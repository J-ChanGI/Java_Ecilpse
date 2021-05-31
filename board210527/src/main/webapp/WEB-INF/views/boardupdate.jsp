<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script >
		function update(){
			var pwd = document.gerElementById=('pwd').value;
			var bpassword = '${boardUpdate.bpassword}';
			if(pwd==bpassword){
				updateform.submit();
			}else{
				alert('비밀번호 불일치');
			}	
				}
</script>

</head>
<body>
	<h2>boardupdate</h2>
	
	<form action="updateprocess" method="post" name="updateform">
		글번호  : <input type="text" name="bnumber" value="${bnumberupdate.bnumber }" readonly><br>
		<!-- 글번호  : <input type="hidden" name="bnumber" value="${bnumberupdate.bnumber }" readonly><br>  
				만약 글번호를 출력하고 싶지 않다고 한다면 hidden 타입으로 보이지 않게 할 수 있다. -->

		작성자  : <input type="text" name="bwriter" value="${bnumberupdate.bwriter }" readonly><br>
		비밀번호  : <input type="text" name="bnumber" id="pwd"><br> <!-- 새로 받아야할 값은 value를 쓰지 않는다 -->
		제목  : <input type="text" name="btitle" value="${bnumberupdate.btitle }"><br>
		내용  : <textarea rows="5" name="bcontents">{bnumberupdate.bcontents}</textarea><br>
		
		<input type="button" onclick="update()" value="수정">
	</form>

</body>
</html>