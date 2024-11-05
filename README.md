# UsersCrudAPI
Goal: Implement Restful API using Java Spring FW and apply error handling and HTTP status codes.

### Detailed Steps to develop API in Real World:

<details>
<summary> Step-1 Gather Requirements:  </summary>

* **Clarify Ambiguities:** Have clear understanding of each Requirement. Discuss any edge cases/ambiguities with Stakeholder/Product owners.
* **Define Use Cases:** Break down requirements into specific usecases that describe how different users interact with the API.
* **Prioritize:** Identify the core features that are essential for MVP (Minimum Viable Product) and those that can be deffered for the future.
</details>

<details>
<summary> Step-2 Design Domain Model </summary>

* **Identify Entities and Relationships:** Based on the requirements, identify the core entities (e.g., User, Order, Product) and their relationships (e.g., a User has many Orders).
* **Define Aggregates:** Group related entities into aggregates that will ensure consistency within the domain, following Domain-Driven Design (DDD) principles if appropriate.
* **Model Business Logic:** Define the core business rules and processes that will be encapsulated in the domain model, including any validation rules or calculations.
</details>

<details>
<summary> Step-3 Plan the Data Model and Persistence Layer </summary>

* **Design Database Schema:** Map your domain model to database tables or collections. Design primary keys, foreign keys, indexes, and relationships (one-to-many, many-to-many, etc.).
* **Choose Persistence Technology:** Decide whether you will use a relational database (e.g., PostgreSQL, MySQL) or NoSQL database (e.g., MongoDB) based on the application requirements.
* **Define Repositories:** Create repository interfaces for data access operations. This keeps the data access layer separate from business logic, promoting clean architecture.
</details>

<details>
<summary> Step-4 Define Service Layer and Business Logic </summary>

* **Identify Services:** Create service classes that encapsulate business logic and operations, keeping the controllers thin. For example, a UserService might handle user registration, login, and profile updates.
* **Define Transactions:** Plan which methods need transaction boundaries to ensure data consistency.
* **Implement Validation:** Define input validation rules for the data that will be processed by the services.
</details>

<details>
<summary> Step-5 Design API Endpoints </summary>

* **Identify Resources and Actions:** Define the resources that your API will expose (e.g., /users, /orders) and the actions for each (e.g., POST to create, GET to retrieve, PUT to update).
* **Design RESTful Endpoints:** Ensure that endpoints follow RESTful principles, using appropriate HTTP methods (GET, POST, PUT, DELETE) and naming conventions (e.g., /users/{id}/orders).
* **Define URL Structure:** Create a consistent and intuitive URL structure that aligns with the domain model. Ensure that endpoints are designed to be versioned (e.g., /api/v1/users).
</details>

<details>
<summary> Step-6 Define Data Transfer Objects (DTOs) </summary>

* **Separate Domain and API Models:** Define DTOs for incoming requests and outgoing responses. This keeps the API layer decoupled from the domain model and allows for flexible transformations.
* **Map DTOs to Domain Models:** Plan how DTOs will be converted to domain models and vice versa, often using a tool like MapStruct or ModelMapper.
* **Document Validation Rules:** Define validation rules at the DTO level (e.g., required fields, field lengths, specific formats) using annotations like @NotNull, @Size, or @Email.
</details>

<details>
<summary> Step-7 Set Up Error Handling and Logging </summary>

* **Define Error Responses:** Create a standard structure for error responses (e.g., error code, message, timestamp). Define custom exceptions to handle specific errors like ResourceNotFoundException.
* **Set Up Global Exception Handler:** Implement a global exception handler to catch and format exceptions in a consistent way.
* **Implement Logging:** Plan logging for key actions and errors, using libraries like Logback or SLF4J, to capture debug and error information.
</details>

<details>
<summary> Step-8 Define Authentication and Authorization </summary>

* **Choose an Authentication Strategy:** Decide on authentication mechanisms, such as JWT, OAuth2, or session-based authentication.
* **Set Up Authorization Rules:** Define which roles or permissions are required for each endpoint, and plan how to enforce these rules within the API.
* **Secure Sensitive Endpoints:** Ensure that endpoints handling sensitive operations (e.g., payment processing, account updates) are properly secured.
</details>

<details>
<summary> Step-9 Document the API </summary>

* **Define OpenAPI/Swagger Specification:** Create documentation for your API endpoints, including expected request and response formats, parameters, status codes, and example responses.
* **Write Usage Guidelines:** Document how the API is intended to be used, including best practices and examples for common use cases.
* **Set Up Interactive Documentation:** Use Swagger UI or similar tools to provide interactive API documentation for developers.
</details>

<details>
<summary> Step-10 Write Tests </summary>

* **Unit Tests:** Write unit tests for service layer methods to verify business logic.
* **Integration Tests:** Write integration tests for the API endpoints, testing the full request-response cycle.
* **End-to-End Tests:** For more complex applications, consider end-to-end tests to verify that all layers of the application work together as expected.
</details>

<details>
<summary> Step-11 Implement API Controllers </summary>

* With all other components in place, create the API controllers and implement the endpoints as planned.
* **Inject Services** Use dependency injection to inject the necessary services into the controllers.
* **Handle Requests and Responses** Map incoming requests to DTOs, call the appropriate service methods, and transform results into response DTOs.
* **Return Consistent Responses:** Ensure that each endpoint consistently returns success or error responses based on the response standards defined earlier.
</details>

<details>
<summary> Step-12 Run and Validate the API </summary>

* **Local Testing:** Run the application locally, test the API endpoints using tools like Postman or curl, and ensure that each endpoint behaves as expected.
* **QA Testing:** Deploy the API to a staging environment and have the QA team run tests to validate the implementation against the requirements.
* **Performance Testing:** For larger applications, run load tests to identify potential bottlenecks or scalability issues.
</details>

### Steps followed in UserCrudAPI development:
Since this is a beginner CRUD API, mainly to understand the important steps in API development and not dealing with a complex problem. 
We will skip some of the steps in the real development. Main agenda is to understand practical aspects of implementing REST API using Spring Boot Framework.
1) Requirements Gathering:
* Create Users with Name, Personal Information like Gender, Phone number
* Update User Information
* Delete User
* User should be able to follow other Users

2) Setup the pom.xml and inital project setup for your Spring Boot Microservice using Spring Initialzr (Spring Project Initializer)
    * Spring Web (includes Tomcat (serverlet engine) and Spring MVC)
    * Spring Data JPA
    * Spring Data Rest
    * H2 in-memory Database Driver
    * Lombok
    * Spring Boot Acutator
    * Spring Doc Open AI (not found on Spring Initializr)

3) Add API Controllers to implement Rest API for User Management Service
    * Skipped the Data Persistence Step, as in this project we are not planning to store the data.
    * Skipped the Service layer, as we just have a light weight Rest controller and we dont need service layer in this case.

4) Add Error Handling with Appropriate HTTP Status Codes and Logging 