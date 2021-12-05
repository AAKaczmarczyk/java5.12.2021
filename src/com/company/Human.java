package com.company;

public class Human extends Animal{

    String fisrtName;
    String lastName;
    private Double salary;

    public Human(String species){
        super("homo sapiens");
        this.salary = 0.0;
    }

    public Double getSalary(){
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
