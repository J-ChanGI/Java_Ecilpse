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
			
	<!--		function recommendCategory(category) {
	            $("#category").val(category);

	            let form = document.recommendation;
	            form.submit();
			} -->	
			function recommendcategory('편의점')(){
				location.href="store"
			}
			
 			
		</script>
	
</head>
<body>
	<div id="tool">	
		<div id="nav">
			<a href="#">사이트</a> 
		
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
		
		<div class="main_contents">
			<div>
				<h2>상품카테고리</h2>
				<div>
					<div class="">
						<ui>
							<li class="icon_cate_li">
								<a href="#" onclick="recommendcategory('편의점');">
								<div>
									<span>
										<img src="C:\Users\Administrator\Desktop\store.png" alt="편의점">
									</span>
								</div>
								<div>
									" 편의점 "
								</div>
								</a>
							</li>  <!--   -->
								<li class="icon_cate_li">
								<a href="#" onclick="recommendcategory(커피/음료)">
								<div>
									<span>
										<img src="C:\Users\Administrator\Desktop\store.png" alt="커피/음료">
									</span>
								</div>
								<div>
									" 커피/음료 "
								</div>
								</a>
							</li>	
							<li class="icon_cate_li">
								<a href="#" onclick="recommendcategory(패스트푸드)">
								<div>
									<span>
										<img src="C:\Users\Administrator\Desktop\store.png" alt="패스트푸드">
									</span>
								</div>
								<div>
									" 패스트푸드 "
								</div>
								</a>
							</li>
								<li class="icon_cate_li">
								<a href="#" onclick="recommendcategory(베이커리/도넛)">
								<div>
									<span>
										<img src="C:\Users\Administrator\Desktop\store.png" alt="베이커리/도넛">
									</span>
								</div>
								<div>
									" 베이커리/도넛 "
								</div>
								</a>
							</li>
								<li class="icon_cate_li">
								<a href="#" onclick="recommendcategory(상품권/생활편의/기타)">
								<div>
									<span>
										<img src="C:\Users\Administrator\Desktop\store.png" alt="상품권/생활편의/기타">
									</span>
								</div>
								<div>
									" 상품권/생활편의/기타 "
								</div>
								</a>
							</li>
						</ui>
					</div>
				</div>
			</div>	
		
		</div>
	
		
		
		
	</div>	
</body>
</html>
