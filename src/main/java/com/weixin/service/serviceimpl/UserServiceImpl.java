package com.weixin.service.serviceimpl;

import com.weixin.bean.WxUser;
import com.weixin.service.UserService;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yongjie on 14-9-24.
 */

@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	SessionFactory sessionFactory;

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public List getUsers() throws HibernateException {
		Query query = sessionFactory.getCurrentSession().createQuery("from WxUser ");
		return query.list();
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public WxUser getUser(Integer id) throws HibernateException {
		return (WxUser) sessionFactory.getCurrentSession().get(WxUser.class, id);
	}

	@Override
	public void addUser(WxUser wxUser) throws HibernateException {
		sessionFactory.getCurrentSession().persist(wxUser);
	}

	@Override
	public void delUser(WxUser wxUser) throws HibernateException {
		sessionFactory.getCurrentSession().delete(wxUser);
	}

	@Override
	public void updateUser(WxUser wxUser) {
		sessionFactory.getCurrentSession().update(wxUser);
	}
}
