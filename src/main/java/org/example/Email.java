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
    private int mailBoxCapacity;
    private String alternateEmail;
    private String companySuffix = "hogwarts.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        //Instead of defining variables directly
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department, which will return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        ///call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //combine elements to generate email id
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Tour email is: " + email);
    }

    //Ask for the department as a method
    private  String setDepartment (){
        //Ask for user input for the department name
        System.out.print("Department Codes\n1 For Sales \n2 For Development\n3 For Accounting\n0 For Nothing\nEnter Department Codes: ");
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
           System.out.println(randomValue);
           System.out.println(passwordSet.charAt(randomValue));
        }
        return new String(password);
    }


    //Set email box capacity

    //Set alternate email

    //Change the password
}
