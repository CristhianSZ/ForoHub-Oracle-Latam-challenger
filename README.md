<h1 align="center"> ForoHub-Challenger</h1>
<h1 align="center"> Desafio Alura</h1>

<p>Este proyecto consiste en crear una API REST para la gestion de un foro, esta aplicacion web nos permite crear y guardar topicos en una base de datos.
Este es un proyecto propusto por Alura latam, para poner en practica lo aprendido en el transcurso de sus cursos.

Se implementaron las opciones de CRUD para los tópicos del foro:

1. **Registro de tópicos y guardarlos en la base de datos topicos**
2. **Listar los tópicos que están en la base de datos**
3. **Mostrar los datos de un tópico seleccionado**
4. **Modificar el tópico seleccionado**
5. **Eliminar el tópico seleccionado de la base de datos**
   
Y todo esto únicamente con el acceso autorizado usando la forma STATELESS de autenticación con JWT (JSON Web Token)

## Caracteristicas de la aplicación y demostración a través de insomnia:

**POST http://localhost:8080/login (autenticación y autorización con el login y clave previamente incluido en la base de datos en la tabla usuarios). Se debe copiar el JWT que regresa el sistema y pegarlo a todas las otras actividades en la parte Auth/Bearer token.**
![image](https://github.com/CristhianSZ/ForoHub-One-Challenge/blob/main/imagen/imagen1.png)

![image](https://github.com/CristhianSZ/ForoHub-One-Challenge/blob/main/imagen/imagen2.png)

  

**POST http://localhost:8080/topicos (Registro de un tópico)** 

![image](https://github.com/CristhianSZ/ForoHub-One-Challenge/blob/main/imagen/imagen3.png)

  
**GET http://localhost:8080/topicos Listar los tópicos que están en la base de datos.**

![image](https://github.com/CristhianSZ/ForoHub-One-Challenge/blob/main/imagen/imagen4.png)

  

**GET http://localhost:8080/topicos/{id} Mostrar los datos de tópico con "id" (se pone el id que se desea buscar )**

![image](https://github.com/CristhianSZ/ForoHub-One-Challenge/blob/main/imagen/imagen5.png)

  
**PUT http://localhost:8080/topicos/{id} Modificar el tópico con "id" (se pone el id que se desea modificar y el atributo que se desea modificar)**

![image](https://github.com/CristhianSZ/ForoHub-One-Challenge/blob/main/imagen/imagen6.png)


**DEL http://localhost:8080/topicos/2 Eliminar el tópico con "id" de la base de datos, (se pone el id del topico que se desea eliminar)**

![image](https://github.com/CristhianSZ/ForoHub-One-Challenge/blob/main/imagen/imagen7.png)





## Tecnologias Utilizadas Y Dependencias Utilizadas
- **Java 17: Lenguaje de programacion principal**
- **Intellij IDEA: Entorno de desarrollo**
- **Spring Boot**
- **MySQL**
- **Maven**
- **Lombok**
- **Spring Web**
- **Spring Boot DevTools**
- **Spring Data JPA**
- **Flyway Migration**
- **MySQL Driver**
- **Validation**
- **Spring Security**


