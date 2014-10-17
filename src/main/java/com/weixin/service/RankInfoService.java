package com.weixin.service;

import com.weixin.bean.RankInfo;

import java.util.List;

/**
 * Created by yongjie on 14-10-10.
 */
public interface RankInfoService {

	public List getRanks();

	public RankInfo getRank(Integer id);

	public void addRank(RankInfo rankInfo);

	public void updateRank(RankInfo rankInfo);

	public void delRank(RankInfo rankInfo);

	public Integer getIdByName(String name);

	public String getNameById(Integer id);

}
