<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
	<head>
	<title></title>
	</head>
	<body>
		<form:form action="darDeAltaIngrediente" method="POST" commandName="ingrediente" role="form">
		
			Nombre: <form:input path="nombre"/>
			<br/>
			Precio: <form:input path="precio"/>
			<br/>
			
			<form:select path="tipo">
            	<form:options items="${tipos}"/>
        	</form:select>
			<br/>				
			<input type="submit" value="Dar de alta"/>
		
		</form:form>
	</body>
</html>
