<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	#body{
		margin-left: 20%;
		margin-right : 20%;
	}
	#form{
		display: inline-block;
        
		top : 50%;
		left : 50%;
		position : absolute;
		width : 300px ; height : 160px;
		margin-left : -200px;
		margin-top : -200px;
	}
</style>
<title>Insert title here</title>
</head>
<body>
<div id="body">
	<div id="form">
	 <a href=".">홈</a><br>
	 <h2>로그인</h2>
	<form action="login" method="post">
		<input type="text" name="mid" placeholder="아이디"><br>
		<br>
		<input type="password" name="mpassword" placeholder="비밀번호"><br>
		<br>
		<input type="submit" value="로그인"><br>
		
	</form>
	</div>
</div>	
</body>
</html>