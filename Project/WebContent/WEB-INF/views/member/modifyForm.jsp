<%@page import="com.project.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/page.css"> 

<div id=content>	
	<h1>정보 수정</h1>
	<form name="frm">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td>
					<input type="text" name="member_id" readonly style="background:#aaaaaa;" value="${member.member_id }" />				
				</td>	
		   </tr>
			<tr>
				<td>패스워드</td>
				<td>	
					<input type="password" name="member_pwd" value="${member.member_pwd }"/>
				</td>
			</tr>			
			<tr>
				<td>이름</td>
				<td>
				<input type="text" name="member_name" readonly style="background:#aaaaaa;"  value="${member.member_name }"/>
				</td>	
			</tr>
			<tr>
				<td>이메일</td>
				<td>
				<input type="text" name="member_id"  value="${member.member_email }" />					
				</td>
			</tr>		
		</table>
		<button class="btn" id="saveBtn">SAVE</button>&nbsp;&nbsp;&nbsp;
	</form>
		
		<button class="btn" id="cancelBtn" onclick="cancel_go();">CANCEL</button>&nbsp;&nbsp;&nbsp;
		<button class="btn" id="listBtn">LIST</button>&nbsp;&nbsp;&nbsp;						

<script>
var saveBtn=document.getElementById("saveBtn");
saveBtn.onclick=function(event){
   document.frm.action="modify";
   document.frm.method="post";
   document.frm.submit();
};
var cancelBtn=document.getElementById("cancelBtn");
cancelBtn.onclick=function(event){
   history.go(-1);
};
var listBtn=document.getElementById("listBtn");
listBtn.onclick=function(event){
   location.href="list";
};
</script>
</div><!--content  --> 

	<%@ include file="/WEB-INF/views/include/footer.jsp" %>
