<%@page import="com.project.dto.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/page.css"> 
<div id=content>
	<h1>회원 상세정보</h1>
	<hr/>

<%-- 
<%
	MemberVO member=(MemberVO)request.getAttribute("member");	
%> 
필요없음. el문이 알아서해줌.--%>

		<table border="1">
			<tr>
				<td>아이디</td><td>${member.member_id }</td>	
		   </tr>
			<tr>
				<td>패스워드</td><td>${member.member_pwd }</td>
			</tr>			
			<tr>
				<td>이름</td><td>${member.member_name }</td>	
			</tr>
			<tr>
				<td>이메일</td><td>${member.member_email }</td>
			</tr>		
		</table>
		<button class="btn" id="modifyBtn">MODIFY</button>&nbsp;&nbsp;&nbsp;
		<button class="btn" id="deleteBtn" onclick="delete_go();">DELETE</button>&nbsp;&nbsp;&nbsp;
		<button class="btn" id="listBtn">LIST</button>&nbsp;&nbsp;&nbsp;
		<!-- 		
		<input type="button" value="수정" onclick="javascript:location.href='member/modify';" />
		<input type="button" value="삭제" onclick="javascript:location.href='delete';" />
		<input type="button" value="목록" onclick="javascript:location.href='list';" /> -->
						
<script>
	var modifyBtn=document.getElementById("modifyBtn")
	modifyBtn.onclick=function(event){
		location.href="modify?member_id=${member.member_id}";		
	};
				
	function delete_go(){
		location.href="delete?member_id=${member.member_id}";
	}
	
	var listBtn=document.getElementById("listBtn");
	listBtn.addEventListener("click",list_go);   //리스너의 (이벤트, 핸들러)
	
	function list_go(){
		location.href="list";
	};
</script>
</div><!-- content -->
<%@ include file="/WEB-INF/views/include/footer.jsp" %>
