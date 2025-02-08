**Lawyer's Ofiice**
An application for managing a lawyer's appointments with his clients , utilizing Spring Boot, Spring Security (JWT), PostgreSQL and more until now without the frontend
**Project Structure**
backend: Contains the Spring Boot application.
**Prerequisites**
Java 21 or higher
**Optional**
Maven
**Setting Up and Running the Application**
1.Setting up the databse
spring.application.name=totallab
server.port=7000


spring.datasource.username=dsuser
spring.datasource.password=uXzyG0hxNNycFNNTfxU3QvlwFGXDFmS8
spring.datasource.url=jdbc:postgresql://dpg-cu05gsjtq21c73amtl2g-a.oregon-postgres.render.com:5432/dsdb_ejlj

2.Start the Spring Boot Application
cd backend
./mvnw spring-boot:run

3.Package the Application
./mvnw package -Dmaven.test.skip

**Running the Full-Stack Application**
1.Start the Backend as described in the Backend section above.

**Links**
JPA EntityManager example in Spring Boot
https://www.bezkoder.com/jpa-entitymanager-spring-boot/
https://www.baeldung.com/jpa-hibernate-persistence-context
https://render.com/
https://start.spring.io/
https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-dependencies
https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-thymeleaf
https://mvnrepository.com/artifact/org.postgresql/postgresql
https://mvnrepository.com/artifact/jakarta.transaction/jakarta.transaction-api
https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-security

**Notice**
For any issues or further details, refer to the individual READMEs in the backend directory
