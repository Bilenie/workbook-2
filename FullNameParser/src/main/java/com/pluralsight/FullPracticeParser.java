package com.pluralsight;

import java.util.Scanner;

public class FullPracticeParser {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            boolean tryAgain = true;
            while (tryAgain) {
                System.out.println("Enter Full Name : ");

                String fullNameAccepted = myScanner.nextLine();

                //take the input and do something with it.

                String[] fullName = fullNameAccepted.split(" ");


                if (fullName.length == 2) {
                    String firstName = fullName[0].trim().toUpperCase();
                    String lastName = fullName[1].trim().toUpperCase();

                    System.out.println(firstName + "\n" + lastName);

                    tryAgain = askAgain();

                } else if (fullName.length == 3) {
                    String firstName = fullName[0].trim().toUpperCase();
                    String middleName = fullName[1].trim().toUpperCase();
                    String lastName = fullName[2].trim().toUpperCase();

                    String middleInitalName = middleName.substring(0, 1).toUpperCase();

                    System.out.println(firstName + "\n" + middleInitalName + "\n" + lastName);
                    tryAgain = askAgain();
                } else {
                    System.out.println("Invalid Input please try again!");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input" + e.getMessage());
        }
    }

    //Method Ask if the user wants to try again

    public static boolean askAgain() {
        System.out.println("Would you want to type again?y/n");

        String choice = myScanner.nextLine();
        return choice.equalsIgnoreCase("Y");
    }
}


