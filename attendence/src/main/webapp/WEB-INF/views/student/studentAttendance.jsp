<%@include file="../includes/header.jsp"%>
<%@include file="../includes/nav.jsp"%>
<c:url value="/student" var="studentUrl" />

<div class="container-fluid">
	<div class="row">
		<%@include file="sidebar.jsp"%>
		<div class="col-md-10 col-md-offset-2 main">
			<h1 class="page-header">Course Offering - Attendance</h1>

			<div class="table-responsive">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>#</th>
							<th>Date</th>
							<th>Location</th>
							<th>TimeSlot</th>
						</tr>
					</thead>
					<tbody>
						<c:set var="i" value="0" />
						<c:forEach items="${records}" var="record">
							<c:set var="i" value="${i+1}" />
							<tr>
								<td>#${i}</td>
								<td>${record.date}</td>
								<td>${record.location.locationId}</td>
								<td>${record.timeslot.abbrv}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>

<%@include file="../includes/footer.jsp"%>
