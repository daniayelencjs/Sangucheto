<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
	<head>
	<title></title>
	</head>
	<body>
		<form:form action="darDeAltaIngrediente" method="post" commandName="ingrediente" role="form">
		
			Nombre: <form:input path="nombre"/>
			<br/>
			Precio: <form:input path="precio"/>
			<br/>
			Ingrediente: <form:input path="tipo"/>
			<br/>				
			<input type="submit" value="Dar de alta"/>
		
		</form:form>
	</body>
</html>