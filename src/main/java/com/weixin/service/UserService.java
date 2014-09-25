package com.weixin.service;

import com.weixin.bean.WxUser;

import java.util.List;

/**
 * Created by yongjie on 14-9-24.
 */
public interface UserService {

	public List getUsers();

	public WxUser getUser(Integer id);

	void addUser(WxUser wxUser);

	void delUser(WxUser wxUser);

	void updateUser(WxUser wxUser);
}
