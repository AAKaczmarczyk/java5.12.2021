package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device{

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
    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
                System.out.println(buyer + "niestety, nie masz pieniędzy.");
            } else if (seller.hasCar(this)){
                System.out.println(seller + "odmowa, nie masz samochodu.");
            } else if(!buyer.hasFreeSpace()) {
                System.out.println(buyer + "niestety ale nie masz już miejsca w garażu.");
            } else {

                seller.cash += price;
                buyer.cash -= price;
                seller.deleteCar(this);
                buyer.addCar(this);
                System.out.println(seller + "Udało się sprzedać auto za: " + price + "pln");
            }
        }

    public abstract void Refuel();


    }
