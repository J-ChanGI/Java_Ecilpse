<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>	
<meta charset="EUC-KR">
<title>Insert title here</title>
		
		<script>
			function idoverlap(){
				var inputId = document.getElementById('idcheck').value;
				var idresult = document.getElementById('idresult');
				$.ajax({
					type : 'post',
					url : 'idcheck',
					data : {'mid': inputId},
					datatype : 'text',
					success : function(result){
						console.log("아이디중복확인");
						if(result == 'ok'){
							idresult.style.color = "green"
							idresult.innerHTML = "사용 가능 한 아이디 입니다."
						}else{
							idresult.style.color = "red"
							idresult.innerHTML = "이미 사용 중인 아이디 입니다"
						}
					},
					error : function(){
						console.log("오류가 발생 중")
					}
				});
			}
			
			function emails(){
				var select  = document.getElementById('email');
				console.log(select.value);
				document.getElementById('domain').value = select.value;
			}
			function pwd(){
				console.log("비밀번호 정규식")
				var exp = /^(?=.*[a-z])(?=.*\d)(?=.*[!#$-])[a-zA-Z\d!#$-]{8,18}$/;
				var pw = document.getElementById('pw').value;
				var p = document.getElementById('pwdresult');
				
				if(pw.match(exp)){
					p.style.color = "green"
					p.innerHTML = "가능합니다."
				}else{
					p.style.color = "red"
						p.innerHTML = "소문자 , 특수문자(!#$-) 가 포함된 8~ 18글자만 가능합니다"
				}
			
			}
			function pwdoverlap(){
				console.log("비밀번호 중복확인")
				var pw = document.getElementById('pw').value;
				var pwdcheck = document.getElementById('pwdcheck').value;
				var p = document.getElementById('pwdresult');
				if(pw == pwdcheck){
					p.style.color = "green"
					p.innerHTML = "비밀번호 일치"
				}else{
					p.style.color = "red"
					p.innerHTML = "비밀번호 불일치"
				}
			}
			function phoencheck(){
				var phoenexp= /^\d{3}-\d{4}-\d{4}$/;
				var phoen = document.getElementById('phone').value;
				var p = document.getElementById('phoenresult');
				console.log("전화번호 유효식")
				if(phoen.match(phoenexp)){
					p.style.color = "green"
					p.innerHTML = "유효한 방식 입니다."
				}else{
					p.style.color = "red"
					p.innerHTML = "유효하지 않은 방식 입니다."
				}
			}
			
		</script>
		
		<style>
			#update{
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
	<div id="update">
	<h2>회원정보수정</h2>
		<div>
		<form action="mbupdateprocess" method="post">
			아이디 : <input type="text" name="mid" id="idcheck" onkeyup="idoverlap()" value="${sessionScope.login}" readonly ><br>
			<p id="idresult"></p>  
			비밀번호 : <input type="password"  id="pw" name="mpassword" onkeyup="pwd()"><br>
			비밀번호 확인 : <input type="password" id="pwdcheck" name="mpasswordcheck" onkeyup="pwdoverlap(this.value)"><br>
			<p id="pwdresult"></p><br>
			이름 : <input type="text" name="mname"><br>
			전화번호 : <input type="text" name="mnumber" id="phone" onkeyup="phoencheck()"><br>
			<p id="phoenresult"></p>
			이메일 : <input type="text" name="memail">@<input type="text"  id="domain" name="mdomain"><br>
			<select id="email" 	onchange="emails()">
				<option value="">직접입력</option>
				<option value="naver.com">naver.com</option>
				<option value="hanmail.net">hanmail.net</option>
				<option value="gmail.com">gmail.com</option>			
			</select>
			<div>
			주소 : <input type="text" id="sample4_postcode" name="maddressnumber" placeholder="우편번호"><br>
			<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
			<input type="text" id="sample4_roadAddress" name="mroadaddress" placeholder="도로명주소"><br>
			<input type="text" id="sample4_jibunAddress" name="mlandaddress" placeholder="지번주소"><br>
			<span id="guide" style="color:#999;display:none"></span>
			<input type="text" id="sample4_detailAddress" name="mdatailedaddress" placeholder="상세주소"><br>
			<input type="text" id="sample4_extraAddress" name="mnote" placeholder="참고항목"><br>
			</div>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
</script>
			<input type="submit" value="수정">		
		</form>
		</div>
		</div>
</div>
</body>
</html>