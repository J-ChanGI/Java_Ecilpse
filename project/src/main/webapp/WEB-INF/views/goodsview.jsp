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
		 function count(type)  {
			  
			  const resultElement = document.getElementById('result');
			  	sum = document.getElementById("idsum")
			  let number = resultElement.value;
			  
			  if(type === 'plus') {
			    number = parseInt(number) + 1;
			    idsum.value = number * ${goods.goodsprice}
			  }else if(type === 'minus')  {
			    number = parseInt(number) - 1;
			    idsum.value = number * ${goods.goodsprice}
			  }
			  
			  resultElement.value = number;
			} 
	
	
	</script>
<style>
			#view{
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
	<div id="view">
	<a href=".">홈</a><br>
	<h2>상세정보</h2>
	<div>
		<div>
			<div>
				<img src="${goods.goodsimgname}"><br>	<br>
				${goods.goodsname}<br>			<br>
				가격 : ${goods.goodsprice}원<br><br>
				${goods.goodsintro}<br><br>
			</div>
		
		</div>
		<div>
		<c:if test="${ sessionScope.login ne null }" >
			<form  action="cart" method="post" >
				<input type="hidden" name="cartid" value="${sessionScope.login}">
				<input type="hidden" name="cartgoods" value="${goods.goodsname}">
				<input type="hidden" name="cartprice" value="${goods.goodsprice }">
				<input type="hidden" name="cartnumber" value="${goods.goodsnumber }">
				
				수량 : <input type="button" onclick='count("minus")' value="-"> 
                 	  <input type="text" id="result" name="cartamount" value="1">                 		
					  <input type="button" onclick='count("plus")' value="+"><br>
				
				합계 :  <input type="text" id="idsum" name="cartsum" value="${goods.goodsprice}">	
					<br>
				<input type="hidden" name="cartimgname" value="${goods.goodsimgname}">
				<input type="submit" value="장바구니">
							
			</form>
			</c:if>
				<button onclick="goodsorder('${goods.goodsnumber}')">주문하기</button>	
			<div>
			
			</div>
		</div>	
			
			<button onclick="goodsdelete('${goods.goodsnumber}')">삭제</button>
	</div> 
</div>
</div>
</body>
</html>