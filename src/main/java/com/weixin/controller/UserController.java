package com.weixin.controller;

import com.weixin.bean.PositionInfo;
import com.weixin.bean.RankInfo;
import com.weixin.bean.WxOrganization;
import com.weixin.bean.WxUser;
import com.weixin.component.UserModel;
import com.weixin.service.OrganizationSerVice;
import com.weixin.service.PositionInfoService;
import com.weixin.service.RankInfoService;
import com.weixin.service.UserService;
import com.weixin.utils.DateUtils;
import com.weixin.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yongjie on 14-9-24.
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	PositionInfoService positionInfoService;
	@Autowired
	RankInfoService rankInfoService;
	@Autowired
	OrganizationSerVice organizationSerVice;
	@Autowired
	UserUtils userUtils;

	@RequestMapping(method = RequestMethod.GET)
	public String ShowUsers(Map<String, Object> model){
		List<WxUser> wxUser = userService.getUsers();
		List<UserModel> users = userUtils.ConvertUserToModel(wxUser);
		model.put("users", users);

		final List<PositionInfo> positions = positionInfoService.getPositions();
		final List<RankInfo> ranks = rankInfoService.getRanks();
		Map map = new HashMap(){{put("positions",positions); put("ranks", ranks);}};
		model.put("data", map);

		return "users";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String ShowAddUsers(Map<String, Object> model){
		final List<PositionInfo> positions = positionInfoService.getPositions();
		final List<RankInfo> ranks = rankInfoService.getRanks();
		Map map = new HashMap(){{put("positions",positions); put("ranks", ranks);}};
		model.put("data", map);
		return "users_add";
	}

	@RequestMapping(value = "/asyncdata")
	public @ResponseBody List AsyncData(){
		List list = new ArrayList();
		List<WxOrganization> organizations = organizationSerVice.getOrganizations();
		for (WxOrganization o : organizations){
			Map map = new HashMap();
			map.put("id", o.getId());
			map.put("pId", o.getParentId());
			map.put("name", o.getOrganizationName());
			list.add(map);
		}
		return list;
	}

	@RequestMapping(method = RequestMethod.PUT, headers="Accept=application/json,application/xml")
	public @ResponseBody Map AddUser(@RequestBody UserModel userModel){
		Map map = new HashMap();
		if (userModel==null){
			map.put("status", "error");
			return map;
		}
		WxUser wxUser = new WxUser();
		wxUser.setName(userModel.getName());
		wxUser.setDepartmentId(organizationSerVice.getIdByName(userModel.getDepartment()));
		wxUser.setPositionId(positionInfoService.getIdByName(userModel.getPosition()));
		wxUser.setRankId(rankInfoService.getIdByName(userModel.getRank()));
		wxUser.setMobile(userModel.getMobile());
		wxUser.setGender(userModel.getGender().equals("男") ? 1 : 0);
		wxUser.setTel(userModel.getTel());
		wxUser.setEmail(userModel.getEmail());
		wxUser.setWeixinId(userModel.getWeixinId());
		wxUser.setEnable(userModel.getUse().equals("1") ? 1 : 0);
		wxUser.setAccount(userModel.getAccount());
		wxUser.setPersonNumbers(userModel.getPersonNumbers());
		wxUser.setDateofbirth(DateUtils.ConvertStringToTimeStamp(userModel.getDateofbirth()));
		wxUser.setPoliceNumber(userModel.getPoliceNumber());
		try {
			userService.addUser(wxUser);
			map.put("status", "ok");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", "error");
		}
		return map;
	}

	@RequestMapping(method = RequestMethod.POST, headers="Accept=application/json,application/xml")
	public @ResponseBody Map updateUser(@RequestBody UserModel userModel){
		Map map = new HashMap();
		if (userModel==null){
			map.put("status","error");
			return map;
		}
		try {
			WxUser user = userService.getUser(Integer.parseInt(userModel.getId()));
			user.setName(userModel.getName());
			user.setDepartmentId(organizationSerVice.getIdByName(userModel.getDepartment()));
			user.setPositionId(positionInfoService.getIdByName(userModel.getPosition()));
			user.setRankId(rankInfoService.getIdByName(userModel.getRank()));
			user.setMobile(userModel.getMobile());
			user.setGender(userModel.getGender().equals("男") ? 1 : 0);
			user.setTel(userModel.getTel());
			user.setEmail(userModel.getEmail());
			user.setWeixinId(userModel.getWeixinId());
			user.setEnable(userModel.getUse().equals("1") ? 1 : 0);
			user.setAccount(userModel.getAccount());
			user.setPersonNumbers(userModel.getPersonNumbers());
			user.setDateofbirth(DateUtils.ConvertStringToTimeStamp(userModel.getDateofbirth()));
			user.setPoliceNumber(userModel.getPoliceNumber());
			userService.updateUser(user);
			map.put("status", "ok");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", "error");
		}
		return map;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
	public @ResponseBody Map deleteUser(@PathVariable Integer userId){
		Map map = new HashMap();
		if (userId==null){
			map.put("status", "error");
			return map;
		}
		try {
			WxUser user = userService.getUser(userId);
			userService.delUser(user);
			map.put("status", "ok");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", "error");
		}
		return map;
	}
}
