<%@include file="../includes/header.jsp" %>
<%@include file="../includes/nav.jsp" %>
	<c:url value="/admin" var="adminUrl" />
	
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="#">Overview</a></li>
					<li><a href="${adminUrl}/users">Users</a></li>
					<li><a href="${adminUrl}/courses">Courses</a></li>
					<li><a href="${adminUrl}/courses-offerings">Course Offering</a></li>
					<li><a href="${adminUrl}/sessions">Session</a></li>
					<li><a href="${adminUrl}/locations">Locations</a></li>
					<li><a href="${adminUrl}/timeslots">Timeslots</a></li>
				</ul>
				<ul class="nav nav-sidebar">
					<li><a href="${adminUrl}/profile">Profile</a></li>
					<li><a href="${adminUrl}/password">Change Password</a></li>
					<li><a href="/logout">Logout</a></li>
				</ul>
			</div>
			<div class="col-md-10 col-md-offset-2 main">
				<h1 class="page-header">Admin Dashboard</h1>

				<h2 class="sub-header">Courses</h2>
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>#</th>
								<th>Header</th>
								<th>Header</th>
								<th>Header</th>
								<th>Header</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1,001</td>
								<td>Lorem</td>
								<td>ipsum</td>
								<td>dolor</td>
								<td>sit</td>
							</tr>
							<tr>
								<td>1,002</td>
								<td>amet</td>
								<td>consectetur</td>
								<td>adipiscing</td>
								<td>elit</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

<%@include file="../includes/footer.jsp" %>
