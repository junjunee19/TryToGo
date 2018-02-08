<%@page import="com.project.dto.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<div id="wrap">
		<table border="1">
			<tr>
				<td>번호</td><td>${notice.notice_no }</td>	
		   </tr>
			<tr>
				<td>제목</td><td>${notice.notice_title }</td>
			</tr>			
			<tr>
				<td>내용</td><td>${notice.notice_content }</td>	
			</tr>
			<tr>
				<td>작성일자</td><td>${notice.notice_wdate }</td>
			</tr>		
		</table>
		<button id="modifyBtn">MODIFY</button>&nbsp;&nbsp;&nbsp;
		<button id="deleteBtn" onclick="delete_go();">DELETE</button>&nbsp;&nbsp;&nbsp;
		<button id="listBtn">LIST</button>&nbsp;&nbsp;&nbsp;
		<!-- 		
		<input type="button" value="수정" onclick="javascript:location.href='member/modify';" />
		<input type="button" value="삭제" onclick="javascript:location.href='delete';" />
		<input type="button" value="목록" onclick="javascript:location.href='list';" /> -->
						
	</div>
</body>
<script>
	var modifyBtn=document.getElementById("modifyBtn")
	modifyBtn.onclick=function(event){
		location.href="modifyNotice?notice_no=${notice.notice_no}";		
	};
				
	function delete_go(){
		location.href="deleteNotice?notice_no=${notice.notice_no}";
	}
	
	var listBtn=document.getElementById("listBtn");
	listBtn.addEventListener("click",list_go);   //리스너의 (이벤트, 핸들러)
	
	function list_go(){
		location.href="noticeList";
	};
</script>
</html>