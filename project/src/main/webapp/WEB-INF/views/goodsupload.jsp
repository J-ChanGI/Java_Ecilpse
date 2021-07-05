<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href=".">메인페이지</a>
	<p>상품등록</p>
		
		<form action="goodsupload" method="post" enctype="multipart/form-data"><br>
			상품명 : <input type="text" name="goodsname"><br>
			상품브랜드 : <input type="text" name="goodsbrand"><br>
			상품설명 : <input type="text" name="goodsintro"><br>
			상품이미지 : <input type="file" name="goodsimg"><br>
			상품코드 : <input type="text" name="goodsnumber"><br>
			카테고리 : <input type="text" name="category"><br>
			가격 : <input type="text" name="goodsprice"><br>
			<input type="submit" value="등록"><br>		
		</form>
		
</body>
</html>