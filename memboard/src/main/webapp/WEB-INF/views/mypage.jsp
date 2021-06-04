<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2>마이페이지</h2><br>
		로그인 아이디 : ${sessionScope.memboardlogin}<br>
 		<a href="mbviewpage">회원정보</a><br>
 		<a href="mywritepage">내가 쓴 글보기</a>
 		
 		<c:if test="${sessionScope.memboardlogin eq 'admin' }">
 	
 		<a href="mblist">회원목록(관리자용)</a>
		</c:if>
</body>
</html>