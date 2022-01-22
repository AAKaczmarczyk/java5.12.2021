package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{

     public FarmAnimal(String species) {super (species); }

     @Override
     public void beEaten() {
         this.isAlive = false;
         this.weight = 0.0;
         System.out.println(this.species + " was eaten");
     }
 }

