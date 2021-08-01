<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
</head>
<body>
	<form id="frm" name="frm" action="memberDelete.do" method="post">
		<div align="center">
			<div><h2>회원탈퇴를 위한 ID, PASSWORD입력</h2></div>
			<div>
				<table>
					<tr>
						<th width="80">ID</th>
						<td>
							<input type="text" id="id" name="id" required="required">
						</td>
					</tr>
					
					<tr>
						<th>PASSWORD</th>
						<td>
							<input type="text" id="password" name="password" required="required">
						</td>
					</tr>
				</table>
			</div>
			<div>
				<button type="submit">탈퇴</button>
			</div>
		</div>
	</form>
</body>
</html>