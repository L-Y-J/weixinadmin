package com.weixin.service.serviceimpl;

import com.weixin.bean.RankInfo;
import com.weixin.service.RankInfoService;
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
public class RankInfoServiceImpl implements RankInfoService {

	@Resource
	SessionFactory sessionFactory;

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public List getRanks() throws HibernateException {
		Query query = sessionFactory.getCurrentSession().createQuery("from RankInfo ");
		return query.list();
	}

	@Override
	@Transactional(propagation= Propagation.NOT_SUPPORTED,readOnly=true)
	public RankInfo getRank(Integer id) throws HibernateException {
		return (RankInfo) sessionFactory.getCurrentSession().get(RankInfo.class, id);
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
}
