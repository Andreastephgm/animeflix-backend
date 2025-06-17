# AnimeFlix - Backend 🎬

This is the backend for the **AnimeFlix** project, built with Java + Spring Boot and using MySQL as the relational database. It includes a Docker-based development environment with phpMyAdmin for easy database management.

---

## 🐳 Getting Started with Docker

### 📦 Requirements

- [Docker Desktop](https://www.docker.com/products/docker-desktop) installed on your machine.
- Docker Compose enabled.

---

### 🚀 How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/Andreastephgm/animeflix-backend.git
   cd animeflix-backend
   ```

2. Create `.env` file:

   Create a `.env` file in the root directory with the following content:

   ```env
   MYSQL_ROOT_PASSWORD=root123
   MYSQL_DATABASE=animeflix
   MYSQL_USER=admin
   MYSQL_PASSWORD=admin123
   ```

3. Docker Setup:

   Make sure you have Docker and Docker Compose installed.  
   To start the MySQL and phpMyAdmin containers, run:

   ```bash
   docker compose up
   ```

4. Access phpMyAdmin:

   Open your browser and go to: [http://localhost:8080](http://localhost:8080)  
   Use these credentials to log in:

   - Server: `db`  
   - Username: `admin`  
   - Password: `admin123`

5. Configure Spring Boot datasource:

   Set your `application.properties` or `application.yml` to connect to the database:

   ```properties
   spring.datasource.url=jdbc:mysql://db:3306/animeflix
   spring.datasource.username=admin
   spring.datasource.password=admin123
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

6. Project Structure Overview:

   ```
   animeflix-backend/
   ├── database/
   │   └── init.sql
   ├── docker-compose.yml
   ├── .env
   ├── src/
   │   └── main/
   │       └── java/
   │           └── com/animeflix/animeflix/
   │               ├── AnimeflixApplication.java
   │               ├── model/
   │               ├── controller/
   │               ├── repository/
   │               └── service/
   ```

7. Push your code to GitHub:

   ```bash
   git init
   git remote add origin https://github.com/YourUsername/animeflix-backend.git
   git add .
   git commit -m "Initial commit with backend and Docker setup"
   git push -u origin main
   ```

8. Replace `YourUsername` with your GitHub username.

---

## 👩🏻 Developer

**Andrea Stefanny García Mejía**  
GitHub: [https://github.com/Andreastephgm](https://github.com/Andreastephgm)

---

## 📝 License

This project is licensed under the MIT License.

