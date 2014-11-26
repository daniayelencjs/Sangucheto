<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<title>Stock</title>
	</head>
	<body>
		<h1>Stock de todos los ingredientes</h1>
			
		<table>
			<tr>
				<td>Ingrediente</td>
				<td>Cantidad</td>
			</tr>
			<c:forEach var="ingrediente" items="${stock}">
				<tr>
					<td>${ingrediente.key.nombre}</td>
					<td>${ingrediente.value}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>