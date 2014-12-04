<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Stock</title>
			<link href='<c:url value="/recursos/css/bootstrap.min.css" />' rel="stylesheet" type="text/css" />
    	<link href='<c:url value="/recursos/css/starter-template.css" />' rel="stylesheet" type="text/css" />
	</head>
	<body>
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <a class="navbar-brand" href="../sangucheto">Sangucheto</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="../sangucheto">Inicio</a></li>
            <li><a href="sangucheto">Sangucheto</a></li>
            <li><a href="formDarDeAltaIngrediente">Nuevo ingrediente</a></li>
            <li class="active"><a href="stock">Ver Stock</a></li>
            <li><a href="irAAgregarStock">Agregar Stock</a></li>
            <li><a href="irAEliminarIngrediente">Eliminar Ingrediente</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">

      <div class="starter-template">
        <h1>Stock de todos los ingredientes</h1>

        <div class="table-responsive">
            <table class="table table-striped">
							<thead>
                <tr>
                  <th>Ingrediente</th>
                  <th>Cantidad</th>
                </tr>
              </thead>
              <tbody>
              	<c:forEach var="ingrediente" items="${stock}">
									<tr>
										<td>${ingrediente.key.nombre}</td>
										<td>${ingrediente.value}</td>
									</tr>
								</c:forEach>
              </tbody>
						</table>
          </div>
      </div>
    </div><!-- /.container -->

	</body>
</html>