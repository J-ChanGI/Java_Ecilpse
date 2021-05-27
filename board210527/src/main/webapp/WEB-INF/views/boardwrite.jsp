<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
		<form action ="boardwrite" method="post">
			
			작성자 <input type="text" name="bwriter"><br>
			비밀번호 <input type="text" name="bpassword"><br>
			글제목 <input type="text" name="btitle"><br>
			내용 <input type="text" name="bcontents"><br>
		
		 	<input type="submit" value="작성"><br>
								
		</form>
		
		 
</body>
</html>