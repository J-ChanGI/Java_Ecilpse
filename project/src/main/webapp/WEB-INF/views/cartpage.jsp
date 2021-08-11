<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
		table, tr, th{
			border: 1px solid black ;
		}
		#body{
			margin-left: 20%;
			margin-right : 20%;
			top : 10%;
		}
</style>

<script>
		function cartdelete(cartcode){
			location.href="cartdelete?cartcode="+ cartcode;
		}
		
</script>
</head>
<body>
<div id="body">
<a href=".">home</a><br>
<h2>장바구니</h2>
		<table>
			<tr>
				<th>상품이름</th>
				<th>가격</th>
				<th>상품코드</th>
				<th>수량</th>
				<th>이미지</th>
				<th>합계</th>
				<th>비고</th>
			</tr>
		
		
		<c:forEach var ="cart" items="${cartlist}">
			
				<tr>
					
					<th>${cart.cartgoods}</th>
					<th>${cart.cartprice}원</th>
					<th>${cart.cartnumber}</th>
					<th>${cart.cartamount}</th>
					<th><img src="${cart.cartimgname}"></th>
					<th>${cart.cartsum}원</th>		
					<th><button onclick="cartdelete(${cart.cartcode})">삭제</button>	</th>
				</tr>
				
				
				
		</c:forEach>
			
			</table>	
</div>			
			

</body>
</html>