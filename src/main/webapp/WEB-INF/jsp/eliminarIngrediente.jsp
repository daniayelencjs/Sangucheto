<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<title>Eliminar Ingrediente</title>
	</head>
	<body>
		<h1>Eliminar ingrediente</h1>
		
		<form:form action="eliminarIngrediente" role="form" method="post">
			<form:select path="nombre">
				<c:forEach var="ingrediente" items="${listaDeIngredientes}">				
					<form:option value="${ingrediente.nombre}" > ${ingrediente.nombre} </form:option> 
				</c:forEach>
			</form:select>
			<input type="submit" value="Eliminar"/>
		</form:form>
		
	</body>
</html>