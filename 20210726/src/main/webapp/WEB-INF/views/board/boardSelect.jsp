<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지글 상세 보기</title>
<script>
	function getRecord(n) {
		frm.bId.value = n;
		frm.submit();
	}
	
	function getRecord1(n) {
		frm1.bId.value = n;
		frm1.submit();
	}
</script>
</head>
<body>
	<div align="center">
		<div><h1>게시글 상세 보기</h1></div>
		<hr>
		<div>
			<table border="1">
				<tr>
					<th width="100">글번호</th>
					<td width = "70" align="center">${board.bId }</td>
					<th width = "100">작성자</th>
					<td width = 150" align="center">${board.bWriter }</td>
					<th width = 100">작성일자</th>
					<td width = "150" align="center">${board.bDate } </td>
					<th width = "100">조회수</th>
					<td width = "70" align="center">${board.bHit }</td> 
				</tr>
				
				<tr>
					<th width="100">글제목</th>
					<td colspan="7">${board.bTitle }</td>
				</tr>
				
				<tr>
					<th width="100">내용</th>
					<td colspan="7">
						<textarea rows="5" cols="150">${board.bContent }</textarea>
					</td>				
				</tr>
			</table>
		</div><br/>
		<div>
			<button type="button" onclick="location.href='boardList.do'">목록</button>&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="getRecord1(${board.bId })">수정</button>&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="getRecord(${board.bId })">삭제</button>
		</div>
		
		<div>
			<form id="frm" name="frm" action="deleteBoard.do" method="post">
				<input type="hidden" id="bId" name="bId">
			</form>
		</div>
		
		<div>
			<form id="frm1" name="frm1" action="updateForm.do" method="post">
				<input type="hidden" id="bId" name="bId">
			</form>
		</div>
	</div>
</body>
</html>