# Railway-Backend 🚆

This project is a **Spring Boot-based microservices backend** for an **Online Railway Reservation System**. It is developed as part of an internship project and follows a modular, scalable architecture using microservices principles.

## 🧩 Microservices Included

- **user-service**: Manages user profiles, roles (user/admin), and user-related data.
- **train-service**: Manages train schedules, routes, classes, and availability.
- **reservation-service**: Handles seat reservations, cancellations, and ticket generation.
- **payment-service**: Processes payments (integrated with Stripe or mock methods).
- **api-gateway**: Handles authentication, login, request routing, and security.
- **eureka-server**: Service discovery using Netflix Eureka.
- **config-server**: Centralized configuration for all services.
- **config-repository**: Git-backed repo with configuration properties for each service.

## ⚙️ Technologies Used

- Java 17
- Spring Boot
- Spring Cloud (Eureka, Config, Gateway, OpenFeign)
- Stripe API (or mock payments)
- Maven
- JPA (Hibernate + MySQL)
- Lombok
- Swagger (OpenAPI)
- Postman
- MySQL Workbench
- Intellij Community Edition
- Git & GitHub

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/iakashchoudhary/Railway-Backend.git
   cd Railway-Backend

2. Start Services (Manually)

- Start **config-server**
- Start **eureka-server**
- Start microservices: `user-service`, `train-service`, `reservation-service`, `payment-service`
- Start **api-gateway**

> 💡 All services fetch their configuration from the `config-repository`.

## 🔐 Security

- Passwords are encrypted using **BCrypt**
- **JWT-based authentication**
- **Role-based access** (`admin`, `user`) via `api-gateway`
