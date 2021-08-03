<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	table, tr,th {
		border : 1px solid black;
	}

</style>
	<script>
		function memberview(mid){
			location.href = "memberview?mid=" + mid;			
		}
		function memberdelete(mid){
			location.href = "memberdelete?mid=" + mid;
		}
	</script>
<title>Insert title here</title>
</head>
<body>
<a href=".">홈페이지</a>
	<h2>회원목록</h2>
	
		<table>
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>비고</th>
				
			</tr>
	<c:forEach var = "mem" items="${memberlist}">
		<tr>
			<th>${mem.mid}</th>
			<th>${mem.mname}</th>
			<th>${mem.mnumber}</th>
			<th>${mem.memail} @ ${mem.mdomain}</th>
		
			<th><button onclick="memberview('${mem.mid}')">조회</button></th>
		</tr>
		
	</c:forEach>
		</table>
</body>
</html>