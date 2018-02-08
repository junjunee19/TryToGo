package com.test.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewResolver {

	public static void View(String url, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		if(url.indexOf("redirect:")==0){
			//redirect:/member/list 이렇게 올거야,
			url=request.getContextPath()+url.replace("redirect:", ""); //이렇게 설정하면 중복하는부분 없저짐
			System.out.println(url);
			response.sendRedirect(url);
		}else{
			url="/WEB-INF/views"+url+".jsp";
			request.getRequestDispatcher(url).forward(request, response); //forwarding
			
		}
		
		
	}
}
