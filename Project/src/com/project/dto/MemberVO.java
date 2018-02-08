package com.project.dto;

public class MemberVO {

	private String member_id;
	private String member_name;	
	private String member_email;
	private String member_pwd;
	private int member_quelified;
	
	
	public MemberVO(){}
	public MemberVO(String member_id,String member_email, String member_pwd){
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_email = member_email;
		this.member_pwd = member_pwd;
	}
	public MemberVO(String member_id, String member_name, String member_email, String member_pwd,
			int member_quelified) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_email = member_email;
		this.member_pwd = member_pwd;
		this.member_quelified = member_quelified;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_pwd() {
		return member_pwd;
	}
	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}
	public int getMember_quelified() {
		return member_quelified;
	}
	public void setMember_quelified(int member_quelified) {
		this.member_quelified = member_quelified;
	}
	@Override
	public String toString() {
		return "MemberVO [member_id=" + member_id + ", member_name=" + member_name + ", member_email=" + member_email
				+ ", member_pwd=" + member_pwd + ", member_quelified=" + member_quelified + "]";
	}

	
}
