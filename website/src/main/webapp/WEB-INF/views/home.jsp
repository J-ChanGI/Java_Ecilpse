<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<meta charset="UTF-8">
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
		#event{
			background-color : green;
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
			function goodslistjoin(){
				location.href="goodslistjoin"
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
			<form action="search" method="get">
				<input type="text" name="keyword">
				<input type="submit" value="검색">
			</form>>
			
		<div >
			<div id="event">
				<h2>다다</h2>
			
			</div>
			
			<div id="category">
			<h3>카테고리</h3>
				<form>
				<ui>
			<!--    <li><input onchange="searchli()" type="checkbox" name="a" value="상품권/생활편의/기타" id="A1"><label for="A1">상품권/생활편의/기타</lebal></li>
					<li><input onchange="searchli()" type="checkbox" name="b" value="편의점" id="A2"><label for="A2">편의점</label></li>
					<li><input onchange="searchli()" type="checkbox" name="c" value="치킨/피자" id="A3">치킨/피자</li>-->
					
                                <li class="">
                                    <a href="goodslist?catename=${goods.catename}" onclick="goodslistjoin()">
                                        <div class=""><span>
                                            <img src="https://img.giftting.co.kr/sendbee/license/20210611/1623377389025_category_icon_06_store.png" alt="편의점"></span>
                                        </div>
                                        <div class="">

                                            음료
                                        </div>
                                    </a>
                                </li>
                                 <li class="">
                                    <a href="goodslist?catename=${goods.catename}" onclick="goodslistjoin()">
                                        <div class=""><span>
                                            <img src="https://img.giftting.co.kr/sendbee/license/20210611/1623377389025_category_icon_06_store.png" alt="편의점"></span>
                                        </div>
                                        <div class="">

                                           치킨
                                        </div>
                                    </a>
                                </li>
				
				
				
				
				
				</ui>	
				</form>
			</div>
			
			<div>
			
		

			</div>
		</div>
		
		<div id="goods">
			<h2>전체상품</h2>
				
			<a href=""><img src="">아메리카노 </a>
		
		
		
	</div>	
</body>
</html>
