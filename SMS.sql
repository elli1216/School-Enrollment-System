create database SchoolEnrollmentDB;
use SchoolEnrollmentDB;

create table Student(
		Student_ID int auto_increment primary key,
        First_Name varchar(255),
        Middle_Name varchar(255),
        Surname varchar(255),
        Email varchar(255),
        Birth_Date date,
        Age int,
        Address varchar(255),
        Phone_No varchar(20),
        Gender varchar(20)
)auto_increment = 1000;

create table Course(
	Course_ID int auto_increment primary key,
    Course_Name varchar(255),
    Course_Acronym varchar(10)
);

create table Subject(
	Subject_ID int auto_increment primary key,
    Subject_Name varchar(255),
    Subject_Code varchar(20),
    Subject_Type varchar(20),
    Course_ID int,
    foreign key (Course_ID) references Course(Course_ID)
);

create table Faculty(
	Faculty_ID int auto_increment primary key,
    First_Name varchar(255),
    Middle_Name varchar(255),
    Surname varchar(255),
    Birth_Date date,
    Age int,
    Address varchar(255),
    Phone_No varchar(20),
    Gender varchar(20),
    Department_ID int,
    foreign key (Department_ID) references Department(Department_ID)
)auto_increment = 100;

create table Department(
	Department_ID int auto_increment primary key,
    Department_Name varchar(255),
    Department_Code varchar(20)
);

create table Section(
	Section_ID int auto_increment primary key,
    Section_Name varchar(20),
    Year_Level int,
    Course_ID int,
    foreign key (Course_ID) references Course(Course_ID)
);

create table Enroll(
	Student_ID int,
    Subject_ID int,
    foreign key (Student_ID) references Student(Student_ID),
	foreign key (Subject_ID) references Subject(Subject_ID)
);

create table Assign(
	Faculty_ID int,
	Subject_ID int,
	foreign key (Faculty_ID) references Faculty(Faculty_ID),
	foreign key (Subject_ID) references Subject(Subject_ID)
);

create table Grade(
	Grade_ID int auto_increment primary key,
    Student_ID int,
    Subject_ID int,
    Grade float,
    foreign key (Student_ID) references Student(Student_ID),
	foreign key (Subject_ID) references Subject(Subject_ID)
);

create table Student_Account(
	Account_ID int auto_increment primary key,
    Student_ID int,
    Username varchar(255),
    Password varchar(255),
    foreign key (Student_ID) references Student(Student_ID)
);

insert into Student(First_Name, Middle_Name, Surname, Email, Birth_Date, Age, Address, Phone_No, Gender)
values ('Michelle', 'Cuadera', 'Gealon', 'gealon.michelle@gmail.com', '2005-09-19', 18, 'Sta. Maria', '09068912700', 'Female');

insert into Course(Course_Name, Course_Acronym)
values ('Bachelor of Science in Information Technology', 'BSIT');

insert into Subject(Subject_Name, Subject_Code, Subject_Type, Course_ID)
values ('Object-Oriented Programming', 'IT201', 'Major', 1); 

insert into Enroll(Student_ID, Subject_ID)
values (1001, 1);

SELECT * FROM Student;
SELECT * FROM Section;
SELECT * FROM Course;
SELECT * FROM Subject;
SELECT * FROM Department;
SELECT * FROM Faculty;
SELECT * FROM Enroll;
SELECT * FROM Student;
SELECT * FROM Student_Account;

SELECT 
    Student.Student_ID, 
    Student.First_Name, 
    Student.Middle_Name, 
    Student.Surname,  
    Subject.Subject_Name, 
    Subject.Subject_Code
FROM 
    Enroll
INNER JOIN 
    Student ON Enroll.Student_ID = Student.Student_ID
INNER JOIN 
    Subject ON Enroll.Subject_ID = Subject.Subject_ID;
