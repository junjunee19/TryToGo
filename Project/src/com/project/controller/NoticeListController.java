package com.project.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dto.NoticeVO;
import com.project.service.NoticeService;
import com.project.service.NoticeServiceImpl;
import com.test.view.ViewResolver;


@WebServlet("/notice/noticeList")
public class NoticeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //화면결정하고 처리할거처리하고 
		String url="/notice/noticeList";  //content
		//String url="/WEB-INF/views/member/list.jsp"; 
		NoticeService noticeService=NoticeServiceImpl.getInstance(); //이전에있던 view가했던역할을함
		
		
		try {
			List<NoticeVO> noticeList=noticeService.getNoticeList(); //memberVO를 list로 가져와서 memberList에 저장.
			request.setAttribute("noticeList", noticeList);
		} catch (SQLException e) {			
			e.printStackTrace(); //사용자한테 나가지않고 console에 찍힘.
			request.setAttribute("error", "시스템에러 발생했습니다.");
		}

		ViewResolver.View(url, request, response);
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
