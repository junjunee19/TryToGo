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
	
	<form name="frm">
		<table border="1">
			<tr>
				<td>번호</td>
				<td>
					<input type="text" name="notice_no" readonly style="background:#aaaaaa;" value="${notice.notice_no}" />				
				</td>	
		   </tr>
			<tr>
				<td>제목</td>
				<td>	
					<input type="text" name="notice_title" value="${notice.notice_title }"/>
				</td>
			</tr>			
			<tr>
				<td>내용</td>
				<td>
				<input type="text" name="notice_content" value="${notice.notice_content }"/>
				</td>	
			</tr>
			<tr>
				<td>작성일자</td>
				<td>	${notice.notice_wdate }
				</td>
			</tr>		
		</table>
		<button id="saveBtn">SAVE</button>&nbsp;&nbsp;&nbsp;
	</form>
		
		<button id="cancelBtn" onclick="cancel_go();">CANCEL</button>&nbsp;&nbsp;&nbsp;
		<button id="listBtn">LIST</button>&nbsp;&nbsp;&nbsp;						
	</div>
</body>
<script>
var saveBtn=document.getElementById("saveBtn");
saveBtn.onclick=function(event){
   document.frm.action="modifyNotice";
   document.frm.method="post";
   document.frm.submit();
};
var cancelBtn=document.getElementById("cancelBtn");
cancelBtn.onclick=function(event){
   history.go(-1);
};
var listBtn=document.getElementById("listBtn");
listBtn.onclick=function(event){
   location.href="noticeList";
};
</script>

</html>