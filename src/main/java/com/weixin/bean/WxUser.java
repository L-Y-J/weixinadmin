package com.weixin.bean;

/**
 * Created by yongjie on 14-9-24.
 */
public class WxUser {
	private int id;
	private String name;
	private Integer departmentId;
	private Integer positionId;
	private String mobile;
	private Integer gender;
	private String tel;
	private String email;
	private String weixinId;
	private Integer enable;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WxUser wxUser = (WxUser) o;

		if (id != wxUser.id) return false;
		if (departmentId != null ? !departmentId.equals(wxUser.departmentId) : wxUser.departmentId != null)
			return false;
		if (email != null ? !email.equals(wxUser.email) : wxUser.email != null) return false;
		if (enable != null ? !enable.equals(wxUser.enable) : wxUser.enable != null) return false;
		if (gender != null ? !gender.equals(wxUser.gender) : wxUser.gender != null) return false;
		if (mobile != null ? !mobile.equals(wxUser.mobile) : wxUser.mobile != null) return false;
		if (name != null ? !name.equals(wxUser.name) : wxUser.name != null) return false;
		if (positionId != null ? !positionId.equals(wxUser.positionId) : wxUser.positionId != null) return false;
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
		result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
		result = 31 * result + (gender != null ? gender.hashCode() : 0);
		result = 31 * result + (tel != null ? tel.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (weixinId != null ? weixinId.hashCode() : 0);
		result = 31 * result + (enable != null ? enable.hashCode() : 0);
		return result;
	}
}
