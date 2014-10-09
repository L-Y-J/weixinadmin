package com.weixin.component;

import java.io.Serializable;

/**
 * Created by yongjie on 14-10-9.
 */
public class UserModel implements Serializable {

	private String id;
	private String name;
	private String gender;
	private String department;
	private String position;
	private String mobile;
	private String tel;
	private String email;
	private String use;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	@Override
	public String toString() {
		return "UserModel{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", gender='" + gender + '\'' +
				", department='" + department + '\'' +
				", position='" + position + '\'' +
				", mobile='" + mobile + '\'' +
				", tel='" + tel + '\'' +
				", email='" + email + '\'' +
				", use='" + use + '\'' +
				'}';
	}
}
