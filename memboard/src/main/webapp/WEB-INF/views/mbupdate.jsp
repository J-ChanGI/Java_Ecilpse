<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
		function update(){
			var pwd = document.getElementById('pwd').value;
			var mpassword = '${mbupdate.mpassword}'
			if(pwd==mpassword){
				updateform.submit();
			}else{
				alert("비밀번호 불일치");
			}
			
		}
	</script>

</head>
<body>
	<h2>회원정보수정</h2><br>
	로그인 아이디 : ${sessionScope.memboardlogin}<br>
	
	<form action="updateprocess" method="post" name="updateform"><br>
			아이디 : <input type="text" name ="mid" value="${mbupdate.mid}" readonly><br>
			비밀번호 : <input type="text" name ="mpassword" id="pwd"><br>
			이름 : <input type="text" name ="mname" value="${mbupdate.mname}"><br>
			전화번호 : <input type="text" name ="mnumber" value="${mbupdate.mnumber}"><br>
			이메일 : <input type="text" name ="memail" value="${mbupdate.memail}"><br>
			프로필사진 : <input type="file" name ="mfilename" value="${mbupdate.mfilename}"><br>
			<br>
			<input type="button" onclick="update()" value="수정">
		</form>

</body>
</html>