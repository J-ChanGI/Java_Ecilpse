<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>memberupdate.jsp</h2>
	<form action="updateprocess" method="post">
		아이디: <input type="text" name="mid" value="${member123.mid}"><br>
		비밀번호: <input type="text" name="mpassword" value="${member123.mpassword}"><br>
		이름: <input type="text" name="mname" value="${member123.mname}"><br>
		이메일: <input type="text" name="memail" value="${member123.memail}"><br>
	
		<input type="button" value="수정">
	</form>
</body>
</html>