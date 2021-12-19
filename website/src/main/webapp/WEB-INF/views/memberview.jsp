<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function deletefn(){
			location.href="memberdelete?mid="+${memberview.mid};
		}
	</script>
</head>
<body>
	<h2>회원 상세 조회</h2>
		아이디 : ${memberview.mid }<br>
		비밀번호 : ${memberview.mpassword }<br>
		이름 : ${memberview.mname }<br>
		전화번호 : ${memberview.mnumber }<br>
		이메일 : ${memberview.memail }<br>
		우편번호 : ${memberview.maddressnumber }<br>
		도로명주소 : ${memberview.mroadaddress }<br>
		지번주소 : ${memberview.mlandaddress }<br>
		상세주소 : ${memberview.mdatailedaddress }<br>
		참고항목 : ${memberview.mnote }<br>
		
		<button onclick="deletefn()">삭제</button>
		
</body>
</html>