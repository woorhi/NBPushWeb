package com.nbware.push.service;

import java.util.List;

import com.nbware.push.model.ReservedSendRequest;

public interface ReservedSendRequestService {
	public void setMsgRequest(ReservedSendRequest msg);
	public ReservedSendRequest getMsgRequest(String msgId);
	public List<ReservedSendRequest> getMsgRequestList();
}
