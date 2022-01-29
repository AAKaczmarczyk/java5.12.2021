package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Animal dog = new Animal("canis") {
            @Override
            public void feed() {

            }

            @Override
            public void test() {

            }


        };
        Car fiat = new Car("Fiat", "seicento", 1989);
        Phone sonyA = new Phone("sony", "AX", 2006, 16);
        Phone xiaomi = new Phone("xiaomi", "o1", 2009, 8);
        Phone iphone = new Phone("iphone", "x12", 2015, 16);

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
        System.out.println(me.getSpecies());
        System.out.println(me.getWeight());
        System.out.println(me.getName());

        System.out.println(fiat.getAge());

        Pet cat = new Pet("felis");

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 10000.0;
        me.car = fiat;

        fiat.sale(me, brotherInLaw, 8000.0);

        iphone.installAnApp("messenger");
        iphone.installAnApp("youtube", "last_stable");

        List<String> apps = new ArrayList<>();
        apps.add("fb");
        apps.add("gmail");
        apps.add("tiktok");
        xiaomi.installAnApp(apps);
    }

}

