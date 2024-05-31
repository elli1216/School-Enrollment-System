/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

/**
 *
 * @author elli
 */
public class Section {
    private String sectionName;
    private int yrLevel;
    private String course;
    
    public Section(String sectionName, int yrLevel, String course){
        this.sectionName = sectionName;
        this.yrLevel = yrLevel;
        this.course = course;
    }
    
    public String getSectionName(){
        return sectionName;
    }
    public int getYrLevel(){
        return yrLevel;
    }
    public String getCourse(){
        return course;
    }
}
