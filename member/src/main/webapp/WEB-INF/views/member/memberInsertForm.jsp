<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<div align="center">
		<div><h1>회  원  가  입</h1></div>
		<div>
			<form id="frm" name="frm" action="memberInsert.do" method="post">
				<div>
					<table border="1">
						<tr height="35">
							<th width="200">ID</th>
							<td width="400">
								<input type="text" id="id" name="id" placeholder="아이디 입력" required="required">
							</td>
						</tr>
						
						<tr height="35">
							<th>Password</th>
							<td>
								<input type="password" id="password" name="password" placeholder="비밀번호 입력" required="required">
							</td>
						</tr>
						
						<tr height="35">
							<th>Password Check</th>
							<td>
								<input type="password" id="passcheck" name="passcheck" placeholder="비밀번호 확인" required="required">
							</td>
						</tr>
						
						<tr height="35">
							<th>이   름</th>
							<td>
								<input type="text" id="name" name="name" placeholder="이름 입력" required="required">
							</td>
						</tr>
						
						<tr height="35">
							<th>나   이</th>
							<td>
								<input type="number" id="age" name="age" placeholder="나이 입력" required="required">
							</td>
						</tr>
						
						<tr height="35">
							<th>취   미</th>
							<td>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="영화보기">영화보기</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="등산">등산</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="농구">농구</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="낚시">낚시</label>
								<label><input type="checkbox" id="hobbys" name="hobbys" value="헬창">헬창</label>
							</td>
						</tr>
					</table>
				</div><br/>
				<div>
					<input type="submit" value="회원가입">&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset" value="취  소">
				</div>
			</form>
		</div>
	</div>
</body>
</html>