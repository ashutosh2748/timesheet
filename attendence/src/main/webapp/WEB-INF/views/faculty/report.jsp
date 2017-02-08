<%@include file="../includes/header.jsp"%>
<%@include file="../includes/nav.jsp"%>
<c:url value="/faculty" var="facultyUrl" />

<div class="container-fluid">
	<div class="row">
		<%@include file="sidebar.jsp" %>
		<div class="col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Course Offerings Report - </h1>

			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Student Id</th>
							<th>Student Name</th>
							<th>Average Attendance</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="i" value="0" />
						<c:forEach items="${reports}" var="report">
							<c:set var="i" value="${i+1}" />
							<tr>
								<td>#${i}</td>
								<td>${report.student.studentId}</td>
								<td>${report.student.firstName} ${report.student.lastName}</td>
								<td>${report.average} %</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<%@include file="../includes/footer.jsp"%>