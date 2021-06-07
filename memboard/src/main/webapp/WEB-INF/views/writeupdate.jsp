<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
		function updatefn(){
			// 이렇게 작성을 해놓으면 단순하게 아래 주소로만 이동하게 되는거죠.. 
			//location.href="boardupdateprocess"; // 이렇게 가면 아무런 데이터가 안간다는거지.. 
			// 이런거 확인하려면 Controller에 Sysout 같은거 써서 파라미터가 제대로 오는지 안오는지 확인도 해보면 좋아요 
			// js 함수로 하려면 form태그에 적었던 name.submit() 이런식으로 한다는거죠 
			boardupdateform.submit();// 이렇게 
		}
	
	</script>

</head>
<body>
	<h2>수정</h2>
	<form action="boardupdateprocess" method="post" name="boardupdateform">
		글번호 : <input type="text" name="bnumber" value="${bviewupdate.bnumber}" readonly><br>
		작성자 : <input type="text" name="bwriter" value="${bviewupdate.bwriter}" readonly><br>
		제목 : <input type="text" name="btitle" value="${boardupdate.btitle}"><br>
		내용 : <input type="text" name="bcontents" value="${boardupdate.bcontents}"><br>
		첨부파일 : <input type="file" name="bfilename" value="${boardupdate.bfilename}"><br>
		<input type="button" value="수정" onclick="updatefn()">
		
	</form>
</body>
</html>