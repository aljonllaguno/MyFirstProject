package com.company.Classes;

/**
 * Created by JPMC-B2-PC15 on 17/02/2017.
 */
public class Employee extends Customer {

    String department;
    String payGrade;
    int employeeID;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }


    public String IntroduceYourSelf(String fname, String lname, String personType, int age, String address){
        return "Hello I'm "+ fname + " " + lname + " I am " + personType + " and I love Chicks" + " and I'm " + age + " years old. I live in " + address;


    }

}
