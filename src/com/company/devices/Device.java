package com.company.devices;

import com.company.Human;
import com.company.Saleable;

abstract public class Device implements Saleable {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;


    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;

    }

    public Integer getAge(){
        return 2021 - yearOfProduction;
    }
    abstract public void turnOn();
    abstract public boolean isTurnedOn();

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("już zaraz to zrobimy");
    }
}

