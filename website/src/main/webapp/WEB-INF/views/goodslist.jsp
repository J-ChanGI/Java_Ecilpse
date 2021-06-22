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
<div>
<a href=".">사이트</a><br>
</div>	
<div>
		<table>
				<tr>
					<th>상품이름</th>
				</tr>
			<c:forEach var = "goods" items="${goodslist}">
				<tr>
					<td><a href="goodsname=${goods.goodsname}">${goods.goodsname}</a></td>
										
				</tr>				
			</c:forEach>
			
			</table>
		
			
</div>			
</body>
</html>