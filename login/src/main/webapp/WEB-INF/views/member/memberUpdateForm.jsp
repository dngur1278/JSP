<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
	<form id="frm" name="frm" action="memberUpdate.do" method="post">
		<div align="center">
			<div><h2>회원정보수정을 위한 ID입력</h2></div>
			<div>
				<table>
					<tr>
						<th>ID</th>
						<td>
							<input type="text" id="id" name="id" required="required">
						</td>
					</tr>
				</table>
			</div>
			<div>
				<button type="submit">수정</button>
			</div>
		</div>
	</form>
</body>
</html>