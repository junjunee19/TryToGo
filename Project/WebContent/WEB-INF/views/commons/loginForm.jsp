<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<link rel="stylesheet" href="<%=request.getContextPath() %>/resources/css/page.css"> 
<div id=content>
	<h1>회원 로그인</h1>
	<hr/>
	<form method="post">
		아이디 : <input type='text' name="id" value="${param.id}"/><br/>
	<%-- 	<% if(id!=null){ %>
		value="<%=id %>"
		<% } %> --%>		
		패스워드 : <input type="password" name="pwd" /><br/>
		<input type="submit" class="btn" value="LOGIN" />
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset"class="btn"  value="RESET" />
	</form>
	
	<div>
		<h3 style="color:red;">${msg }</h3>
	</div>	
</div><!--content  --> 

<%@ include file="/WEB-INF/views/include/footer.jsp" %>