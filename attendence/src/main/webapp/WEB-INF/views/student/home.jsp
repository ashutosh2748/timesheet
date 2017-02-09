<%@include file="../includes/header.jsp"%>
<%@include file="../includes/nav.jsp"%>
<c:url value="/student" var="studentUrl" />

<div class="container-fluid">
	<div class="row">
		<%@include file="sidebar.jsp"%>
		<div class="col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Course Offerings</h1>

			<!-- <form class="form-inline">
				  <div class="form-group">
				    <label for="studentId">Student Id:</label>
				    <input type="text" class="form-control" id="studentId">
				  </div>
				  
				  <div class="form-group">
				  	  <label for="course-offering">Course Offering:</label>
					  <select class="form-control" id="course-offering">
					    <option value="">Choose Course Offering</option>
					    <option value="1">One</option>
					    <option value="2">Two</option>
					    <option value="3">Three</option>
					  </select>
				  </div>
				  
				  <button type="submit" class="btn btn-primary">Search</button>
				</form> -->

			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Course Offering Id</th>
							<th>Start Date</th>
							<th>End Date</th>
							<th>Location</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="i" value="0" />
						<c:forEach items="${courseofferings}" var="courseOff">
							<c:set var="i" value="${i+1}" />
							<tr>
								<td>#${i}</td>
								<td>${courseOff.courseOfferingId}</td>
								<td>${courseOff.startDate}</td>
								<td>${courseOff.endDate}</td>
								<td>${courseOff.location.name}</td>
								<td><a href="${pageContext.request.contextPath}/student/attendance/${courseOff.id}"
									title="View Course Offerings">View Attendance</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>



		</div>
	</div>
</div>

<%@include file="../includes/footer.jsp"%>
