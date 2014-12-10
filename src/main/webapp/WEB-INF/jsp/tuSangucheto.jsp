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
    <div id="wrap">
      <div class="container">
        <div class="starter-template">
          
          <h1>As&iacute; qued&oacute; tu sangucheto</h1>
          
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
                </div>
              </div>
            </div>
          </div>

          <h3>Gracias por tu compra!</h3>

        </div>
      </div><!-- /.container -->
      <div id="pust"></div>
    </div><!-- /#wrap -->
   
    <%@include file="/recursos/includes/footer.html" %>

    <script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Sangucheto)").addClass("active");
      });
    </script>

	</body>
</html>