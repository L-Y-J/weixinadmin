package com.weixin.bean;

/**
 * Created by yongjie on 14-9-24.
 */
public class WxOrganization {
	private int id;
	private String organizationName;
	private int organizationLevel;
	private Integer parentId;

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

	public int getOrganizationLevel() {
		return organizationLevel;
	}

	public void setOrganizationLevel(int organizationLevel) {
		this.organizationLevel = organizationLevel;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WxOrganization that = (WxOrganization) o;

		if (id != that.id) return false;
		if (organizationLevel != that.organizationLevel) return false;
		if (organizationName != null ? !organizationName.equals(that.organizationName) : that.organizationName != null)
			return false;
		if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (organizationName != null ? organizationName.hashCode() : 0);
		result = 31 * result + organizationLevel;
		result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
		return result;
	}
}
