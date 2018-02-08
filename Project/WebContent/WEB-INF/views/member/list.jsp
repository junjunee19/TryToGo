<%@page import="com.project.dto.MemberVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/page.css"> 
<div id=content>
	<h1>회원 리스트</h1>
	<a href="join"><button class="btn" >회원등록</button></a>
	<hr/>

<%-- <%
	List<MemberVO> memberList=(List<MemberVO>)request.getAttribute("memberList");
	String error=(String)request.getAttribute("error");
%> --%>	
	
<%-- <%
   MemberVO loginUser = (MemberVO)request.getAttribute("loginUser");z
   if(loginUser==null){
%>

<%}else{ %>
<%=loginUser.getMember_name() %>님 반갑습니다.

<%}%> 
스크립틀릿에서 JSTL로바뀜.--%>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>패스워드</th>
			<th>이름</th>
			<th>이메일</th>			
		</tr>
		
<%-- 		<%
			for(MemberVO member:${memberList}){			
		%>		
		
		<tr>
			<td><%=member.getMember_id() %></td>
			<td><%=member.getMember_pwd() %></td>
	
			  <td><a href="readPage?member_id=<%=member.getMember_id() %>" ><%=member.getMember_name() %></a></td>
			<td><%=member.getMember_regDate() %></td>			
		</tr>		
		<%
			}
		%>  --%>		
		<c:forEach var="member" items="${memberList }">
			<tr>
				<td>${member.member_id }</td>
				<td>${member.member_pwd }</td>
				<td><a href="readPage?member_id=${member.member_id}">${member.member_name }</a></td>
				<td>${member.member_email } </td>				
			</tr>
		</c:forEach>
		
	</table>
</div><!--content  --> 

	<%@ include file="/WEB-INF/views/include/footer.jsp" %>


	
	