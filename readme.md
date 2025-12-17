# Etapa 2 Backend con Spring Boot

# Descripcion del Proyecto

Este proyecto corresponde a la segunda etapa dentro de un plan de formacion profesional orientado al desarrollo backend.
En esta fase se configuro la base de una API REST, con estructura limpia, junto a la conexion a base de datos relacional, ademas de buenas practicas de configuracion con el fin de sentar las bases para una aplicacion escalable,mantenible y segura.

# Objetivo Principal

El objetivo Principal de esta etapa es:

-Validar el entorno de desarrollo de nuestro proyecto,
-Configurar de manera correcta Spring Boot
-Comprender el proceso de Despliegue de la aplicacion
-Establecer una conexion con el sistema de base de datos relacional
-Aplicar control de Versiones desde el Inicio del Desarrollo de la Aplicacion.
-Implementar una arquitectura backend profesional

# Tecnologias utilizadas 

-Java 25
-Spring Boot 4
-Spring Data JPA
-Hibernate
-SQL Server
-Maven
-Git
-GitHub
-PostMan

# Configuracion del entorno

## Requisitos Previos 
-Java JDK 17+
-SQL Server en ejecucion.
-Git Instalado
-IDE Visual Studio Code

## Creacion de la base de datos

CREATE DATABASE BD_SPRINGBOOT;

Las tablas se generan automaticamente gracias a JPA e Hibernate

## Configuracion de la aplicacion

-Configuracion general en application.properties
-uso de variables de entorno para manejar credenciales de base de datos
-Separacion clara de responsabilidades por capas

## Verificacion de funcionamiento

-La aplicacion se inicializa de manera exitosa
-Hay conexion con la base de datos
-Servicios y controladores cargados sin problemas
-Endpoint testeados a travez de PostMan

# Arquitectura base

El proyecto usa una arquitectura en capas para evitar acomplamiento y facilitar la escalabilidad del sistema

Cliente --> Controller --> Service --> Repository --> Base de Datos

# Funcionalidades Implementadas

## Entidades 

-Producto
-Categoria
-Relacion ManyToOne entre Producto y Categoria

# Endpoint REST

Se implemento un CRUD completo para ambas entidades

-GET (listar y obtener por ID)
-POST (crear)
-PUT (actualizar)
-DELETE(eliminar)

Todos estos metodos fueron probados de manera exitosa en la plataforma PostMan

# Validaciones

Las Validaciones de campo se realizaron con Jakarta Validation corroborando que arroje los errores HTTP Esperados

# Control de Versiones

Implementado desde la configuracion incial para:

-Registrar los avances en cada parte del proyecto
-Evidenciar Mejora Continua
-Mantener un historial limpio y ordenado
-Facilitar el seguimiento del Proyecto

# Estado del Proyecto 

-Proyecto configurado correctamente
-Conexion a base de datos funcional
-Arquitectura definida
-Capas controller,service, repository y models implementadas
-CRUD completo para las 2 entidades
-Relacion entre entidades testeada
-Validaciones implementadas
-Realizacion de Pruebas con PostMan
-API REST Completamente Funcional