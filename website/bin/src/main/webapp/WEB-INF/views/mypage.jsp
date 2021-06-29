<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<script>
			function memberupdate(){
				location.href="memberupdate"
			}
			function memberlistjoin(){
				location.href="memberlistjoin"
			}
			function goodsuploadjoin(){
				location.href="goodsuploadjoin"
			}
		</script>
</head>
<body>
<a href=".">사이트</a>
	<h2>마이페이지</h2>
	로그인 아이디 : ${sessionScope.login}<br>
	
	
	
	
	<button onclick="memberupdate()">회원정보수정</button>
	<c:if test="${sessionScope.login eq 'admin' }">
	<button onclick="memberlistjoin()">회원 전체 목록 (관리자용)</button>
	<button onclick="goodsuploadjoin()">상품등록(관리자용)</button>
	</c:if>
</body>
</html>