<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
		<script>
			function memberupdate(){
				location.href="memberupdate"
			}
		</script>
</head>
<body>
	<h2>마이페이지</h2>
	로그인 아이디 : ${sessionScope.login}<br>
	
	
	
	
	<button onclick="memberupdate()">회원정보수정</button>
</body>
</html>