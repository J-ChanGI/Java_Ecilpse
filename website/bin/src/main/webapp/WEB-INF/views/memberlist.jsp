<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
		table,th,tr {
			border: 1px solid black;
			border-collapse : collapse;
		}
</style>
</head>
		<script>
			function listview(id){
				location.href="memberview?mid="+id;
			}
		</script>
<body>
		<h2>회원 전체 조회 목록</h2><br>
		<table>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>비고</th>
			</tr>	
			
			<c:forEach var ="ship" items="${memberlist}">
				<tr>
					<th>${ship.mid}</th>
					<th>${ship.mpassword}</th>
					<th><button onclick="listview('${ship.mid}')">조회</button></th>
				</tr>
			</c:forEach>
		</table>
		
		
</body>
</html>