# Notes REST API (Spring Boot)

## 📌 Description
A backend application to manage notes with full CRUD operations using Spring Boot.

## 🚀 Features
- Create Note
- Get All Notes
- Get Note by ID
- Update Note
- Delete Note

## 🛠 Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 Database

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|---------|------------|
| POST | /notes | Create note |
| GET | /notes | Get all notes |
| GET | /notes/{id} | Get note by ID |
| PUT | /notes/{id} | Update note |
| DELETE | /notes/{id} | Delete note |

## ▶️ How to Run
1. Clone repo
2. Run `DemoApplication`
3. Test APIs using Postman

## 📸 Sample Request
POST /notes
{
  "title": "Sample",
  "content": "Test note"
}
