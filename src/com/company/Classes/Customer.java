package com.company.Classes;

/**
 * Created by JPMC-B2-PC15 on 17/02/2017.
 */
public class Customer extends Person {

    String address;
    String telNumber;
    int customerID;

    public Customer () {
    }

    //constructor
    public Customer (String address, String telNumber, int customerID) {
        this.address=address;
        this.telNumber=telNumber;
        this.customerID=customerID;
    }




    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    public String IntroduceYourSelf(String fname, String lname, String personType, int age, String address){
        return "Hello I'm "+ fname + " " + lname + " I am " + personType + " and I love Banana" + " and I'm " + age + " Years Old. I live in " + address;

    }



    //public void CurrentAge(int year, String intro){
        //return intro + " " + 2017-year;
    //}
}
