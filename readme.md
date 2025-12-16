# Etapa 2 Backend con Spring Boot

# Descripcion del Proyecto

Este proyecto corresponde a la segunda etapadentro de un plan de formacion profesional orientado al desarrollo backend.
En esta fase se configuro la base de una API REST, con estructura limpia, junto a la conexion a base de datos relacional, ademas de cubrir los valores de autenticacion con variables locales todo esto con el fin de sentar las bases para una arquitectura escalable y segura.

# Objetivo Principal

El objetivo Principal de esta etapa es:

-Validar el entorno de desarrollo de nuestro proyecto,
-Configurar de manera correcta Spring Boot y saber desplegarlo en cualquier sistema.
-Establecer una conexion con el sistema de base de datos que deseemos.
-Aplicar control de Versiones desde el Inicio (Gracias a la primera Etapa de esta formacion profesional)

# Tecnologias utilizadas 

-Java 25
-Spring Boot 4
-Spring Data JPA
-Hibernate
-SQL Server
-Maven
-Git
-GitHub

# Configuracion del entorno

## Requisitos Previos 
-Java JDK 17+
-SQL Server en ejecucion.
-Git Instalado
-IDE VSCODE

## Creacion de la base de datos

CREATE DATABASE BD_SPRINGBOOT;

Las tablas se generan automaticamente gracias a JPA e Hibernate

## Configuracion de la aplicacion

Se aplicaron buenas practicas como el manejo de las credenciales de inicio de sesion con variables de entorno ademas de la configuracion general de la aplicacion en aplication.properties.

## Verificacion de funcionamiento

La aplicacion se conecta de manera exitosa a la base de datos ademas de inicializar sus servicios sin problema alguno.

# Arquitectura base

El proyecto usa una arquitectura en capas para evitar acomplamiento y facilitar la escalabilidad del sistema

Cliente --> Controller --> Service --> Repository --> Service --> Controller --> Cliente

# Control de Versiones

Implementado desde la configuracion incial para:

-Registrar los avances en cada parte del proyecto
-Evidenciar Mejora Continua
-Mantener un historial limpio y ordenado

# Estado del Proyecto 

-Proyecto configurado
-Conexion a base de datos funcional
-Arquitectura definida