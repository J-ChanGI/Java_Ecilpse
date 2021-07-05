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
			location.href ="mypagejoin";
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
					<button onclick="loginjoin()">로그인</button>
					<button onclick="membershipjoin()">회원가입</button>
					
					<button onclick="logout()">로그아웃</button>
					
					<button onclick="mypagejoin()">마이페이지</button>
								
				</div>
			</div>
		</div>	
	</div>

</body>
</html>
