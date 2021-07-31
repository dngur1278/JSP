<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
</head>
<body>
	<c:forEach var="members" items="${list }">
		${members.id } <br>
		${members.password } <br>
		${members.name } <br>
		${members.age } <br>
		${members.hobby } <br>
		${members.state } <br>
		<hr>
	</c:forEach>
</body>
</html>