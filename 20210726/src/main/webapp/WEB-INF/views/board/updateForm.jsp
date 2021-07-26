<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
</head>
<body>
	<div align="center">
		<div><h1>게시글 수정</h1></div>
		<hr>
		<div>
			<form id="frm" name="frm" action="boardUpdate.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="100">글번호</th>
							<td width = "70" align="center">${board.bId }
							<input type="hidden" id="bId" name="bId" value="${board.bId }">
							</td>
							<th width = "100">작성자</th>
							<td width = 150" align="center">${board.bWriter }</td>
							<th width = 100">작성일자</th>
							<td width = "150" align="center">${board.bDate } </td>
							<th width = "100">조회수</th>
							<td width = "70" align="center">${board.bHit }</td> 
						</tr>
						
						<tr>
							<th width="100">글제목</th>
							<td colspan="7">
								<input type="text" id="bTitle" name="bTitle" value="${board.bTitle }" size="100">
							</td>
						</tr>
						
						<tr>
							<th width="100">내용</th>
							<td colspan="7">
								<textarea rows="5" cols="150" id="bContent" name="bContent">${board.bTitle }</textarea>
							</td>				
						</tr>
					</table>
				</div><br/>
				<div>
					<button type="button" onclick="location.href='boardList.do'">목록</button>&nbsp;&nbsp;&nbsp;
					<button type="submit">수정완료</button>
				</div>
			</form>
		</div>		
		
	</div>
</body>
</html>