package com.weixin.controller;

import com.weixin.bean.WxOrganization;
import com.weixin.service.OrganizationSerVice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by yongjie on 14-9-23.
 */

@Controller
public class OrganizationController {

	@Autowired
	OrganizationSerVice organizationSerVice;

	@RequestMapping("/organizations")
	public String ShowOrganizations(Map<String, Object> model){
		List<WxOrganization> organizations = organizationSerVice.getOrganizations();
		model.put("organizations", organizations);
		return "organizations";
	}
}
