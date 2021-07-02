<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		
		
		
	</script>
</h1>

<P>  The time on the server is ${serverTime}. </P>
	<div>
		<div>
			<div>
				<div>
					<button onclick="loginjoin()">로그인</button>
					<button onclick="membershipjoin()">회원가입</button>
								
				</div>
			</div>
		</div>	
	</div>

</body>
</html>
