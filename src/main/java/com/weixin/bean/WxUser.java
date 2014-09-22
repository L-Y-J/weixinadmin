package com.weixin.bean;

/**
 * Created by yongjie on 14-9-22.
 */
public class WxUser {
	private int id;
	private String wxId;
	private String wxName;
	private Byte wxLevel;
	private String wxCompany;
	private String wxPhone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWxId() {
		return wxId;
	}

	public void setWxId(String wxId) {
		this.wxId = wxId;
	}

	public String getWxName() {
		return wxName;
	}

	public void setWxName(String wxName) {
		this.wxName = wxName;
	}

	public Byte getWxLevel() {
		return wxLevel;
	}

	public void setWxLevel(Byte wxLevel) {
		this.wxLevel = wxLevel;
	}

	public String getWxCompany() {
		return wxCompany;
	}

	public void setWxCompany(String wxCompany) {
		this.wxCompany = wxCompany;
	}

	public String getWxPhone() {
		return wxPhone;
	}

	public void setWxPhone(String wxPhone) {
		this.wxPhone = wxPhone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WxUser wxUser = (WxUser) o;

		if (id != wxUser.id) return false;
		if (wxCompany != null ? !wxCompany.equals(wxUser.wxCompany) : wxUser.wxCompany != null) return false;
		if (wxId != null ? !wxId.equals(wxUser.wxId) : wxUser.wxId != null) return false;
		if (wxLevel != null ? !wxLevel.equals(wxUser.wxLevel) : wxUser.wxLevel != null) return false;
		if (wxName != null ? !wxName.equals(wxUser.wxName) : wxUser.wxName != null) return false;
		if (wxPhone != null ? !wxPhone.equals(wxUser.wxPhone) : wxUser.wxPhone != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (wxId != null ? wxId.hashCode() : 0);
		result = 31 * result + (wxName != null ? wxName.hashCode() : 0);
		result = 31 * result + (wxLevel != null ? wxLevel.hashCode() : 0);
		result = 31 * result + (wxCompany != null ? wxCompany.hashCode() : 0);
		result = 31 * result + (wxPhone != null ? wxPhone.hashCode() : 0);
		return result;
	}
}
