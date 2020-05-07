<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
HttpSession seccion = (HttpSession) request.getSession();
String Usuariovariable = (String)seccion.getAttribute("user");

if(Usuariovariable==null){
	response.sendRedirect("index.jsp");
}
%>
<meta charset="ISO-8859-1">
<title>historial</title>
</head>
<body>
<h1 align="center">Bienvenido</h1>
<form action="ServeletUser" method="post">
<input type="submit" value="Cerrar" name="btncerrar">
</form>

</body>
</html>