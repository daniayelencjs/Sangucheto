<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
	<title>Eliminar Ingrediente</title>
			<%@include file="/recursos/includes/recursos.html" %>
	</head>
	<body>

		<%@include file="/recursos/includes/navbar.html" %>

		<div class="container">
      <div class="starter-template">
      	<h1>Eliminar ingrediente</h1>
      	<div class="row">
          <div class="col-md-12">
          	<form:form class="form-horizontal" action="eliminarIngrediente" role="form" method="post">
          		<div class="form-group">
          			<label for="nombre" class="control-label col-md-4">Elegir</label>
                <div class="col-md-4">
									<form:select class="form-control" id="nombre" path="nombre">
										<c:forEach var="ingrediente" items="${listaDeIngredientes}">				
											<form:option value="${ingrediente.nombre}" > ${ingrediente.nombre} </form:option> 
										</c:forEach>
									</form:select>
								</div>
							</div>
							<div class="form-group">
								<input type="submit" class="btn btn-primary" value="Eliminar"/>
							</div>
						</form:form>
					</div>
				</div>
      </div>
    </div>

		<script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Eliminar Ingrediente)").addClass("active");
      });
    </script>
		
	</body>
</html>