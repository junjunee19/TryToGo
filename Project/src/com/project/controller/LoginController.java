package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbc.exception.InvalidPasswordException;
import com.jdbc.exception.NotFoundIDException;
import com.project.dto.MemberVO;
import com.project.request.LoginRequest;
import com.project.service.MemberService;
import com.project.service.MemberServiceImpl;
import com.test.view.ViewResolver;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/commons/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/commons/loginForm";
		ViewResolver.View(url, request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		LoginRequest logreq=new LoginRequest(id,pwd);
		
		MemberService service=MemberServiceImpl.getInstance();
		
		String url="redirect:/member/list"; //list
		
		HttpSession session=request.getSession();
		
		try {
			MemberVO member=service.login(logreq);	//memberVO줘.
			session.setAttribute("loginUser", member);
			
			
		} catch (SQLException e) {
			url="/commons/error";//redirecting이아니기떄문에 
			request.setAttribute("msg", "데이터베이스 장애입니다.");
			e.printStackTrace();
			
		} catch (NotFoundIDException e) {
			url="/commons/loginForm";
			request.setAttribute("msg", "아이디가 존재하지않습니다.");
			e.printStackTrace();
				
		} catch (InvalidPasswordException e) {
			url="/commons/loginForm";
			request.setAttribute("msg", "패스워드가 존재하지않습니다.");
			e.printStackTrace();
					
		}
		
		ViewResolver.View(url, request, response);
	}

}
