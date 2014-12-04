<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Tu sangucheto</title>
			<%@include file="/recursos/includes/recursos.html" %>
	</head>
	<body>

		<%@include file="/recursos/includes/navbar.html" %>

    <div class="container">
      <div class="starter-template">
        
        <h1>Tu sangucheto</h1>
        
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
                <p>
                  <a class="btn btn-primary" href="#" role="button">Listo! &raquo;</a>
                </p>
              </div>
            </div>
          </div>
        </div>



<%--
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
--%>
      </div>
    </div><!-- /.container -->

    <script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Sangucheto)").addClass("active");
      });
    </script>

	</body>
</html>