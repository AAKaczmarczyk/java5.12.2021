package com.company.devices;

public class Device {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public String colour;

    public Device(String producer, String model, Integer yearOfProduction, Integer ramSize) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
    }

    public String toString() {
        return "Producent: " + this.producer + ", model: ," + this.model + ", rok produkcji: " + this.yearOfProduction;
    }
}

