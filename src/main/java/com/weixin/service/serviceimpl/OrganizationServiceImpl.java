package com.weixin.service.serviceimpl;

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
		Query query;
		query = sessionFactory.getCurrentSession().createQuery("from WxOrganization ");
		return query.list();
	}
}
