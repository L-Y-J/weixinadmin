package com.weixin.controller;

import com.weixin.bean.WxUser;
import com.weixin.component.UserModel;
import com.weixin.service.UserService;
import com.weixin.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
	UserUtils userUtils;

	@RequestMapping(method = RequestMethod.GET)
	public String ShowUsers(Map<String, Object> model){
		List<WxUser> wxUser = userService.getUsers();
		List<UserModel> users = userUtils.ConvertUserToModel(wxUser);
		model.put("users", users);
		return "users";
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
		//TODO 转化id为名称
		wxUser.setDepartmentId(1);
		wxUser.setPositionId(1);
		wxUser.setMobile(userModel.getMobile());
		wxUser.setGender(userModel.getGender().equals("男") ? 1 : 0);
		wxUser.setTel(userModel.getTel());
		wxUser.setEmail(userModel.getEmail());
		//TODO 微信id
		wxUser.setWeixinId("xxxxxxxxxxx");
		wxUser.setEnable(userModel.getUse().equals("1") ? 1 : 0);
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
			//TODO 转化id为名称
			user.setDepartmentId(1);
			user.setPositionId(1);
			user.setMobile(userModel.getMobile());
			user.setGender(userModel.getGender().equals("男") ? 1 : 0);
			user.setTel(userModel.getTel());
			user.setEmail(userModel.getEmail());
			//TODO 微信id
			user.setWeixinId("xxxxxxxxxxx");
			user.setEnable(userModel.getUse().equals("1") ? 1 : 0);
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
