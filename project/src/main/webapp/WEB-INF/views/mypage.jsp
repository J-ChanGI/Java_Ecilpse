<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function update(){
			location.href="mbupdate";
		}
		function memberlistjoin(){
			location.href="memberlist"
		}
		function goodsuploadjoin(){
			location.href="goodsuploadjoin"
		}
	</script>
	<style>
		#mypage{
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
	<div id="mypage" >
	<h2>마이페이지</h2>
	
	아이디 : ${mypage.mid} <br>
	이름 : ${mypage.mname} <br>
	전화번호 : ${mypage.mnumber} <br>
	이메일 : ${mypage.memail} @ ${mypage.mdomain} <br>
	주소번호 : ${mypage.maddressnumber} <br>
	도로명주소 : ${mypage.mroadaddress} <br>
	지번주소 : ${mypage.mlandaddress} <br>
	상세주소 : ${mypage.mdatailedaddress} <br>
	참고 : ${mypage.mnote} <br>
	<br>
	<button onclick="update()">회원정보수정</button><br>
	
	
	<c:if test = "${sessionScope.login eq 'admin' }">
	<button onclick="memberlistjoin()">회원전체목록 조회(관리자용)</button>
	<button onclick="goodsuploadjoin()">상품등록(관리자용)</button>
	</c:if>
	
	</div>
</div>
</body>
</html>