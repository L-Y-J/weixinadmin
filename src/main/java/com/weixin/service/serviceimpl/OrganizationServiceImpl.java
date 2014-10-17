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
		try {
			Query query = sessionFactory.getCurrentSession().createQuery("from WxOrganization ");
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public WxOrganization getOrganization(Integer id) {
		try {
			return (WxOrganization) sessionFactory.getCurrentSession().get(WxOrganization.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
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
	public void updateOrganization(WxOrganization wxOrganization) {
		sessionFactory.getCurrentSession().update(wxOrganization);
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public Integer getIdByName(String name) {
		String sql = String.format("from WxOrganization where organizationName='%s'",name);
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(sql);
			return ((WxOrganization)query.list().get(0)).getId();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public String getNameById(Integer id) {
		String sql = String.format("from WxOrganization where id=%d", id);
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(sql);
			return ((WxOrganization)query.list().get(0)).getOrganizationName();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
