package com.pluralsight;

import java.util.Scanner;

public class FullNameParserPractice{

    static Scanner scanner = new Scanner(System.in); // 👈 global/class-level Scanner

    public static void main(String[] args) {
        String userInput = askingQuestion();
        logic(userInput);
    }

    public static String askingQuestion() {
        String fullName;

        while (true) {
            System.out.println("Please enter your name (format: first last OR first middle last):");
            fullName = scanner.nextLine().trim();

            String[] nameParts = fullName.split(" ");

            if (nameParts.length == 2 || nameParts.length == 3) {
                return fullName;
            } else {
                System.out.println("Invalid format. Try again.");
            }
        }
    }

    public static void logic(String fullName) {
        String[] nameParts = fullName.split(" ");

        String firstName = nameParts[0];
        String middleName = "(none)";
        String lastName;

        if (nameParts.length == 2) {
            lastName = nameParts[1];
        } else {
            middleName = nameParts[1].substring(0, 1).toUpperCase() + ".";
            lastName = nameParts[2];
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
