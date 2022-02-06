package com.company.devices;

import com.company.creatures.Human;

public class Diesel extends Car{
    public Diesel(String producer, String model, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
    }
    @Override
    public void Refuel() {
        this.petrol = 25.0;
        System.out.println("Dolano paliwa do auta " + petrol + " litrów");
    }

    public void Sale(Human client, Human broker, double v) {
    }
}
