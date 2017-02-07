
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="true"%>
<html>
<head>
	<title>Login</title>
	<link href="webjars/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>

	<div id="login-box">

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>

		<form name='loginForm'
		  action="<c:url value='/login' />" method='POST'>

		<table>
			<tr>
				<%-- <td><spring:message code="form.userID.label"/></td> --%>
				<td>Username: <input type='text' name='username'></td>
			</tr>
			<tr>
				<%-- <td><spring:message code="form.password.label"/></td> --%>
				<td>Password: <input type='password' name='password' /></td>
			</tr>
			<tr>
				<td class="btn " colspan='2'><input name="submit" type="submit"
				  value="Login" /></td>
				  <%-- <spring:message code="form.submit.label"/> --%>
			</tr>
		  </table>

		  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

		</form>
	</div>
	
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	
</body>
</html>
