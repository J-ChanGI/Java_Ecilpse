<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function idoverlap(){
			var inputId = document.getElementById('mid').value;
			var checkResult = document.getElementById('checkresult');
			$.ajax({
				type : 'post',
				url : 'idcheck',
				data : {'mid' : inputId},
				dataType : 'text',
				success : function(result){
					console.log("아이디중복확인");
					if(result=="ok"){
						checkResult.style.color = 'green';
						checkResult.innerHTML = "사용가능한 아이디 입니다"
					}else{
						checkResult.style.color = 'red';
						checkResult.innerHTML = "이미 사용중인 아이디 입니다"
					}
				},
				error : function(){
					console.log("아이디 중복 안되고 있음")
				}
			})
			
		}
	
	</script>
</head>
<body>
		<h1>회원가입</h1>
		<form action ="member" method="post" enctype="multipart/form-data"><br>
			아이디 : <input type="text" name ="mid" id="mid" onkeyup="idoverlap()"><br>
				<span id="checkresult"></span><br>
			비밀번호 : <input type="text" name ="mpassword"><br>
			이름 : <input type="text" name ="mname"><br>
			전화번호 : <input type="text" name ="mnumber"><br>
			이메일 : <input type="text" name ="memail"><br>
			프로필사진 : <input type="file" name ="mfile"><br>
			<br>
			<input type="submit" value="회원가입">
		</form>
</body>
</html>