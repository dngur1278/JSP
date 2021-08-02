<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
	<div align="center">
		<div><h2>회원 정보 수정</h2></div>
		<hr>
		<div>
			<form id="frm" name="frm" action="memberUpdateOk.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="100">ID</th>
							<td width="70" align="center">
								${member.id }
								<input type="hidden" id="id" name="id" value="${member.id }">
							</td>
						</tr>
						<tr>
							<th>PASSWORD</th>
							<td align="center">
								<input type="password" id="password" name="password" value="${member.password }">
							</td>
						</tr>
						<tr>
							<th>NAME</th>
							<td align="center">
								<input type="text" id="name" name="name" value="${member.name }">
							</td>
						</tr>
						<tr>
							<th>AGE</th>
							<td align="center">${member.age }</td>
						</tr>
						<tr>
							<th>GENDER</th>
							<td align="center">${member.gender }</td>
						</tr>
					</table>
				</div><br/>
				<div>
					<button type="submit" class="btn btn-secondary">수정완료</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>