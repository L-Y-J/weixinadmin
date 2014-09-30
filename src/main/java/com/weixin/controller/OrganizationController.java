package com.weixin.controller;

import com.weixin.bean.WxOrganization;
import com.weixin.component.OrganizationTree;
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
		OrganizationTree organizationTree = BuildOrganizationTree(organizations);
		model.put("menu", organizationTree);
		return "organizations";
	}

	private OrganizationTree BuildOrganizationTree(List<WxOrganization> wxOrganizations){
		OrganizationTree root = new OrganizationTree();
		GetChildNode(root, null, wxOrganizations);
		return root;
	}

	private void GetChildNode(OrganizationTree current, Integer parentId, List<WxOrganization> wxOrganizations){
		for (WxOrganization o : wxOrganizations){
			if (o.getParentId()==parentId){
				OrganizationTree child = new OrganizationTree();
				child.setCurrent(o);
				current.getChildList().add(child);
				GetChildNode(child, o.getId(), wxOrganizations);
			}
		}
	}
}
