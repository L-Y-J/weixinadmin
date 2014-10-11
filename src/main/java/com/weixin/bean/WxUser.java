package com.weixin.bean;

import java.sql.Timestamp;

/**
 * Created by yongjie on 14-10-10.
 */
public class WxUser {
	private int id;
	private String name;
	private Integer departmentId;
	private Integer positionId;
	private Integer rankId;
	private String mobile;
	private Integer gender;
	private String tel;
	private String email;
	private String weixinId;
	private Integer enable;
	private String account;
	private String personNumbers;
	private Timestamp dateofbirth;
	private String policeNumber;
	private String avatar;
	private Integer status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public Integer getRankId() {
		return rankId;
	}

	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeixinId() {
		return weixinId;
	}

	public void setWeixinId(String weixinId) {
		this.weixinId = weixinId;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPersonNumbers() {
		return personNumbers;
	}

	public void setPersonNumbers(String personNumbers) {
		this.personNumbers = personNumbers;
	}

	public Timestamp getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Timestamp dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getPoliceNumber() {
		return policeNumber;
	}

	public void setPoliceNumber(String policeNumber) {
		this.policeNumber = policeNumber;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WxUser wxUser = (WxUser) o;

		if (id != wxUser.id) return false;
		if (account != null ? !account.equals(wxUser.account) : wxUser.account != null) return false;
		if (avatar != null ? !avatar.equals(wxUser.avatar) : wxUser.avatar != null) return false;
		if (dateofbirth != null ? !dateofbirth.equals(wxUser.dateofbirth) : wxUser.dateofbirth != null) return false;
		if (departmentId != null ? !departmentId.equals(wxUser.departmentId) : wxUser.departmentId != null)
			return false;
		if (email != null ? !email.equals(wxUser.email) : wxUser.email != null) return false;
		if (enable != null ? !enable.equals(wxUser.enable) : wxUser.enable != null) return false;
		if (gender != null ? !gender.equals(wxUser.gender) : wxUser.gender != null) return false;
		if (mobile != null ? !mobile.equals(wxUser.mobile) : wxUser.mobile != null) return false;
		if (name != null ? !name.equals(wxUser.name) : wxUser.name != null) return false;
		if (personNumbers != null ? !personNumbers.equals(wxUser.personNumbers) : wxUser.personNumbers != null)
			return false;
		if (policeNumber != null ? !policeNumber.equals(wxUser.policeNumber) : wxUser.policeNumber != null)
			return false;
		if (positionId != null ? !positionId.equals(wxUser.positionId) : wxUser.positionId != null) return false;
		if (rankId != null ? !rankId.equals(wxUser.rankId) : wxUser.rankId != null) return false;
		if (status != null ? !status.equals(wxUser.status) : wxUser.status != null) return false;
		if (tel != null ? !tel.equals(wxUser.tel) : wxUser.tel != null) return false;
		if (weixinId != null ? !weixinId.equals(wxUser.weixinId) : wxUser.weixinId != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
		result = 31 * result + (positionId != null ? positionId.hashCode() : 0);
		result = 31 * result + (rankId != null ? rankId.hashCode() : 0);
		result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
		result = 31 * result + (gender != null ? gender.hashCode() : 0);
		result = 31 * result + (tel != null ? tel.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (weixinId != null ? weixinId.hashCode() : 0);
		result = 31 * result + (enable != null ? enable.hashCode() : 0);
		result = 31 * result + (account != null ? account.hashCode() : 0);
		result = 31 * result + (personNumbers != null ? personNumbers.hashCode() : 0);
		result = 31 * result + (dateofbirth != null ? dateofbirth.hashCode() : 0);
		result = 31 * result + (policeNumber != null ? policeNumber.hashCode() : 0);
		result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		return result;
	}
}
