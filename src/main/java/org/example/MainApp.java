package org.example;

public class MainApp {
    public static void main(String[] args) {

        //Create an object of the Email constructor
        Email mail1 = new Email("Harry", "Potter");

        //Set Mailbox Capacity
        mail1.setMailBoxCapacity(300);

        //Show all Info
        System.out.println(mail1.showInfo());

    }
}