package com.project.dto;

import java.util.Date;

public class CommentsVO {

	private int comments_no;
	private int comments_type;
	private int comments_typeno;
	private String comments_content;
	private Date comments_wdate;
	private int comments_complain;
	private String comments_memberid;
	
	
	public CommentsVO(){}
	public CommentsVO(int comments_no, int comments_type, int comments_typeno, String comments_content,
			Date comments_wdate, int comments_complain, String comments_memberid) {
		super();
		this.comments_no = comments_no;
		this.comments_type = comments_type;
		this.comments_typeno = comments_typeno;
		this.comments_content = comments_content;
		this.comments_wdate = comments_wdate;
		this.comments_complain = comments_complain;
		this.comments_memberid = comments_memberid;
	}
	public int getComments_no() {
		return comments_no;
	}
	public void setComments_no(int comments_no) {
		this.comments_no = comments_no;
	}
	public int getComments_type() {
		return comments_type;
	}
	public void setComments_type(int comments_type) {
		this.comments_type = comments_type;
	}
	public int getComments_typeno() {
		return comments_typeno;
	}
	public void setComments_typeno(int comments_typeno) {
		this.comments_typeno = comments_typeno;
	}
	public String getComments_content() {
		return comments_content;
	}
	public void setComments_content(String comments_content) {
		this.comments_content = comments_content;
	}
	public Date getComments_wdate() {
		return comments_wdate;
	}
	public void setComments_wdate(Date comments_wdate) {
		this.comments_wdate = comments_wdate;
	}
	public int getComments_complain() {
		return comments_complain;
	}
	public void setComments_complain(int comments_complain) {
		this.comments_complain = comments_complain;
	}
	public String getComments_memberid() {
		return comments_memberid;
	}
	public void setComments_memberid(String comments_memberid) {
		this.comments_memberid = comments_memberid;
	}
	@Override
	public String toString() {
		return "CommentsVO [comments_no=" + comments_no + ", comments_type=" + comments_type + ", comments_typeno="
				+ comments_typeno + ", comments_content=" + comments_content + ", comments_wdate=" + comments_wdate
				+ ", comments_complain=" + comments_complain + ", comments_memberid=" + comments_memberid + "]";
	}
	
	
}
