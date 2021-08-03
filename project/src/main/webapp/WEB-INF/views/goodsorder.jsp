<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href=".">메인페이지</a>
		<h2>주문하기</h2>
		
		<div id="1">
			<div >
			
				<p>이름 :<input type="hidden" name="" value=" ${order.mid}"></p>
				<p>전화번호 : <input type="" name="" value="${order.mnumber}"></p>
				<p>이메일 : <input type="text" name="" value="${order.memail}">@ <input type="text" name="" value="${order.mdomain}"></p>
				<p>주소번호 : <input type="text" name="" value="${order.maddressnumber}"></p>
				<p>도로명주소 : <input type="text" name="" value="${order.mroadaddress}"></p>
				<p>지번주소 : <input type="text" name="" value="${order.mlandaddress}"></p>
				<p>상세주소 : <input type="text" name="" value="${order.mdatailedaddress}"></p>
				<p>참조 : <input type="text" name="" value="${order.mnote}"></p>
			
			</div>	
			<div >
				<p>상품명 : ${orders.goodsname}</p>
				<p>브랜드 : ${orders.goodsbrand}</p>
				<p>가격 : ${orders.goodsprice}</p>
				<p>수량 : </p>
				<p>상품번호 : ${orders.goodsnumber}</p>
				<p>합계 : </p>
			</div>
		</div>
		<div id="2">
			
			<button>결제하기</button>
		
		</div>
			
		
</body>
</html>