package com.weixin.bean;

/**
 * Created by yongjie on 14-10-10.
 */
public class RankInfo {
	private int id;
	private String rankName;
	private String rankIntroduction;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRankName() {
		return rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public String getRankIntroduction() {
		return rankIntroduction;
	}

	public void setRankIntroduction(String rankIntroduction) {
		this.rankIntroduction = rankIntroduction;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RankInfo rankInfo = (RankInfo) o;

		if (id != rankInfo.id) return false;
		if (rankIntroduction != null ? !rankIntroduction.equals(rankInfo.rankIntroduction) : rankInfo.rankIntroduction != null)
			return false;
		if (rankName != null ? !rankName.equals(rankInfo.rankName) : rankInfo.rankName != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (rankName != null ? rankName.hashCode() : 0);
		result = 31 * result + (rankIntroduction != null ? rankIntroduction.hashCode() : 0);
		return result;
	}
}
