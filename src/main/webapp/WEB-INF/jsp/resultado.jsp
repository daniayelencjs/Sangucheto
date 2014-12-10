<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Resultado</title>
		<%@include file="/recursos/includes/recursos.html" %>
	</head>
	
	<body>
		<%@include file="/recursos/includes/navbar.html" %>
		<div id="wrap">
			<div class="container">

				<div class="starter-template">
	        		<h1>Resultado</h1>
	        		<p class="lead">${mensaje}</p>
	      		</div>
	    	</div><!-- /.container -->
			<div id="push"></div>
		</div><!-- /#wrap -->

		<%@include file="/recursos/includes/footer.html" %>

	</body>
</html>