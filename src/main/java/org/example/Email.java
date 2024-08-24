package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10 ;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "hogwarts.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        //Instead of defining variables directly
        this.firstName = firstName;
        this.lastName = lastName;

        //Call a method asking for the department, which will return the department
        this.department = setDepartment();


        ///call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate email id
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

    }

    //Ask for the department as a method
    private  String setDepartment (){
        //Ask for user input for the department name
        System.out.println("New Employee: " + firstName + " " + lastName + " ." +
                "\nDepartment Codes" +
                "\n1 For Sales " +
                "\n2 For Development" +
                "\n3 For Accounting" +
                "\n0 For Nothing" +
                "\nSelect Department Codes: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1){ return  "sales";}
        else if (departmentChoice == 2){return  "dev";}
        else if (departmentChoice == 3) {return "accounting";}
        else {return "";}
    }

    //Generate a random password
    private String randomPassword(int length) {
        //Characters to choose from
        String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%&";
        char [] password = new char[length];
        for (int i =0; i<length; i++) {
           int randomValue = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(randomValue);

        }
        return new String(password);
    }

    //Set email box capacity
    public void setMailBoxCapacity (int capacity){
        this.mailBoxCapacity = capacity;
        //System.out.println("Your mailbox capacity is " + capacity);
    }

    //Set alternate email
    public  void setAlternateEmail (String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
    public  void changePassword (String password){
        this.password = password;
        //System.out.println("Your New password is : " + password);
    }

    //show mailbox capacity
    public int getMailBoxCapacity () {
        return mailBoxCapacity;
    }

    public String getAlternateEmail (){
        return alternateEmail;
    }

    public String getPassword (){
        return  password;
    }

    //Method to return all the information: Name, email, mailbox Capacity
    public String showInfo() {
        return "Display Name: " + firstName +" " + lastName +
                "\nCompany Email: " + email +
                "\nMail-Box Capacity: " + mailBoxCapacity + " MB.";
    }
}
