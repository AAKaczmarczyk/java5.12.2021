package com.company.devices;

public class Electric extends Car{
    public Electric(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void Refuel() {
        this.charge = 140.0;
    System.out.println("Doładowano auto, moc: " + charge + "kWh");
    }
}