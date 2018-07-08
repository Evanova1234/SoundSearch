<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

	<form:form method="post" modelAttribute="musicGenre">

		<div class="form-group">
			<label for="genreName">Nazwa gatunku</label> 
			<form:input type="text" class="form-control" path="genreName" id="genreName" placeholder="Podaj gatunek muzyczny"/>
		</div>
		<div class="form-group">
			<label for="genreDescription">Opis gatunku</label> 
			<form:input type="text"	class="form-control" path="genreDescription" id="genreDescription" placeholder="Podaj opis gatunku"/>
		</div>
		<div class="form-group">
			<label for="parentGenre">Gatunek nadrzędny</label> 
			<form:select path="parentGenre" itemValue="id" items="${parentGenres}" itemLabel="genreName" />
		</div>
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