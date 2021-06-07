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
		
		function bdelete(){
			location.href="bdelete?bnumber=" + ${bview.bnumber};			
		}
	</script>
</head>
<body>
	<h2>글 조회</h2><br>
	
	글번호  	 : ${bview.bnumber}<br>
	작성자  	 : ${bview.bwriter}<br>
	제목   	 : ${bview.btitle}<br>
	내용	   	 : ${bview.bcontents}<br>
	첨부파일	 : ${bview.bfilename}<br>
		
	<div id="comment-write"><!-- 댓글등록 -->
		작성자: <input type="text" id="cwriter"><br>
		내용	: <input type="text" id="ccontents"><br>
		<button id="cwrite-btn">댓글등록</button>
	</div>
	
		<div id="comment-list"> <!-- 댓글목록 -->
		<table border="1">
				<th>작성자</th>
				<th>내용</th>	
				<c:forEach var="comment" items="${commentList }">
					<td>${comment.cwriter }</td>
					<td>${comment.ccontents}</td>
				</c:forEach>				
			</table>	
		</div>	
		<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
		<script>
			$(document).ready(function(){
				$("#cwrite-btn").click(function(){
					var cwriter = document.getElementById('cwriter').value;
					var ccontents = document.getElementById('ccontents').value;
					var cbnumber = '${bview.bnumber}';
						console.log(cwriter);
						console.log(ccontents);
						console.log(cbnumber);
					$.ajax({
						type: 'post',
						url: 'comment/commentwrite',
						data:{
							'cwriter':cwriter,
							'ccontents':ccontents,
							'cbnumber' : cbnumber},
							dataType: 'json',
							success: function(list){
								console.log(list);
								var output = "<table border='1'>";

								output += "<tr><th>작성자</th>";

								output += "<th>내용</th></tr>";

								for(var i in list){

								output += "<tr>";

								output += "<td>"+list[i].cwriter+"</td>";

								output += "<td>"+list[i].ccontents+"</td>";

								output += "</tr>";

								}

								output += "</table>";

								document.getElementById('comment-list').innerHTML = output;

								document.getElementById('cwriter').value='';

								document.getElementById('ccontents').value='';	
							},
							error: function(){
								console.log("문제있음");
							}
					});
				});
			});
		</script><br>
		<div>
	
		<c:if test="${sessionScope.memboardlogin eq 'admin' && '#{bwriter}' }">
 				
			<button onclick="bupdate()">글 수정요청</button><br>
		</c:if>
 			<button onclick="bdelete()">삭제</button><br>
 		</div>
		
		
		
		
</body>
</html>