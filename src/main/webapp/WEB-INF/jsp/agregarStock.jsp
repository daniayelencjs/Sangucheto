<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<title>Agregar Stock</title>
	</head>
	<body>
		<h1>Agregar stock</h1>
		
		<form:form action="cambiarStock" modelAttribute="cambiarStock" role="form" method="post">
			${ingrediente.nombre}
			<form:input path="nuevoStock"/>			
			<input type="submit" value="Agregar Stock"/>
		</form:form>
	</body>
</html>