<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<div align="center">
		<div><h2>회  원  가  입</h2></div>
		<form id="frm" name="frm" action="memberInsert.jsp" method="post">
			<div>
				<table border="1">
					<tr>
						<th width="200">ID</th>
						<td width="300"><input type="text" id="id" name="id"></td>
					</tr>
					<tr>
						<th width="200">Password</th>
						<td width="300"><input type="password" id="password" name="password"></td>
					</tr>
					<tr>
						<th width="200">이     름</th>
						<td width="300"><input type="text" id="name" name="name"></td>
					</tr>
					<tr>
						<th width="200">나     이</th>
						<td width="300"><input type="text" id="age" name="age"></td>
					</tr>
					<tr>
						<th width="200">취     미</th>
						<td width="300">
							<label><input type="checkbox" id="hobby" name="hobby" value="등산">등산</label>
							<label><input type="checkbox" id="hobby" name="hobby" value="낚시">낚시</label>
							<label><input type="checkbox" id="hobby" name="hobby" value="축구">축구</label>
							<label><input type="checkbox" id="hobby" name="hobby" value="농구">농구</label>
							<label><input type="checkbox" id="hobby" name="hobby" value="여행">여행</label>
						</td>
					</tr>
				</table>
				<div>
					<input type="submit" value="회원가입">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset" value="취소">
				</div>
			</div>
		</form>
	</div>
</body>
</html>