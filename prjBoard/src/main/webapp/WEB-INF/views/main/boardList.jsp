<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList</title>
<script>
function getRecord(n){
	frm.bId.value=n;
	frm.submit();
}
</script>

</head>
<body>
	<div align="center">
		<div>
			<h2>공지사항리스트</h2>
		</div>
		<div>
			<table border="1">
				<tr>
					<th width="100">number</th>
					<th width="100">writer</th>
					<th width="100">title</th>
					<th width="100">date</th>
					<th width="100">hit</th>
				</tr>
				<c:forEach var="boards" items="${boards }">
					<tr onclick="getRecord(${boards.bId })">
						<td width="200">${boards.bId }</td>
						<td width="200">${boards.bWriter }</td>
						<td width="200">${boards.bTitle }</td>
						<td width="200">${boards.bDate}</td>
						<td width="200">${boards.bHit}</td>
					</tr>
				</c:forEach>
			</table>
		</div><div>
		<form id="frm" name="frm" action="selectBoard.do" method="post">
			<input type="hidden" id="bId" name="bId">
			</form>
		</div><hr>
		<div>
			<button onclick="location.href='home.do'">home</button>
			<button onclick="location.href='insertForm.do'">새 글작성</button>
			<button onclick="location.href='deleteForm.do'">글 삭제하기</button> 
		</div>
	</div>
</body>
</html>