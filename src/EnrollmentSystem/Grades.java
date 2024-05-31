/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

/**
 *
 * @author elli
 */
public class Grades {
    private float grade;
    private String subject_ID;
    private String student_ID;

    public Grades(float grade, String subject_ID, String student_ID) {
        this.grade = grade;
        this.subject_ID = subject_ID;
        this.student_ID = student_ID;
    }
    public float getGrade(){
        return grade;
    }
    public String getSubID(){
        return subject_ID;
    }
    public String getStudID(){
        return student_ID;
    }
}
