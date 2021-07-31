<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<script>
	function getRecord(n) {
		frm.sNo.value = n;
		frm.submit();
	}
</script>

<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- Page Heading -->
	<h1 class="h3 mb-2 text-gray-800">커뮤니티 글보기</h1>
	<br>
	
	<div class="card shadow mb-4">
		<div class="card-header py-3">
			<h4 class="m-0 font-weight-bold text-primary">
				제목: ${list[0].sTitle }
			</h4>
		</div>
		<div class="card-body">
			<div class="table-responsive">
				작성자: ${list[0].sWriter } <br> 
				내용: ${list[0].sContent }<br>
				<hr>
				<i class="fas fa-align-justify"></i>
				<b>댓글</b>
				<br><br>
				<c:if test="${not empty list[0].cName }">
					<c:forEach var="sns" items="${list }">
						작성자: ${sns.cName }<br>
						댓글 내용: ${sns.cSubject }<br>
						댓글 작성일: ${sns.cDate } <br>
						<br>
					</c:forEach>
				</c:if>
			</div>
		</div>
	</div>
</div>
<!-- /.container-fluid -->

</div>
<!-- End of Main Content -->

<!-- Page level plugins -->
<script src="vendor/datatables/jquery.dataTables.min.js"></script>
<script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts -->
<script src="js/demo/datatables-demo.js"></script>