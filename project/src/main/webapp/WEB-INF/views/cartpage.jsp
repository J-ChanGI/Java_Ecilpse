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
</style>

<script>
		function cartdelete(cartcode){
			location.href="cartdelete?cartcode="+ cartcode;
		}
		
</script>
</head>
<body>
<a href=".">메인페이지</a><br>
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
					<th>${cart.cartimgname}</th>
					<th>1</th>		
					<th><button onclick="cartdelete(${cart.cartcode})">삭제</button>	</th>
				</tr>
				
				
				
		</c:forEach>
			
			</table>	
			<h2>합계 금액 : </h2>
			

</body>
</html>