# 📘 Notes REST API – Complete Understanding Guide

---

## 🚀 Project Overview

This project is a **Backend Application** built using **Spring Boot** that provides REST APIs to manage notes.

It supports:

* Creating notes
* Reading notes
* Updating notes
* Deleting notes

---

# 🧠 1. What is Backend?

**Answer:**
Backend is the part of an application that handles:

* Data processing
* Business logic
* Database operations

**Why?**
Frontend shows UI, but backend actually performs operations like saving data.

---

# 🌐 2. What is a REST API?

**Answer:**
REST API is a way for client (user/frontend) to communicate with server using HTTP methods.

**Example:**

* GET → fetch data
* POST → send data
* PUT → update data
* DELETE → remove data

**Why?**
Without APIs, frontend and backend cannot communicate.

---

# 🔄 3. Flow of This Project

```
Client (Postman)
→ Controller
→ Service
→ Repository
→ Database
→ Response
```

**Why this flow?**
To separate responsibilities and keep code clean and maintainable.

---

# 🧩 4. What is Controller?

**Answer:**
Controller handles incoming HTTP requests.

**Example:**

```java
@PostMapping
```

**Why?**
It acts as an entry point for user requests.

---

# ⚙️ 5. What is Service Layer?

**Answer:**
Service contains business logic.

**Example:**

* Creating note
* Updating note

**Why?**
Separates logic from controller → cleaner design.

---

# 🗄️ 6. What is Repository?

**Answer:**
Repository interacts with the database.

**Example:**

```java
repo.save(note);
```

**Why?**
To avoid writing SQL manually and simplify database operations.

---

# 💾 7. What is Database?

**Answer:**
Database stores application data.

**In this project:**

* H2 Database (in-memory)

**Why?**
To persist data (notes).

---

# 🔍 8. What is H2 Database?

**Answer:**
H2 is an in-memory database used for development/testing.

**Why?**

* No installation required
* Easy to use
* Data resets on restart

---

# 🧪 9. What is Postman?

**Answer:**
Postman is a tool to test APIs.

**Why?**
We don’t have frontend, so we use Postman to send requests.

---

# 🔒 10. What is Validation?

**Answer:**
Validation ensures correct data is sent.

**Example:**

```java
@NotBlank(message = "Title is required")
```

**Why?**
To prevent invalid or empty data from entering system.

---

# ⚠️ 11. What is @Valid?

**Answer:**
`@Valid` triggers validation on incoming request.

**Why?**
Without it, validation rules won’t execute.

---

# 🚫 12. What is Exception Handling?

**Answer:**
Exception handling manages errors gracefully.

**Example:**

```json
{
  "error": "Note not found"
}
```

**Why?**
Prevents crashes and gives proper error messages.

---

# 🌍 13. What is Global Exception Handler?

**Answer:**
A centralized class to handle all exceptions.

**Why?**

* Avoids duplicate error handling
* Keeps code clean

---

# 🧠 14. What is Spring Boot?

**Answer:**
Spring Boot is a framework to build backend applications quickly.

**Why?**

* Reduces boilerplate code
* Provides ready-to-use features

---

# 🔄 15. What is CRUD?

**Answer:**
CRUD = Create, Read, Update, Delete

**Why?**
These are basic operations in any application.

---

# 📡 16. API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| POST   | /notes      | Create note    |
| GET    | /notes      | Get all notes  |
| GET    | /notes/{id} | Get note by ID |
| PUT    | /notes/{id} | Update note    |
| DELETE | /notes/{id} | Delete note    |

---

# 🧠 17. Why Layered Architecture?

**Answer:**
To separate concerns:

* Controller → request handling
* Service → logic
* Repository → database

**Why?**
Improves maintainability and scalability.

---

# 🎯 18. Key Learnings

* How backend works
* How APIs are built
* How data flows in application
* How validation and error handling works

---

# 💣 Final Summary

This project demonstrates:

* REST API development
* Clean architecture
* Validation
* Exception handling
* Database interaction

👉 This is a **complete backend project for a fresher level developer**

---

# 🚀 Future Improvements

* Replace H2 with MySQL
* Add authentication (JWT)
* Deploy project

---
