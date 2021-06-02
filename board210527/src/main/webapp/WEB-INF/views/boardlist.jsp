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
	 border : 1px solid black;
	 border-collapse : collapse;
	}
</style>

</head>
<body>
	<h2> list </h2>
	<table>
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>글비번</th>
			<th>글제목</th>
			<th>내용</th>
			<th>작성시간</th>
			<th>조회수</th>
		</tr>
		<c:forEach var="board" items="${boardList}">
			<tr>
				<td>${board.bnumber}</td>
				<td>${board.bwriter}</td>
				<td>${board.bpassword}</td>
				<td><a href= "boardview?bnumber=${board.bnumber}">${board.btitle}</a></td>
				<td>${board.bcontents}</td>
				<td>${board.bdate}</td>
				<td>${board.bhits}</td>
				
			</tr>
		</c:forEach>
		
	</table>
	
	
</body>
</html>