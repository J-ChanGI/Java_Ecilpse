<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function update(){
			location.href="memboardupdate";
		}
	</script>
	
	
</head>
<body>
	로그인 아이디 : ${sessionScope.memboardlogin}<br>
	<h2>회원정보</h2>
		아이디 : ${memboardview.mid }<br>
		비밀번호 : ${memboardview.mpassword }<br>
		이름 : ${memboardview.mname }<br>
		전화번호 : ${memboardview.mnumber }<br>
		이메일 : ${memboardview.memail }<br>
		프로필사진 : ${memboardview.mfilename }<br>
		
	<button onclick="update()">회원정보수정</button><br>
	
</body>
</html>