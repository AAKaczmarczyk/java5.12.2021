package com.company;

import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        Car fiat = new Car("Fiat", "seicento", 1989);
        Phone sonyA = new Phone("sony", "AX", 2006, 16);

        System.out.println("model: " + fiat.model);
        System.out.println("producent: " + fiat.producer);
        System.out.println(fiat);
        System.out.print(sonyA);

        System.out.print(sonyA.getRamSize());

        Human me = new Human();
        System.out.println(me.getSalary(600.00));

        me.getSalary(600.00);

        me.feed();
        me.takeForAWalk();
        System.out.println(me.species);
        System.out.println(me.weight);
        System.out.println(me.firstName);

        System.out.println(fiat.getAge());

        Animal cat = new Pet("felis");

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 10000.0;
        me.car = fiat;

        fiat.sale(me, brotherInLaw, 8000.0);
    }

}

