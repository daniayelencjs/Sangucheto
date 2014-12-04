<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Inicio</title>
			<%@include file="/recursos/includes/recursos.html" %>
	</head>
	<body>
		
    <%@include file="/recursos/includes/navbar.html" %>

    <div class="container">

      <div class="starter-template">
        <h1>Bienvenido a Sangucheto!</h1>
        <p class="lead">Arm&aacute; tu sangucheto a tu gusto. Agregale tus condimentos e ingredientes favoritos! :D</p>
      </div>

    </div><!-- /.container -->

    <script type="text/javascript">
      $(document).ready(function() {
        $("#navbar ul li:contains(Inicio)").addClass("active");
      });
    </script>

	</body>
</html>