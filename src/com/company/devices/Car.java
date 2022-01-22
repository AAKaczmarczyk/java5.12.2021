package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public class Car extends Device implements Saleable {

    Double engineVolume;
    String plates;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.engineVolume = 1.9;
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

    public String toString(){
        return "Producent: "+ this.producer + ", model: ,"+ this.model + ", rok produkcji: " + this.yearOfProduction;
    }
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price);{
            System.out.println("sorry, nie masz kasy");
        }else if (seller.car != this) {
            System.out.println("sorry, ale nie masz samochodu");
        }else {
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Udało się sprzedać autp za " + price + "pln");
        }
        }


}
