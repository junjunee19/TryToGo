package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.exception.FailToVerifiedIDException;
import com.project.request.JoinRequest;
import com.project.service.MemberService;
import com.project.service.MemberServiceImpl;
import com.test.view.ViewResolver;

@WebServlet("/member/join")
public class joinMemberController extends HttpServlet { //1url결정
  
   /* public joinMemberServlet() {
        super();
        
    }*/

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //사용자한
		String url="/member/joinForm";
		ViewResolver.View(url, request, response);
		request.getRequestDispatcher(url).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");//한글꺠짐방지. 
		String url="redirect:/member/list";//가야할 페이지 redirecting
		
		MemberService service=MemberServiceImpl.getInstance();
		
		JoinRequest joinReq=new JoinRequest();		//membeVO가져와서
		joinReq.setMember_id(request.getParameter("member_id")); //memberVO에 입력한 Parameter set.! 객체화!!
		joinReq.setMember_pwd(request.getParameter("member_pwd"));
		joinReq.setMember_name(request.getParameter("member_name"));
		joinReq.setMember_email(request.getParameter("member_email"));
		
		try {
			service.joinMember(joinReq); //사용자가 입력한 command객체를 service에 넘긴다.
		} catch (SQLException e) {		
			url="/commons/error";
			e.printStackTrace();
			/*request.getRequestDispatcher(url).forward(request, response);
			return; //흐르면안됨.
*/		} catch (FailToVerifiedIDException e) {	//중복처리 Exception
			url="/member/joinForm";
			request.setAttribute("msg", "아이디중복입니다.");			
			e.printStackTrace();			
			/*request.getRequestDispatcher(url).forward(request, response);
			return; //흐르면안됨.
*/			
		}
		
	/*	response.sendRedirect(url);*/
		ViewResolver.View(url, request, response);
	}

}
