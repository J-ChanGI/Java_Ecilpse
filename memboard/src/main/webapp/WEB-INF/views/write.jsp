<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	로그인 아이디 : ${sessionScope.memboardlogin}<br>
	<h2>글 쓰기</h2>
		<form action = "boardwrite" method="post" enctype="multipart/form-data" ><br>
		작성자 : <input type ="text" name="bwriter" ><br>
		제목 : <input type="text" name="btitle"><br>
		내용 : <input type="text" name="bcontents"><br>
		파일 : <input type="file" name="bfile"><br>
		<input type = "submit" value="작성"><br>	
		</form>
</body>
</html>