# E-Commerce Application

## Overview

This project is an **e-commerce application** backend developed using **Spring Boot**, **PostgreSQL**, and **Swagger**. It supports key functionalities such as product management, order processing, cart management, and seller registration. This project is designed to demonstrate the use of modern software development practices and frameworks.

## Features

- **Product Management:** Create, update, and delete products.
- **Cart Management:** Add, update, and view products in the cart.
- **Order Processing:** Place and manage orders.
- **Seller Management:** Register and manage sellers.
- **API Documentation:** Auto-generated API documentation with Swagger.

## Technologies Used

- **Spring Boot:** A Java-based framework used to build scalable and maintainable backend applications. Key Spring Boot features used include:
  - **Dependency Injection**: Simplifies dependencies management across the application.
  - **Annotations**: Such as `@RestController`, `@Service`, `@Repository`, `@Autowired`, etc., to simplify configuration and development.
  - **Bean Scopes and Lifecycle Management**: Managing the lifecycle and scope of beans within the Spring context.
- **PostgreSQL:** A powerful, open-source object-relational database system used to manage application data.
- **Swagger:** Used for API documentation and testing, allowing developers to easily visualize and interact with the API.

## Project Structure

- **src/main/java:** Contains the source code of the application.
- **controllers/:** REST controllers for handling HTTP requests.
- **services/:** Service layer for business logic.
- **repositories/:** Repositories for database interactions.
- **models/:** Entity classes representing database tables.
- **src/main/resources:** Contains configuration files.
- **application.properties:** Configuration file for the application.

## Setup with Docker

This project uses Docker Compose to run both PostgreSQL and the Spring Boot application in separate containers.

### 1. Environment Variables

Sensitive data like database passwords are stored in a `.env` file. A sample file `.env.example` is provided.

#### Steps:

1. Copy `.env.example` to create your own `.env`:

```bash
cp .env.example .env

2. Open .env and update the values if needed:

POSTGRES_USER=your_postgres_user
POSTGRES_PASSWORD=your_postgres_password
POSTGRES_DB=your_database_name
SPRING_DATASOURCE_URL=jdbc:postgresql://postgres:5432/your_database_name
SPRING_DATASOURCE_USERNAME=your_postgres_user
SPRING_DATASOURCE_PASSWORD=your_postgres_password

3. Start the containers using Docker Compose:

docker-compose up -d --build 

4. Accessing the Application

http://localhost:8080/swagger-ui/index.html



