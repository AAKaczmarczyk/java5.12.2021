package com.company.devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
    }
    @Override
    public void Refuel() {
        this.petrol = 25.0;
        System.out.println("Dolano paliwa do auta " + petrol + " litrów");
    }
}
