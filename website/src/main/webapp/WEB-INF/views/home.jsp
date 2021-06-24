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
		#ul{
			list-style:none;
			margin:0; 
     		padding:0;
		}
		.li{
		    
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
			<a href=".">사이트</a> 
		
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
		<div>
			<form action="search" method="get">
			  
			  <select name = "searchtype" style="display:none">
			  	<option value="catename,goodsname"></option>
			  	
			  </select>
				<input type="text" name="keyword">
				<input type="submit" value="검색">
			</form>
		</div>	
		<div >
			<div id="event">
				<h2>다다</h2>
			
			</div>
			
			<div id="category">
			<h3>카테고리</h3>
				<form>
					<ul id="ul">
                     <li class="li">	
                     <a href="goodslist?catename=음료">
                     	<div class=""><span>
                     		<img src="https://img.giftting.co.kr/sendbee/license/20210611/1623377389025_category_icon_06_store.png" alt="편의점"></span>
                     	</div>
                    	<div class="">

                     		음료
                     	</div>
                     
                     </a>
                     </li>
                     <li class="li">          
                     <a href="goodslist?catename=치킨">
                     	<div class=""><span>
                     		<img src="https://img.giftting.co.kr/sendbee/license/20210611/1623377389025_category_icon_06_store.png" alt="편의점"></span>
                     	</div>
                     	<div class="">

                      		치킨
                     	</div>
                     </a>
                     </li>
                    </ul>     
				</form>
			</div>
			
			<div>
			
		

			</div>
		</div>
		
		<div id="goods">
			<h2>전체상품</h2>
				
				<c:forEach var = "homegoods" items= "${homelist}">
					<td><a href="goods?goodsnumber=${homegoods.goodsnumber}">${homegoods.goodsname}</a></td>
					
				</c:forEach>
				
			
	</div>
		
</body>
</html>
