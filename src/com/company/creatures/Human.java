package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal{

    String firstName;
    String lastName;
    private Double salary;
    public Double cash;
    public Car car;
    public Phone mobile;
    public Animal pet;


    public Human(){
        super("homo sapiens");
        this.salary = 0.0;
        this.cash = 0.0;

    }



    public Double getSalary(double v){
        //sprawdzenie uprawnien
        //konwersje
        //pobranie danych z bazy
        //pobranie z cache
        //dodanie logow
        return salary;
    }

    public void setSalary(Double salary){
        //uprawnienia
        //zapisanie do bazy danych
        //przygotowanie dokumentow
        //logi zapisane
        this.salary = salary;
    }

}
