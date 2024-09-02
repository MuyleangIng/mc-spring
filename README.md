# Microservices Demo with Config Server and PostgreSQL

This project sets up a microservices infrastructure using Spring Boot, Spring Cloud Config, and PostgreSQL.

## Services

1. Eureka Server (Discovery Service)
2. Config Server (using GitHub)
3. API Gateway
4. User Service (with PostgreSQL)

## Setup

1. Ensure Java 17, Gradle, and PostgreSQL are installed on your system.
2. Create a GitHub repository for your configurations and update the Config Server's application.yml with your repository URL.
3. Create a PostgreSQL database named 'userdb'.
4. Run each service: `./gradlew bootRun`

Start the services in this order:
1. Eureka Server
2. Config Server
3. API Gateway
4. User Service

## Testing

To test the setup:

1. Check Eureka Dashboard: http://localhost:8761
2. Test User Service via API Gateway: 
   - Create user: POST http://localhost:8080/user-service/users
   - Get users: GET http://localhost:8080/user-service/users

