package com.project.service;

import java.sql.SQLException;
import java.util.List;

import com.project.controller.ModifyNoticeRequest;
import com.project.controller.WriteNoticeRequest;
import com.project.dto.NoticeVO;

public interface NoticeService {
	
	//ȸ�� ����Ʈ ����
	List<NoticeVO> getNoticeList() throws SQLException;
	//ȸ�� ���� ����
	void writeNotice(WriteNoticeRequest req)throws SQLException;
	//ȸ�� �����ϱ�
	void modifyNotice(ModifyNoticeRequest req)throws SQLException;
	//ȸ�� Ż���ϱ�
	void removeNotice(int Notice_no)throws SQLException;
	
	NoticeVO getNoticeByNo(int notice_no)throws SQLException;
	
}







