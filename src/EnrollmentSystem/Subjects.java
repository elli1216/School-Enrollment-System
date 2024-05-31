/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

/**
 *
 * @author elli
 */
public class Subjects {
    private String subjectID;
    private String subjectName;
    private String subjectType;
    private String courseID;

    public Subjects(String subjectID, String subjectName, String subjectType, String courseID) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.subjectType = subjectType;
        this.courseID = courseID;
    }
    
    public String getSubID(){
        return subjectID;
    }
    public String getSubName(){
        return subjectName;
    }
    public String getSubType(){
        return subjectType;
    }
    public String getCourseID(){
        return courseID;
    }
}
