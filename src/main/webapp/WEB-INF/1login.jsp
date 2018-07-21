<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
	response.setCharacterEncoding("UTF-8");
	request.setCharacterEncoding("UTF-8");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
<link rel="stylesheet"
	href="//fonts.googleapis.com/css?family=Open+Sans:300,400">
<!-- Google web font "Open Sans", https://fonts.google.com/ -->
<link rel="stylesheet"
	href="font-awesome-4.6.3/css/font-awesome.min.css">
<!-- Font Awesome, http://fontawesome.io/ -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- Bootstrap style, http://v4-alpha.getbootstrap.com/ -->
<link rel="stylesheet" href="css/magnific-popup.css">
<!-- Magnific pop up style, http://dimsemenov.com/plugins/magnific-popup/ -->
<link rel="stylesheet" href="css/templatemo-style.css">
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
					<li class="tm-nav-item"><a href="#welcome"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-smile-o tm-nav-fa"></i>Home
					</a></li>
					<li class="tm-nav-item"><a href="#gallery"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-image tm-nav-fa"></i>Bands
					</a></li>
					<li class="tm-nav-item"><a href="#services"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-tasks tm-nav-fa"></i>Ads
					</a></li>
					<li class="tm-nav-item"><a href="#about"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-sitemap tm-nav-fa"></i>People
					</a></li>
					<li class="tm-nav-item"><a href="#contact"
						class="tm-nav-item-link tm-button"> <i
							class="fa fa-envelope-o tm-nav-fa"></i>Your messages
					</a></li>
				</ul>
				</nav>
			</div>

			<div class="tm-main-content">

				<div class="tm-content-box tm-content-box-home">
					<div>
						<h2>Login!</h2>
						<c:if test="${param.error != null}">
							<p>Invalid credentials!!!</p>
						</c:if>

						<form method="post" action="/SoundSearch/login">
							<input type="text" name="username" placeholder="Enter username">
							<input type="password" name="password"
								placeholder="Enter password"> <input type="hidden"
								name="${_csrf.parameterName}" value="${_csrf.token}" /> <input
								type="submit" value="Log in">
						</form>
					</div>

					<div>
						<h2>Register!</h2>
						<form:form method="post" action="/SoundSearch/register"
							modelAttribute="singleUser">
							<form:input path="username" placeholder="Enter username" />
							<form:input path="password" placeholder="Enter password"
								type="password" />

							<input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />

							<input type="submit" value="Register">
						</form:form>
					</div>

					<div class="tm-welcome-boxes-container"></div>
				</div>



				</section>

				<footer class="tm-footer">
				<p class="text-xs-center">
					Copyright &copy; 2016 Your Company | Design: <a
						href="http://templatemo.com" target="_parent">Templatemo</a>
				</p>
				</footer>

			</div>
		</div>
	</div>

	<!-- load JS files -->

	<script src="js/jquery-1.11.3.min.js"></script>
	<!-- jQuery (https://jquery.com/download/) -->
	<script
		src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script>
	<!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<!-- Magnific pop-up (http://dimsemenov.com/plugins/magnific-popup/) -->
	<script src="js/jquery.singlePageNav.min.js"></script>
	<!-- Single Page Nav (https://github.com/ChrisWojcik/single-page-nav) -->

	<!-- Templatemo scripts -->
	<script>
		/* Google map
		------------------------------------------------*/
		var map = '';
		var center;

		function initialize() {
			var mapOptions = {
				zoom : 16,
				center : new google.maps.LatLng(37.769725, -122.462154),
				scrollwheel : false
			};

			map = new google.maps.Map(document.getElementById('google-map'),
					mapOptions);

			google.maps.event.addDomListener(map, 'idle', function() {
				calculateCenter();
			});

			google.maps.event.addDomListener(window, 'resize', function() {
				map.setCenter(center);
			});
		}

		function calculateCenter() {
			center = map.getCenter();
		}

		function loadGoogleMap() {
			var script = document.createElement('script');
			script.type = 'text/javascript';
			script.src = 'https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&'
					+ 'callback=initialize';
			document.body.appendChild(script);
		}

		function setNavbar() {
			if ($(document).scrollTop() > 160) {
				$('.tm-sidebar').addClass('sticky');
			} else {
				$('.tm-sidebar').removeClass('sticky');
			}
		}

		$(document).ready(function() {

			// Single page nav
			$('.tm-main-nav').singlePageNav({
				'currentClass' : "active",
				offset : 20
			});

			// Detect window scroll and change navbar
			setNavbar();

			$(window).scroll(function() {
				setNavbar();
			});

			// Magnific pop up
			$('.tm-gallery').magnificPopup({
				delegate : 'a', // child items selector, by clicking on it popup will open
				type : 'image',
				gallery : {
					enabled : true
				}
			// other options
			});

			// Google Map
			loadGoogleMap();
		});
	</script>

</body>
</html>