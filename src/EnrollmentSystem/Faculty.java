/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

/**
 *
 * @author elli
 */
public class Faculty extends User{
    private int facultyID;
    private String deptID;

    public Faculty(int facultyID, String FName, String MName, String SName, String birthdate, int age, String address, String phoneNo, String gender, String deptID) {
        super(FName, MName, SName, birthdate, age, address, phoneNo, gender);
        this.facultyID = facultyID;
        this.deptID = deptID;
    }
    public int getFacultyID(){
        return facultyID;
    }
    public String getFName(){
        return super.getFname();
    }
    public String getMName(){
        return super.getMname();
    }
    public String getSName(){
        return super.getSname();
    }
    public String getBirthdate(){
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
    public String getGender(){
        return super.getGender();
    }
    public String getDeptID(){
        return deptID;
    }
}