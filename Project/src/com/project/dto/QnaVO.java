package com.project.dto;

import java.util.Date;

public class QnaVO {
	
	
	
	private int qna_type;
	private int qna_typesno;
	private String qna_title;
	private Date qna_wdate;
	private int qna_secret;
	private String qna_content;
	private String qna_anser;
	private String member_id;
	
	
	public QnaVO(){}
	public QnaVO(int qna_type, int qna_typeno, String qna_title, Date qna_wdate, int qna_secret, String qna_content,
			String qna_anser, String member_id) {
		super();
		this.qna_type = qna_type;
		this.qna_typesno = qna_typeno;
		this.qna_title = qna_title;
		this.qna_wdate = qna_wdate;
		this.qna_secret = qna_secret;
		this.qna_content = qna_content;
		this.qna_anser = qna_anser;
		this.member_id = member_id;
	}
	public int getQna_type() {
		return qna_type;
	}
	public void setQna_type(int qna_type) {
		this.qna_type = qna_type;
	}
	public int getQna_typeno() {
		return qna_typesno;
	}
	public void setQna_typeno(int qna_typeno) {
		this.qna_typesno = qna_typeno;
	}
	public String getQna_title() {
		return qna_title;
	}
	public void setQna_title(String qna_title) {
		this.qna_title = qna_title;
	}
	public Date getQna_wdate() {
		return qna_wdate;
	}
	public void setQna_wdate(Date qna_wdate) {
		this.qna_wdate = qna_wdate;
	}
	public int getQna_secret() {
		return qna_secret;
	}
	public void setQna_secret(int qna_secret) {
		this.qna_secret = qna_secret;
	}
	public String getQna_content() {
		return qna_content;
	}
	public void setQna_content(String qna_content) {
		this.qna_content = qna_content;
	}
	public String getQna_anser() {
		return qna_anser;
	}
	public void setQna_anser(String qna_anser) {
		this.qna_anser = qna_anser;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	@Override
	public String toString() {
		return "QnaVO [qna_type=" + qna_type + ", qna_typeno=" + qna_typesno + ", qna_title=" + qna_title
				+ ", qna_wdate=" + qna_wdate + ", qna_secret=" + qna_secret + ", qna_content=" + qna_content
				+ ", qna_anser=" + qna_anser + ", member_id=" + member_id + "]";
	}
	
	
}
