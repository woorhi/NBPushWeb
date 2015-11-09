package com.nbware.push.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nbware.push.mapper.ReservedSendRequestMapper;
import com.nbware.push.model.ReservedSendRequest;

@Service
public class ReservedSendRequestServiceImpl implements ReservedSendRequestService {
	
	@Autowired
	private ReservedSendRequestMapper reqMapper;
	
	@Override
	public void setMsgRequest(ReservedSendRequest msg) {
		reqMapper.insertReservedSendRequest(msg);
	}

	@Override
	public ReservedSendRequest getMsgRequest(String msgId) {		
		return reqMapper.selectRequest(msgId);
	}

	@Override
	public List<ReservedSendRequest> getMsgRequestList() {
		return reqMapper.selectList();
	}
}
