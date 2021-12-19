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
		
		
		<h2>글 목록 페이징 </h2><br>
		<form action="search" method="get" >
			<select name="searchtype">
				<option value="btitle">제목</option>
				<option value="bwriter">작성자</option>
			</select>
			<input type="text" name="keyword" placeholder="검색어입력">
			<input type="submit" value="검색">
		</form>
		
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
		</table>
		<a href="writelist">목록</a><br>
		
		<c:choose>
		<c:when test="${paging.page<=1}">
			[이전]&nbsp;
		</c:when>
		<c:otherwise>
		
			<a href="paging?page=${paging.page-1}">[이전]</a>&nbsp;
		</c:otherwise>
	</c:choose>
	
	<c:forEach begin="${paging.startpage}" end="${paging.endpage}" var="i" step="1">
		<c:choose>
			<c:when test="${i eq paging.page}">
				${i}
			</c:when>
			<c:otherwise>
				<a href="paging?page=${i}">${i}</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>

	<c:choose>
		<c:when test="${paging.page>=paging.maxpage}">
			[다음]
		</c:when>
		<c:otherwise>
			<a href="paging?page=${paging.page+1}">[다음]</a>
		</c:otherwise>
	</c:choose>
	
</body>
</html>