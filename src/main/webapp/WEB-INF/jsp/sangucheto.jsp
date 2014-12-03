<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<title>Arma tu sangucheto</title>
	</head>
	<body>
		<h1>Arma tu sangucheto</h1>
		
		<div style="overflow:hidden">
			<div style="float:left">
				<h2>Ingredientes</h2>
				<ul>
					<c:forEach var="ingrediente" items="${ingredientesSangucheto}">				
						<li>${ingrediente.nombre}</li>
					</c:forEach>
				</ul>
			</div>
			
			<div style="float:left">
				<h2>Condimentos</h2>
				<ul>
					<c:forEach var="condimento" items="${condimentosSangucheto}">				
						<li>${condimento.nombre}</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		
		<form:form action="agregarIngredienteASangucheto" modelAttribute="ingredienteAgregar" role="form" method="post">
			<form:select path="nombre">
				<c:forEach var="ingrediente" items="${ingredientesStock}">				
					<form:option value="${ingrediente.nombre}" > ${ingrediente.nombre} </form:option> 
				</c:forEach>
			</form:select>
			<input type="submit" value="Agregar al Sangucheto"/>
		</form:form>
		
		<form:form action="agregarCondimentoASangucheto" modelAttribute="condimentoAgregar" role="form" method="post">
			<form:select path="nombre">
				<c:forEach var="condimento" items="${condimentosStock}">				
					<form:option value="${condimento.nombre}" > ${condimento.nombre} </form:option> 
				</c:forEach>
			</form:select>
			<input type="submit" value="Agregar al Sangucheto"/>
		</form:form>
		
	</body>
</html>