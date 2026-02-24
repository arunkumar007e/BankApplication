# Bank Application

A simple Spring Boot based banking application that provides REST APIs for managing bank accounts. The application allows users to create accounts, check balance, deposit money, and withdraw money.

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Maven
- H2 / MySQL (Update based on your database)

---

## Features

- Create a new bank account
- View account details
- Deposit money into an account
- Withdraw money from an account
- RESTful API design

---

## Project Structure

- Controller Layer – Handles API requests
- Service Layer – Contains business logic
- Repository Layer – Handles database operations
- Model Layer – Defines entity classes

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | /accounts | Create a new account |
| GET    | /accounts/{id} | Get account details by ID |
| PUT    | /accounts/deposit | Deposit money |
| PUT    | /accounts/withdraw | Withdraw money |

---

## How to Run the Project
1. Clone the repository
   git clone https://github.com/arunkumar007e/BankApplication.git

2. Navigate into the project folder
   cd BankApplication

3. Run the application
   mvn spring-boot:run

4. Access APIs using Postman or any REST client.
