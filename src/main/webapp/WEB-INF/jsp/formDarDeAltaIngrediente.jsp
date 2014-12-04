<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title></title>
			<%@include file="/recursos/includes/recursos.html" %>
	</head>
	<body>

		<%@include file="/recursos/includes/navbar.html" %>

		<form:form action="darDeAltaIngrediente" method="POST" commandName="ingrediente" role="form">
		
			Nombre: 
			<form:input path="nombre"/>
			<br/>
			Precio: 
			<form:input path="precio"/>
			<br/>
			Tipo Ingrediente:
			<form:select path="tipo">
            	<form:options items="${tipos}"/>
        	</form:select>
			<br/>				
			<input type="submit" value="Dar de alta"/>
		
		</form:form>

		<script type="text/javascript">
      $(function() {
        $("#navbar ul li:contains(Nuevo ingrediente)").addClass("active");
      });
    </script>

	</body>
</html>
