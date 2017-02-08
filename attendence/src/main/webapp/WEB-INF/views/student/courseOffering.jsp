<%@include file="../includes/header.jsp" %>
<%@include file="../includes/nav.jsp" %>
	<c:url value="/student" var="studentUrl" />
	
	<div class="container-fluid">
		<div class="row">
			<%@include file="sidebar.jsp" %>
			<div class="col-md-10 col-md-offset-2 main">
				<h1 class="page-header">Course Offerings</h1>
				
				<form class="form-inline">
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
				</form>
				
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