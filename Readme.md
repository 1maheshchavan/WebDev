# **E-Commerce Backend APIs Project**

## **Project Overview**
This project is a backend API service designed to address a business problem by implementing APIs in Java, using AWS Lambda, Swagger, and DynamoDB. It showcases the ability to design, develop, and deploy APIs following best practices.

---

## **Technologies Used**
- **Programming Language**: Java
- **Frameworks**: AWS Lambda, Swagger
- **Database**: DynamoDB
- **API Documentation Tool**: Swagger (OpenAPI)
- **Testing Tool**: Postman

---

## **Goals and Objectives**
1. Translate an ambiguous business problem into a technical solution.
2. Design and implement RESTful APIs with Swagger documentation.
3. Deploy APIs on AWS Lambda.
4. Ensure adherence to best practices for API design and development.

---

## **API Design**
The APIs are designed to manage core resources and their operations efficiently. Here are the CRUDL operations for each resource:

### **Client Resource**
- **Create Client**: `POST /clients`
- **Get Client Details**: `GET /clients/{clientId}`
- **Update Client Details**: `PUT /clients/{clientId}`
- **Delete Client**: `DELETE /clients/{clientId}`
- **List All Clients**: `GET /clients`

### **Other Resources**
- Similar CRUDL operations are implemented for:
  - Therapist
  - Session
  - Journal
  - Journal Entry

---

## **Repository Details**
- **GitHub Repository**: [https://github.com/1maheshchavan/WebDev/tree/main/src/main/java/com/example/therapyapi]
- **Pull Request**: [https://github.com/cygnius/nick-fury/tree/main/.github]
- **Reviewer Access**: Granted to `founder@cygniusconsulting.com`, `rajmishra@cygniusconsulting.com`, `shubham@cygniusconsulting.com`

---

## **Additional Resources**
- **Swagger Learning Resources**:
  - [CRUD Design YouTube Video 1](https://www.youtube.com/watch?v=lsMQRaeKNDk)
  - [CRUD Design YouTube Video 2](https://www.youtube.com/watch?v=_YlYuNMTCc8)
  - [Swagger YouTube Tutorial](https://www.youtube.com/watch?v=7LQrTQTS_R0)
- **DynamoDB Schema Design**: [Link to schema design]

---

## **Contact for Review**
- Contact Prateek for queries or feedback on API design and database schema.

---

## **Future Enhancements**
1. Add more specialized endpoints for advanced functionality.
2. Implement caching mechanisms for improved performance.
3. Introduce authentication and authorization mechanisms.

---

## **How to Run Locally**
1. Clone the repository.
   ```bash
   git clone [repository link]
   ```
2. Navigate to the project directory.
   ```bash
   cd project-directory
   ```
3. Install dependencies and build the project.
   ```bash
   mvn clean install
   ```   