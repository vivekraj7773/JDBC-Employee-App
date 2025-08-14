# Employee Management System (Java + JDBC)

This is a console-based Employee Management System built in Java using **JDBC** for database operations.  
The application allows us to **Add, View, Update, and Delete** employee records from a MySQL database.

---

## Features
- Add a new employee
- View all employees
- Update employee details
- Delete an employee
- Exit the program

---

## Technologies Used
- **Java** (JDK)
- **MySQL** (Database)
- **JDBC** (Java Database Connectivity)
- **VS Code** (IDE)

---

## Database Setup

1. Install **MySQL** and create a new database:
    ```sql
    CREATE DATABASE employee_db;
    ```

2. Create the `employees` table:
    ```sql
    CREATE TABLE employees (
        id INT PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(100) NOT NULL,
        position VARCHAR(100),
        salary decimal(10,2)
    );

   ```

## How to Run the Project

1. **Clone the repository** (or download the files):
    ```bash
    git clone https://github.com/vivekraj7773/JDBC-Employee-App-java.git
    ```
    
2. **Open in your IDE** (VS Code / IntelliJ / Eclipse).
   

4. **Compile and Run**:
    ```bash
    javac Main.java EmployeeDAO.java
    java Main
    ```

---


