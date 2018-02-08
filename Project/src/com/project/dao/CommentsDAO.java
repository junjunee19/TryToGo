package com.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.project.dto.NoticeVO;

public interface CommentsDAO {

List<NoticeVO> selectNoticeList() throws SQLException;
	
	
	//ȸ�� ���
	void insertComments(NoticeVO notice) throws SQLException;
	
	//ȸ�� ����
	void updateComments(NoticeVO notice) throws SQLException;
	
	//ȸ�� ����
	void deleteComments(int notice_no)throws SQLException;


	NoticeVO selectCommentsByNo(int notice_no) throws SQLException;
	
}
