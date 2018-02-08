package com.project.service;

import java.sql.SQLException;
import java.util.List;

import com.jdbc.exception.FailToVerifiedIDException;
import com.jdbc.exception.InvalidPasswordException;
import com.jdbc.exception.NotFoundIDException;
import com.jdbc.exception.NullLoginUserException;
import com.jdbc.scope.SessionScope;
import com.project.dao.MemberDAO;
import com.project.dao.MemberDAOImpl;
import com.project.dto.MemberVO;
import com.project.request.JoinRequest;
import com.project.request.LoginRequest;
import com.project.request.ModifyRequest;

public class MemberServiceImpl implements MemberService {

	private static MemberServiceImpl instance = new MemberServiceImpl();

	private MemberServiceImpl() {
	}

	public static MemberServiceImpl getInstance() {
		return instance;
	}

	
	private MemberDAO memberDAO=MemberDAOImpl.getInstance();		
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public List<MemberVO> getMemberList() throws SQLException {		
		List<MemberVO> memberList = memberDAO.selectMemberList();
		return memberList;
	}

	@Override
	public MemberVO getMemberByID(String member_id) throws SQLException {
		MemberVO member = memberDAO.selectMemberByID(member_id);
		return member;
	}

	@Override
	public void joinMember(JoinRequest req) throws SQLException, FailToVerifiedIDException {

		MemberVO member = memberDAO.selectMemberByID(req.getMember_id());
		if (member != null) {// ���̵� �ߺ�
			throw new FailToVerifiedIDException();
		}
		member=req.toMemberVO();	

		memberDAO.insertMember(member);

	}

	@Override
	public void modifyMember(ModifyRequest req) throws SQLException {
		MemberVO member = req.toMemberVO();
		memberDAO.updateMember(member);
	}

	@Override
	public void removeMember(String member_id) throws SQLException {
		MemberVO loginUser = SessionScope.loginUser;
	/*	if (loginUser.getMember_id().equals(member_id)) { //
			SessionScope.loginUser = null;
		}*/
		memberDAO.deleteMember(member_id);
		
	}

	@Override
	public MemberVO login(LoginRequest req) throws SQLException, NotFoundIDException, InvalidPasswordException {
		MemberVO member = memberDAO.selectMemberByID(req.getMember_id());
		if (member != null) {// ���̵� ����
			if (req.getMember_pwd().equals(member.getMember_pwd())) {// �α���Ȯ��.
				/*SessionScope.loginUser = member; // �α��� ��������
*/				return member;
			} else {
				throw new InvalidPasswordException();
			}
		} else {// ���̵� ����ġ
			throw new NotFoundIDException();
		}

	}

	@Override
	public void logout() throws SQLException, NullLoginUserException {
		if (SessionScope.loginUser != null) {
			SessionScope.loginUser = null;
		} else {
			throw new NullLoginUserException();
		}
	}

}
