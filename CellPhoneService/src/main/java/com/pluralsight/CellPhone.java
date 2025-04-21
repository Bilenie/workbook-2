package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //This is the constructor
    //In this case it is deciding the value for the properties.

  public CellPhone(){
    this.serialNumber = 0;
    this.model = "";
    this.carrier = "";
    this.phoneNumber = "";
    this.owner = "";
   }
   //The overloaded constructors EXERCISE 3 today class April 21
    public  CellPhone(int sn, String model,String carrier, String phoneNumber, String owner){
        this.serialNumber = sn;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;

    }
  //EXERCISE 3 today class April 21 end here

    //We are creating a method here

    //Function is to dial a phone number

    public void dial(String phoneNumber){

       System.out.println(this.getOwner() + "'s phone is calling" + phoneNumber);

    }



   //We right-click and generate a getter and setter. usually last.


    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
