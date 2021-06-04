<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function bupdate(){
			location.href="bviewupdate?bnumber=" + ${bview.bnumber};
			
		}
	</script>
</head>
<body>
	<h2>글 조회</h2><br>
		
		글번호 : ${bview.bnumber}<br>
		작성자 : ${bview.bwriter}<br>
		제목 : ${bview.btitle}<br>
		내용 : ${bview.bcontents}<br>
		작성일자 : ${bview.bdate}<br>
		조회수 : ${bview.bhits}<br>
		첨부파일 : ${bview.bfilename}<br>
		
	
		<button onclick="bupdate()">글 수정요청</button><br>
	
		<button>삭제</button><br>
</body>
</html>