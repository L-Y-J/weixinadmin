package com.weixin.bean;

/**
 * Created by yongjie on 14-9-22.
 */
public class WxOrganization {
	private int id;
	private String organizationName;
	private String organizationLevel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationLevel() {
		return organizationLevel;
	}

	public void setOrganizationLevel(String organizationLevel) {
		this.organizationLevel = organizationLevel;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WxOrganization that = (WxOrganization) o;

		if (id != that.id) return false;
		if (organizationLevel != null ? !organizationLevel.equals(that.organizationLevel) : that.organizationLevel != null)
			return false;
		if (organizationName != null ? !organizationName.equals(that.organizationName) : that.organizationName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (organizationName != null ? organizationName.hashCode() : 0);
		result = 31 * result + (organizationLevel != null ? organizationLevel.hashCode() : 0);
		return result;
	}
}
