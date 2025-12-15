<h1 align="center">📦 Inventory Management System – DevOps Project</h1>

<p align="center">
  A full-stack <strong>Inventory Management System</strong> developed and managed using  
  <strong>DevOps best practices</strong> such as <strong>Git, Maven, branching strategy</strong>,  
  and frontend–backend is integration.
</p>

---

## 📌 Introduction

The **Inventory Management System** is a DevOps-based academic project designed to demonstrate how a real-world application is developed, version-controlled, built, and managed using modern DevOps tools.

The project consists of:
- A **frontend** built using HTML, CSS, and JavaScript  
- A **backend** developed using Java Spring Boot and Maven  
- Proper **Git version control** with multiple branches and commits  

This project highlights **DevOps concepts like branching, commits, build automation, and integration**.

---

## 🎯 Project Objectives

- To understand and implement DevOps fundamentals  
- To use **Git & GitHub** for version control  
- To follow **branching strategies** (main, feature, visual, bugfix)  
- To build and manage backend using **Maven**  
- To integrate frontend with backend APIs  
- To demonstrate multiple commits and branches as required for CA  

---

## 🧱 System Architecture

The system follows a simple client–server architecture:

- **Frontend (UI)**
  - HTML  
  - CSS  
  - JavaScript  

- **Backend (API Layer)**
  - Java  
  - Spring Boot  
  - Maven  

- **Version Control**
  - Git  
  - GitHub  

The frontend communicates with the backend using **REST APIs** running on `localhost:8080`.

---

## 🛠️ Tools and Technologies Used

### Frontend
- HTML  
- CSS  
- JavaScript  

### Backend
- Java  
- Spring Boot  
- Maven  

### DevOps Tools
- Git  
- GitHub  
- Maven  

---

## 📂 Project Structure
Devops-int331-project/
│
├── index.html # Frontend UI
├── style.css # Frontend styling
│
├── backend-java/
│ ├── pom.xml # Maven configuration
│ ├── src/main/java/
│ │ └── com/inventory/
│ │ ├── InventoryApplication.java
│ │ ├── controller/
│ │ │ └── InventoryController.java
│ │ ├── service/
│ │ │ └── InventoryService.java
│ │ └── model/
│ │ └── Product.java
│
├── .vscode/ # Editor configuration
└── README.md # Project documentation

---

## 🌿 Git Branching Strategy

| Branch Name | Purpose |
|------------|---------|
| main | Stable version of the project |
| visual | UI / design-related changes |
| feature-api | Backend API enhancements |
| bugfix-cleanup | Bug fixes and cleanup |

---

## 🧪 Backend APIs Used

| API Endpoint | Method | Description |
|-------------|--------|-------------|
| `/products` | GET | Fetch all products |
| `/add` | POST | Add a new product |
| `/update` | PUT | Update existing product |
| `/search/{name}` | GET | Search product by name |
| `/delete/{name}` | DELETE | Delete product by name |

---

## ⚠️ Challenges Faced

- Understanding Git branch tracking  
- Managing multiple commits correctly  
- Running frontend and backend separately  
- Handling Maven build errors  
- Understanding REST API integration  
- Dealing with Whitelabel Error Page (404)  

---

## ✅ Advantages of the System

- Clean separation of frontend and backend  
- Proper DevOps workflow with Git & Maven  
- Easy to maintain and extend  
- Real-world DevOps experience  
- Academic CA-ready project  

---

## 🚀 Future Enhancements

- Database integration (MySQL / PostgreSQL)  
- User authentication  
- Docker containerization  
- CI/CD pipeline using GitHub Actions  
- Deployment on cloud (AWS / Azure)  

---

## 🎓 Conclusion

This Inventory Management System project successfully demonstrates the use of **DevOps practices** in a real-world scenario.  
By integrating **Git version control**, **Maven build automation**, and **frontend–backend interaction**, the project provides strong foundational knowledge for DevOps and software engineering concepts.

---

## 📚 References

- Spring Boot Documentation  
- Maven Documentation  
- Git & GitHub Documentation  

---

## ⚙️ Commands Used

### Git Commands

```bash
git init

git add index.html
git commit -m "Frontend: added inventory UI"

git add style.css
git commit -m "Frontend: added styling"

git add backend-java
git commit -m "Backend: added Spring Boot inventory service"

git checkout -b visual
git commit -m "UI: visual improvements"

git checkout -b feature-api
git commit -m "API: enhanced inventory endpoints"

git checkout -b bugfix-cleanup
git commit -m "Bugfix: cleaned frontend validations"

git push -u origin main
git push -u origin visual
git push -u origin feature-api
git push -u origin bugfix-cleanup
