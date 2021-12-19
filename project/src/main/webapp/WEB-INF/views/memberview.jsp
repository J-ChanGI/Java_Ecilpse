<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function memberdelete(mid){
			location.href = "memberdelete?mid="+ mid;
		}
	</script>
	<style>
		#view{
			display: inline-block;
       		top : 10%;
			position : absolute;
			width : 300px ; height : 160px;
			}
	
		#body{
			margin-left: 20%;
			margin-right : 20%;
		}
	</style>
</head>
<body>
<div id="body">
<a href=".">홈페이지</a><br>
<div id="view">	
		<h2>상세조회</h2>
		
	아이디 : ${view.mid} <br>
	이름 : ${view.mname} <br>
	전화번호 : ${view.mnumber} <br>
	이메일 : ${view.memail} @ ${view.mdomain} <br>
	주소번호 : ${view.maddressnumber} <br>
	도로명주소 : ${view.mroadaddress} <br>
	지번주소 : ${view.mlandaddress} <br>
	상세주소 : ${view.mdatailedaddress} <br>
	참고 : ${view.mnote} <br>
	<br>	
	<button onclick="memberdelete('${view.mid}')">삭제</button>	
</div></div>
</body>
</html>