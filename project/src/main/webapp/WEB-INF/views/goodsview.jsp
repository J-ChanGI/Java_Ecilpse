<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function goodsdelete(goodsnumber){
			location.href="goodsdelete?goodsnumber="+ goodsnumber;
		}
	</script>

	
</head>
<body>
	<a href=".">홈</a><br>
	<h2>상세정보</h2>
	<div>
		<div>
			<div>
				${goods.goodsname}<br>			
			</div>
		
		</div>
			<form action="cart" method="post">
				<input type="hidden" name="cartid">
				<input type="hidden" name="cartgoods">
				<input type="hidden" name="cartprice">
				<input type="hidden" name="cartnumber">
				<input type="hidden" name="cartamount">
				<input type="hidden" name="cartcode">
				<input type="submit" value="찜">				
			</form>
			<button onclick="goodsdelete('${goods.goodsnumber}')">삭제</button>
	</div> 

</body>
</html>