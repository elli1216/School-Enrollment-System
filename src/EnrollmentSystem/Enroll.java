/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

/**
 *
 * @author elli
 */
public class Enroll {
    private int studentID;
    private String subjectID;
    private String subjectName;

    public Enroll(int studentID, String subjectID, String subjectName) {
        this.studentID = studentID;
        this.subjectID = subjectID;
        this.subjectName = subjectName;
    }
    
    public int getStudentID(){
        return studentID;
    }
    public String getSubjectID(){
        return subjectID;
    }
    public String getSubjectName(){
        return subjectName;
    }
}
