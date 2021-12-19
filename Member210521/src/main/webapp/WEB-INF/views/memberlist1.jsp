<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, tr, td, th {
		border: 1px solid black;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<h2>memberlist.jsp</h2>
	
	로그인아이디: ${sessionScope.loginMember} <br>
	
	<table>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>상세조회</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="member" items="${memberList}">
			<tr>
				<td>${member.mid}</td>
				<td>${member.mpassword}</td>
				<td>${member.mname}</td>
				<td>${member.memail}</td>
				<!-- 조회 링크를 클릭하면 memberview.jsp에 해당 회원의 정보만 출력 -->
				<td><a href="memberview?mid=${member.mid}">조회</a>
				<!-- http://localhost:8081/member/memberview?mid=aa
						memberview 라는 주소를 요청하면서 mid 파라미터에 aa를 담아서 간다  -->
				<td><button onclick="deletefn('${member.mid}')">삭제</button>
			</tr>
		</c:forEach>
		
		
	</table>
	<script>
		function deletefn(id){
			console.log('삭제할아이디'+id);
			location.href="memberdelete?mid="+id;
			// location.href="memberdelete?mid=id";(x)
		}
	</script>
	
	
</body>
</html>