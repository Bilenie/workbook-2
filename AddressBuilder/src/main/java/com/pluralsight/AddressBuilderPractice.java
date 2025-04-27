package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderPractice {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create list of Questions to ask
        String[] questions = {
                "Full Name: ",
                "Billing Street: ",
                "Billing City: ",
                "Billing State: ",
                "Billing Zip: ",
                "Shipping Street: ",
                "Shipping City: ",
                "Shipping State: ",
                "Shipping Zip: "
        };

        // Create empty Array to store answers
        String[] answers = new String[questions.length];// set the limit of the answer to the question

        // Ask each question and store answer
        System.out.println("Please provide the following information:");
        for (int i = 0; i < questions.length; i++) {
            System.out.print(questions[i]);
            answers[i] = getAnswer();
        }

        // Build the address information
        StringBuilder addressInformation = new StringBuilder();
        addressInformation.append(answers[0]).append("\n\n");
        addressInformation.append("Billing Address:\n");
        addressInformation.append(answers[1]).append("\n");
        addressInformation.append(answers[2]).append(", ").append(answers[3]).append(" ").append(answers[4]).append("\n\n");
        addressInformation.append("Shipping Address:\n");
        addressInformation.append(answers[5]).append("\n");
        addressInformation.append(answers[6]).append(", ").append(answers[7]).append(" ").append(answers[8]);

        // Display
        System.out.println("\n" + addressInformation.toString());//convert the object addressInformation to string .
    }

    // Method to get input
    public static String getAnswer() {
        return myScanner.nextLine().trim();
    }
}
