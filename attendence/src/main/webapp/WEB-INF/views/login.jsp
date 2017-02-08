<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="true"%>
<html>
<head>
	<title>Login</title>
	<link href="webjars/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" />
	<link href="css/custom.css" rel="stylesheet" />
</head> 
<body>
	
	<div class="container">

      <form class="form-signin" name='loginForm' action="<c:url value='/login' />" method='POST'>
        <h2 class="form-signin-heading">Please sign in</h2>
        
        <c:if test="${not empty error}">
			<div class="alert alert-danger">
			  <strong>Error!</strong> ${error}
			</div>
		</c:if>
		
		<c:if test="${not empty msg}">
			<div class="alert alert-success">
			  <strong>Success!</strong> ${msg}
			</div>
		</c:if>
		
        <label for="username" class="sr-only">Username:</label>
        <input type="text" name="username" id="username" class="form-control" placeholder="Username" required autofocus>
        <label for="password" class="sr-only">Password:</label>
        <input type="password" name="password" id="password" class="form-control" placeholder="Password" required>
       	
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        
        <input class="btn btn-lg btn-primary btn-block" name="submit" type="submit" value="Login" />
      </form>

    </div> <!-- /container -->
	
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
</body>
</html>
