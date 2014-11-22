<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<c:forEach var="item" items="${stock}">
				<tr>
					<td>${item.key.nombre}</td>
					<td>${item.value}</td>
				</tr>
			</c:forEach>
		</table>		
	</body>
</html>