package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        /*Wrapped the if/else logic inside a while loop to continuously prompt the user
        until they enter a valid name format (either first & last OR first, middle & last).*/

        while(true) {

            //prompts the user to enter a name in two kind of formating options.
            System.out.println("Enter your first name => use this format (first last or first middle last):");
            //store the answer in a string variable and trim the name using trim()
            String fullName = myScanner.nextLine().trim();


            //parse the name and print pieces information by using split()

            String[] fullNameSplit = fullName.split(" ");

            if (fullNameSplit.length == 2) {


                //store the split pieces in a variable

                String first = fullNameSplit[0];
                String last = fullNameSplit[1];

                //print first & last name if the condition is true.

                System.out.println("First name: " + first);
                System.out.println("Middle name: (none)");
                System.out.println("Last name: " + last);

                break;
            } else if (fullNameSplit.length == 3) {

                //store the split pieces in a variable

                String first = fullNameSplit[0];
                String middle = fullNameSplit[1];
                String last = fullNameSplit[2];

                // Convert middle name to capital initial + "."
                String middleInitial = middle.substring(0, 1).toUpperCase() + ".";

                //print first & last name if the condition is true.

                System.out.println("First name: " + first);
                System.out.println("Middle name:" + middleInitial);
                System.out.println("Last name: " + last);
                break;

            } else {
                System.out.println("please provide valid answer");
            }
        }

    }
}
