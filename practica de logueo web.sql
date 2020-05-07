create database logueopractica;

use logueopractica;

CREATE TABLE tb_usuariosp(
IdUsuarios int primary key,
Nombre_usuario varchar(50),
Apellido_usuario varchar(50),
Usuario varchar(50),
Contrasena varchar(50)
);

CREATE TABLE tb_historial(
IdHistorial int primary key,
IdUsuario int,
fecha date,
foreign key (IdUsuario) references tb_usuariosp(IdUsuarios)
);

insert into tb_usuariosp(IdUsuarios, Nombre_usuario, Apellido_usuario, Usuario, Contrasena) value(1, "Pedro", "Albarado", "pa", "123");
insert into tb_usuariosp(IdUsuarios, Nombre_usuario, Apellido_usuario, Usuario, Contrasena) value(2, "Juan", "Albarado", "ja", "321");
