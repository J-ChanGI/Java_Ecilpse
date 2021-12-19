<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		table,tr,td,th{
			border: 1px solid black;
			border-collapse : collapse;
		}
	</style>
	<script>
		function deletefn(id){
			location.href="mbdelete?mid="+id;
		}
	</script>
</head>
<body>
	<h2>mblist</h2>
	로그인 아이디 : ${sessionScope.memboardlogin}<br>
	<h2>회원목록</h2><br>
	<table>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>프로필사진</th>			
		</tr>
	
		<c:forEach var = "mem" items="${memboardlist}">
			<tr>
				<td>${mem.mid}</td>
				<td>${mem.mpassword}</td>
				<td>${mem.mname}</td>
				<td>${mem.mnumber}</td>
				<td>${mem.memail}</td>
				<td>${mem.mfilename}</td>
			<td><a href= "infor?mid=${mem.mid }">조회</a>
			<td><button onclick="deletefn('${mem.mid }')">삭제</button></td>
			</tr>
			
		</c:forEach>
	</table>
	
</body>
</html>