<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function update(){
			location.href="boardupdate?bnumber="+ ${board.bnumber};			
		}
		
		function boarddelete(){
			
			var pwd = prompt("비밀번호를 입력하세요");
			var bpassword = "${board.bpassword}";
			if(pwd == bpassword){
				location.href="boarddelete?bnumber"+ ${board.bnumber};	
			}else{
				alert("비밀번호 불일치");
			}
		}
	
	</script>

</head>
<body>
	<h2>view</h2>
	글번호 : ${board.bnumber}<br>
	작성자 : ${board.bwriter}<br>
	비밀번호 : ${board.bpassword}<br>
	제목 : ${board.btitle}<br>
	내용 : ${board.bcontemts}<br>
	작성시간 : ${board.bdate}<br>
	조회수 : ${board.bhits}<br>
	첨부파일 : ${board.bfilename}<br>
	이미지 : <img src="resources/upload/${board.bfilename}" heigth="200" width="200"> <br>
	
	<a href="boardlist">목록으로 돌아가기</a>	
	
	<a href="boardupdate?bnumber=${board.bnumber}">수정</a>
	
	
	<!--  //버튼 사용할 경유
	<button onclick="update()">수정버튼</button>
	-->	
	<button onclick="boarddelete()">삭제</button>
	
	<a href="paging?page=${page}">목록</a>
</body>
</html>















