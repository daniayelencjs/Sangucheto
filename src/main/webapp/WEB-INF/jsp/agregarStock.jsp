<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Agregar Stock</title>
			<%@include file="/recursos/includes/recursos.html" %>
	</head>
	<body>

		<%@include file="/recursos/includes/navbar.html" %>

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
		
		<script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Agregar Stock)").addClass("active");
      });
    </script>

	</body>
</html>