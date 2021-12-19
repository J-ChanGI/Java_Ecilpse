<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<style>
		#body{
			margin-left: 20%;
			margin-right : 20%;
		}
		#ul_top_menu{
			text-align:right;
			list-style : none;
		}
		#ul_top_menu li{
			display : inline;
			font-size : 11 px;
		}
		#ul_top_menu a{
			text-decoration :none ;
			color: inherit;
		}
		#search{
			text-align : center;
		}
		#goods{
			margin : 50px;
			padding : 50px;
		}
		#ul_top_cate li{
			display : inline;
			text-align : center;
		}
		#ul_middle_menu li{
			display : inline;
		}
		#ul_middle_menu a{
			text-decoration :none ;
			color: inherit;
		}
		.img{
			border : 1px solid black;
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
		
			<div id="body">
											
					
						<ul id="ul_top_menu">
						<li ><button onclick="loginjoin()">로그인</button></li>
						<li ><button onclick="membershipjoin()">회원가입</button></li>
					
						<c:if test="${ sessionScope.login ne null }" >
						<li ><button onclick="logout()">로그아웃</button></li>
						<li ><a href="mypage">마이페이지</a></li>
						<li ><a href="cartpage"> 장바구니 </a></li>
						</c:if>				
						</ul>
					
				<a href=".">home</a>
				<div id="search">
				
				<form action ="search" method="post">
							
							<select name="searchtype" style="display:none">
								<option value="goodsname, goodsbrand, goodstype"></option>
							</select>
							
							<input type="text" name="keyword">
							<input type="submit" value="검색">					
						</form>
				</div>		
				
			
				
			<div>
			<h2>카테고리</h2>
			<ul id="ul_middle_menu">
				<li><a href="goodslist?category=치킨">치킨</a></li>
				<li><a href="goodslist?category=피자">피자</a></li>
				<li><a href="goodslist?category=음료">음료</a></li>
			
			</ul>
						
			</div>
		
					<h2 id="h2">전체상품</h2>
					<div id="goods">
					<c:forEach var ="homegoods" items="${homelist}" >
						<td><a href="goodsview?goodsnumber=${homegoods.goodsnumber}"><img src="${homegoods.goodsimgname}" ></a></td>

					</c:forEach>
					</div>
		<br>
		
		
		</div>
</body>
</html>