<#macro page> <!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>${title}</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">E-Invoicer</a>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="#">Clienti</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Facturi</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Comentzi</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li class="nav-item">${user}</li>
				<li class="nav-item"><a href="/logout"
					class="btn btn-default navbar-btn">LogOut</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<#nested>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
</body>
</html>
</#macro>