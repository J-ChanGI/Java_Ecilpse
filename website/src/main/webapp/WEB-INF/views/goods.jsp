<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2>${goods.goodsname}</h2>
				
				상품이름 :	${goods.goodsname} <br>
				상품가격 :	${goods.goodsprice} <br>
				카테고리 :	${goods.catename} <br>
				
								
						
			
		<p>★ 본 상품은 프로모션 상품으로 유효기간 연장 및 환불이 불가합니다.<p>
	
</body>
</html>