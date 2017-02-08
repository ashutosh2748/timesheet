<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="utf-8"> 
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="MUM">
	<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
	<link rel="icon" href="images/favicon.ico" type="image/x-icon">
	<title>Welcome to MUM Attendance Checking Software!</title>
	<!-- <link href="webjars/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" /> -->
	<style>
		.welcome-page{
			max-width: 800px;
		    padding: 15px;
		    margin: 0 auto;
		    text-align: center;
		}
		.welcome-page img{
			width: 55%;
		}
		.welcome-page a{
			text-decoration: underline;
    		color: #2f2020;
		}
		.welcome-page a:hover{
			text-decoration: none;
    		color: #9ca2a2;
    		cursor: pointer;
		}
	</style>

</head>
<body>  

	<div class="container-fluid welcome-page">
		<div class="row">
			<div class="col-sm-12">
				<h1>Welcome to Attendance Checking Software!</h1>
				<a href="/login" title="Attendance Checking Software">
					<img src="images/scanner.jpg" title="Attendance Checking Software" alt="Attendance Checking Software " />
					<h3>Login Here</h3>
				</a>
 			</div>
		</div>
	</div>

</body>
</html>
