package com.nbware.push.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nbware.push.model.ReservedSendRequest;

public interface ReservedSendRequestMapper {
	List<ReservedSendRequest> selectList();
	void insertReservedSendRequest( @Param("sendReq") ReservedSendRequest sendReq );
	ReservedSendRequest selectRequest(@Param("msgId") String msgId);
}
