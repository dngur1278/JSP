<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div><h1>게시글 상세 보기</h1></div>
		<hr>
		<div>
			<table border="1">
				<tr>
					<th width="100">ID</th>
					<td width = "70" align="center">${member.id }</td>
					<th width = "100" colspan="2">PASSWORD</th>
					<td width = 150" align="center" colspan="2">${member.password }</td>
				</tr>
				
				<tr>
					<th width = 100">NAME</th>
					<td width = "150" align="center">${member.name } </td>
					<th width = "100">GENDER</th>
					<td width = "70" align="center">${member.gender }</td>
					<th width = "100">AGE</th>
					<td width = "70" align="center">${member.age }</td>  
				</tr>
			</table>
		</div>
		<div>
			<button type="button" onclick="location.href='home.do'">HOME...</button>
		</div>
	</div>
</body>
</html>