package com.company;

import com.company.Classes.Customer;
import com.company.Classes.Employee;
import com.company.Classes.Person;
import com.company.Classes.StaticMethods;

public class Main {

    public static void main(String[] args) {
        // write your code here


        //while
        StaticMethods.whileMethod(10);
        //do while
        StaticMethods.doWhileMethod(10);
        //for loop
        StaticMethods.forLoopMethod(10);
        //while sum
        StaticMethods.whileMethodSum(6);

        StaticMethods.forLoopMethodSum(6);

        StaticMethods.factorial(7);

        }





        /*
        Employee firstEmployee = new Employee();
        Customer firstCustomer = new Customer();
        Customer customer = new Customer("Cebu","09438114658",10001);
        Person firstUser = new Person();

        firstUser.setfName("Null");
        firstUser.setlName("Void");
        firstUser.setMidName('L');
        firstUser.setAge(26);

        firstEmployee.setfName("Aljon");
        firstEmployee.setlName("Llaguno");
        firstEmployee.setDepartment("Professional Services");
        firstEmployee.setPayGrade("Cass D");
        firstEmployee.setEmployeeID(9999);

        firstCustomer.setfName("Nico");
        firstCustomer.setlName("Palma");
        firstCustomer.setAddress("San Jose Talamban Panowayon Hot Babes Cebu");
        firstCustomer.setTelNumber("09438114658");
        firstCustomer.setCustomerID(11333);

        //Calling Constructor
        System.out.println(customer.getAddress() + " " + customer.getTelNumber() + " " + customer.getCustomerID());


        //Overide
        System.out.println(firstUser.IntroduceYourSelf(firstUser.getfName(),firstUser.getlName(),"just a Person"));
        System.out.println(firstCustomer.IntroduceYourSelf(firstCustomer.getfName(),firstCustomer.getlName(),"a Customer",30,"Home of the Packers"));
        System.out.println(firstEmployee.IntroduceYourSelf(firstEmployee.getfName(),firstEmployee.getlName(),"an Employee",26,"Talamban Cebu"));

        */

        /*
        System.out.println("First Name:\t" + firstEmployee.getfName());
        System.out.println("Last Name:\t"+ firstEmployee.getlName());
        System.out.println("Department:\t" + firstEmployee.getDepartment());
        System.out.println("Pay Grade:\t" + firstEmployee.getPayGrade());
        System.out.println("Employee ID:\t" + firstEmployee.getEmployeeID());
        System.out.println("-----------------------------");
        System.out.println("First Name:\t" + firstCustomer.getfName());
        System.out.println("Last Name:\t"+ firstCustomer.getlName());
        System.out.println("Address:\t" + firstCustomer.getAddress());
        System.out.println("Telephone #:\t" + firstCustomer.getTelNumber());
        System.out.println("Customer ID:\t" + firstCustomer.getCustomerID());
        */



        /*
        Person firstUser = new Person();
        Person secondUser = new Person();
        Person thirdUser = new Person();

        firstUser.setfName("Aljon");
        firstUser.setlName("Llaguno");
        firstUser.setMidName('L');
        firstUser.setAge(26);

        secondUser.setfName("Nico");
        secondUser.setlName("Palma");
        secondUser.setMidName('S');
        secondUser.setAge(70);

        thirdUser.setfName("Iro");
        thirdUser.setlName("Palma");
        thirdUser.setMidName('N');
        thirdUser.setAge(10);


        String firstname = firstUser.getfName();
        String lastname = firstUser.getlName();
        Character midname = firstUser.getMidName();
        int age = firstUser.getAge();

        String firstnameb = secondUser.getfName();
        String lastnameb = secondUser.getlName();
        Character midnameb = secondUser.getMidName();
        int ageb = secondUser.getAge();

        String firstnamec = thirdUser.getfName();
        String lastnamec = thirdUser.getlName();
        Character midnamec = thirdUser.getMidName();
        int agec = thirdUser.getAge();

        System.out.println("**********GOOD USER**********");
        System.out.println("" +
                "FIRST NAME:\t" + firstname + "" +
                "\nLAST NAME:\t" + lastname + "" +
                "\nMIDDLE INITIAL:\t" + midname + "" +
                "\nAGE:\t" + age + "\n");

        System.out.println("**********DRUG USER**********");
        System.out.println("" +
                "FIRST NAME:\t" + firstnameb + "" +
                "\nLAST NAME:\t" + lastnameb + "" +
                "\nMIDDLE INITIAL:\t" + midnameb + "" +
                "\nAGE:\t" + ageb + "\n");

        System.out.println("**********PALMA's DOG**********");
        System.out.println("" +
                "FIRST NAME:\t" + firstnamec + "" +
                "\nLAST NAME:\t" + lastnamec + "" +
                "\nMIDDLE INITIAL:\t" + midnamec + "" +
                "\nAGE:\t" + agec);
       */

    }
