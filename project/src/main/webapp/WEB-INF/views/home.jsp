<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	<script>
		function membershipjoin(){
			location.href = "membershipjoin";			
		}
		function loginjoin(){
			location.href = "loginjoin";			
		}
		function mypagejoin(){
			location.href ="mypage";
		}
		function logout(){
			location.href="logout";
		}
		
	</script>
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  로그인된 아이디 : ${sessionScope.login} </P>
<a href=".">홈페이지</a><br>
	<div>
		<div>
			<div>
				<div>
					<div>
						<form action ="search" method="post">
							
							<select name="searchtype" style="display:none">
								<option value="goodsname, goodsbrand"></option>
							</select>
							
							<input type="text" name="keyword">
							<input type="submit" value="검색">					
						</form>
					</div>
				
				
					<button onclick="loginjoin()">로그인</button>
					<button onclick="membershipjoin()">회원가입</button>
					
					<c:if test="${ sessionScope.login ne null }" >
					<button onclick="logout()">로그아웃</button>
					<a href="mypage">마이페이지</a>
					<a href="cartpage"> 장바구니 </a>
					</c:if>				
				
				</div>
			</div>
				<div>
					<a href="goodslist?category=A">A</a>
				</div>
				<div>
					<a href="goodslist?category=C">C</a>
				</div>
		</div>	
				<div>
				<div>
					<h2>전체상품</h2>
					
					<c:forEach var ="homegoods" items="${homelist}">
						<td><a href="goodsview?goodsnumber=${homegoods.goodsnumber}">${homegoods.goodsname}</a></td>

					</c:forEach>
					
				</div>
						
				</div>
			
	
	</div>
	

</body>
</html>