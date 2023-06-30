<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- formularios -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Error Page Directive -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1.0">
	  <title>Document</title>
	  <link rel="stylesheet" href="resources/css/style.css">
	</head>
	<body id="contacto">
	
		<button>Menu</button>
    	<ul>
		    <li><a href="/">Inicio</a></li>
		    <li><a href="/contacto">Contacto</a></li>
		    <li><a href="/capacitacion">Crear Capacitación</a></li>
		    <li><a href="ListarCapacitaciones">Ver Capacitaciones</a></li>
		</ul>
	
	
	  <form:form action="contacto" method="POST" id="contacto-form" modelAttribute="contacto">
	    <fieldset>
	      <legend> Contacto </legend>
	      <div>
	      	<form:errors path="nombre" />
	        <form:label for="nombre" path="nombre">Nombre: </form:label>
	        <form:input type="text" name="nombre"  path="nombre" id="nombre" placeholder="Ingrese su nombre" title="Su nombre pue oiga!" />
	      </div>
	      <div>
	      	<form:errors path="email" />
	        <form:label for="email" path="email">Email: </form:label>
	        <form:input type="email" name="email" path="email" id="email" placeholder="Ingrese su email" title="Su email cabellero!!" />
	      </div>
	      <div>
	      	<form:errors path="mensaje"/>
	        <form:label for="mensaje" path="mensaje">Mensaje: </form:label>
	        <form:textarea name="mensaje" path="mensaje" id="mensaje" placeholder="Su mensaje..." title="Escriba su ocurrencia acá" ></form:textarea>
	      </div>
	      <input type="submit"/>
	    </fieldset>
	      
	  </form:form>
	   <script src="resources/js/index.js"></script>
	</body>
</html>