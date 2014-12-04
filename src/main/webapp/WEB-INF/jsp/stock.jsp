<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
	<head>
	<title>Stock</title>
			<%@include file="/recursos/includes/recursos.html" %>
	</head>
	<body>
		
    <%@include file="/recursos/includes/navbar.html" %>

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

    <script type="text/javascript">
      $(function() {
        $("#navbar ul li:contains(Ver stock)").addClass("active");
      });
    </script>

	</body>
</html>