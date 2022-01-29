package com.company.creatures;

import com.company.Saleable;

public abstract class Animal implements Saleable, Feedable {
    final static Double DEFAULT_CAT_WEIGHT = 2.0;
    public static final double DEFAULT_DOG_WEIGHT = 10.0;
    private static final Double DEFAULT_WEIGHT = 1.0;
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;
    final String species;
    Double weight;
    public String name;
    Boolean isAlive;
    Boolean feed;

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        if(this.species.equals("canis")){
            this.weight = DEFAULT_DOG_WEIGHT;

        } else if (this.species.equals("felis")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }

    }

    public String getSpecies() { return species; }

    public Double getWeight() { return weight; }

    public String getName() { return name; }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("thx for food bro");
        } else {
            System.out.println("too late, sorry");
        }
    }
    protected abstract void test();

    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight -= 1;
            System.out.println("nice walk :D");
            if (this.weight <= 0) {
                this.isAlive = false;
            }
        } else {
            System.out.println("POLICE HALO THERE IS SOME DEAD DOG!");
        }
        }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        System.out.println("już zaraz to zrobimy");
    }

}

