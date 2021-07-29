<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function goodsdelete(goodsnumber){
			location.href="goodsdelete?goodsnumber="+ goodsnumber;
		}
		function goodsorder(goodsnumber){
			location.href="goodsorder?goodsnumber="+ goodsnumber;
		}
	
	</script>

	
</head>
<body>
	<a href=".">홈</a><br>
	<h2>상세정보</h2>
	<div>
		<div>
			<div>
				${goods.goodsimgname}<br>	
				${goods.goodsname}<br>			
				가격 : ${goods.goodsprice}원<br>
				${goods.goodsintro}<br>
			</div>
		
		</div>
		<div>
		<c:if test="${ sessionScope.login ne null }" >
			<form  action="cart"method="post">
				<input type="hidden" name="cartid" value="${sessionScope.login}">
				<input type="hidden" name="cartgoods" value="${goods.goodsname}">
				<input type="hidden" name="cartprice" value="${goods.goodsprice }">
				<input type="hidden" name="cartnumber" value="${goods.goodsnumber }">
				수량 : <input type="text" name="cartamount"><br>
				<input type="hidden" name="cartimgname" value="${goods.goodsimgname }">
				<input type="submit" value="장바구니">
							
			</form>
			</c:if>
				<button onclick="goodsorder('${goods.goodsnumber}')">주문하기</button>	
			<div>
			
			</div>
		</div>	
			<button onclick="goodsdelete('${goods.goodsnumber}')">삭제</button>
	</div> 

</body>
</html>