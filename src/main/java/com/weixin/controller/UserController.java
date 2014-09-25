package com.weixin.controller;

import com.weixin.bean.WxUser;
import com.weixin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by yongjie on 14-9-24.
 */

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/users")
	public String ShowUsers(Map<String, Object> model){
		List<WxUser> users = userService.getUsers();
		model.put("users", users);
		return "users";
	}
}
