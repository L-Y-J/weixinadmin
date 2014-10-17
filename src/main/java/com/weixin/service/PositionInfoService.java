package com.weixin.service;

import com.weixin.bean.PositionInfo;

import java.util.List;

/**
 * Created by yongjie on 14-10-10.
 */
public interface PositionInfoService {

	public List getPositions();

	public PositionInfo getPosition(Integer id);

	public void addPositions(PositionInfo positionInfo);

	public void updatePositions(PositionInfo positionInfo);

	public void delPositions(PositionInfo positionInfo);

	public Integer getIdByName(String name);

	public String getNameById(Integer id);
}
