package com.project.request;

import com.project.dto.MemberVO;

public class ModifyRequest {

	
	private String member_email;
	private String member_id;
	private String member_pwd;	
	
	public ModifyRequest(){}
	public ModifyRequest(String member_email,String member_pwd) {
		super();		
		this.member_email = member_email;
	}	
	public String getMember_email() {
		return member_email;
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
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}	
	
	
	
	public MemberVO toMemberVO(){
		MemberVO member=new MemberVO();		
		member.setMember_pwd(member_pwd);
		member.setMember_id(member_id);
		member.setMember_email(member_email);
		return member;
	} 
	
	
}
