package com.project.service;

import java.sql.SQLException;
import java.util.List;

import com.project.controller.WriteNoticeRequest;
import com.project.controller.ModifyNoticeRequest;
import com.project.dao.NoticeDAO;
import com.project.dao.NoticeDAOImpl;
import com.project.dto.NoticeVO;

public class NoticeServiceImpl implements NoticeService {

	private static NoticeServiceImpl instance = new NoticeServiceImpl();

	private NoticeServiceImpl() {
	}

	public static NoticeServiceImpl getInstance() {
		return instance;
	}

	
	private NoticeDAO NoticeDAO=NoticeDAOImpl.getInstance();		
	public void setNoticeDAO(NoticeDAO NoticeDAO) {
		this.NoticeDAO = NoticeDAO;
	}

	@Override
	public List<NoticeVO> getNoticeList() throws SQLException {
		List<NoticeVO> noticeList = NoticeDAO.selectNoticeList();
		return noticeList;
	}

	@Override
	public void writeNotice(WriteNoticeRequest req) throws SQLException{

		NoticeVO Notice=req.toNoticeVO();	

		NoticeDAO.insertNotice(Notice);

	}

	@Override
	public void modifyNotice(ModifyNoticeRequest req) throws SQLException {
		NoticeVO Notice = req.toNoticeVO();
		NoticeDAO.updateNotice(Notice);
	}

	@Override
	public void removeNotice(int Notice_no) throws SQLException {
	/*	if (loginUser.getNotice_id().equals(Notice_id)) { //
			SessionScope.loginUser = null;
		}*/
		NoticeDAO.deleteNotice(Notice_no);
		
	}

	@Override
	public NoticeVO getNoticeByNo(int notice_no) throws SQLException {
		NoticeVO member = NoticeDAO.selectNoticeByNo(notice_no);
		return member;
	}



}
