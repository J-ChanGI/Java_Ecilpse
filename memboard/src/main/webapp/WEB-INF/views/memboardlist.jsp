<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
		table, th, tr,td {
			border : 1px solid black;
			border-collsapse : collapse;
		}
	</style>

</head>
<body>
		
		로그인 아이디 : ${sessionScope.memboardlogin}<br>
		
		<a href="writepage">글작성</a><br>
		<a href="mypages">마이페이지</a><br>
		<a href="paging">페이징목록</a><br>
				
		<h2>글 목록 </h2>
		<table>
			<tr>
				<th>글번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>내용</th>
				<th>첨부파일</th>
				<th>작성일자</th>
				<th>조회수</th>
				
			</tr>
			<c:forEach var = "wlist" items="${writelist}">
				<tr>
					<th>${wlist.bnumber}</th>
					<th>${wlist.bwriter}</th>
					<th><a href="writeview?bnumber=${wlist.bnumber}">${wlist.btitle}</a></th>
					<th>${wlist.bcontents}</th>
					<th>${wlist.bfilename}</th>
					<th>${wlist.bdate}</th>
					<th>${wlist.bhits}</th>
				
				</tr>
			</c:forEach>	
		</table><br>
						
</body>
</html>