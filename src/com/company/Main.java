package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.Collections;
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
        Phone xiaomi = new Phone("xiaomi", "11G", 2011, 8) ;
        Phone iphone = new Phone("iphone", "XS", 2015, 16) ;
        Diesel fiat = new Diesel("Fiat", "seicento", 1989);
        Electric etron = new Electric("etron", "GT", 2020);
        LPG toyota = new LPG("toyota", "corolla", 1997);
        Phone sonyA = new Phone("sony", "AX", 2006, 16) {
        };

        System.out.println("model: " + fiat.model);
        System.out.println("producent: " + fiat.producer);
        System.out.println(fiat);
        System.out.println(fiat.getAge());
        System.out.println(fiat.petrol);
        fiat.Refuel();
        System.out.println(fiat.petrol + "auto zatankowane");
        System.out.println(etron.charge);
        etron.Refuel();
        System.out.println(etron.charge + "auto naładowane");
        System.out.println(toyota.gas);
        toyota.Refuel();
        System.out.println(toyota.gas + "auto zatankowane LPG");

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
        Pet cat = new Pet("felis");

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 10000.0;
        me.car = fiat;

        fiat.sale(me, brotherInLaw, 8000.0);

        xiaomi.installAnApp(Collections.singletonList("WhatsApp"));
        iphone.installAnApp("youtube", "last_stable");
        List<String> apps = new ArrayList<>();
        apps.add("facebook");
        apps.add("gmail");
        apps.add("WhatsApp");
        xiaomi.installAnApp(apps);
    }

}

