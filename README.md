# School Enrollment System

A comprehensive Java-based desktop application for managing school enrollment, built using Java Swing GUI and SQL Server database.

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [System Architecture](#system-architecture)
- [Database Schema](#database-schema)
- [Installation](#installation)
- [Usage](#usage)
- [User Roles](#user-roles)
- [Screenshots](#screenshots)
- [Technical Details](#technical-details)
- [Contributing](#contributing)
- [License](#license)

## 🔍 Overview

The School Enrollment System is a desktop application designed to streamline the management of student enrollment, faculty administration, course management, and academic records. The system provides separate interfaces for administrators and students, offering comprehensive functionality for educational institutions.

## ✨ Features

### 🎓 Student Features
- **Student Login**: Secure authentication system for students
- **Student Dashboard**: Personalized dashboard with navigation options
- **Subject Enrollment**: Add/drop subjects functionality with search capabilities
- **Grade Viewing**: View academic grades and performance
- **Profile Management**: View and manage personal information

### 👨‍💼 Administrator Features
- **Admin Dashboard**: Comprehensive control panel for system management
- **Student Management**: Complete CRUD operations for student records
- **Faculty Management**: Add, update, delete, and manage faculty information
- **Course Management**: Manage courses, subjects, and sections
- **Grade Management**: Assign and manage student grades
- **Department Management**: Organize faculty by departments

### 📚 Academic Management
- **Course Creation**: Define courses with acronyms and details
- **Subject Management**: Organize subjects by course and type (Major/Minor)
- **Section Management**: Create and manage class sections by year level
- **Enrollment Tracking**: Monitor student enrollment in subjects
- **Grade Recording**: Comprehensive grading system

## 🏗️ System Architecture

```
School Enrollment System
├── Frontend (Java Swing GUI)
│   ├── Login Interface
│   ├── Student Dashboard
│   ├── Admin Home
│   ├── Management Interfaces
│   └── Form Components
├── Backend (Java Classes)
│   ├── Model Classes (Student, Faculty, Course, etc.)
│   ├── Database Connection
│   └── Business Logic
└── Database (SQL Server)
    ├── Student Tables
    ├── Faculty Tables
    ├── Academic Tables
    └── Relationship Tables
```

## 🗄️ Database Schema

### Core Tables

#### Student Management
- **Student**: Student information (ID, name, contact details, demographics)
- **Student_Account**: Login credentials for students
- **Section**: Class sections organized by year level and course

#### Faculty Management
- **Faculty**: Faculty member information
- **Department**: Academic departments

#### Academic Management
- **Course**: Degree programs (e.g., BSIT)
- **Subject**: Individual subjects within courses
- **Enroll**: Student-subject enrollment records
- **Assign**: Faculty-subject assignments
- **Grade**: Student grades for enrolled subjects

### Key Relationships
- Students belong to Courses and Sections
- Faculty members are assigned to Departments
- Subjects are categorized under Courses
- Enrollments link Students to Subjects
- Grades track Student performance in Subjects

## 🚀 Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- SQL Server Database
- NetBeans IDE (recommended) or any Java IDE

### Setup Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/School-Enrollment-System.git
   cd School-Enrollment-System
   ```

2. **Database Setup**
   - Install SQL Server
   - Execute the `SMS.sql` file to create the database schema
   - Update database connection settings in `DBConnection.java`

3. **Configure Database Connection**
   ```java
   // Update these values in src/EnrollmentSystem/DBConnection.java
   static final String url = "jdbc:sqlserver://YOUR_SERVER;Database=SchoolEnrollmentDB;encrypt=true;trustServerCertificate=true;IntegratedSecurity=true";
   static final String username = "your_username";
   static final String password = "your_password";
   ```

4. **Compile and Run**
   - Open the project in your Java IDE
   - Compile the source files
   - Run the `Login.java` main method to start the application

## 📖 Usage

### Starting the Application
1. Run the `Login.java` class
2. Use the login interface to access the system

### Login Credentials

#### Administrator Access
- **Username**: `admin`
- **Password**: `admin`

#### Student Access
- Use student ID and password from the database
- Default student accounts can be created through admin interface

### Navigation Flow

```
Login Screen
├── Admin Login → Home Dashboard
│   ├── Student Enrollment Management
│   ├── Course Management
│   ├── Faculty Management
│   └── Logout
└── Student Login → Student Dashboard
    ├── Add/Drop Subjects
    ├── View Grades
    ├── Profile Information
    └── Logout
```

## 👥 User Roles

### 🔑 Administrator
- Full system access and control
- Manage all students, faculty, and academic data
- Configure courses, subjects, and sections
- Assign grades and monitor enrollment

### 🎓 Student
- Limited access to personal academic information
- Enroll in or drop subjects
- View assigned grades
- Update personal profile information

## 🛠️ Technical Details

### Technology Stack
- **Frontend**: Java Swing GUI Framework
- **Backend**: Core Java with JDBC
- **Database**: Microsoft SQL Server
- **IDE**: NetBeans (with .form files for GUI design)

### Key Components

#### Model Classes
- `Student.java` - Student entity and operations
- `Faculty.java` - Faculty member entity
- `Course.java` - Academic course representation
- `Subject.java` - Subject/course module entity
- `Section.java` - Class section entity
- `Grades.java` - Grade recording entity
- `User.java` - Base user class

#### GUI Classes
- `Login.java` - Authentication interface
- `Home.java` - Administrator dashboard
- `StudentDashboard.java` - Student interface
- `StudentEnrollment.java` - Student management interface
- `FacultyManagement.java` - Faculty administration
- `CourseManagement.java` - Academic program management

#### Utility Classes
- `DBConnection.java` - Database connectivity
- `Enroll.java` - Enrollment operations

### Design Patterns Used
- **MVC Pattern**: Separation of model, view, and controller logic
- **DAO Pattern**: Data access abstraction for database operations
- **Singleton Pattern**: Database connection management

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Development Guidelines
- Follow Java naming conventions
- Maintain consistent code formatting
- Add comments for complex business logic
- Test database operations thoroughly
- Ensure GUI responsiveness

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📧 Contact

**Developer**: elli  
**Project Link**: [https://github.com/elli1216/School-Enrollment-System](https://github.com/elli1216/School-Enrollment-System)

## 🙏 Acknowledgments

- Java Swing documentation and community
- SQL Server database management resources
- NetBeans IDE for GUI development tools
- Educational institution requirements that inspired this system

---

*This School Enrollment System provides a solid foundation for educational institutions looking to digitize their enrollment and academic management processes.*
