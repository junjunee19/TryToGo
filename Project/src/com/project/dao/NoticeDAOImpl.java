package com.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.project.dto.NoticeVO;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.jdbc.source.DataSourceDBCPIbatis;

public class NoticeDAOImpl implements NoticeDAO {

	private static NoticeDAOImpl instance=
			new NoticeDAOImpl();
	private NoticeDAOImpl(){}
	public static NoticeDAOImpl getInstance(){
		return instance;
	}
	
	
	DataSourceDBCPIbatis dataSource=DataSourceDBCPIbatis.getInstance(); //sql클라이언트 할당.
	private SqlMapClient client=dataSource.getSqlMapClient();
	public void setclient(SqlMapClient client){
		this.client=client;
	}
	
	
	@Override
	public List<NoticeVO> selectNoticeList() throws SQLException {
		
		List<NoticeVO> noticeList=(List<NoticeVO>)
				client.queryForList("selectNoticeList",null);
		return noticeList;
	}
	
	@Override
	public NoticeVO selectNoticeByNo(int notice_no) throws SQLException {
		NoticeVO notice=(NoticeVO)
			client.queryForObject("selectNoticeByNo",notice_no);
		return notice;
	}

	@Override
	public void insertNotice(NoticeVO Notice) throws SQLException {
		client.update("insertNotice",Notice);		
	}

	@Override
	public void updateNotice(NoticeVO Notice) throws SQLException {
		client.update("updateNotice",Notice);		
	}

	@Override
	public void deleteNotice(int Notice_no) throws SQLException {
		client.update("deleteNotice",Notice_no);		
	}

}
