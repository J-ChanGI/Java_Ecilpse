<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>글 쓰기</h2>
		<form action = "boardwrite" method="past" enctype="multipart/form-data" ><br>
		제목 : <input type="text" name="btitle"><br>
		내용 : <input type="text" name="bcontents"><br>
		파일 : <input type="file" name="bfile"><br>
		<input type = "submit" value="작성"><br>	
		</form>
</body>
</html>