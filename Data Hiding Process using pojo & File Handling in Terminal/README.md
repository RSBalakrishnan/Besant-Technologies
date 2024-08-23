Here's a comprehensive README content that covers all three phases of your project:

---

# Detail Dashboard

## Overview

The Detail Dashboard is a Java-based application designed to manage student and teacher accounts. This application allows for account creation and login for both students and teachers, storing user details in CSV files.

## Features

- **Student Account Creation**: Allows creation of new student accounts with details such as name, registration number, email, department, and password.
- **Teacher Account Creation**: Allows creation of new teacher accounts with details such as name, ID number, email, subject, and password.
- **Student Login**: Authenticates student login using credentials stored in a CSV file.
- **Teacher Login**: Authenticates teacher login using credentials stored in a CSV file.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- Apache Commons IO library

## Installation

1. **Clone the Repository**:
    ```bash
    git clone <repository-url>
    ```

2. **Add Apache Commons IO Dependency**:
   - Download the Apache Commons IO library from [Apache Commons IO](https://commons.apache.org/proper/commons-io/download_io.cgi).
   - Add the JAR file to your project's classpath.

## Usage

1. **Running the Application**:
   - Navigate to the project directory and compile the Java files:
     ```bash
     javac -cp .;path/to/commons-io.jar src/com/pojo/*.java src/Details.java
     ```
   - Run the application:
     ```bash
     java -cp .;path/to/commons-io.jar Details
     ```

2. **Interaction**:
   - Upon running, you will be prompted with a menu to choose between student and teacher options.
   - Follow the on-screen instructions to create accounts or log in.

## Code Structure

### `Details.java`

- **Purpose**: Handles the main logic for account creation and login.
- **Functions**:
  - `accountCreate()`: Creates a new student account.
  - `teacherAccountCreate()`: Creates a new teacher account.
  - `studentLogin()`: Logs in a student and displays their details if credentials are correct.
  - `teacherLogin()`: Logs in a teacher and displays their details if credentials are correct.

### `Students.java` (Located in `com.pojo`)

- **Purpose**: Defines the structure and behaviors of student objects.
- **Attributes**:
  - `name`: Name of the student.
  - `regNum`: Registration number.
  - `email`: Email address.
  - `dept`: Department.
  - `passcode`: Password.
- **Methods**:
  - Getters and setters for each attribute.
  - `toString()`: Returns a CSV formatted string representation of the student.

### `Teachers.java` (Located in `com.pojo`)

- **Purpose**: Defines the structure and behaviors of teacher objects.
- **Attributes**:
  - `name`: Name of the teacher.
  - `idNum`: ID number.
  - `email`: Email address.
  - `subject`: Subject taught.
  - `password`: Password.
- **Methods**:
  - Getters and setters for each attribute.
  - `toString()`: Returns a CSV formatted string representation of the teacher.

## File Locations

- **Student Data**: `D:\\File\\pass.csv`
- **Teacher Data**: `D:\\File\\dataTeacher.csv`


## Contact

For any questions or inquiries, please contact crishrb7@gmail.com

***THIS README CONTENT GENERATED USING CHATGPT 4o mini***
---
