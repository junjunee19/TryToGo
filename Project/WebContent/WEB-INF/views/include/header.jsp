<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page trimDirectiveWhitespaces="true" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<script
  src="http://code.jquery.com/jquery-1.12.4.min.js">
  </script>
<title></title>
<style>
*{
	margin:0px;
	padding:0px;
	
	list-style:none;
}
div#wrap{
	width:850px;
	margin:0 auto;	
}
div#wrap header{
	position:relative;
	height:200px;
	border:1px solid black;
	background:#ddddff;
	border-radius:15px;
	overflow:hidden;
}
div#wrap header div#head_top{	
	height:160px;	
	
}
div#wrap header div#head_bottom{
	width:100%;
	position:absolute;
	left:0;
	bottom:0;
	height:35px;		
	line-height:35px
	
}

div#head_bottom>button{
	margin-left:5px;
}

div#wrap div#top_menu{
	height:30px;
	line-height:30px;
}


div#wrap div#top_menu ul{
	overflow:hidden;
	background:gray;
	
	
}
div#wrap div#top_menu ul>li{
	float:right;
	margin-right:15px;
	font-size:12px;
	color:#efefef;
	font-weight:bold;
}

div#wrap div#head_top div#title{
	height:135px;
	line-height:135px;
}
div#wrap div#head_top div#title>h1{
	font-size:54px;
	text-align:center;
}

div#head_top div#top_menu ul>li>a{

	color:white;
	text-decoration:none;
}

.btn{
	height:30px;
	padding:0 5px;
	border-radius:7px;
	background:gray;
	border:1px solid white;
	color:white;
	font-weight:bold;
	cursor:pointer;
}

</style>
</head>
<body>
	<div id=wrap>
		<header>
			<div id="head_top">		
				<div id="top_menu">
					<ul>
						<li id="site"><a href="<%=request.getContextPath()%>/member/list">회원관리 </a> | 상품관리 | 게시판관리</li>
						<li id="log">${loginUser.member_name }님 반갑습니다.</li>
						<li>
							<c:choose>
								<c:when test="${empty loginUser }">
									<a href="<%=request.getContextPath() %>/commons/login"><button class="btn">로그인</button></a>
								</c:when>
									
								<c:otherwise>									
									<a href="<%=request.getContextPath() %>/commons/logout">
									<button class="btn" style="height:25px;">Logout</button></a>
								</c:otherwise>
							</c:choose>
						</li>
					</ul>										
				</div>
				<div id="title">
					<h1>관리자 페이지</h1>
				</div>					
			</div>
			<div id="head_bottom">
			<button class="btn" id="memberBtn">회원리스트</button>
			<button class="btn" id="productBtn">상품리스트</button>
			</div>
		</header>
<script>
<%-- 
			$('#memberBtn').click(function(event){ //click event handler
				$(location).attr('href','<%=request.getContextPath() %>/member/list');
			}); publisher 이 많이사용함. 추후에 생기는 동적인메서드에대해서 사용이 제한이된다.(페이지로딩을 할때 컴포넌트가있어야함.)
								그냥 디스패쳐에 요청하는것 --%>
			
			$('#memberBtn').on('click',function(event){ /* 개발자용 . 리스너에게 이벤트를 등록하는 방식.(리스너에 등록. 컴포넌트가 없어도됌. 이후에 )
				 */
				<%--  location.href="<%=request.getContextPath()%>/member/list"; --%>
				location.href="<c:url value="/member/list" />";
			});
			
</script>
	