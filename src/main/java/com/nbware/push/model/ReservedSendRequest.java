package com.nbware.push.model;

import java.util.Date;

public class ReservedSendRequest {
	private int msgMngId;
	private String content;
	private String receiverId;
	private int result;
	private Date requestDateTime;
	private String title;
	private Date showDate;
	private char receiverType;
	private String imgUrl;
	private int successCnt;
	private int failCnt;
	private Date sendDate;

	public int getSuccessCnt() {
		return successCnt;
	}

	public void setSuccessCnt(int successCnt) {
		this.successCnt = successCnt;
	}

	public int getFailCnt() {
		return failCnt;
	}

	public void setFailCnt(int failCnt) {
		this.failCnt = failCnt;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public int getMsgMngId() {
		return msgMngId;
	}

	public void setMsgMngId(int msgMngId) {
		this.msgMngId = msgMngId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Date getRequestDateTime() {
		return requestDateTime;
	}

	public void setRequestDateTime(Date requestDateTime) {
		this.requestDateTime = requestDateTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public char getReceiverType() {
		return receiverType;
	}

	public void setReceiverType(char receiverType) {
		this.receiverType = receiverType;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReservedSendRequest [msgMngId=");
		builder.append(msgMngId);
		builder.append(", content=");
		builder.append(content);
		builder.append(", receiverId=");
		builder.append(receiverId);
		builder.append(", result=");
		builder.append(result);
		builder.append(", requestDateTime=");
		builder.append(requestDateTime);
		builder.append(", title=");
		builder.append(title);
		builder.append(", showDate=");
		builder.append(showDate);
		builder.append(", receiverType=");
		builder.append(receiverType);
		builder.append(", imgUrl=");
		builder.append(imgUrl);
		builder.append("]");
		return builder.toString();
	}

}
