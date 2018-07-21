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
    <link href='<spring:url value="/resources/css/styleFront.css"/>' rel="stylesheet" />
    <link href='<spring:url value="//fonts.googleapis.com/css?family=Open+Sans:300,400"/>' rel="stylesheet" /> <!-- Google web font "Open Sans", https://fonts.google.com/ -->
    <link href='<spring:url value="/resources/css/styleFront.css"/>' rel="stylesheet" /> <!-- Font Awesome, http://fontawesome.io/ -->
    <link href='<spring:url value="/resources/font-awesome-4.6.3/css/font-awesome.min.css"/>' rel="stylesheet" />
    <link href='<spring:url value="/resources/css/bootstrap.min.css"/>' rel="stylesheet" /> <!-- Bootstrap style, http://v4-alpha.getbootstrap.com/ -->
    <link href='<spring:url value="/resources/css/magnific-popup.css"/>' rel="stylesheet" /> <!-- Magnific pop up style, http://dimsemenov.com/plugins/magnific-popup/ -->
    <link href='<spring:url value="/resources/css/templatemo-style.css"/>' rel="stylesheet"/> <!-- Templatemo style -->
    
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
                            <li class="tm-nav-item"><a href="#welcome" class="tm-nav-item-link tm-button">
                                <i class="fa fa-smile-o tm-nav-fa"></i>Welcome</a>
                            </li>
                            <li class="tm-nav-item"><a href="#gallery" class="tm-nav-item-link tm-button">
                                <i class="fa fa-image tm-nav-fa"></i>Image Gallery</a>
                            </li>
                            <li class="tm-nav-item"><a href="#services" class="tm-nav-item-link tm-button">
                                <i class="fa fa-tasks tm-nav-fa"></i>Our Services</a>
                            </li>
                            <li class="tm-nav-item"><a href="#about" class="tm-nav-item-link tm-button">
                                <i class="fa fa-sitemap tm-nav-fa"></i>About Company</a>
                            </li>
                            <li class="tm-nav-item"><a href="#contact" class="tm-nav-item-link tm-button">
                                <i class="fa fa-envelope-o tm-nav-fa"></i>Contact Us</a>
                            </li>
                        </ul>
                    </nav>
                </div>
                
                <div class="tm-main-content">
                    
                    <div class="tm-content-box tm-content-box-home">                        
                        <img src="img/1200x800-01.jpg" alt="Image 1" class="img-fluid tm-welcome-img">                        
                        <div class="tm-welcome-boxes-container">
                            <div class="tm-welcome-box">
                                <div class="tm-welcome-text">
                                    <h2 class="tm-section-title">Aliquam ante sapien</h2>
                                    <p>Duis vel elit eu eros dapibus vestibulum vel vel nibh. Nulla id ornare eros, at efficitur risus.</p>    
                                </div>                            
                                <a href="#" class="tm-welcome-link tm-button">Learn More</a>
                            </div>
                            <div class="tm-welcome-box">
                                <div class="tm-welcome-text">
                                    <h2 class="tm-section-title">Lorem ipsum dolor</h2>
                                    <p>Vivamus eleifend ac turpis sit amet maximus. Nulla in faucibus nisl, ut ultrices magna.</p>    
                                </div>                            
                                <a href="#" class="tm-welcome-link tm-button">Read Details</a>
                            </div>
                        </div>
                    </div>
                        
                    <div id="gallery" class="tm-content-box">                        
                        <div class="grid tm-gallery">
                            <figure class="effect-bubba">
                                <img src="img/img-11-08.jpg" alt="Image 8" class="img-fluid">
                                <figcaption>
                                    <h2>Light <span>Bridge</span></h2>
                                    <p>Fusce faucibus metus in augue</p>
                                    <a href="img/img-11-08.jpg">View more</a>
                                </figcaption>
                            </figure>

                            <figure class="effect-bubba">
                                <img src="img/img-11-07.jpg" alt="Image 7" class="img-fluid">
                                <figcaption>
                                    <h2>Glass <span>Tower</span></h2>
                                    <p>Sed ut ipsum eu purus ullamcorper</p>
                                    <a href="img/img-11-07.jpg">View more</a>
                                </figcaption>
                            </figure>

                            <figure class="effect-bubba">
                                <img src="img/img-11-05.jpg" alt="Image 5" class="img-fluid">
                                <figcaption>
                                    <h2>Jump <span>Higher</span></h2>
                                    <p>Morbi fermentum eget libero sed</p>
                                    <a href="img/img-11-05.jpg">View more</a>
                                </figcaption>
                            </figure>

                            <figure class="effect-bubba">
                                <img src="img/img-11-03.jpg" alt="Image 3" class="img-fluid">
                                <figcaption>
                                    <h2>Forest <span>Park</span></h2>
                                    <p>Aenean rutrum enim a tellus suscipit</p>
                                    <a href="img/img-11-03.jpg">View more</a>
                                </figcaption>
                            </figure>

                            <figure class="effect-bubba">
                                <img src="img/img-11-02.jpg" alt="Image 2" class="img-fluid">
                                <figcaption>
                                    <h2>Ice <span>Mountain</span></h2>
                                    <p>Curabitur a ipsum eget eros sodales</p>
                                    <a href="img/img-11-02.jpg">View more</a>
                                </figcaption>
                            </figure>

                            <figure class="effect-bubba">
                                <img src="img/img-11-04.jpg" alt="Image 4" class="img-fluid">
                                <figcaption>
                                    <h2>Green <span>Field</span></h2>
                                    <p>Duis eget tortor et mauris tempus</p>
                                    <a href="img/img-11-04.jpg">View more</a>
                                </figcaption>
                            </figure>                                
                        </div>
                    </div>

                    <div id="services" class="tm-content-box tm-gray-bg tm-services">

                        <div class="tm-services-img-container">
                            <img src="img/450x900-01.jpg" alt="Green Field" class="img-fluid tm-services-img">    
                        </div> 
                            
                        <div class="tm-box-pad tm-services-description-container">
                            <h2 class="tm-section-title">Vivamus eget convallis tellus</h2>
                            <p class="tm-section-description">Pipeline Bootstrap 4.0 Template is provided by <a href="http://templatemo.com" target="_parent">templatemo</a> website. You may use this HTML CSS template and also share it to friends. Thank you for visiting our site.</p>
                        <p class="tm-section-description">Duis vel elit eu eros dapibus vestibulum vel vel nibh. Morbi efficitur erat nulla, id tempor mi accumsan sed. Suspendisse sollicitudin condimentum interdum. <span class="tm-blue-text">BG #F4F4F4 Button BG #936</span> <span class="tm-red-text">Button Hover BG #C33</span></p> 
                            <p class="tm-section-description">Nulla id ornare eros, at efficitur risus. Fusce sodales lorem magna, id tempor justo mattis eget. Aenean accumsan semper commodo. Aliquam ante sapien, tincidunt sed vaius et, luctus condimentum sapien.</p>   
                        </div>                                              
                        
                    </div>

                    <!-- slider -->
                    <div id="about" class="tm-content-box">
                        <div class="tm-box-pad tm-bordered-box">
                            <h2 class="tm-section-title">Mauris sollicitudin a nibh ut sollicitudin</h2>
                            <p>Pellentesque quam libero, hendrerit pretium feugiat sed, rhoncus ac nunc. Etiam eget dui vel ex eleifend mattis eget vitae risus. Nullam eu libero sit amet quam finibus condimentum. Aenean vulputate dictum suscipit. Morbi efficitur erat nulla, id tempor mi accumsan sed.</p>
                            <a href="#" class="tm-button tm-button-normal">Read More</a>
                        </div>
                        <div class="tm-flex">
                            <div class="tm-purple-bg tm-box-pad tm-bordered-box tm-no-border-top">
                                <h2 class="tm-section-title">Cras volutpat fermentum</h2>
                                <p>Aliquam ante sapien, tincidunt sed varius et, luctus condimentum sapien. Duis vel elit eu eros dapibus vestibulum vel vel nibh. Nulla id ornare eros.</p>
                            </div>
                            <div class="tm-gray-bg tm-box-pad tm-bordered-box tm-no-border-top">
                                <h2 class="tm-section-title">Aenean vulputate dictum</h2>
                                <p>Suspendisse ultricies egestas nulla, non vestibulum quam suscipit et. Sed sit amet enim ultricies, auctor nisl eu, porta augue. Cras et tristique augue.</p>
                            </div>    
                        </div>                        
                    </div>

                    <section id="contact" class="tm-content-box">

                        <div class="tm-flex">
                            <div class="tm-contact-left-half tm-gray-bg">
                                <div class="tm-contact-inner-pad">
                                    <h2 class="tm-section-title">Contact Us</h2>
                                    <form action="#contact" method="post" class="contact-form">

                                        <div class="form-group">
                                            <input type="text" id="contact_name" name="contact_name" class="form-control" placeholder="Name"  required/>
                                        </div>
                                        <div class="form-group">
                                            <input type="email" id="contact_email" name="contact_email" class="form-control" placeholder="Email"  required/>
                                        </div>
                                        <div class="form-group">
                                            <textarea id="contact_message" name="contact_message" class="form-control" rows="9" placeholder="Message" required></textarea>
                                        </div>
                                        
                                        <button type="submit" class="btn btn-primary pull-xs-right tm-button tm-button-normal">Submit</button>

                                    </form>
                                </div>                                
                            </div>

                            <div class="tm-contact-right-half tm-purple-bg">
                                <div class="tm-address-box">
                                    <h2 class="tm-section-title">Our Location</h2>
                                    <address>110 tellus ut fringilla ornare,<br>
                                             velit arcu rutrum metus<br>
                                             id elementum 10990
                                    </address>    
                                </div>                                
                                <div id="google-map"></div>
                            </div>
                        </div>
                        
                    </section>  

                    <footer class="tm-footer">
                        <p class="text-xs-center">Copyright &copy; 2016 Your Company | Design: <a href="http://templatemo.com" target="_parent">Templatemo</a></p>
                    </footer>

                </div>
            </div>             
        </div>
        
        <!-- load JS files -->
        
        <script src="js/jquery-1.11.3.min.js"></script>             <!-- jQuery (https://jquery.com/download/) -->
        <script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap (http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h) -->
        <script src="js/jquery.magnific-popup.min.js"></script>     <!-- Magnific pop-up (http://dimsemenov.com/plugins/magnific-popup/) -->
        <script src="js/jquery.singlePageNav.min.js"></script>      <!-- Single Page Nav (https://github.com/ChrisWojcik/single-page-nav) -->
        
        <!-- Templatemo scripts -->
        <script>  

        /* Google map
        ------------------------------------------------*/
        var map = '';
        var center;

        function initialize() {
            var mapOptions = {
                zoom: 16,
                center: new google.maps.LatLng(37.769725, -122.462154),
                scrollwheel: false
            };
        
            map = new google.maps.Map(document.getElementById('google-map'),  mapOptions);

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

        function loadGoogleMap(){
            var script = document.createElement('script');
            script.type = 'text/javascript';
            script.src = 'https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&' + 'callback=initialize';
            document.body.appendChild(script);
        } 

        function setNavbar() {
            if ($(document).scrollTop() > 160) {
                $('.tm-sidebar').addClass('sticky');
            } else {
                $('.tm-sidebar').removeClass('sticky');
            }
        }                   
    
        $(document).ready(function(){
            
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
              delegate: 'a', // child items selector, by clicking on it popup will open
              type: 'image',
              gallery: {enabled:true}
              // other options
            });

            // Google Map
            loadGoogleMap();            
        });
    
        </script>             

    </body>
    </html>