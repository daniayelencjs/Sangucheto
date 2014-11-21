<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
	<title>Stock</title>
	</head>
	<body>
		<a href="irACrearPersona">Crear persona</a>
		<table>
			<tr>
				<td>Ingrediente</td>
				<td>Cantidad</td>
			</tr>
			<c:forEach var="item" items="${stock}">
				<tr>
					<td>${item.Ingrediente.nombre}</td>
					<td>${item.Integer}</td>
				</tr>
			</c:forEach>
		</table>		
	</body>
</html>