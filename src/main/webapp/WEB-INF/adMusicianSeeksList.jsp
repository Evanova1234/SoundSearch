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
<style>

#table {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#table td, #table th {
    border: 1px solid #ddd;
    padding: 8px;
}

#table tr:nth-child(even){background-color: #f2f2f2;}

#table tr:hover {background-color: #ddd;}

#table th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #993366;
    color: white;
}

<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}


</style>
</style>
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
			<h1 class="tm-banner-title">SoundSearch</h1>
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
                    <li class="tm-nav-item"><a href="/SoundSearch/logout" 
                    	class="tm-nav-item-link tm-button">
                    <i class="fa fa-sitemap tm-nav-fa"></i>Wyloguj</a>
                    </li>					
					
				</ul>
				</nav>
			</div>

			<div class="tm-main-content"  >

					
	                       
				<div class="tm-flex">
					
         	<table id="table">
				<tr>
					<th>Autor</th>
					<th>Miejscowość</th>
					<th>Instrumenty</th>
					<th>Sprzęt</th>
					<th>Ogłoszenie</th>
				</tr>
				<c:forEach items="${adList}" var="ad">
				<tr>
					<td>${ad.singleUser.firstName} ${ad.singleUser.lastName}</td>
					<td>${ad.singleUser.city}</td>
					<td>
						<c:forEach items="${ad.singleUser.playedInstruments}" var="instrument">
							<p>${instrument.name}</p>
						</c:forEach>
					</td>
					
					<td>${ad.singleUser.gear}</td>
					<td>${ad.description}</td>
					
				</tr>
				</c:forEach>
			</table>
					  
         	    </div>

                   
        	</div>
        
         
      

    </body>
    </html>