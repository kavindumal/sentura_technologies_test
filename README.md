# IJSE 2025 Internship Program - R & D Challenge Test

## Overview
This repository contains the solution for the IJSE 2025 Internship Program R & D Challenge Test. The backend is created using Spring Boot and integrates with the Weavy cloud APIs. The solution includes endpoints for user management such as creating, listing, updating, and deleting users.

## Weavy Cloud Integration
Weavy is a cloud service that provides various APIs for user management and other functionalities. For this challenge, we have integrated the following Weavy APIs:
- Create User
- List Users
- Get User Details
- Update User
- Delete User

## Tech Stack
- **Backend**: Spring Boot
- **HTTP Client**: OkHttp
- **Testing**: Postman

## Setup and Installation
1. **Clone the repository**:
    ```sh
    git clone https://github.com/kavindumal/sentura_technologies_test.git
    cd sentura_technologies_test
    ```

2. **Configure Weavy API Credentials**:
    - Sign up at [Weavy](https://www.weavy.com/) and obtain your API credentials.
    - Update the `application.properties` file with your Weavy API credentials:
    ```properties
    weavy.api.url=https://api.weavy.com
    weavy.api.token=YOUR_API_TOKEN
    ```

3. **Build and Run the Application**:
    ```sh
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```

## API Endpoints
The following endpoints are available to interact with the Weavy Cloud:

### Create User
- **Endpoint**: `POST /api/users`
- **Description**: Creates a new user in Weavy.

### List Users
- **Endpoint**: `GET /api/users`
- **Description**: Retrieves a list of all users from Weavy.

### Get User Details
- **Endpoint**: `GET /api/users/{userId}`
- **Description**: Retrieves details of a specific user by ID from Weavy.

### Update User
- **Endpoint**: `PUT /api/users/{userId}`
- **Description**: Updates the details of a specific user by ID in Weavy.

### Delete User
- **Endpoint**: `DELETE /api/users/{userId}`
- **Description**: Deletes a specific user by ID from Weavy.

## Postman Collection
A Postman collection for testing the endpoints is available in the repository. The collection file is named `Weavy-testing.postman_collection.json`. Import this file into Postman to test the API endpoints.

## Contact
- **Name**: Kavindu Malshan
- **Email**: kavindu11250403@gmail.com
- **GitHub**: [kavindumal](https://github.com/kavindumal)

Thank you for reviewing my challenge submission!