<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<link rel="stylesheet" href="css/menu.css">
<link rel="stylesheet" href="css/loginview.css">
</head>
<body width="100%" height="100%">
<jsp:include page="../home/header.jsp" />
	<form id="frm" action="login.do" method="post" class="loginForm">
		<h2>Login</h2>
		
		<div class="idForm">
			<input type="text" id="id" name="id" class="id" placeholder="ID" required="required">
		</div>
		
		<div class="passForm">
			<input type="password" id="password" name="password" class="pw" placeholder="PW" required="required">
		</div>
		
		<input type="submit" class="btn" value="LOG IN">
		
		<div class="bottomText">
			Don't you have ID? <a href="#">sign up</a>
		</div>
	</form>
</body>
</html>