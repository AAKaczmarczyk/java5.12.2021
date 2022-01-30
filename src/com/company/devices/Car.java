package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

public abstract class Car extends Device implements Saleable {

    public Double engineVolume;
    public String plates;
    public Double value;
    public Double charge;
    public Double gas;
    public Double petrol;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.engineVolume = 1.9;
        this.plates = "GTC 5013";
        this.value = 1000.0 ;
        this.charge = 30.0;
        this.gas = 0.0;
        this.petrol = 0.0;
    }

    @Override
    public void turnOn() {
        System.out.println("przekręcam kluczyk w stacyjce");
        System.out.println("odpalam silnik");
        System.out.println("silnik chodzi");
    }

    @Override
    public boolean isTurnedOn() {
        return true;
    }

    public String toString() {
        return "Producent: " + this.producer + ", model: ," + this.model + ", rok produkcji: " + this.yearOfProduction;
    }

    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
                System.out.println("niestety, nie masz pieniędzy");
            }
             else if (seller.car != this) {
                System.out.println("odmowa, nie masz samochodu");
            } else {
                seller.cash += price;
                buyer.cash -= price;
                seller.car = null;
                buyer.car = this;
                System.out.println("Udało się sprzedać auto za: " + price + "pln");
            }
        }
    public abstract void Refuel();


    }
