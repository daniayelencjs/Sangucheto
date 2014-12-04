<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<title>Eliminar Ingrediente</title>
			<%@include file="/recursos/includes/recursos.html" %>
	</head>
	<body>

		<%@include file="/recursos/includes/navbar.html" %>

		<h1>Eliminar ingrediente</h1>
		
		<form:form action="eliminarIngrediente" role="form" method="post">
			<form:select path="nombre">
				<c:forEach var="ingrediente" items="${listaDeIngredientes}">				
					<form:option value="${ingrediente.nombre}" > ${ingrediente.nombre} </form:option> 
				</c:forEach>
			</form:select>
			<input type="submit" value="Eliminar"/>
		</form:form>

		<script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Eliminar Ingrediente)").addClass("active");
      });
    </script>
		
	</body>
</html>