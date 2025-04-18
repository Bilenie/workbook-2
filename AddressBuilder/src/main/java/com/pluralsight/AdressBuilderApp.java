package com.pluralsight;

import java.util.Scanner;

public class AdressBuilderApp {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //message for the users!
        System.out.println("Welcome!!! Please provide the following information:");

        //prompt the user to their information

        //Billing Information

        System.out.println("Enter your Full Name :");
        String fullName= myScanner.nextLine().trim();
        System.out.println("Enter your Billing Street:");
        String billingStreet = myScanner.nextLine().trim();
        System.out.println("Enter your Billing City:");
        String billingCity = myScanner.nextLine().trim();
        System.out.println("Enter your BillingState:");
        String billingState = myScanner.nextLine().trim();
        System.out.println("Enter your Billing Zip:");
        String billingZip = myScanner.nextLine().trim();

        //Shipping Information

        System.out.println("Enter your Shipping Street:");
        String shippingStreet= myScanner.nextLine().trim();
        System.out.println("Enter your Shipping City:");
        String shippingCity = myScanner.nextLine().trim();
        System.out.println("Enter your Shipping State:");
        String shippingState= myScanner.nextLine().trim();
        System.out.println("Enter your Shipping Zip:");
        String shippingZip= myScanner.nextLine().trim();


        StringBuilder addressInformation = new StringBuilder();

        addressInformation.append(fullName+ "\n");
        addressInformation.append("Billing Address:" + "\n");
        addressInformation.append(billingStreet+ "\n");
        addressInformation.append(billingCity);
        addressInformation.append(billingState);
        addressInformation.append(billingZip+ "\n");

        addressInformation.append("Billing Address:" + "\n");
        addressInformation.append(shippingStreet + "\n");
        addressInformation.append(shippingCity);
        addressInformation.append(shippingState);
        addressInformation.append(shippingZip);

        //Print out the information received
        System.out.println(addressInformation);

    }
}
