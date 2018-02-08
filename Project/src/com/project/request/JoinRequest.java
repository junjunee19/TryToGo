package com.project.request;

import com.project.dto.MemberVO;

public class JoinRequest {
	
	private String member_id;
	private String member_name;
	private String member_email;
	private String member_pwd;
	
	public JoinRequest(){}
	public JoinRequest(String member_id, String member_name, String member_email, String member_pwd) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_email = member_email;
		this.member_pwd = member_pwd;
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
	@Override
	public String toString() {
		return "JoinRequest [member_id=" + member_id + ", member_name=" + member_name + ", member_email=" + member_email
				+ ", member_pwd=" + member_pwd + "]";
	}
	
	public MemberVO toMemberVO(){
		MemberVO member=new MemberVO();
		member.setMember_name(member_name);
		member.setMember_pwd(member_pwd);
		member.setMember_id(member_id);
		member.setMember_email(member_email);
		return member;
	} 
	
	

}
