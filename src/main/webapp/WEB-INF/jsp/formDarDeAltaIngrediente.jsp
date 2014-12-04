<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title></title>
			<%@include file="/recursos/includes/recursos.html" %>
	</head>
	<body>

		<%@include file="/recursos/includes/navbar.html" %>

		<div class="container">
      <div class="starter-template">
      	<div class="row">
          <div class="col-md-12">
          	<form:form class="form-horizontal" action="darDeAltaIngrediente" commandName="ingrediente" role="form" method="post">
          		<div class="form-group">
          			<label for="nombre" class="control-label col-md-4">Nombre</label>
                <div class="col-md-4">
									<form:input class="form-control" id="nombre" path="nombre"/>
								</div>
							</div>
							<div class="form-group">
								<label for="precio" class="control-label col-md-4">Precio</label>
                <div class="col-md-4">
									<form:input class="form-control" id="precio" path="precio"/>
								</div>
							</div>
							<div class="form-group">
								<label for="tipo" class="control-label col-md-4">Tipo</label>
                <div class="col-md-4">
									<form:select class="form-control" id="precio" path="tipo">
				            <form:options items="${tipos}"/>
				        	</form:select>
								</div>
							</div>
							<div class="form-group">
								<input type="submit" class="btn btn-primary" value="Dar de alta"/>
							</div>
						</form:form>
      </div>
    </div>

		<script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Nuevo Ingrediente)").addClass("active");
      });
    </script>

	</body>
</html>
