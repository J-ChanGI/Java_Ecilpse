<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		 function count(type)  {
		  
		  const resultElement = document.getElementById('result');
		  		sum = document.getElementById('idsum');
		  		 
		  let number = resultElement.value;
		  	
		  
		  if(type === 'plus') {
		    number = parseInt(number) + 1;
		    idsum.value = number * ${orders.goodsprice};
		  }else if(type === 'minus')  {
		    number = parseInt(number) - 1;
		    idsum.value = number * ${orders.goodsprice} ;;
		  }
		  
		  resultElement.value = number;
			
		 } 
		
		
		
		
		
	</script>
	
	
	
</head>
<body>
<a href=".">메인페이지</a>
		<h2>주문하기</h2>
		
		<div id="1">
			<div >
			<form action="" method="post">
				<p>이름 : <input type="text" name="" value=" ${order.mid}"></p>
				<p>전화번호 : <input type="text" name="" value="${order.mnumber}"></p>
				<p>이메일 : <input type="text" name="" value="${order.memail}">@ <input type="text" name="" value="${order.mdomain}"></p>
				<p>주소번호 : <input type="text" name="" value="${order.maddressnumber}"></p>
				<p>도로명주소 : <input type="text" name="" value="${order.mroadaddress}"></p>
				<p>지번주소 : <input type="text" name="" value="${order.mlandaddress}"></p>
				<p>상세주소 : <input type="text" name="" value="${order.mdatailedaddress}"></p>
				<p>참조 : <input type="text" name="" value="${order.mnote}"></p>
				<p>상품명 : <input type="text" name="" value=" ${orders.goodsname}" readonly></p>
				<p>브랜드 : <input type="text" name="" value=" ${orders.goodsbrand}"readonly></p>
				<p>가격 : <input type="text" name="" value="${orders.goodsprice}원" readonly></p>
				<p>수량 : <input type="button" onclick='count("minus")' value="-"> 
                 		<input type="text" id="result" name="orderamount" value="1">                 		
						<input type="button" onclick='count("plus")' value="+">
				
				<p>상품번호 :<input type="text" name="" value=" ${orders.goodsnumber}"></p>
				<p>합계 :  <input type="text" id="idsum" name="sum" value="${orders.goodsprice}"></p>
				<input type="submit" value="결제하기">
			</form>
			</div>	
			<div >
				
			</div>
		</div>
		<div id="2">
			
			
		</div>
			
		
</body>
</html>