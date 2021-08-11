<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		#upload{
			display: inline-block;
       		top : 10%;
			position : absolute;
			width : 300px ; height : 160px;
			}
	
		#body{
			margin-left: 20%;
			margin-right : 20%;
		}
	</style>
</head>

<body>
<div id="body">
<a href=".">home</a>
	<div id="upload">

	<p>상품등록</p>
		
		<form action="goodsupload" method="post" enctype="multipart/form-data"><br>
			상품명 : <input type="text" name="goodsname"><br><br>
			
			상품브랜드 : <input type="text" name="goodsbrand"><br><br>
			
			상품설명 : <input type="text" name="goodsintro"><br><br>
			
			상품이미지 : <input type="file" name="goodsimg"><br><br>
			
			카테고리 : <input type="text" name="category"><br><br>
			
			가격 : <input type="text" name="goodsprice"><br><br>
			
			종류 : <input type="text" name="goodstype"><br><br>
			
			<input type="submit" value="등록"><br><br>
		</form>
	</div>
</div>		
</body>
</html>