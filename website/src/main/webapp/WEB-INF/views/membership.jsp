<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>	
<meta charset="UTF-8">
<title>Insert title here</title>
	<script>
			function phonecheck(){   		// 전화번호 정규식
				console.log("전화번호 정규식");
				var expnumber = /^\d{3}-\d{4}-\d{4}$/;
				var phone = document.getElementById('phone').value;
				var numbercheck = document.getElementById('numbercheck');
				
				if(phone.match(expnumber)){
					numbercheck.style.color = "green"
						numbercheck.innerHTML = "유효합니다"
				}else{
					numbercheck.style.color = "red"
					numbercheck.innerHTML = "010 - 4자리 - 4자리 로 써주세요."
				}
			}
			function pwdcheck(){		// 비밀번호 정규식
				console.log("비밀번호 정규식");
				var expassword =  /^(?=.*[a-z])(?=.*\d)(?=.*[!#$-])[a-zA-Z\d!#$-]{8,18}$/; 
				var pwd = document.getElementById("pwd").value;
				var pwdcheck = document.getElementById("passwordcheck");
				
				if(pwd.match(expassword)){
					pwdcheck.style.color="green"
					pwdcheck.innerHTML = "가능합니다"
				}else{
					pwdcheck.style.color="red"
					pwdcheck.innerHTML = "소문자 , 특수문자(!#$-) 가 포함된 8~ 18글자만 가능합니다"
				}
			}
			function idoverlap(){  //id 중복 
				console.log("아이디중복확인");
				var inputId = document.getElementById('idcheck').value; //id 값 입력
				var checkresult = document.getElementById('checkresult');
				$.ajax({
					type : 'post', // 전송 방식
					url : 'idcheck', // controller 에 받는 주소
					data : {'mid' : inputId}, // 전송할 파라미터 (name 값 입력)
					dataType : 'text',
					success : function(result){
						console.log("아이디중복확인");
						if(result =="ok"){
							checkresult.style.color="green"
							checkresult.innerHTML = "사용가능한 아이디 입니다"
						}else{
							checkresult.style.color ="red"
							checkresult.innerHTML = "이미 사용중인 아이디 입니다"
						}
					},
					error : function(){
						console.log("아이디중복 안되고 있음")
					}
				});
			}
	
	</script>
	
	

</head>
<body>
<div id="memberjoindiv">
	<form action="membership" method="post">
		아이디 :<input type="text" name="mid" id="idcheck" onkeyup="idoverlap()"><br>
			<span id="checkresult"></span><br>
		비밀번호 :<input type="password" name="mpassword" id="pwd" onkeyup="pwdcheck()"><br>
			<span id="passwordcheck"></span><br>
		이름 :<input type="text" name="mname"><br>
		전화번호 :<input type="text" name="mnumber" id="phone" onkeyup="phonecheck()"><br>
			<span id="numbercheck"></span><br>
		이메일 :<input type="text" name="memail"><br>
		주소 :
		<input type="text" id="sample4_postcode" name="maddressnumber" placeholder="우편번호">
		<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
		<input type="text" id="sample4_roadAddress" name="mroadaddress" placeholder="도로명주소"><br>
		<input type="text" id="sample4_jibunAddress" name="mlandaddress" placeholder="지번주소"><br>
		<span id="guide" style="color:#999;display:none"></span>
		<input type="text" id="sample4_detailAddress" name="mdatailedaddress" placeholder="상세주소"><br>
		<input type="text" id="sample4_extraAddress" name="mnote" placeholder="참고항목"><br>

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
</script><br>

		<input type="submit" value="회원가입"><br>

	</form>
</div>	
	
	
	
	
</body>
</html>