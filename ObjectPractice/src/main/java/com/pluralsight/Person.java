package com.pluralsight;

public class Person {

    //I set properties for to describe my class.
    private String firstName;
    private String lastName;
    private String ssn;
    private int age;
    private int health;

    //Constructor - tell it what I need or to create instance (Special method on class,name match class).
    //I need all the things below (requirments) to help me make a person or my application.
    public Person(String firstName, String lastName, String ssn, int age, int health) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.age = age;
        this.health = health;
    }


    //My method write here. It is things that my class/app can do.

    public void goToWork() {
        this.health -= 10;


    }

    public void goToSleep() {
        this.health += 10;

    }

    public void sayHello() {
        System.out.println("\nHello");
    }

    public void introduceName() {
        System.out.printf("I'm %s , What is your name?", firstName);
    }

    public void introduceName2() {
        System.out.printf("I'm %s , nice to meet you!", firstName);
    }

    // Generate getter (get the function)  and setter( change the value by passing arguments) here.

    public String getFirstName() {
        String formatFirstName = "\n" + firstName;
        return formatFirstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        String formatLastName = "\n" + lastName;
        return formatLastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
