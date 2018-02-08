package com.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.jdbc.source.DataSourceDBCPIbatis;
import com.project.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private static MemberDAOImpl instance=
			new MemberDAOImpl();
	private MemberDAOImpl(){}
	public static MemberDAOImpl getInstance(){
		return instance;
	}

	DataSourceDBCPIbatis dataSource=DataSourceDBCPIbatis.getInstance(); //sql클라이언트 할당.
	private SqlMapClient client=dataSource.getSqlMapClient();
	public void setclient(SqlMapClient client){
		this.client=client;
	}
	
	@Override
	public List<MemberVO> selectMemberList() throws SQLException {
		@SuppressWarnings("unchecked")
		List<MemberVO> memberList=(List<MemberVO>)client.queryForList("selectMemberList",null);
		return memberList;
	}
	

	@Override
	public MemberVO selectMemberByID(String member_id) throws SQLException {
		MemberVO member=(MemberVO)
				client.queryForObject("selectMemberByID",member_id);
			return member;
	}

	@Override
	public void insertMember(MemberVO member) throws SQLException {
		client.update("insertMember",member);	
	}

	@Override
	public void updateMember(MemberVO member) throws SQLException {
		client.update("updateMember",member);
	}

	@Override
	public void deleteMember(String member_id) throws SQLException {
		client.update("deleteMember",member_id);

	}

}
