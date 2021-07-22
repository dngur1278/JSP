<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login 처리 결과</title>
</head>
<body>
	넘어온 ID: ${param.id }
	넘어온 PassWord: ${param.password}
	
	<%
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = null;
		String msg = null;
		
		if (id.equals("hong") && password.equals("1234")){
			name = "홍길동";
			msg = name + "님 환영합니다.";
		} else {
			msg = "아이디 또는 비밀번호가 틀렸습니다.";
		}
	%>
	
	<div align="center">
		<h1><%= msg %></h1>
		<a href="../index.jsp">Home...</a>
	</div>
</body>
</html>