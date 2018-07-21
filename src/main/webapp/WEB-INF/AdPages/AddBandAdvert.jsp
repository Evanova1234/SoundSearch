<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<% 	response.setCharacterEncoding("UTF-8");
	request.setCharacterEncoding("UTF-8");
	%>
    
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" modelAttribute="advertisement">


		<div class="form-group">
			<label>Dane muzyka</label> 
			<form:input type="text" class="form-control" path="description" id="description" 
						placeholder="Opis ogłoszenia"/>
			
			<form:input type="date" class="form-control" path="expirationDate" id="expirationDate" 
						placeholder="Data Ogłoszenia"/>
		</div>

		<form:checkboxes path="instruments" itemValue="id" items="${playedInstruments}" itemLabel="name" />

		<form:checkboxes path="musicGenres" itemValue="id" items="${musicGenres}" itemLabel="genreName"/>

		<form:checkboxes path="bandUser" itemValue="id" items="${bandUsers}" itemLabel="bandName"/>
		<form:input path="adCategory" itemValue="adCategory" items="${advertisement.adCategory}" itemLabel="adCategory"/>
		<button type="submit" class="btn btn-primary">Zapisz!</button>

	</form:form>



</body>
</html>