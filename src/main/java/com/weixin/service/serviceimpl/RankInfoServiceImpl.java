package com.weixin.service.serviceimpl;

import com.weixin.bean.RankInfo;
import com.weixin.service.RankInfoService;
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
public class RankInfoServiceImpl implements RankInfoService {

	@Resource
	SessionFactory sessionFactory;

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public List getRanks() throws HibernateException {
		try {
			Query query = sessionFactory.getCurrentSession().createQuery("from RankInfo ");
			return query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public RankInfo getRank(Integer id) throws HibernateException {
		try {
			return (RankInfo) sessionFactory.getCurrentSession().get(RankInfo.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void addRank(RankInfo rankInfo) throws HibernateException {
		sessionFactory.getCurrentSession().persist(rankInfo);
	}

	@Override
	public void updateRank(RankInfo rankInfo) throws HibernateException {
		sessionFactory.getCurrentSession().update(rankInfo);
	}

	@Override
	public void delRank(RankInfo rankInfo) throws HibernateException {
		sessionFactory.getCurrentSession().delete(rankInfo);
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public Integer getIdByName(String name) throws HibernateException {
		String sql = String.format("from RankInfo where rankName='%s'",name);
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(sql);
			return ((RankInfo)query.list().get(0)).getId();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public String getNameById(Integer id) {
		String sql = String.format("from RankInfo where id=%d", id);
		try {
			Query query = sessionFactory.getCurrentSession().createQuery(sql);
			return ((RankInfo)query.list().get(0)).getRankName();
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
