<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<% 	response.setCharacterEncoding("UTF-8");
	request.setCharacterEncoding("UTF-8");
%>
    
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

	<form:form method="post" modelAttribute="singleUser">


		<div class="form-group">
			<label for="firstName">Dane muzyka</label> 
			<form:input type="text" class="form-control" path="firstName" id="firstName" 
						placeholder="Imię"/>
			
			<form:input type="text" class="form-control" path="lastName" id="lastName" 
						placeholder="Nazwisko"/>

			<form:input type="text" class="form-control" path="city" id="city" 
						placeholder="Miejscowość"/>
						
			<form:input type="date" class="form-control" path="birthDate" id="birthDate" 
						placeholder="Miejscowość"/>

			<form:input type="date" class="form-control" path="playingYears" id="playingYears" 
						placeholder="Od kiedy grasz?"/>
						
			<form:input type="text" class="form-control" path="gear" id="gear" 
						placeholder="Sprzęt, który posiadasz"/>

			<form:input type="text" class="form-control" path="description" id="description" 
						placeholder="Coś o Tobie"/>
						
			<form:input type="text" class="form-control" path="httpLink" id="httpLink" 
						placeholder="Link do Twojej strony"/>
		</div>

		<form:checkboxes items="${playedInstruments}" path="playedInstruments" itemLabel="instrument" />

		<form:checkboxes items="${musicGenres}" path="musicGenres" itemLabel="genreName" />

		<button type="submit" class="btn btn-primary">Zapisz!</button>

	</form:form>


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