package com.weixin.bean;

/**
 * Created by yongjie on 14-10-10.
 */
public class SystemUser {
	private int id;
	private String userName;
	private String password;
	private String roleName;
	private String rights;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SystemUser that = (SystemUser) o;

		if (id != that.id) return false;
		if (password != null ? !password.equals(that.password) : that.password != null) return false;
		if (rights != null ? !rights.equals(that.rights) : that.rights != null) return false;
		if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;
		if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (userName != null ? userName.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
		result = 31 * result + (rights != null ? rights.hashCode() : 0);
		return result;
	}
}
