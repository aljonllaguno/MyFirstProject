package com.company.Classes;

/**
 * Created by JPMC-B2-PC15 on 17/02/2017.
 */
public class Person {

    String userName;
    Character midName;
    String email;
    String fName;
    String lName;
    String password;
    int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Character getMidName() {
        return midName;
    }

    public void setMidName(Character midName) {
        this.midName = midName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String IntroduceYourSelf(String fname, String lname, String personType){
        return "Hello I'm "+ fname + " " + lname + " I am " + personType;

    }
}
