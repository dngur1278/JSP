<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="400" height="400" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td colspan="2">
				<!-- 헤더 부분: 시작 -->
				<tiles:insertAttribute name="header"/>
				<!-- 헤더 부분: 끝 -->
			</td>
		</tr>
		<tr>
			<td width="100" valign="top">
				<!-- 매뉴 부분: 시작 -->
			    <tiles:insertAttribute name="menu"/>
			    <!-- 매뉴 부분: 끝 -->    
			</td>
			<td width="300" valign="top">
				<!-- 내용 부분: 시작 -->
				<tiles:insertAttribute name="body"/>
				<br><br><br>
			    <!-- 내용 부분: 끝 -->
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<!-- 푸터 부분: 시작 -->
			    <tiles:insertAttribute name="footer"/>
			    <!-- 푸터 부분: 끝 -->    
			</td>
		</tr>
	</table>
</body>
</html>