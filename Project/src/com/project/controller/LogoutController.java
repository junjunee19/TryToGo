package com.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/commons/logout")
public class LogoutController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String url=request.getContextPath()+"/member/list";
		
		HttpSession session=request.getSession();
		session.invalidate();
		
	/*	if(SessionScope.loginUser!=null){
			SessionScope.loginUser=null;
		}*/
		
		response.sendRedirect(url);
	}

	

}
