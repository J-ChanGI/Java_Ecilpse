<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h2>상품등록</h2>
	
		<form action="goodsupload" method="post"><br>
			상품이름 : <input type="text" name="goodsname"><br>
			브랜드 : <input type="text" name="goodsbrand"><br>
			가격 : <input type="text" name="goodsprice"><br>
			카테고리 : <input type="text" name="catename"><br>
			<input type="submit" value="등록"><br>
		</form>
</body>
</html>