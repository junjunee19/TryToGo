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
	<form action="writeNotice" method="post">
		제목 : <input type="text" name="notice_title" /><br/>
		내용 : <input type="text" name="notice_content" /><br/>
		<input type="submit" value="작성완료" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="취소하기" />
		&nbsp;&nbsp;&nbsp;
		<input type="button" value="목록으로" onclick="javascript:location.href='noticeList';" />
	</form>
</body>
</html>