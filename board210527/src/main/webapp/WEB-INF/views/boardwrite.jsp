<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h2>미첨부파일 글쓰기 </h2>		
		<form action ="boardwrite" method="post">
			
			작성자 <input type="text" name="bwriter"><br>
			비밀번호 <input type="text" name="bpassword"><br>
			글제목 <input type="text" name="btitle"><br>
			내용 <input type="text" name="bcontents"><br>
		
		 	<input type="submit" value="작성"><br>
								
		</form>
		
		
		<!--첨부파일 글쓰기-->
		<h2>첨부파일 글쓰기</h2>
		<form action ="boardwritefile" method="post" enctype="multipart/form-data">
			
			작성자 <input type="text" name="bwriter"><br>
			비밀번호 <input type="text" name="bpassword"><br>
			글제목 <input type="text" name="btitle"><br>
			내용 <input type="text" name="bcontents"><br>
			파일 : <input type="file" name="bfile"><br>
		 	<input type="submit" value="작성"><br>
								
		</form>
		
		
		
		 
</body>
</html>