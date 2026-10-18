# AnimeFlix - Backend 🎬

This is the backend for the **AnimeFlix** project, built with Java and Spring Boot, strictly following **Hexagonal Architecture (Ports and Adapters)** principles. It uses **MongoDB** as a NoSQL database and is ready for containerized local development.

---

## 🏗️ Project Architecture

The project follows Hexagonal Architecture to keep the business logic completely decoupled from external infrastructure concerns (such as databases or web frameworks):

```text
animeflix-backend/
├── src/
│   └── main/
│       └── java/
│           └── com/animeflix/animeflix/
│               ├── AnimeflixApplication.java
│               ├── application/
│               │   ├── port/
│               │   │   ├── in/       # Input use case interfaces
│               │   │   └── out/      # Output repository ports
│               │   └── usecase/      # Business logic implementations
│               ├── domain/           # Pure domain entities
│               └── infrastructure/
│                   ├── persistence/
│                   │   ├── adapters/ # Repository adapters (MongoDB)
│                   │   ├── documents/# MongoDB persistence models (@Document)
│                   │   ├── mappers/  # Mappers between Domain and Documents
│                   │   └── repository/# Spring Data MongoDB interfaces
│                   └── rest/         # REST Controllers
```
## <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" width="48" height="48" /> Docker Getting Started with Docker

📦 Prerequisites:
Docker Desktop installed on your machine.
Maven (or using the included wrapper ./mvnw).

## 🚀 How to Run
1. Clone this repository:

```bash 
git clone [https://github.com/Andreastephgm/animeflix-backend.git](https://github.com/Andreastephgm/animeflix-backend.git)
cd animeflix-backend
```

2. Start MongoDB via Docker:
   Run the following command in your terminal to start a local MongoDB container on port 27017:

```bash
docker run -d -p 27017:27017 --name anime-mongo mongo:latest
```

3. Configure application.properties:
   Ensure your src/main/resources/application.properties points correctly to your MongoDB instance:

```bash
spring.application.name=animeflix
spring.data.mongodb.uri=mongodb://localhost:27017/animeflix-backend
server.port=8080
```

4. Run the Spring Boot Application:
   Use the included Maven Wrapper in the project to compile and run the server:

```bash
./mvnw spring-boot:run
```

5. Test the Endpoints (Full CRUD):
   You can use Postman to interact with the following endpoints exposed at http://localhost:8080/api/animes:
```text
POST /api/animes/new - Create a new anime.
GET /api/animes/all - List all anime records.
GET /api/animes/{id} - Find an anime by its ID.
PUT /api/animes/{id} - Update an existing anime.
DELETE /api/animes/{id} - Delete an anime.
```
## 👩🏻 Developer
Andrea Stefanny García Mejía

## [![GitHub](https://img.shields.io/badge/GitHub-381717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Andreastephgm)[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/andreastefannydev/)

## 📝 License
This project is licensed under the MIT License.

