package com.weixin.component;

import com.weixin.bean.WxOrganization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yongjie on 14-9-25.
 */

public class OrganizationTree {

	WxOrganization current = null;
	List<OrganizationTree> childList = new ArrayList<OrganizationTree>();

	public WxOrganization getCurrent() {
		return current;
	}

	public void setCurrent(WxOrganization current) {
		this.current = current;
	}

	public List<OrganizationTree> getChildList() {
		return childList;
	}

	public void setChildList(List<OrganizationTree> childList) {
		this.childList = childList;
	}
}
