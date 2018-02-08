package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.scope.SessionScope;
import com.project.dto.MemberVO;
import com.project.service.MemberService;
import com.project.service.MemberServiceImpl;
import com.test.view.ViewResolver;


@WebServlet("/member/list")
public class MemberListcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //화면결정하고 처리할거처리하고 
		String url="/member/list";  //content
		//String url="/WEB-INF/views/member/list.jsp"; 
		MemberService memberService=MemberServiceImpl.getInstance(); //이전에있던 view가했던역할을함
		
		MemberVO loginUser=SessionScope.loginUser;
		
		request.setAttribute("loginUser", loginUser);
		
		try {
			List<MemberVO> memberList=memberService.getMemberList(); //memberVO를 list로 가져와서 memberList에 저장.
			request.setAttribute("memberList", memberList);
			System.out.println("성공");
		} catch (SQLException e) {			
			e.printStackTrace(); //사용자한테 나가지않고 console에 찍힘.
			request.setAttribute("error", "시스템에러 발생했습니다.");
		}
		System.out.println("ddddd");
		ViewResolver.View(url, request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
