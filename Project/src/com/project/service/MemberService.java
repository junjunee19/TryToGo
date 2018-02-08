package com.project.service;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.exception.FailToVerifiedIDException;
import com.jdbc.exception.InvalidPasswordException;
import com.jdbc.exception.NotFoundIDException;
import com.jdbc.exception.NullLoginUserException;
import com.project.dto.MemberVO;
import com.project.request.JoinRequest;
import com.project.request.LoginRequest;
import com.project.request.ModifyRequest;

public interface MemberService {
	
	//ȸ�� ����Ʈ ����
	List<MemberVO> getMemberList() throws SQLException;
	//ȸ�� ���� ����
	MemberVO getMemberByID(String member_id)throws SQLException;
	//ȸ�� �����ϱ�
	void joinMember(JoinRequest req)throws SQLException
										   ,FailToVerifiedIDException;
	//ȸ�� �����ϱ�
	void modifyMember(ModifyRequest req)throws SQLException;
	//ȸ�� Ż���ϱ�
	void removeMember(String member_id)throws SQLException;
	
	//�α��� �ϱ�
	MemberVO login(LoginRequest req)
			throws SQLException,NotFoundIDException,InvalidPasswordException; 
	//�α׾ƿ� �ϱ�
	void logout()throws SQLException,NullLoginUserException;
	
	
}







