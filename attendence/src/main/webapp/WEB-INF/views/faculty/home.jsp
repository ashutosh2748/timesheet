<%@include file="../includes/header.jsp"%>
<%@include file="../includes/nav.jsp"%>
<c:url value="/faculty" var="facultyUrl" />

<div class="container-fluid">
	<div class="row">
		<%@include file="sidebar.jsp" %>
		<div class="col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Faculty Dashboard</h1>

			<h2 class="sub-header">Courses</h2>
			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Course Id</th>
							<th>Course Description</th>
							<th>Course Offerings</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="i" value="0" />
						<c:forEach items="${courses}" var="course">
							<c:set var="i" value="${i+1}" />
							<tr>
								<td>#${i}</td>
								<td>${course.courseId}</td>
								<td>${course.description}</td>
								<td><a href="${pageContext.request.contextPath}/faculty/course-offerings/${course.id}" title="View Course Offerings">View</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<%@include file="../includes/footer.jsp"%>
