package com.weixin.utils;

import com.weixin.bean.PositionInfo;
import com.weixin.bean.RankInfo;
import com.weixin.bean.WxOrganization;
import com.weixin.bean.WxUser;
import com.weixin.component.UserModel;
import com.weixin.service.OrganizationSerVice;
import com.weixin.service.PositionInfoService;
import com.weixin.service.RankInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yongjie on 14-10-10.
 */
public class UserUtils {

	@Autowired
	PositionInfoService positionInfoService;
	@Autowired
	RankInfoService rankInfoService;
	@Autowired
	OrganizationSerVice organizationSerVice;

	List<PositionInfo> positionInfos;
	List<RankInfo> ranks;
	List<WxOrganization> organizations;

	public List<UserModel> ConvertUserToModel(List<WxUser> wxUsers){
		positionInfos = positionInfoService.getPositions();
		ranks = rankInfoService.getRanks();
		organizations = organizationSerVice.getOrganizations();

		List<UserModel> models = new ArrayList<UserModel>();
		for (WxUser o : wxUsers) {
			UserModel model = new UserModel();
			model.setId(String.valueOf(o.getId()));
			model.setName(o.getName());
			model.setMobile(o.getMobile());
			model.setGender(o.getGender()==1?"男":"女");
			model.setTel(o.getTel());
			model.setEmail(o.getEmail());
			model.setWeixinId(o.getWeixinId());
			model.setUse(o.getEnable()==1?"禁用":"不禁用");
			model.setAccount(o.getAccount());
			model.setPersonNumbers(o.getPersonNumbers());
			model.setDateofbirth(DateUtils.ConvertTimeStampToString(o.getDateofbirth()));
			model.setPoliceNumber(o.getPoliceNumber());
			model.setAvatar(o.getAvatar());
			model.setStatus(o.getStatus()==1?"已关注":o.getStatus()==2?"已冻结":"未关注");
			model.setPosition(FindPositionNameById(o.getPositionId()));
			model.setRank(FindRankNameById(o.getRankId()));
			model.setDepartment(FindOrganizationNameById(o.getDepartmentId()));
			models.add(model);
		}
		return models;
	}

	private String FindPositionNameById(Integer id){
		String name = "";
		for (PositionInfo p : positionInfos){
			if (p.getPositionId()==id){
				name = p.getPositionName();
				break;
			}
		}
		return name;
	}

	private String FindRankNameById(Integer id){
		String name = "";
		for (RankInfo r : ranks){
			if (r.getId()==id){
				name = r.getRankName();
				break;
			}
		}
		return name;
	}

	private String FindOrganizationNameById(Integer id){
		String name = "";
		for (WxOrganization o : organizations){
			if (o.getId()==id){
				name = o.getOrganizationName();
				break;
			}
		}
		return name;
	}

}
