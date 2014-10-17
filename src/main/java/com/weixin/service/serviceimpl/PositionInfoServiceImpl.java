package com.weixin.service.serviceimpl;

import com.weixin.bean.PositionInfo;
import com.weixin.service.PositionInfoService;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yongjie on 14-10-10.
 */
@Transactional
public class PositionInfoServiceImpl implements PositionInfoService {

	@Resource
	SessionFactory sessionFactory;

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public List getPositions() throws HibernateException {
		try {
			Query query = sessionFactory.getCurrentSession().createQuery("from PositionInfo ");
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public PositionInfo getPosition(Integer id) {
		try {
			return (PositionInfo) sessionFactory.getCurrentSession().get(PositionInfo.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
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

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public Integer getIdByName(String name) {
		String sql = String.format("from PositionInfo where positionName='%s'",name);
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(sql);
			return ((PositionInfo)query.list().get(0)).getPositionId();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public String getNameById(Integer id) {
		String sql = String.format("from PositionInfo where positionId=%d", id);
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(sql);
			return ((PositionInfo)query.list().get(0)).getPositionName();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
