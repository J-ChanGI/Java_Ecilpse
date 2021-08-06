<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<style>
		.hoemgory{
			
		}
	
	</style>

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


<P>  로그인된 아이디 : ${sessionScope.login} </P>
		<div>
			
				<div>
					<div class="">
						<button onclick="loginjoin()">로그인</button>
						<button onclick="membershipjoin()">회원가입</button>
					
						<c:if test="${ sessionScope.login ne null }" >
						<button onclick="logout()">로그아웃</button>
						<a href="mypage">마이페이지</a>
						<a href="cartpage"> 장바구니 </a>
						</c:if>				
				
					</div>
				<div class = "">
				<a href=".">랭킹닭컴</a>
						<form action ="search" method="post">
							
							<select name="searchtype" style="display:none">
								<option value="goodsname, goodsbrand"></option>
							</select>
							
							<input type="text" name="keyword">
							<input type="submit" value="검색">					
						</form>
				</div>
			
				
			</div>
				<div class="homegory">
					<a href="goodslist?category=치킨">치킨</a>
				</div>
				<div class="homegory">
					<a href="goodslist?category=피자">피자</a>
				</div>
				<div class="homegory">
					<a href="goodslist?category=음료">음료</a>
				</div>
				
		</div>	
				<div>
				<div>
					<h2 id="h2">전체상품</h2>
					
					<c:forEach var ="homegoods" items="${homelist}">
						<td><a href="goodsview?goodsnumber=${homegoods.goodsnumber}"><img src="${homegoods.goodsimgname}"></a></td>

					</c:forEach>
					
				</div>
						
				</div>
		
	<div>
		<span>더보기</span>
	</div>	

</body>
</html>