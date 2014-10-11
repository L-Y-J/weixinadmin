package com.weixin.bean;

import java.sql.Timestamp;

/**
 * Created by yongjie on 14-10-10.
 */
public class MessageInfo {
	private int id;
	private String messageContent;
	private String messageType;
	private String receiver;
	private Timestamp messageTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Timestamp getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(Timestamp messageTime) {
		this.messageTime = messageTime;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MessageInfo that = (MessageInfo) o;

		if (id != that.id) return false;
		if (messageContent != null ? !messageContent.equals(that.messageContent) : that.messageContent != null)
			return false;
		if (messageTime != null ? !messageTime.equals(that.messageTime) : that.messageTime != null) return false;
		if (messageType != null ? !messageType.equals(that.messageType) : that.messageType != null) return false;
		if (receiver != null ? !receiver.equals(that.receiver) : that.receiver != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (messageContent != null ? messageContent.hashCode() : 0);
		result = 31 * result + (messageType != null ? messageType.hashCode() : 0);
		result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
		result = 31 * result + (messageTime != null ? messageTime.hashCode() : 0);
		return result;
	}
}
