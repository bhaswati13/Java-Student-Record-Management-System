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

### Sample Output

**Choose an option:**
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Students
6. Exit

1  
Enter student name:  
Bhas  
Enter student age:  
22  
Enter student department:  
MSc Data Science  
Enter student year:  
2  
Student added successfully.  

**Choose an option:**
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Students
6. Exit

1  
Enter student name:  
Naba  
Enter student age:  
19  
Enter student department:  
BSc Statistics  
Enter student year:  
3  
Student added successfully.  

**Choose an option:**
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Students
6. Exit

1
Enter student name:  
Bhas  
Enter student age:  
23  
Enter student department:  
MSc Statistics  
Enter student year:  
2  
Student added successfully.  

**Choose an option:**
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Students
6. Exit

2  
Student Records:  
ID: 3, Name: Bhas, Age: 23, Department: MSc Data Science, Year: 2  
ID: 4, Name: Nabanita Bardhan, Age: 19, Department: BSc Statistics, Year: 3    
ID: 5, Name: Bhas Chatterjee, Age: 24, Department: MSc Statistics, Year: 2  
ID: 6, Name: Bhas, Age: 22, Department: MSc Data Science, Year: 2   
ID: 7, Name: Naba, Age: 19, Department: BSc Statistics, Year: 3    
ID: 8, Name: Bhas, Age: 23, Department: MSc Statistics, Year: 2  

**Choose an option:**
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Students
6. Exit

5  
Do you want to search for students? (yes/no)  
yes  
Choose a search criteria:  
1. Search by ID  
2. Search by Name  
3. Search by Department  
4. Search by Year  
5. Search by Age  

2    
Enter student Name:  
Bhas  
Search Results:  
ID: 3, Name: Bhas, Age: 23, Department: MSc Data Science, Year: 2  
ID: 6, Name: Bhas, Age: 22, Department: MSc Data Science, Year: 2  
ID: 8, Name: Bhas, Age: 23, Department: MSc Statistics, Year: 2  
  
**Choose an option:**
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Students
6. Exit

4  
Enter the ID of the student to delete:  
6  
Student deleted successfully.  

**Choose an option:** 
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Students
6. Exit

2  
Student Records:  
ID: 3, Name: Bhas, Age: 23, Department: MSc Data Science, Year: 2  
ID: 4, Name: Nabanita Bardhan, Age: 19, Department: BSc Statistics, Year: 3  
ID: 5, Name: Bhas Chatterjee, Age: 24, Department: MSc Statistics, Year: 2  
ID: 7, Name: Naba, Age: 19, Department: BSc Statistics, Year: 3  
ID: 8, Name: Bhas, Age: 23, Department: MSc Statistics, Year: 2  
 
**Choose an option:**
1. Add Student
2. View All Students
3. Update Student
4. Delete Student
5. Search Students
6. Exit

6  
Exiting program.  
 

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.




Contributions are welcome! If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.
