<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>회원가입</h1>
		<form action ="member" method="post" enctype="multipart/form-data"><br>
			아이디 : <input type="text" name ="mid"><br>
			비밀번호 : <input type="text" name ="mpassword"><br>
			이름 : <input type="text" name ="mname"><br>
			전화번호 : <input type="text" name ="mnumber"><br>
			이메일 : <input type="text" name ="memail"><br>
			프로필사진 : <input type="file" name ="mfile"><br>
			<br>
			<input type="submit" value="회원가입">
		</form>
</body>
</html>