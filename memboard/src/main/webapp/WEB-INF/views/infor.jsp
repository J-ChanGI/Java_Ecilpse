<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원정보상세조회</h2><br>
	
	<h2>회원정보</h2><br>
		아이디 : ${infor.mid}<br>
		비밀번호 : ${infor.mpassword}<br>
		이름 : ${infor.mname}<br>
		전화번호 : ${infor.mnumber}<br>
		이메일 : ${infor.memail}<br>
		프로필사진 : ${infor.mfilename}<br>
</body>
</html>	