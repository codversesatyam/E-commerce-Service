# E-commerce Service

Backend service for an AI-powered e-commerce platform built using Spring Boot.

## Features
- Product catalog management
- Order placement
- Event publishing using Kafka
- Clean layered architecture
- Designed with microservice principles

## Architecture
- Authentication handled by a separate Auth Service
- This service focuses on business logic
- Kafka used for asynchronous communication

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- Apache Kafka
- H2 / MySQL

## Notes
- Kafka producer is implemented
- Consumers and AI recommendation service are planned for future phases
