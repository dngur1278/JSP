<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색할 회원 id 입력하는 곳</title>
</head>
<body>
	<form id="frm" name="frm" method="post" onclick="memberSelectOne.do">
		<div align="center">
			<table>
				<tr>
					<th>ID</th>
					<td>
						<input type="text" id="id" name="id">
					</td>
				</tr>
			</table><br>
			<input type="submit" value="검색">
		</div>
	</form>
</body>
</html>