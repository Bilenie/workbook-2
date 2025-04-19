package com.pluralsight;

public class PersonApp {

    public static void main(String[] args) {
        //let us use our person class to create a person.

        //Creating an object called bilenie that do the function from Person class.

        Person bilenie = new Person("Bilenie", "Tilahun", ("455-54-6565"), 29, 50);

        bilenie.sayHello();
        bilenie.introduceName();

        System.out.println(bilenie.getFirstName());
        System.out.println(bilenie.getLastName());

        //Creating another object in this case another person called billy that do the function Person class.

        Person billy = new Person("Billy", "Mekbib", ("455-54-8965"), 29, 60);

        billy.sayHello();
        billy.introduceName2();

        System.out.println(billy.getFirstName());
        System.out.println(billy.getLastName());

    }

}
