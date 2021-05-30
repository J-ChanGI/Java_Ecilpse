<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>view</h2>
	글번호 : ${board.bnumber}<br>
	작성자 : ${board.bwriter}<br>
	비밀번호 : ${board.bpassword}<br>
	제목 : ${board.btitle}<br>
	내용 : ${board.bcontemts}<br>
	작성시간 : ${board.bdate}<br>
	조회수 : ${board.bhits}<br>
	<a href="boardlist">목록으로 돌아가기</a>	
</body>
</html>















