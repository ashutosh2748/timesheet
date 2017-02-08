<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Detail</title>
</head>
<body>
	<h1>Student Detail</h1>
	
	<table>
		<tr><td>Student Id</td><td>:</td><td>${student.studentId}</td></tr>
		<tr><td>Student Full Name</td><td>:</td><td>${student.firstName} ${student.lastName}</td></tr>
	</table>
	
	
	
</body>
</html>