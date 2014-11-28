<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<title>Agregar Stock</title>
	</head>
	<body>
		<h1>Agregar stock</h1>
		
		<form:form action="agregarStock" role="form" method="post">
			<form:select path="nombreIngrediente">
				<c:forEach var="ingrediente" items="${listaDeIngredientes}">				
					<form:option value="${ingrediente.nombre}" > ${ingrediente.nombre} </form:option> 
				</c:forEach>
			</form:select>
			<form:input path="cantidad"/>
			<input type="submit" value="Agregar Stock"/>
		</form:form>
		
	</body>
</html>