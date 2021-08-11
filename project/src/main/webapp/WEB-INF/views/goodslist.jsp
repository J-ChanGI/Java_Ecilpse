<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<style>
			#goodslist{
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
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="body">
<a href=".">home</a><br>
		<div id="goodslist">
	
	
	
		<table>
			<tr>
				<th>상품이름</th>
			
			</tr>
			<c:forEach var = "goods" items="${goodslist}">
				
				<tr>
					<td><a href="goodsview?goodsnumber=${goods.goodsnumber}"><img src="${goods.goodsimgname}"></a></td>
				</tr>
			
			</c:forEach>
			
		</table>
		
	</div>
</div>	
		
</body>
</html>