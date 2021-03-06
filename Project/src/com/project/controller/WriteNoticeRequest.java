package com.project.controller;

import java.util.Date;

import com.project.dto.NoticeVO;

public class WriteNoticeRequest {

	private int notice_no;
	private String notice_title;
	private Date notice_wdate;
	private String notice_content;
	
	public WriteNoticeRequest() {}

	public WriteNoticeRequest(int notice_no, String notice_title, Date notice_wdate, String notice_content) {
		super();
		this.notice_no = notice_no;
		this.notice_title = notice_title;
		this.notice_wdate = notice_wdate;
		this.notice_content = notice_content;
	}

	public int getNotice_no() {
		return notice_no;
	}

	public void setNotice_no(int notice_no) {
		this.notice_no = notice_no;
	}

	public String getNotice_title() {
		return notice_title;
	}

	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}

	public Date getNotice_wdate() {
		return notice_wdate;
	}

	public void setNotice_wdate(Date notice_wdate) {
		this.notice_wdate = notice_wdate;
	}

	public String getNotice_content() {
		return notice_content;
	}

	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}
	
	public NoticeVO toNoticeVO(){
		NoticeVO notice=new NoticeVO();
		notice.setNotice_title(notice_title);
		notice.setNotice_content(notice_content);
		return notice;
	} 
}
