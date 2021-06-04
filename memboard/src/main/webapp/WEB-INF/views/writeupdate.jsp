<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function updatefn(){
			location.href="boardupdateprocess";
		}
	
	</script>

</head>
<body>
	<h2>수정</h2>
	<form action="boardupdateprocess" method="post" name="boardupdateform">
		글번호 : <input type="text" name="bnumber" value="${boardupdate.bnumber }" readonly><br>
		작성자 : <input type="text" name="bwriter" value="${boardupdate.bwriter }" readonly><br>
		제목 : <input type="text" name="btitle" value="${boardupdate.btitle }"><br>
		내용 : <input type="text" name="bcontents" value="${boardupdate.bnumber }"><br>
		첨부파일 : <input type="file" name="bfilename" value="${boardupdate.bfilename }"><br>
		<input type="button" value="수정" onclick="updatefn()">
		
	</form>
</body>
</html>