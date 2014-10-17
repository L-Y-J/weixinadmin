package com.weixin.service;

import com.weixin.bean.WxOrganization;

import java.util.List;

/**
 * Created by yongjie on 14-9-22.
 */

public interface OrganizationSerVice {

	public List getOrganizations();

	public WxOrganization getOrganization(Integer id);

	public void addOrganization(WxOrganization wxOrganization);

	public void delOrganization(WxOrganization wxOrganization);

	public void updateOrganization(WxOrganization wxOrganization);

	public Integer getIdByName(String name);

	public String getNameById(Integer id);
}
