# ElePath 

This repository contains the backend for the ElePath application, which is used to track and manage elephant locations. The backend is built using Spring Boot and provides RESTful APIs for the frontend application.

---

## **Table of Contents**

1. [Technologies Used](#technologies-used)
2. [Getting Started](#getting-started)
3. [Configuration](#configuration)


---

## **Technologies Used**

- **Spring Boot** (3.x.x) - Backend framework
- **MySQL** - Database management
- **Spring Data JPA** - ORM and database interaction
- **Spring Web** - Building RESTful APIs
- **Lombok** (optional) - To reduce boilerplate code

---

## **Getting Started**

### Prerequisites

- Java 17 or higher
- Maven 3.8+
- MySQL 8.0+

### Project Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/username/elepath-backend.git
   cd elepath-backend
   ```
2. Open the project in your IDE (IntelliJ IDEA, Eclipse, etc.).
3. Ensure that Maven dependencies are installed:
   ```bash
   mvn clean install
   ```

---

## **Configuration**

### MySQL Database Configuration

1. Create a database named `elepath` in MySQL:
   ```sql
   CREATE DATABASE elepath_db;
   ```
2. Update the `src/main/resources/application.properties` file with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/elepath
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```
3. Ensure the MySQL server is running.

---

## **Contributing**

1. Fork the repository.
2. Create a new branch for your feature/bug fix.
3. Commit your changes and submit a pull request.

---

## **License**

This project is licensed under the MIT License. See the LICENSE file for details.

---
