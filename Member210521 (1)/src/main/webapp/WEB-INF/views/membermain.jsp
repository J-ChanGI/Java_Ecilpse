<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>         
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
/* 로그아웃 버튼을 클릭하면 아래 logout 함수가 호출되고  */
	function logout() {
		// 아래 내용은 logout 주소를 요청하는 내용
		location.href="logout";
	}
	
	function update() {
		location.href="memberupdate";
	}
</script>
</head>
<body>
	<h2>membermain.jsp</h2>
	
	<!-- 세션에 저장한 값 출력 -->
	로그인아이디: ${sessionScope.loginMember} <br>
	
	<h2>${sessionScope.loginMember} 님 반갑습니다!!</h2> 
	
	<!-- 관리자(admin)로 로그인 했을때만 회원목록 링크 노출
		로그인아이디가 admin이면 회원목록 링크가 보이고 
		admin이 아니면 보이지 않음. -->
	<div style="background-color:yellow;">
	<c:if test="${sessionScope.loginMember eq 'admin'}">
		<a href="memberlist">회원목록조회(관리자전용)</a>
		<h2>로그인 아이디가 admin일때만 보입니다.</h2>
	</c:if>
	</div>
	<h2>여기는 누구나 보입니다.</h2>
	
	<button onclick="logout()">로그아웃</button> <br>
	
	<!-- 회원정보수정 절차
		1단계 : 정보수정 버튼을 클릭하면 DB로부터 내 정보를 가져와서 memberupdate.jsp에 출력을하고
		2단계 : memberupdate.jsp에서 이메일주소를 수정하고 수정한 내용을 DB에 반영 후 다시 membermain.jsp로 돌아옴. -->
	<button onclick="update()">회원정보수정</button> <br>
	
	<a href="./">홈으로</a>
</body>
</html>








