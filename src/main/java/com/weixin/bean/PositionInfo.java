package com.weixin.bean;

/**
 * Created by yongjie on 14-10-10.
 */
public class PositionInfo {
	private int positionId;
	private String positionName;
	private String positionIntroduction;

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPositionIntroduction() {
		return positionIntroduction;
	}

	public void setPositionIntroduction(String positionIntroduction) {
		this.positionIntroduction = positionIntroduction;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PositionInfo that = (PositionInfo) o;

		if (positionId != that.positionId) return false;
		if (positionIntroduction != null ? !positionIntroduction.equals(that.positionIntroduction) : that.positionIntroduction != null)
			return false;
		if (positionName != null ? !positionName.equals(that.positionName) : that.positionName != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = positionId;
		result = 31 * result + (positionName != null ? positionName.hashCode() : 0);
		result = 31 * result + (positionIntroduction != null ? positionIntroduction.hashCode() : 0);
		return result;
	}
}
