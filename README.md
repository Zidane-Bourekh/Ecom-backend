# E-commerce Backend Project

This is a backend project for an e-commerce platform built with **Spring Boot**. The primary objective is to develop a RESTful API to manage the key functionalities of an e-commerce system, such as managing products, users, and orders.

## Table of Contents

- [Project Description](#project-description)
- [Technology Stack](#technology-stack)
- [Setup Instructions](#setup-instructions)


---

## Project Description

This project serves as the backend for an e-commerce application. It provides functionalities such as:
- Managing a product catalog (CRUD operations).
- Handling user authentication and authorization (Spring Security).
- Implementing a shopping cart and order management (future functionality).
- Exposing a RESTful API for potential integration with a front-end application.

---

## Technology Stack

The project is built using the following technologies:

- **Java 17**: Chosen for its modern features and long-term support (LTS).
- **Spring Boot 3.4.1**: For rapid development of robust web applications.
- **Maven**: Used for dependency management and build automation.
- **H2 Database**: An in-memory database for development and testing.
- **Spring Data JPA**: To interact with the database using repositories.
- **Spring Security**: To secure the application with authentication and authorization.
- **Lombok**: To reduce boilerplate code (e.g., getters, setters, constructors).

---

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/YourUsername/ecommerce-backend.git
   cd ecommerce-backend
   ```

2. **Build the project: Make sure you have Maven installed and run**
    ```bash
    mvn clean install
    ```
3. **Run the application: Use the following command**
    ```bash
    mvn spring-boot:run
    ```
    The application will start on http://localhost:8080.

4. **Access the database**
    
    H2 Console: http://localhost:8080/h2-console
    Default JDBC URL: jdbc:h2:mem:testdb


    

