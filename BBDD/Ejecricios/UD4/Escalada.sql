create table asociacion(
codigo int,
nombre varchar(15) not null,
ubicacion varchar(30), 
constraint asociacion_pk primary key (codigo),
constraint codigo_chk check (codigo>0));

create table alpinistas (
nif varchar(9),
nombre varchar(15) not null,
fecha_nacimiento date,
codigo int,
fecha_ingreso date not null,
constraint alpinistas_pk primary key (nif),
constraint alpinistas_fk foreign key (codigo) references asociacion(codigo));

create table telefonos(
nif varchar(9),
telefono varchar(9),
constraint telefonos_pk primary key (nif, telefono),
constraint telefonos_fk foreign key (nif) references alpinistas(nif));

create table picos(
nombre varchar(30),
altura int,
coordenadas float,
pain varchar(15),
constraint picos_pk primary key (nombre));

create table escala (
nif varchar(9),
nombre varchar(25),
fecha_inicio date,
tiempo int,
oxigeno int,
cara enum("norte","sur","este","oeste"),
constraint escala_pk primary key (nif, nombre),
constraint escala_fk1 foreign key (nif) references alpinistas(nif));