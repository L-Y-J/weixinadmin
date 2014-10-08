package com.weixin.controller;

import com.weixin.bean.WxUser;
import com.weixin.service.UserService;
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

	@RequestMapping(method = RequestMethod.GET)
	public String ShowUsers(Map<String, Object> model){
		List<WxUser> users = userService.getUsers();
		model.put("users", users);
		return "users";
	}

	@RequestMapping(method = RequestMethod.PUT)
	public @ResponseBody Map AddUser(@RequestBody WxUser wxUser){
		Map map = new HashMap();
		if (wxUser!=null){
			map.put("status","ok");
		}else{
			map.put("status","error");
		}
		return map;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Map updateUser(@RequestBody ArrayList list){
		Map map = new HashMap();
		if (list==null){
			map.put("status","error");
			return map;
		}

		for (Object o : list){
			System.out.println(o.toString());
		}
		map.put("status","ok");
		return map;
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public @ResponseBody Map deleteUser(@RequestBody ArrayList list){
		Map map = new HashMap();
		if (list==null){
			map.put("status","error");
		}
		for (Object o : list) {
			System.out.println(o);
		}
		map.put("status","ok");
		return map;
	}
}
