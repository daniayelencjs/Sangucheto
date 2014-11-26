<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<title>Agregar Stock</title>
	</head>
	<body>
		<h1>Agregar stock</h1>
		
		<form action="agregarStock" method="post">
			<div>
				<select name="ingredienteKey">
					<c:forEach var="ingrediente" items="${listaDeIngrediente}">				
						<option value=<c:out value="${ingrediente}" /> > <c:out value="${ingrediente.nombre}" /> </option> 
					</c:forEach>
				</select>
				<label> Cantidad </label>
				<input name="cantidad"/>
			</div>
			<input type="submit" value="Agregar stock" />
		</form>
		
		<%--
		<form:form action="agregarStock" modelAttribute="ingrediente" role="form" method="post">
			<form:select path="listaDeProductos">
				<form:option value="" label="Elegir un Producto">
					<form:options items="${listaDeProductos.key.nombre}"></form:options>
				</form:option>
			</form:select>
			<input type="submit" value="Agregar Stock"/>
		</form:form>
		--%>
	</body>
</html>