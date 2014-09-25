package com.weixin.service.serviceimpl;

import com.weixin.bean.WxOrganization;
import com.weixin.service.OrganizationSerVice;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yongjie on 14-9-22.
 */

@Transactional
public class OrganizationServiceImpl implements OrganizationSerVice {

	@Resource
	SessionFactory sessionFactory;

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public List getOrganizations() throws HibernateException {
		Query query = sessionFactory.getCurrentSession().createQuery("from WxOrganization ");
		return query.list();
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public WxOrganization getOrganization(Integer id) throws HibernateException {
		return (WxOrganization) sessionFactory.getCurrentSession().get(WxOrganization.class, id);
	}

	@Override
	public void addOrganization(WxOrganization wxOrganization) throws HibernateException {
		sessionFactory.getCurrentSession().persist(wxOrganization);
	}

	@Override
	public void delOrganization(WxOrganization wxOrganization) throws HibernateException {
		sessionFactory.getCurrentSession().delete(wxOrganization);
	}

	@Override
	public void updateOrganization(WxOrganization wxOrganization) throws HibernateException {
		sessionFactory.getCurrentSession().update(wxOrganization);
	}
}
