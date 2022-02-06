package com.company.devices;

import com.company.creatures.Human;

public class LPG extends Car{
    public LPG(String producer, String model, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
    }
    @Override
    public void Refuel() {
        this.gas = 50.0;
        System.out.println("Zatankowano gaz w aucie " + gas + "dm3");
    }

    public void Sale(Human client, Human broker, double v) {
    }
}
