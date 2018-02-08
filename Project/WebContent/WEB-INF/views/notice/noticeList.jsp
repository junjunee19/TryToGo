<%@page import="com.project.dto.NoticeVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<a href="<%=request.getContextPath()%>/notice/writeNotice"><button>글쓰기</button></a>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성날짜</th>
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

		<c:forEach var="notice" items="${noticeList }">
			<tr>
				<td>${notice.notice_no }</td>
				<td><a href="noticeRead?notice_no=${notice.notice_no}">${notice.notice_title }</a></td>
				<td>${notice.notice_wdate }</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>