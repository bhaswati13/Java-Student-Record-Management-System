# Student Record Management System

A simple command-line application for managing student records with MySQL database connectivity using Java.

## Overview

This project is a basic Student Record Management System implemented in Java. It allows users to perform CRUD operations (Create, Read, Update, Delete) on student records. The application uses MySQL to store and retrieve data.

## Features

- **Add Student:** Add a new student record with name, age, department, and year.
- **View All Students:** Display a list of all students in the database.
- **Update Student:** Modify an existing student's information.
- **Delete Student:** Remove a student record from the database.
- **Search Students:** Search for students based on ID, name, department, year, or age.

## Prerequisites

- Java Development Kit (JDK)
- MySQL Database
- MySQL Connector/J library (Included in the `lib` directory)

## Getting Started

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/student-record-management.git
   ```

2. Set up your MySQL database and update the connection details in the `DatabaseManager.java` file.

3. Compile the Java files:

   ```bash
   javac -cp "bin;lib/mysql-connector-j-8.2.0.jar" -d bin src/*.java
   ```

4. Run the application:

   ```bash
   java -cp "bin;lib/mysql-connector-j-8.2.0.jar" Main
   ```

## Usage

Follow the on-screen prompts to interact with the application. You can add, view, update, delete, and search for student records.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.


```
