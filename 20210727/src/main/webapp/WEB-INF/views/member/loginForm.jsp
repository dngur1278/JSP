<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="../home/header.jsp" />
<body>
	<div align="center">
		<div>
			<h1>Login</h1>
		</div>
		<div>
			<form id="frm" action="login.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="150">ID(아이디)</th>
							<td wtdth="200">
								<input type="text" id="id" name="id" placeholder="아이디를 입력하세요..." required="required"> 
							</td>
						</tr>
						
						<tr>
							<th width="150">password(비밀번호)</th>
							<td wtdth="200">
								<input type="password" id="password" name="password" placeholder="패스워드를 입력하세요..." required="required"> 
							</td>
						</tr>
					</table>
				</div><br/>
				
				<div>
					<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;
					<input type="reset" vlaue="취소"> 
				</div>
			</form>
		</div>
	</div>
</body>
</html>