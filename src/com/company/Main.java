package com.company;

import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Phone xiaomi = new Phone("xiaomi", "11G", 2011, 8) ;
        Phone iphone = new Phone("iphone", "XS", 2015, 16) ;
        Diesel fiat = new Diesel("Fiat", "seicento", 1989);
        Electric etron = new Electric("etron", "GT", 2020);
        LPG toyota = new LPG("toyota", "corolla", 1997);
        Phone sonyA = new Phone("sony", "AX", 2006, 16) {
            @Override
            public void installAnApp(@NotNull List<String> appNames) {
                super.installAnApp(appNames);
            }
        };

        Human client  = new Human();
        Human broker = new Human();
        Human dealer = new Human();
        fiat.value = 1000.00;
        toyota.value = 10000.00;
        etron.value = 100000.00;
        client.firstName = "Zenon";
        client.lastName = "Kowalski";
        broker.firstName = "Edward";
        broker.lastName = "Nowicki";
        dealer.firstName = "Gerwazy";
        dealer.lastName = "Guz";
        client.cash = 900.00;
        broker.cash = 300000.00;
        dealer.cash = 10000000.00;
        System.out.println("Sprawdzam 1");
        client.addCar(fiat);
        client.addCar(toyota);
        System.out.println("Ilość pieniędzy klienta przed sprzedarzą = " + client.cash);
        System.out.println("Ilość pieniędzy pośrednika po kupnie = " + broker.cash);
        fiat.Sale(client, broker, 700.00);
        System.out.println("Ilość pieniędzy klienta po sprzedaży = " + client.cash);
        System.out.println("Ilość pieniędzy brokera po kupnie = " + broker.cash);
        System.out.println("Sprawdzam 2");
        toyota.Sale(client, broker, 9000.00);
        System.out.println("Sprawdzam 3");
        dealer.addCar(etron);
        dealer.addCar(etron);
        dealer.addCar(etron);
        etron.Sale(client, dealer, 1000000.00);
        System.out.println("Sprawdzam 4");
        client.carList();
        broker.carList();
        dealer.carList();
        System.out.println("Sprawdzam 5");
        System.out.println("Wartość samochodów w garazu u sprzedwcy aut: " + dealer.getGarageValue() + " zł");
        System.out.println("Wartość samochodów w garazu u klienta: " + client.getGarageValue() + " zł");
        System.out.println("Sprawdzam 6");
        System.out.println(dealer.hasFreeSpace());
        System.out.println(client.hasFreeSpace());
        System.out.println("Sprawdzam 7");
        System.out.println(dealer.hasCar(etron));
        System.out.println(client.hasCar(fiat));
        System.out.println("Sprawdzam 8");
        dealer.carList();
        dealer.deleteCar(etron);
        dealer.carList();
        System.out.println(dealer.hasFreeSpace());
        System.out.println("Sprawdzam 9");
        client.carList();
        client.addCar(etron);
        client.addCar(fiat);
        client.addCar(toyota);
        client.carList();
        client.sortCars();
        client.carList();



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
        System.out.println(me.getSalary());

        me.getSalary();

        me.feed();
        me.takeForAWalk();
        System.out.println(me.getSpecies());
        System.out.println(me.getWeight());
        System.out.println(me.getName());
        Pet cat = new Pet("felis");

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 10000.0;

        fiat.sale(me, brotherInLaw, 8000.0);

        xiaomi.installAnApp(Collections.singletonList("WhatsApp"));
        iphone.installAnApp("last_stable");
        List<String> apps = new ArrayList<>();
        apps.add("facebook");
        apps.add("gmail");
        apps.add("WhatsApp");
        xiaomi.installAnApp(apps);
    }

}

