Creating a new project from scratch using Spring Initializr in Intellij

📦 Product Management API (Spring Boot)
This project was developed as part of the Java and Spring Framework course at Vistula University. 
The primary goal is to build a professional REST API architecture that interacts with a database and includes a robust error-handling mechanism.

🚀 Features & Technologies:
* Spring Boot 3.x & Java 17
* Spring Data JPA & H2 Database (In-memory database)
* Lombok (Code simplification)
* MapStruct (Entity-DTO mapping)
* Swagger UI (API Documentation and Testing)
* Global Exception Handling (Custom error responses)

  🛠️ API Usage & Testing:
1. Once the application is running, all tests can be performed via Swagger UI:

   🔗 URL: http://localhost:8081/swagger-ui/index.html

<img width="1900" height="1021" alt="Screenshot 2026-04-25 110958" src="https://github.com/user-attachments/assets/f03cf82b-1103-4973-b5d1-5a921255363d" />
That is what you will see after running.

2. Create Product (POST):
 <img width="1864" height="966" alt="Screenshot 2026-04-25 113409" src="https://github.com/user-attachments/assets/aa13c28f-c7a6-4ea0-8d09-e35546873c38" />
Creating a new product named "macbook air".

3. Read Product (GET):
<img width="1869" height="1015" alt="Screenshot 2026-04-25 111526" src="https://github.com/user-attachments/assets/3a3b5b32-1a80-4ab1-ad4e-800d7fe6bba4" />

4. Update Product (PUT):
<img width="1285" height="899" alt="Screenshot 2026-04-25 113812" src="https://github.com/user-attachments/assets/33bdb20f-921f-48de-9c3b-b2310ee0245c" />

5. Error Handling & Delete (DELETE):
<img width="1275" height="876" alt="Screenshot 2026-04-25 113909" src="https://github.com/user-attachments/assets/cc940b15-5a2c-4e97-bab7-4c1dc3dc87a8" />


❓ Theoretical Analysis: 

Question:

Even though the ProductRepository interface is empty, how can we use methods like save, findById, and findAll in the ProductService without any errors?

Answer:

This is possible due to the power of "Repository Abstraction" in Spring Data JPA:

1-The ProductRepository extends the JpaRepository<Product, Long> interface.

2-When the Spring Boot application starts, it scans this interface and automatically creates a Proxy Implementation at runtime.

3-This generated class already contains the implementation for all standard database operations (save, delete, count, etc.). Therefore, the developer does not need to write manual SQL queries or implement these methods manually.

🔧 Installation Instructions:

1-Download or clone the project to your local machine.

2-Update dependencies using Maven (pom.xml).

3-Run the FirstRestApiSpringApplication.java file.

4-Open the Swagger link to start testing the endpoints.
