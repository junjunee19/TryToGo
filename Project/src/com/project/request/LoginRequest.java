package com.project.request;

public class LoginRequest {
	private String member_id;
	private String member_pwd;
	
	public LoginRequest(){}
	public LoginRequest(String member_id, String member_pwd) {
		super();
		this.member_id = member_id;
		this.member_pwd = member_pwd;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pwd() {
		return member_pwd;
	}
	public void setMember_pwd(String member_pwd) {
		this.member_pwd = member_pwd;
	}
	@Override
	public String toString() {
		return "LoginRequest [member_id=" + member_id + ", member_pwd=" + member_pwd + "]";
	}
	
	
}
