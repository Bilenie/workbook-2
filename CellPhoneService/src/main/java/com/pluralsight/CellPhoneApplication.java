package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner  myScanner = new Scanner (System.in);

    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone();

        System.out.println("What is the serial number");//we are going to pars it to int later.
        String  sn = myScanner.nextLine();

        System.out.println("What model is the phone");
        String  model = myScanner.nextLine();

        System.out.println("Who is the carrier");
        String  carrier = myScanner.nextLine();

        System.out.println("What is the phone number");
        String  phoneNumber = myScanner.nextLine();

        System.out.println("Who is the owner of the phone");
        String  owner = myScanner.nextLine();

        //set the cellphone data on the object

        myPhone.setSerialNumber( Integer.parseInt(sn));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        //use the getters to display this information

//        System.out.println("The SN is :" +  myPhone.getSerialNumber());
//        System.out.println("The Model is :" +  myPhone.getModel());
//        System.out.println("The Carrier is :" +  myPhone.getCarrier());
//        System.out.println("The Phone Number is :" +  myPhone.getPhoneNumber());
//        System.out.println("The Owner is :" +  myPhone.getOwner());


        //create my new phone called myPhone2.

        CellPhone myPhone2 = new CellPhone();

        myPhone2.setPhoneNumber("466-554-6464");
        myPhone2.setOwner("Eric :-)");


        //use the display method instead.The argument passed can be myPhone or myPhone2.
        display(myPhone);

        System.out.println("----------------My second phone-------------");

        display(myPhone2);

        myPhone.dial(myPhone2.getPhoneNumber());

        myPhone2.dial(myPhone.getPhoneNumber());

    }
    //create a method here.Knowes how to display information for a phone
    static void display(CellPhone myPhone2 ){
        System.out.println("The SN is :" +  myPhone2.getSerialNumber());
        System.out.println("The Model is :" +  myPhone2.getModel());
        System.out.println("The Carrier is :" +  myPhone2.getCarrier());
        System.out.println("The Phone Number is :" +  myPhone2.getPhoneNumber());
        System.out.println("The Owner is :" +  myPhone2.getOwner());
    }

}
