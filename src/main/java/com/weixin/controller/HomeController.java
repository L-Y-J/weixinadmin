package com.weixin.controller;

import com.weixin.service.OrganizationSerVice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yongjie on 14-9-23.
 */

@Controller
public class HomeController {

	@Autowired
	OrganizationSerVice organizationSerVice;

	@RequestMapping(value={"/","/home"}, method= RequestMethod.GET)
	public String ShowHomePage(){
		return "index";
	}
}
