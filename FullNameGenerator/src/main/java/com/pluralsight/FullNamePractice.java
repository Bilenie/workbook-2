package com.pluralsight;

import java.util.Scanner;

public class FullNamePractice {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your First Name : ");
        String firstName = myScanner.nextLine();
        System.out.println("Enter your Middle Name : ");
        String middleName = myScanner.nextLine();
        System.out.println("Enter your Last Name : ");
        String lastName = myScanner.nextLine();
        System.out.println("Enter your Suffix : ");
        String suffix = myScanner.nextLine();

        StringBuilder fullName = new StringBuilder();

       fullName.append(firstName);
       if(!middleName.isEmpty()){
           fullName.append(middleName);
       }
       fullName.append(lastName);
        if(!suffix.isEmpty()){
            fullName.append(suffix);
        }
        System.out.println(fullName);

    }
}
