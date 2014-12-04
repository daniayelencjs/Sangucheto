<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Arma tu sangucheto</title>
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
            <li class="active"><a href="sangucheto">Sangucheto</a></li>
            <li><a href="formDarDeAltaIngrediente">Nuevo ingrediente</a></li>
            <li><a href="stock">Ver Stock</a></li>
            <li><a href="irAAgregarStock">Agregar Stock</a></li>
            <li><a href="irAEliminarIngrediente">Eliminar Ingrediente</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">
      <div class="starter-template">
        
        <h1>Arma tu sangucheto</h1>
        
        <div class="row">
          <div class="col-md-4">
            <table class="table table-striped">
                <thead>
                  <tr>
                    <th>Ingredientes</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach var="ingrediente" items="${ingredientesSangucheto}">				
										<tr><td>${ingrediente.nombre}</td></tr>
									</c:forEach>
                </tbody>
              </table>
          </div>

          <div class="col-md-4">
            <table class="table table-striped">
                <thead>
                  <tr>
                    <th>Condimentos</th>
                  </tr>
                </thead>
                <tbody>
                  <c:forEach var="condimento" items="${condimentosSangucheto}">				
										<tr><td>${condimento.nombre}</td></tr>
									</c:forEach>
                </tbody>
              </table>
          </div>

          <div class="col-md-4">
            <div class="jumbotron">
              <div class="container">
                <h3>Precio</h3>
                <p>$${precio}</p>
                <p><a class="btn btn-primary" href="#" role="button">Listo! &raquo;</a></p>
              </div>
            </div>
          </div>
        </div>




        <div class="row">
          <div class="col-md-4">
            <ul class="list-group">
              <li class="list-group-item active">Ingredientes</li>
            	<c:forEach var="ingrediente" items="${ingredientesSangucheto}">				
								<li class="list-group-item">${ingrediente.nombre}</li>
							</c:forEach>
            </ul>
          </div>

          <div class="col-md-4">
            <ul class="list-group">
              <li class="list-group-item active">Condimentos</li>
            	<c:forEach var="condimento" items="${condimentosSangucheto}">				
								<li class="list-group-item">${condimento.nombre}</li>
							</c:forEach>
            </ul>
          </div>

          <div class="col-md-4">
            <div class="jumbotron">
              <div class="container">
                <h3>Precio</h3>
                <p>$${precio}</p>
                <p><a class="btn btn-primary" href="#" role="button">Listo! &raquo;</a></p>
              </div>
            </div>
          </div>
        </div>

        <hr>

        <div class="row">
          <div class="col-md-8">
          	<form:form class="form-horizontal" action="agregarIngredienteASangucheto" commandName="ingredienteAgregar" role="form" method="post">
          		<div class="form-group">
          			<label for="ingrediente" class="control-label col-md-3">Agregar ingrediente</label>
                <div class="col-md-6">
									<form:select class="form-control" id="ingrediente" path="nombre">
										<c:forEach var="ingrediente" items="${ingredientesStock}">
											<form:option value="${ingrediente.nombre}" > ${ingrediente.nombre} </form:option> 
										</c:forEach>
									</form:select>
								</div>
								<div class="col-md-2">
									<input type="submit" class="btn btn-primary" value="Agregar al Sangucheto"/>
								</div>
							</div>
						</form:form>
						
						<form:form class="form-horizontal" action="agregarCondimentoASangucheto" commandName="condimentoAgregar" role="form" method="post">
							<div class="form-group">
          			<label for="condimento" class="control-label col-md-3">Agregar condimento</label>
                <div class="col-md-6">
									<form:select class="form-control" id="condimento" path="nombre">
										<c:forEach var="condimento" items="${condimentosStock}">				
											<form:option value="${condimento.nombre}" > ${condimento.nombre} </form:option> 
										</c:forEach>
									</form:select>
								</div>
								<div class="col-md-2">
									<input type="submit" class="btn btn-primary" value="Agregar al Sangucheto"/>
								</div>
              </div>
						</form:form>
          </div> 
        </div>

      </div>
    </div><!-- /.container -->		
	</body>
</html>