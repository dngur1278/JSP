<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css/signup.css"/>
	
	<script type="text/javascript">
	<!-- 필수 입력정보인 아이디, 비밀번호가 입력되었는지 확인하는 함수 -->
		function checkValue(){
			if(!document.frm.id.value){
				alert("아이디를 입력하세요.");
				return false;
			}
			
			if(!document.frm.password.value){
				alert("비밀번호를 입력하세요.");
				return false;
			}
			<!-- 비밀번호와 비밀번호 확인이 같은 값인지 확인 -->
			if(document.frm.password.value != document.frm.passwordok.value){
				alert("비밀번호를 동일하게 입력하세요.");
				return false;
			}
		}
		
		function winopen(){
			window.open("idCheckForm.do", "아이디 중복 체크", "width=400, height=350");
		}
	</script>
</head>

<body>
	<form name="frm" action="check.do" method="post" class="joinForm" onsubmit="return checkValue()">
                                                                                               
		<h2>회원가입</h2>
		
		<div class="textForm">
			<input type="text" id="id" name="id" class="id" placeholder="아이디" required="required">
      	</div>
      	<input type="button" value="중복확인" class="btn" onclick="winopen()">
      	
		<div class="textForm">
 			<input type="password" id="password" name="password" class="pw" placeholder="비밀번호" required="required">
		</div>
		
		<div class="textForm">
			<input type="password" id="passwordok" name="passwordok" class="pw" placeholder="비밀번호 확인">
		</div>
		
		<div class="textForm">
			<input type="text" id="name" name="name" class="name" placeholder="이름" required="required">
		</div>
				
		<div class="textForm">
			<input type="number" id="age" name="age" class="name" maxlength="2" placeholder="나이" >
		</div>
		
		<div>
			<label><input type="checkbox" id="gender" name="gender" value="남자">남자</label>&nbsp;&nbsp;&nbsp;
			<label><input type="checkbox" id="gender" name="gender" value="여자">여자</label>
		</div>
		<br/><br/>
		<input type="submit" class="btn" value="가입"/>
		<input type="button" class="btn" value="취소"/>
    </form>
</body>
</html>