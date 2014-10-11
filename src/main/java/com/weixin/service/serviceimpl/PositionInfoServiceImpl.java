package com.weixin.service.serviceimpl;

import com.weixin.bean.PositionInfo;
import com.weixin.service.PositionInfoService;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yongjie on 14-10-10.
 */
@Transactional
@Service
public class PositionInfoServiceImpl implements PositionInfoService {

	@Resource
	SessionFactory sessionFactory;

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public List getPositions() throws HibernateException {
		Query query = sessionFactory.getCurrentSession().createQuery("from PositionInfo ");
		return query.list();
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public PositionInfo getPosition(Integer id) throws HibernateException {
		return (PositionInfo) sessionFactory.getCurrentSession().get(PositionInfo.class, id);
	}

	@Override
	public void addPositions(PositionInfo positionInfo) throws HibernateException {
		sessionFactory.getCurrentSession().persist(positionInfo);
	}

	@Override
	public void updatePositions(PositionInfo positionInfo) throws HibernateException {
		sessionFactory.getCurrentSession().update(positionInfo);
	}

	@Override
	public void delPositions(PositionInfo positionInfo) throws HibernateException {
		sessionFactory.getCurrentSession().delete(positionInfo);
	}
}
