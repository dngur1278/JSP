<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<script>
	function getRecord(n){
		frm.id.value = n;
		frm.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<div><h1>회원 목록 리스트</h1></div>
		<div>
			<table border="1">
				<tr>
					<th width="150">ID</th>
					<th width="150">PASSWORD</th>
					<th width="150">NAME</th>
					<th width="100">AGE</th>
					<th width="200">GENDER</th>
				</tr>
				<c:forEach var="member" items="${list }">
					<tr onclick="getRecord(${member.id})">
						<td align="center">${member.id }</td>
						<td align="center">${member.password }</td>
						<td align="center">${member.name }</td>
						<td align="center">${member.age }</td>
						<td align="center">${member.gender }</td>
					</tr>
				</c:forEach>
			</table>
		</div><br/>
		<div>
			<button type="button" onclick="location.href='home.do'">Home...</button>
		</div>
		<div>
			<form id="frm" name="frm" action="memberSelect.do" method="post">
				<input type="hidden" id="id" name="id">
			</form>
		</div>
	</div>
	
</body>
</html>