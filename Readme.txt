Reto Backend: Desafío a resolver de microServicios:

* Microservicio desarrollado en JAVA Spring boot

* API Rest documentada en Swagger

* Deployado en AWS o algún CLOUD + código subido en GITHUB

- Endpoint de Entrada POST /creacliente

		Nombre, Apellido, Edad, Fecha de nacimiento

-Endpoint de salida GET /kpideclientes

		Promedio edad entre todos los clientes

		Desviación estándar entre las edades de todos los clientes

-Endpoint de salida GET /listclientes

	Lista de personas con todos los datos + fecha probable de muerte de cada una

RESOLUCIÓN:

Reposititorio github: https://github.com/vanebelgarro/people

Link de Deploy de API en Google Cloud Platform: https://prueba-321711.rj.r.appspot.com

Endpoints resultantes: 

-https://prueba-321711.rj.r.appspot.com/creacliente 
METODO POST
Ejemplo body:

{"nombre": "vanesa", 
"apellido": "garro", 
"edad": 30, 
"nacimiento": "24/06/1991"}

-https://prueba-321711.rj.r.appspot.com/kpideclientes
-https://prueba-321711.rj.r.appspot.com/listclientes

La API fue creada con el framework Spring Boot, que nos facilitará su configuración (uso de dependencias, conexión con la base de datos, despliegue de servidor, etc), java y Maven. También fue utilizada la herramienta de mapeo hibernate.
Para el almacenamiento de datos se utilizó la base de datos relacional MySQL con el siguiente modelado:

REATE TABLE persona(
id_persona bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
nombre_persona varchar(200),
apellido_persona varchar(200),
edad_persona tinyint UNSIGNED NOT NULL,
nacimiento_persona date NOT NULL,
CONSTRAINT pk_persona PRIMARY KEY (id_persona)
);

Esta tabla se encuentra corrida en un hosting propio, sin embargo puede cambiar la configuración de la base de datos a localhost instalando MySQL, corriendo la tabla de arriba y cambiando las propiedades de conexión del archivo application.properties. En el archivo antes mencionado puede cambiar tambien el puerto.
