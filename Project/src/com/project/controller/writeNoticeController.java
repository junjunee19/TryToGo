package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.service.NoticeService;
import com.project.service.NoticeServiceImpl;
import com.test.view.ViewResolver;

@WebServlet("/notice/writeNotice")
public class writeNoticeController extends HttpServlet { // 1url결정

	/*
	 * public joinMemberServlet() { super();
	 * 
	 * }
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { // 사용자한
		String url = "/notice/writeNoticeForm";
		ViewResolver.View(url, request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");// 한글꺠짐방지.
		String url = "redirect:/notice/noticeList";// 가야할 페이지 redirecting

		NoticeService service = NoticeServiceImpl.getInstance();

		WriteNoticeRequest writeReq = new WriteNoticeRequest(); // membeVO가져와서
		writeReq.setNotice_title(request.getParameter("notice_title")); // NoticeVO에
		writeReq.setNotice_content(request.getParameter("notice_content"));

		try {
			service.writeNotice(writeReq); // 사용자가 입력한 command객체를 service에 넘긴다.
		} catch (SQLException e) {
			url = "/commons/error";
			e.printStackTrace();
		}
		ViewResolver.View(url, request, response);
	}

}
