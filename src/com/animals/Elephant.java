package com.animals;

public class Elephant extends Animal{


    public Elephant(String animalCategory) {
        super(animalCategory);
    }

    @Override
    public void eat() {
        System.out.println("Elephant Eat Grass !!!");
    }

    @Override
    public void drink() {
        System.out.println("Elephant Drink Water !!!");
    }
}
