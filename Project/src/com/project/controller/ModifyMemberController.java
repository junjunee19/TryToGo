package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.dto.MemberVO;
import com.project.request.ModifyRequest;
import com.project.service.MemberService;
import com.project.service.MemberServiceImpl;
import com.test.view.ViewResolver;

@WebServlet("/member/modify")// /contextPath뒤
public class ModifyMemberController extends HttpServlet {
	   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/member/modifyForm";
		
		HttpSession session=request.getSession();
		MemberVO loginUser=(MemberVO)session.getAttribute("loginUser");
		
		
		if(loginUser==null){
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			out.print("<script>alert('로그인이 필요합니다.');</script>");			
			url=request.getContextPath()+"/commons/login";
			/*response.sendRedirect(url);*/
			out.print("<script>");
			out.print("location.href='"+url+"'");
			out.print("</script>"); //redirect,forword가 중간에있으면 안됌. 그래서 out.이면 모두 out.으로한다.
			return;
		}
		
		String member_id=(String)request.getParameter("member_id");
		if(member_id!=null){
			MemberService service=MemberServiceImpl.getInstance();
			try {
				MemberVO member=service.getMemberByID(member_id);
				request.setAttribute("member", member);
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}else{
			return;
		}
		ViewResolver.View(url, request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url="redirect:/member/list";
		ModifyRequest modifyreq=new ModifyRequest();
	
		modifyreq.setMember_pwd(request.getParameter("member_pwd"));
		modifyreq.setMember_id(request.getParameter("member_id"));
		modifyreq.setMember_email(request.getParameter("member_email"));
		
	
		MemberService service=MemberServiceImpl.getInstance();
		try {
			service.modifyMember(modifyreq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ViewResolver.View(url, request, response);
	}

}
