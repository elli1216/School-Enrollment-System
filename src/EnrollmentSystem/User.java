/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnrollmentSystem;

/**
 *
 * @author elli
 */
public class User {
    private String FName;
    private String MName;
    private String SName;
    private String birthdate;
    private int age;
    private String address;
    private String phoneNo;
    private String gender;

    public User(String FName, String MName, String SName, String birthdate, int age, String address, String phoneNo, String gender) {
        this.FName = FName;
        this.MName = MName;
        this.SName = SName;
        this.birthdate = birthdate;
        this.age = age;
        this.address = address;
        this.phoneNo = phoneNo;
        this.gender = gender;
    }
    public String getFname(){
        return FName;
    }
    public String getMname(){
        return MName;
    }
    public String getSname(){
        return SName;
    }
    public String getBirthDate(){
        return birthdate;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNo(){
        return phoneNo;
    }
    public String getGender(){
        return gender;
    }
}
