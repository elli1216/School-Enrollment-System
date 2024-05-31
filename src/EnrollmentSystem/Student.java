/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

/**
 *
 * @author elli
 */
public class Student extends User{
    private int studNo;
    private String course;
    private int yrLevel;
    private String section;

    public Student(int studNo, String FName, String MName, String SName, String birthdate, int age, String address, String phoneNo, String course, int yrLevel, String section, String gender) {
        super(FName, MName, SName, birthdate, age, address, phoneNo, gender);
        this.studNo = studNo;
        this.course = course;
        this.yrLevel = yrLevel;
        this.section = section;
    }

    public int getStudNo(){
        return studNo;
    }
    public String getFname(){
        return super.getFname();
    }
    public String getMname(){
        return super.getMname();
    }
    public String getSname(){
        return super.getSname();
    }
    public String getBirthDate(){
        return super.getBirthDate();
    }
    public int getAge(){
        return super.getAge();
    }
    public String getAddress(){
        return super.getAddress();
    }
    public String getPhoneNo(){
        return super.getPhoneNo();
    }
    public String getCourse(){
        return course;
    }
    public int getYrLevel(){
        return yrLevel;
    }
    public String getSection(){
        return section;
    }
    public String getGender(){
        return super.getGender();
    }  
}
