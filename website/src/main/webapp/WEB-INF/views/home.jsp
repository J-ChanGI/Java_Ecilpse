<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<style>
		#loginbar{
			background-color: red;	
		}		 
		#goods{
			background-color : pink; padding 30px;
		}
		#category{
			background-color : blue;
		}
		
	</style>

		<script>
			function memberjoin(){
				location.href="memberjoin";
			}
			function loginjoin(){
				location.href="loginjoin"
			}
			function logout(){
				location.href="logout"
			}
			function mypagejoin(){
				location.href="mypagejoin"
			}
		</script>
	
</head>
<body>
	<div id="tool">	
		<div id="nav">
			<a href="">사이트</a> 
		
		</div>
		
		<div id="loginbar">
			로그인 아이디 : ${sessionScope.login}<br>
			<button onclick="loginjoin()">로그인</button>
			<button onclick="memberjoin()">회원가입</button>
			
			<c:if test="${sessionScope.login eq 'admin'}">
			<button onclick="mypagejoin()">마이페이지</button><br>
			</c:if>
			<button onclick="logout()">로그아웃</button>
		</div>
		
		<div id="goods">
			<h2>전체 상품</h2>
		
			<div id="category">
			<h3>카테고리</h3>
				<form>
				<ui>
					<li><input onchange="searchli()" type="checkbox" name="a" value="상품권/생활편의/기타" id="A1">상품권/생활편의/기타</li>
					<li><input onchange="searchli()" type="checkbox" name="b" value="편의점" id="A2">편의점</li>
					<li><input onchange="searchli()" type="checkbox" name="c" value="치킨/피자" id="A3">치킨/피자</li>
				</ui>	
				</form>
			</div>
			
			<div>
			<h3>브랜드</h3>
			<form>
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 33떡볶이-->
				<input onchange="searchli()" type="checkbox" name="" value="7번가피자" id="B2"> 7번가피자
				<input onchange="searchli()" type="checkbox" name="" value="BHC" id="B3"> BHC
			<!--<input type="checkbox" name="" value=""> CGV(영화)-->
			<!--<input type="checkbox" name="" value=""> CPK-->
				<input onchange="searchli()" type="checkbox" name="" value="CU"> CU
				<input onchange="searchli()" type="checkbox" name="" value="GS THE FRESH"> GS THE FRESH
				<input onchange="searchli()" type="checkbox" name="" value="GS25"> GS25
				<input onchange="searchli()" type="checkbox" name="" value="GS25(금액권)"> GS25(금액권)
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> TGIF-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> U+ 데이터쿠폰-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 공차-->
				<input onchange="searchli()" type="checkbox" name="" value="교촌치킨"> 교촌치킨
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 국가공인안마센터-->
				<input onchange="searchli()" type="checkbox" name="" value="굽네치킨"> 굽네치킨
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 긴자-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 까페띠아모-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 깐부치킨-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 나뚜루-->
				<input onchange="searchli()" type="checkbox" name="" value="네네치킨"> 네네치킨
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 던킨-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 도레도레-->
				<input onchange="searchli()" type="checkbox" name="" value="또래오래"> 또래오래
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 뚜레쥬르-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 라이언치즈볼어드벤처-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 레드컨테이너-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 롯데리아-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 롯데백화점-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 룩옵티컬-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 마노핀-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 마호가니치킨-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 맥도날드-->
				<input onchange="searchli()" type="checkbox" name="" value="멕시카나치킨"> 멕시카나치킨
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 명랑핫도그-->
			<!--<input onchange="searchli()" type="checkbox" name="" value=""> 못된고양이-->
				<input onchange="searchli()" type="checkbox" name="" value="미니스톱"> 미니스톱
				
			</form>
			</div>
		</div>
		
		<div>
			<h2>상품리스트</h2>
			
			<a href="goods1join"><img src="C:\Users\user\Desktop\goods.jpg">치킨</a>
			<a href="goods2join"><img src="C:\Users\user\Desktop\고양이1">고양이</a>
			<a href="goods3join"><img src="C:\Users\user\Desktop\고양이2">고양이2</a>
		</div>
	
		
		
		
	</div>	
</body>
</html>
