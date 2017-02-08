<%@include file="../includes/header.jsp"%>
<%@include file="../includes/nav.jsp"%>
<c:url value="/faculty" var="facultyUrl" />

<div class="container-fluid">
	<div class="row">
		<%@include file="sidebar.jsp" %>
		<div class="col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Course Offerings - Sessions - </h1>

			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Id</th>
							<th>Start Date</th>
							<th>End Date</th>
							<th>Location</th>
							<th>Report</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="i" value="0" />
						<c:forEach items="${courseoffering}" var="courseOff">
							<c:set var="i" value="${i+1}" />
							<tr>
								<td>#${i}</td>
								<td>${courseOff.courseOfferingId}</td>
								<td>${courseOff.startDate}</td>
								<td>${courseOff.endDate}</td>
								<td>${courseOff.location.name}</td>
								<td><a href="course-offering/${courseOff.id}" title="View Report">View</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<%@include file="../includes/footer.jsp"%>