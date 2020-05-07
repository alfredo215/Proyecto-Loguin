<html>
<head>
	<%@page contentType="text/html"%>
	<%@page pageEncoding="UTF-8"%>
	<meta charset="utf-8">
	<title>Login</title>
	<link rel="stylesheet" href="css/Disenio.css">
</head>

<body>

<div class="login-box">
	<img class="avatar" src="img/logo.jpg" alt="Logo persona">
	<h1>Login</h1>
	<form action="ServeletUser" method="post">
		<!-- Usuario-->
		<label for="username">Usuario</label>
		<input type="text" placeholder="Introdusca usuario" name="user">
		<!-- Usuario-->
		<label for="password">Contraseña</label>
		<input type="password" placeholder="Introdusca contraseña"  name="pass">

		<input type="submit" value="Entrar">

		<a href="">¿Has olvidado tu contraseña?</a>
		<br>
		<a href="">No tienes una cuenta</a>

	</form>

</div>

</body>
</html>
