<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio Sesion</title>
</head>
<body>

	<form action="InicioSesionServlet" method="post">
        nombreUsuario: <input type="text" name="nombreUsuarioo"><br>
        Contraseña: <input type="password" name="password"><br>
        <input type="submit" value="Iniciar Sesión">
    </form>

</body>
</html>