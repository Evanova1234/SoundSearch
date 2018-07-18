<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<% 	response.setCharacterEncoding("UTF-8");
	request.setCharacterEncoding("UTF-8");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="pl_PL">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap 101 Template</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

</head>
<body>

	<div>

		<div>
			<h2>Login!</h2>
			<c:if test="${param.error != null}">
				<p>Invalid credentials!!!</p>
			</c:if>

			<form method="post" action="/modul6/login">
				<input type="text" name="username" placeholder="Enter username">
				<input type="password" name="password" placeholder="Enter password">
				<input type="hidden" 	name="${_csrf.parameterName}"
										value="${_csrf.token}"/> 
				<input type="submit" value="Log in">
			</form>
		</div>

		<div>
			<h2>Register!</h2>
			<form:form action="register" method="post" modelAttribute="singleUser">
				<form:input path="userName" placeholder="Enter username" />
				<form:input path="password" placeholder="Enter password" type="password" />

				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csrf.token}" />

				<input type="submit" value="Register">
			</form:form>
		</div>

		


		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<!-- Latest compiled and minified JavaScript -->
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
			integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
			crossorigin="anonymous"></script>
</body>
</html>