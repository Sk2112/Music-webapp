# 🎶 Music Web App

It is a Spring Boot backend application that provides RESTful APIs to perform CRUD operations for managing music data.
This project was developed as part of an assignment for Ektros Private Limited
---
## 🚀 Features

- ✅ CRUD operations (Create, Read, Update, Delete) on music data
- ✅ MySQL database integration for persistence
- ✅ Configurable environment via application.properties
- ✅ Industry-standard backend practices (layered architecture, JPA, Hibernate).
---
## 📌 Tech Stack

- Java 17+
- Spring Boot 3+
- Spring Data JPA + Hibernate
- MySQL Database
- Maven (build tool)

## 📂 Project Structure

 ┣ 📂 src/main/java/com/musify
 ┃ ┣ 📂 controller   # REST Controllers
 ┃ ┣ 📂 service      # Business logic
 ┃ ┣ 📂 repository   # JPA Repositories
 ┃ ┗ 📂 model        # Entity classes
 ┣ 📂 src/main/resources
 ┃ ┣ application.properties
 ┗ pom.xml

⚙️ Configuration – application.properties
 ### To run the project, configure your MySQL database credentials inside src/main/resources/application.properties.
``` bash

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/YourDbName
spring.datasource.username=YOUR_DB_USERNAME
spring.datasource.password=YOUR_DB_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate + JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

 ###  Note :- 
- Replace YOUR_DB_USERNAME and YOUR_DB_PASSWORD with your local MySQL credentials.
- You may also change musifydb to your preferred database name.



## 📦 Running the Application
 1. Clone the repository
``` bash git clone https://github.com/Sk2112/Music-webapp
cd Frontend
cd Backend
```
2.Configure the database in application.properties
3.Run the Spring Boot app

``` bash

mvn spring-boot:run
```
## 📌 Insights & Learnings
- Understood the fundamentals of Spring Boot and REST APIs
- Learned CRUD operations with JPA & MySQL
- Practiced industry-standard project structure
- Gained a basic overview of frontend integration (React)
- Implemented APIs for song details (song name, duration, etc.)
