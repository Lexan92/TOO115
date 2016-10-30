<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE HTML>
<!--
	Twenty by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>SDDC</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		
                
                <link href="<c:url value="assets/css/main.css"/>" rel="stylesheet">
                
                
                
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
	</head>
	<body class="index">
		<div id="page-wrapper">

			<!-- Header -->
				<header id="header" class="alt">
					<h1 id="logo"><a href="index.html">SDDC <span>by MLOW</span></a></h1>
					<nav id="nav">
						<ul>
							<li class="current"><a href="index.html">Bienvenido</a></li>
							<li class="submenu">
								<a href="#">Opciones</a>
								<ul>
									<li><a href="left-sidebar.html">Estado de mi Denuncia</a></li>
									<li><a href="right-sidebar.html">Hacer Denuncia</a></li>
									
									<!--<li class="submenu">
										<a href="#">Submenu</a>
										<ul>
											<li><a href="#">Dolore Sed</a></li>
											<li><a href="#">Consequat</a></li>
											<li><a href="#">Lorem Magna</a></li>
											<li><a href="#">Sed Magna</a></li>
											<li><a href="#">Ipsum Nisl</a></li>
										</ul>
									</li>-->
								</ul>
							</li>
							<li><a href="#" class="button special">Iniciar Sesion</a></li>
							<li><a href="#" class="button special-alt">Registrarse</a></li>
						</ul>
					</nav>
				</header>

			<!-- Banner -->
				<section id="banner">

					<!--
						".inner" is set up as an inline-block so it automatically expands
						in both directions to fit whatever's inside it. This means it won't
						automatically wrap lines, so be sure to use line breaks where
						appropriate (<br />).
					-->
					<div class="inner">

						<header>
							<h2>Sistema<br/>de<br/> Denuncias Ciudadanas</h2>
						</header>
						<p>Automatizamos <strong>tus</strong> denuncias
						
						
						<footer>
							<ul class="buttons vertical">
								<li><a href="#main" class="button fit scrolly">Denunciar</a></li>
							</ul>
						</footer>

					</div>

				</section>

			<!-- Main -->
				<article id="main">

					<header class="special container">
					<span class="icon fa-bullhorn"></span> 
						<h2> <strong>Denuncia Ciudadana</strong> 
					</header>

					<!-- One -->
						<section class="wrapper style2 container special-alt">
							<div class="row 50%">
								<div class="8u 12u(narrower)">

                                                                    <f:form action="add.html" modelAttribute="Denuncia">
										<div class="row 50%">
											<div class="6u 12u(mobile)">
												<p><strong>Nombre y Apellido</strong></p>
												<input type="text" name="name" placeholder="Escriba su nombre y apellido" />
											</div>
											<div class="6u 12u(mobile)">
												<p><strong>Correo Electronico</strong></p>
												<input type="text" name="email" placeholder="Escriba su Correo Electronico" />
											</div>
										</div>
										<div class="row 50%">
											<div class="12u">
												<p><strong>Categoria de Denuncia</strong></p>				
												<select name='Categoria'>
                                                                                                            <option selected >Selecciona uno</option>
                                                                                                            
                                                                                                            <c:forEach items="${lst}" var="p">
                                                                                                                <option value=${p.idCategoria}>${p.nombreCategoria}</option>
                                                                                                                
                                                                                                            </c:forEach>
                                                                                                           
                                                                                                            </select>
											</div>
										</div>
										<div class="row 50%">
											<div class="12u">
												<p><strong>Descripcion de los hechos</strong></p>
												<textarea name="Descripcion" placeholder="Redacte aqui lo sucedido, nombre de personas involucradas, dependencias u oficinas de gobierno involucradas, nombres y cargos de los involucrados, la fecha y hora" rows="7"></textarea>
											</div>
										</div>


										<div class="row">
											<div class="12u">
												<ul class="buttons">

													<br/>
													<li><span class="icon fa-picture-o"> Imagen</span></li><br/>
													<li><input type="file" class="special" name="imagen" <img src="/images/photo-camera.png" alt=""></span></li><br/><br/>
													<li><span class="icon fa-video-camera"> Video</span></li><br/>
													<li><input type="file" class="special" name="video"></span></li>

													
										</div>

										</div>



										<div class="row">
											<div class="12u">
												<ul class="buttons">
													<li><input type="submit"  class="special" value="Registrar su Denuncia" /></li>
												</ul>
											</div>
										</div>
									</f:form>
                                                                    <script>
                                                                 (function(){
	var content = document.getElementById("geolocation-test");

	if (navigator.geolocation)
	{
		navigator.geolocation.getCurrentPosition(function(objPosition)
		{
			var lon = objPosition.coords.longitude;
			var lat = objPosition.coords.latitude;

			content.innerHTML = "<p><strong>Latitud:</strong> " + lat + "</p><p><strong>Longitud:</strong> " + lon + "</p>";

		}, function(objPositionError)
		{
			switch (objPositionError.code)
			{
				case objPositionError.PERMISSION_DENIED:
					content.innerHTML = "No se ha permitido el acceso a la posición del usuario.";
				break;
				case objPositionError.POSITION_UNAVAILABLE:
					content.innerHTML = "No se ha podido acceder a la información de su posición.";
				break;
				case objPositionError.TIMEOUT:
					content.innerHTML = "El servicio ha tardado demasiado tiempo en responder.";
				break;
				default:
					content.innerHTML = "Error desconocido.";
			}
		}, {
			maximumAge: 75000,
			timeout: 15000
		});
	}
	else
	{
		content.innerHTML = "Su navegador no soporta la API de geolocalización.";
	}
})();</script>

								</div>
								<div class="4u 12u(narrower) important(narrower)">

									<ul class="featured-icons">
										<li><span class="icon fa-assistive-listening-systems"></span></li>
										<li><span class="icon fa-child"><span class="label">Feature 2</span></span></li>
										<li><span class="icon fa-bullhorn"><span class="label">Feature 3</span></span></li>
										<li><span class="icon fa-exclamation-circle"><span class="label">Feature 4</span></span></li>
										<li><span class="icon fa-commenting"><span class="label">Feature 5</span></span></li>
										<li><span class="icon fa-eye"><span class="label">Feature 6</span></span></li>



									</ul>

								</div>
							</div>
						</section>

					

			<!-- Footer -->
				<footer id="footer">

					<ul class="icons">
						<li><a href="#" class="icon circle fa-twitter"><span class="label">Twitter</span></a></li>
						<li><a href="#" class="icon circle fa-facebook"><span class="label">Facebook</span></a></li>
						<li><a href="#" class="icon circle fa-google-plus"><span class="label">Google+</span></a></li>
						<li><a href="#" class="icon circle fa-github"><span class="label">Github</span></a></li>
						<li><a href="#" class="icon circle fa-dribbble"><span class="label">Dribbble</span></a></li>
					</ul>

					<ul class="copyright">
						<li>&copy; Untitled</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
					</ul>

				</footer>

		</div>

		<!-- Scripts -->
                <script src=<c:url value="/assets/js/jquery.min.js"/>></script>
               <script src=<c:url value="assets/js/jquery.dropotron.min.js"/>></script>
		<script src=<c:url value="assets/js/jquery.scrolly.min.js"/>></script>	
		<script src=<c:url value="assets/js/jquery.scrollgress.min.js"/>></script>	
		<script src=<c:url value="assets/js/skel.min.js"/>></script>	
		<script src=<c:url value="assets/js/util.js"/>></script>	
		<script src=<c:url value="assets/js/main.js"/>></script>
              
			
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			

	</body>
</html>