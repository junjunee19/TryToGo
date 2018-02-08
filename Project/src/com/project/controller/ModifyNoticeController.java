package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.NoticeVO;
import com.project.service.NoticeService;
import com.project.service.NoticeServiceImpl;
import com.test.view.ViewResolver;

@WebServlet("/notice/modifyNotice")// /contextPath뒤
public class ModifyNoticeController extends HttpServlet {
	   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/notice/modifyNoticeForm";
		
//		if(SessionScope.loginUser==null){
//			response.setContentType("text/html;charset=utf-8");
//			PrintWriter out=response.getWriter();
//			out.print("<script>alert('로그인이 필요합니다.');</script>");			
//			url=request.getContextPath()+"/commons/login";
//			/*response.sendRedirect(url);*/
//			out.print("<script>");
//			out.print("location.href='"+url+"'");
//			out.print("</script>"); //redirect,forword가 중간에있으면 안됌. 그래서 out.이면 모두 out.으로한다.
//			return;
//		}
		
		int notice_no=Integer.parseInt(request.getParameter("notice_no"));
//		if(notice_no!=0){
			NoticeService service=NoticeServiceImpl.getInstance();
			try {
				NoticeVO notice=service.getNoticeByNo(notice_no);
				request.setAttribute("notice", notice);
			} catch (SQLException e) {				
				e.printStackTrace();
			}
//		}else{
//			return;
//		}
		ViewResolver.View(url, request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url="redirect:/notice/noticeList";
		ModifyNoticeRequest modifyReq=new ModifyNoticeRequest();
		modifyReq.setNotice_no(Integer.parseInt(request.getParameter("notice_no")));
		modifyReq.setNotice_title(request.getParameter("notice_title"));
		modifyReq.setNotice_content(request.getParameter("notice_content"));
	
		NoticeService service=NoticeServiceImpl.getInstance();
		try {
			service.modifyNotice(modifyReq);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ViewResolver.View(url, request, response);
	}

}
