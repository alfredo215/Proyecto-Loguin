<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Historial</title>
</head>
<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="http://code.jquery.com/jquery-latest.js">
</script>



<script type="text/javascript">
	$(document).ready(function(){
		
			$.post('ServeleteHistorialUsuario',{

			},function(respose){

			let datos = JSON.parse(respose)
			console.log(datos);
			var tabladatos = document.getElementById('tablaDatos')
			for (let item of datos) {

				tabladatos.innerHTML +=`
		
					<tr>
					<td>${item.idHistorial}</td>
					<td>${item.IdUsuario}</td>
					<td>${item.nombre_usuario}</td>
					<td>${item.apellido_usuario}</td>
					<td>${item.fecha}</td>
				
					</tr>
					
				`

			}

			});
		});
		
</script>
<body>

				<table class="table table-dark" id="tablaDatos">
					<thead>
						<th>Id</th>
						<th>IdUsuario</th>
						<th>Nombre</th>
						<th>Apellido</th>
						<th>Fecha</th>

					</thead>
					<tbody>
						

					</tbody>
					
				</table>


</body>
</html>