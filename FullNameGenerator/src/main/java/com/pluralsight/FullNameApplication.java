package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //prompt the user to enter the parts of their name
        System.out.println("Enter your first name :");
        String firstName = myScanner.nextLine().trim();

        System.out.println("Enter your middle name (optional):");
        String middleName = myScanner.nextLine().trim();

        System.out.println("Enter your last name :");
        String lastName = myScanner.nextLine().trim();

        System.out.println("Enter your suffix (optional) :");
        String suffixName = myScanner.nextLine().trim();

        // Generate and print full name
        String fullName = generateFullName(firstName, middleName, lastName, suffixName);
        System.out.println("Full name: " + fullName);
    }

    /*Here create a method to call in the main to make things simple
    and free the main from bunch of codes.
     */
    public static String generateFullName(String first, String middle, String last, String suffix) {
       // Create a fullName variable starting with the first name, then add middle initial, last name, and suffix as needed.
        String fullName = first;
       // Add middle initial if available
        if (!middle.isEmpty()) {
            String middleInitial = middle.substring(0, 1).toUpperCase() + ".";
            fullName = fullName + " " + middleInitial;
        }

        // Add last name
        fullName = fullName + " " + last;

        // Add suffix with comma if available
        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }

        return fullName;
    }
}
//StringBuilder fullName = new StringBuilder();
//FullName.append(firstName); - kevin showed me this!
