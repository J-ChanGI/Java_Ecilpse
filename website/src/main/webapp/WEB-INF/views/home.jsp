<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
		<script>
			function memberjoin(){
				location.href="memberjoin";
			}
			function loginjoin(){
				location.href="loginjoin"
			}
			function logout(){
				location.href="logout"
			}
			function mypagejoin(){
				location.href="mypagejoin"
			}
		</script>
	
</head>
<body>
		로그인 아이디 : ${sessionScope.login}<br>
		<button onclick="memberjoin()">회원가입</button><br>
		<button onclick="loginjoin()">로그인</button><br>
		
		<c:if test="${sessionScope.memboardlogin eq admin }">
		<button onclick="mypagejoin()">마이페이지</button><br>
		
		<button onclick="logout()">로그아웃</button>
		</c:if>
		
		
</body>
</html>
