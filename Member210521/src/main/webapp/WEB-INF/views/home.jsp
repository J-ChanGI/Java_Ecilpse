<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
	<!-- 아래 두개 링크는 단순 페이지 이동을 위한 링크 -->
	<a href="joinpage">회원가입페이지로이동</a> <br>
	<a href="loginpage">로그인페이지로이동</a> <br>
	<!-- 아래 링크는 DB에서 정보를 가져와서 memberlist.jsp에 출력하기 위한 링크 -->
	<a href="memberlist">회원목록출력</a> <br>
	
	로그인아이디: ${sessionScope.loginMember} <br>
</body>
</html>
