<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!-- taglibs are not ignored -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Pipeline Bootstrap 4.0 Theme</title>
<!--
Pipeline
http://www.templatemo.com/tm-496-pipeline
-->
<!-- load stylesheets -->
<link href='<spring:url value="/resources/css/styleFront.css"/>'
	rel="stylesheet" />
<link
	href='<spring:url value="//fonts.googleapis.com/css?family=Open+Sans:300,400"/>'
	rel="stylesheet" />
<!-- Google web font "Open Sans", https://fonts.google.com/ -->
<link href='<spring:url value="/resources/css/styleFront.css"/>'
	rel="stylesheet" />
<!-- Font Awesome, http://fontawesome.io/ -->
<link
	href='<spring:url value="/resources/font-awesome-4.6.3/css/font-awesome.min.css"/>'
	rel="stylesheet" />
<link href='<spring:url value="/resources/css/bootstrap.min.css"/>'
	rel="stylesheet" />
<!-- Bootstrap style, http://v4-alpha.getbootstrap.com/ -->
<link href='<spring:url value="/resources/css/magnific-popup.css"/>'
	rel="stylesheet" />
<!-- Magnific pop up style, http://dimsemenov.com/plugins/magnific-popup/ -->
<link href='<spring:url value="/resources/css/templatemo-style.css"/>'
	rel="stylesheet" />
<!-- Templatemo style -->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
</head>

<body>
	<div class="container-fluid">

		<section id="welcome" class="tm-content-box tm-banner margin-b-10">
		<div class="tm-banner-inner">
			<h1 class="tm-banner-title">Pipeline</h1>
		</div>
		</section>

		<div class="tm-body">
			<div class="tm-sidebar">
				<nav class="tm-main-nav">
				<ul class="tm-main-nav-ul">
					<li class="tm-nav-item"><a href="/SoundSearch/home"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-smile-o tm-nav-fa"></i>Strona Startowa
					</a></li>
					<li class="tm-nav-item"><a href="/SoundSearch/editUser"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-smile-o tm-nav-fa"></i>Twój profil
					</a></li>
					<li class="tm-nav-item"><a href="/SoundSearch/bandMenu"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-image tm-nav-fa"></i>Zespoły
					</a></li>
					<li class="tm-nav-item"><a href="/SoundSearch/adMenu"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-tasks tm-nav-fa"></i>Ogłoszenia
					</a></li>

				</ul>
				</nav>
			</div>

			<div class="tm-main-content">



				<div class="tm-flex">
					<div class="form-group">
						<form:form method="post" modelAttribute="singleUser">
						
							<form:input type="hidden" class="form-control" items="${singleUser.id}"
									path="id" id="id"/>

							<form:input type="hidden" class="form-control" items="${singleUser.username}"
									path="username" id="username"/>
									
							<form:input type="hidden" class="form-control" items="${singleUser.password}"
									path="password" id="password"/>
									
							<form:input type="text" class="form-control" items="${singleUser.firstName}"
									path="firstName" id="firstName"/>
									
							<form:input type="text" class="form-control" items="${singleUser.lastName}"
									path="lastName" id="lastName" placeholder="Nazwisko"/>
						
							<form:input type="text" class="form-control" items="${singleUser.city}" 
									path="city" id="city" placeholder="Miejscowość"/>
												
							<form:input type="date" class="form-control" items="${singleUser.birthDate}"
									path="birthDate" id="birthDate" placeholder="Rok urodzenia"/>
						
							<form:input type="date" class="form-control" items="${singleUser.playingYears}" path="playingYears" id="playingYears" 
												placeholder="Od kiedy grasz?"/>
												
							<form:input type="text" class="form-control" items="${singleUser.gear}" path="gear" id="gear" 
												placeholder="Sprzęt, który posiadasz"/>
						
							<form:input type="text" class="form-control" items="${singleUser.description}" path="description" id="description" 
												placeholder="Coś o Tobie"/>
												
							<form:input type="text" class="form-control" items="${singleUser.httpLink}" path="httpLink" id="httpLink" 
												placeholder="Link do Twojej strony"/>

						
							<form:select multiple="true" path="playedInstruments" itemValue="id" items="${playedInstruments}" itemLabel="name" />
						
							<form:select multiple="true" path="musicGenres" itemValue="id" items="${musicGenres}" itemLabel="genreName"/>
							
							<button type="submit" class="btn btn-primary">Zapisz!</button>
						
						</form:form>
					
					</div>
					


				</div>


			</div>
</body>
</html>