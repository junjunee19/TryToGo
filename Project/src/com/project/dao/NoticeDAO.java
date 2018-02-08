package com.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.project.dto.NoticeVO;

public interface NoticeDAO {
	
	// ȸ������ ...............
	
	//ȸ�� ����Ʈ
	List<NoticeVO> selectNoticeList() throws SQLException;
	
	
	//ȸ�� ���
	void insertNotice(NoticeVO notice) throws SQLException;
	
	//ȸ�� ����
	void updateNotice(NoticeVO notice) throws SQLException;
	
	//ȸ�� ����
	void deleteNotice(int notice_no)throws SQLException;


	NoticeVO selectNoticeByNo(int notice_no) throws SQLException;
	
}








