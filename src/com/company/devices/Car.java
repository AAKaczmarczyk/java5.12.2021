package com.company.devices;

public class Car extends Device{

    Double engineVolume;
    String plates;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.9;
    }
    public String toString(){
        return "Producent: "+ this.producer + ", model: ,"+ this.model + ", rok produkcji: " + this.yearOfProduction;
    }
}
