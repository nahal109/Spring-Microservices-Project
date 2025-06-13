# 🚀 Spring Boot Microservices Project

Welcome to my **Microservices with Spring Boot project**. This hands-on project simulates a real-world, scalable microservices architecture using the Spring ecosystem. It covers key enterprise-level practices in designing, developing, deploying, and managing microservices.

---

## 🎯 Project Objective

This project is aimed at:
- Understanding the challenges of monolithic architecture
- Learning and implementing the Microservices Architecture
- Using Spring Boot and Spring Cloud modules to build scalable, resilient, and cloud-ready services
- Applying enterprise-level patterns and tools in a real-world simulation

---

## 🧠 What You'll Learn

| Area | Concepts |
|------|----------|
| 📦 Microservices Fundamentals | Monolith vs Microservices, Benefits, Design Patterns |
| 🔧 Service Development | Spring Boot, REST APIs, Database Integration (MySQL) |
| 🔁 Communication | REST Template, WebClient, OpenFeign |
| 🔍 Service Discovery | Eureka Server, Eureka Clients |
| 🎛 API Gateway | Routing, Filtering, Centralized Access Control |
| 🔐 Config Management | Spring Cloud Config Server + Git |
| 🔁 Config Refresh | Spring Cloud Bus with RabbitMQ |
| 🕵️ Distributed Tracing | Sleuth and Zipkin | 
| 💥 Fault Tolerance | Circuit Breakers, Retries (Resilience4j) |
| 🐳 Containerization | Docker |


---

## 📚 Project Chapters

### ✅ Chapter 1: Building Microservices
- DepartmentService:
  - MySQL Config
  - REST API Implementation
- EmployeeService:
  - MySQL Config
  - REST API Implementation

### ✅ Chapter 2: Microservice Communication
- Overview of Inter-service Communication
- RestTemplate Communication
- WebClient Communication
- OpenFeign Client Communication

### ✅ Chapter 3: Service Discovery - Eureka
- Create Eureka Server
- Register DepartmentService & EmployeeService as Eureka Clients
- Run Multiple Instances for Load Testing
- Load Balancing with Eureka and Spring Cloud LoadBalancer

### ✅ Chapter 4: API Gateway - Spring Cloud Gateway
- Create API Gateway Microservice
- Register API Gateway as Eureka Client
- Configure Routes and Test via Postman
- Enable Auto Route Mapping

### ✅ Chapter 5: Centralized Configuration - Config Server
- Create Spring Cloud Config Server
- Connect to Git-based Config Repo
- Register Config Server to Eureka
- Refactor Services to Use Config Server
- Enable Runtime Refresh

### ✅ Chapter 6: Auto Config Refresh - Spring Cloud Bus + RabbitMQ
- Problem: Manual Restart after Config Changes
- Solution: Spring Cloud Bus
- Set Up Auto Refresh with RabbitMQ using Docker
- Test Config Change Refresh Without Restart

### ✅ Chapter 7: Distributed Tracing - Sleuth & Zipkin
- Spring Cloud Sleuth Integration
- Zipkin Setup and Visualization
- Analyze Service-to-Service Calls with Trace IDs

### ✅ Chapter 8: Circuit Breaker - Resilience4j
- Problem: Service Failures and Latency
- Circuit Breaker Pattern Overview
- Implement Circuit Breaker with Resilience4j
- Retry Pattern Implementation

### ✅ Chapter 9: Adding New Microservice
- How to Add a New Microservice to Existing Setup
- Apply Config, Eureka, Feign, Gateway, Tracing, etc.

---

## 🔧 Tech Stack

- Java 17
- Spring Boot 
- Spring Cloud
- Spring Web, WebFlux
- Eureka Server & Clients
- OpenFeign, WebClient, RestTemplate
- Spring Cloud Gateway
- Spring Cloud Config Server
- RabbitMQ
- Spring Cloud Bus
- Spring Cloud Sleuth & Zipkin
- Resilience4j
- MySQL
- Docker

---

## 🗂 Project Structure

spring-microservices-project/<br>
├── api-gateway/<br>
├── config-server/<br>
├── department-service/<br>
├── employee-service/<br>
├── organization-service/<br>
├── service-registry/<br>
└── README.md


---

## 🚀 How to Run

### Prerequisites:
- Java 17+
- MySQL
- Docker (for RabbitMQ & Zipkin)
- Postman

### Run Order:
1. `config-server`
2. `servise-registry`
3. `api-gateway`
4. `department-service`
5. `employee-service`
6. `organization-service`
7. Docker Zipkin: `docker run -d -p 9411:9411 openzipkin/zipkin`
8. Docker RabbitMQ: `docker run -d -p 5672:5672 -p 15672:15672 rabbitmq:3-management`

Test APIs via:
- API Gateway
- Postman
- Trace with Zipkin: http://localhost:9411
- RabbitMQ UI: http://localhost:15672

---

## 📌 Key Topics Demonstrated

- ✅ RESTful Services with Spring Boot
- ✅ Service Discovery using Eureka
- ✅ API Gateway Routing
- ✅ Centralized Configuration with Spring Cloud Config
- ✅ Messaging and Auto Refresh with RabbitMQ
- ✅ Circuit Breaking and Retry with Resilience4j
- ✅ Distributed Tracing with Sleuth and Zipkin
- ✅ Docker-based Local Microservice Infrastructure

---

## 📬 Contact

**Developer:** *[peshan eranga]*  
**Email:** peshan.nahal@gmail.com  





