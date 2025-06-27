# 🚀 J2EE-Security-JWT-With-db

## 📝 Project Overview

**J2EE-Security-JWT-With-db** is a practical Java EE project that demonstrates secure authentication and role-based authorization using JSON Web Tokens (JWT) and a database-backed identity store. The project leverages Jakarta EE Security API, JAX-RS for RESTful endpoints, Hibernate ORM for persistence, and MySQL for data storage. It is ideal for learning how to build modern, stateless, and scalable authentication systems in enterprise Java applications.

---

## 📽️ Demo Video
[![J2EE-Security-JWT-With-db Project Demo](https://github.com/chamikathereal/J2EE-Security-JWT-With-db/blob/main/J2EE-Security-JWT-With-db.png)](https://youtu.be/sSrRBxIvBqo)

---

## 🗂️ Project Structure

```
J2EE-Security-JWT-With-db/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── lk.jlat.app.security/
│   │   │       ├── config/
│   │   │       │   └── AppConfig
│   │   │       ├── controller/
│   │   │       │   └── AuthController
│   │   │       ├── model/
│   │   │       │   └── User
│   │   │       ├── security/
│   │   │       │   ├── AppIdentityStore
│   │   │       │   ├── AuthMechanism
│   │   │       │   └── Credentials
│   │   │       ├── service/
│   │   │       │   └── LoginService
│   │   │       ├── servlet/
│   │   │       │   ├── Login
│   │   │       │   └── Profile
│   │   │       └── util/
│   │   ├── resources/
│   │   │   └── META-INF/
│   │   │       └── persistence.xml
│   │   └── webapp/
│   │       ├── user/
│   │       │   └── index.jsp
│   │       ├── WEB-INF/
│   │       │   └── web.xml
│   │       ├── index.jsp
│   │       └── login.jsp
├── pom.xml
```
[See full structure and code in the attached file][1]

## 📦 Module Details

#### 🟦 **config**
- **AppConfig**  
  Configures the JAX-RS application path (`/api`) for all REST endpoints.

  ##

#### 🟦 **controller**
- **AuthController**  
  REST controller for authentication endpoints (`/auth/login`, `/auth/register`). Handles login requests, validates credentials, and issues JWT tokens.

  ##

#### 🟦 **model**
- **User**  
  JPA entity representing a user with username, password, and a set of roles. Used for authentication and authorization.

  ##

#### 🟦 **security**
- **AppIdentityStore**  
  Custom identity store that validates user credentials and retrieves roles from the database using the `LoginService`.
  
- **AuthMechanism**  
  Custom HTTP authentication mechanism that supports both JWT-based and form-based authentication, using the Jakarta EE Security API.
  
- **Credentials**  
  POJO representing username and password for authentication requests.

  ##

#### 🟦 **service**
- **LoginService**  
  Handles user validation and role retrieval from the database using JPA and Hibernate.

  ##

#### 🟦 **servlet**
- **Login**  
  Servlet for processing login requests and authenticating users.
  
- **Profile**  
  Servlet for displaying the user profile page, secured with role-based access control annotations.

  ##

#### 🟦 **util**
- **JWTUtil**  
  Utility class for generating and validating JWT tokens, embedding username and roles as claims.

  ##

#### 🟦 **resources/META-INF**
- **persistence.xml**  
  JPA configuration file for Hibernate and MySQL integration.

  ##

#### 🟦 **webapp**
- **user/index.jsp**  
  User dashboard, accessible only to authenticated users with the appropriate role.
  
- **WEB-INF/web.xml**  
  Declarative security configuration for protected resources and role mappings.
  
- **login.jsp**  
  Custom login form for user authentication.
  
- **index.jsp**  
  Public landing page.

## ⚙️ Key Features

- ✅ Secure JWT-based authentication for REST APIs
- ✅ Database-backed user and role management with Hibernate (JPA)
- ✅ Custom identity store and authentication mechanism (Jakarta EE Security API)
- ✅ Stateless session management using JWTs
- ✅ Role-based access control for servlets and endpoints
- ✅ Clean, modular Maven project structure

## 💡 How It Works

- **User Authentication:**  
  Users authenticate via REST (`/api/auth/login`) or form. Credentials are validated against the database. On success, a JWT is issued containing the username and roles.

- **JWT Validation:**  
  Protected endpoints require a valid JWT in the `Authorization` header (`Bearer `). The custom authentication mechanism parses and validates the token, extracting user identity and roles for access control.

- **Role-Based Authorization:**  
  Access to servlets and JSPs is protected using declarative (`web.xml`) and annotation-based security. Only users with appropriate roles can access secured resources.

- **Session Management:**  
  Stateless authentication is achieved using JWTs, eliminating the need for server-side session storage.

- **Database Integration:**  
  User credentials and roles are stored in MySQL and managed via Hibernate/JPA.

## 🛠️ Technologies Used

- Java 11
- Jakarta EE 10 (JAX-RS, Security API, Servlet, JPA)
- Hibernate ORM
- MySQL
- JJWT (io.jsonwebtoken)
- Maven

## 📚 Learning Outcomes

- ✅ Implement JWT-based authentication and authorization in Java EE
- ✅ Integrate database-backed identity management with Hibernate
- ✅ Secure RESTful APIs and web resources with modern best practices
- ✅ Build scalable, stateless, and secure enterprise Java applications

## 🧑‍💻 Author

Chamika Gayashan  
Undergraduate Software Engineer | Sri Lanka  
Linkedin: @chamikathereal  
Current date: Friday, June 27, 2025, 6:30 PM +0530
