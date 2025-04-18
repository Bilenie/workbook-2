package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationsApp {


    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        //prompt user for full name, the date of the show (MM/dd/yyyy), and number of tickets need
        boolean gettingName = true;
        String fullName= "";
        while(gettingName){
            System.out.println("Enter your full name :");
            fullName = myScanner.nextLine().trim();
            //Take the response and do if statement on it
            //name should be swapped (last name first and first name second)

            String[] fullNameSplit = fullName.split(" ");

            if (fullNameSplit.length == 2) {
                //store the split pieces in a variable
                String first = fullNameSplit[0];
                String last = fullNameSplit[1];

                fullName = last + ", " + first;
                gettingName = false;
            } else {
                System.out.println("Invalid input please try again!");
            }
        }

        String dateReserved =""; //later parse to local date


        // Validation for the date if response is not valid. got this from ChatGpt/try & catch
//        if (!dateReserved.matches("\\d{2}/\\d{2}/\\d{4}")) {
//            System.out.println("Invalid date format. Please use MM/dd/yyyy like 05/13/2023.");
//
//        }

        boolean gettingDate = true;
        while(gettingDate){
            System.out.println("Enter the date (MM/dd/yyyy):");
            //try to run the code and 55
            try{
                dateReserved = myScanner.nextLine().trim();
                DateTimeFormatter formatOfDateReserveInput = DateTimeFormatter.ofPattern("MM/dd/yyy");
                LocalDate dateReservedConverted = LocalDate.parse(dateReserved, formatOfDateReserveInput);
            }
            catch(Exception e){
                System.out.println("Invalid input please try again!");
                continue;
            }
            gettingDate = false;
        }
        System.out.println("Enter how many ticket(s) you want :");
        int ticketNumber = myScanner.nextInt();

        //Another way of doing it String ticketString = (ticketNumber == 1) ? "1 ticket" : ticketNumber + " tickets";

        String ticketString;
        if (ticketNumber == 1) {
            ticketString = "1 ticket";
        }
        else if (ticketNumber == 0) {
            ticketString = "not valid number";
        }
        else {
            ticketString = ticketNumber + " tickets";
        }

        //display confirmation message (ticket "reserved for",date,"under" , name)
        // the date at the print should be in the default format(YYYY- MM-DD)
        System.out.println(ticketString + " reserved for " + dateReserved + " under " + fullName);

    }
}
