package com.animals;

public class Elephant extends Animal{


    public Elephant(String animalCategory) {
        super(animalCategory);
    }

    @Override
    void eat() {
        System.out.println("Elephant Eat Grass !!!");
    }

    @Override
    void drink() {
        System.out.println("Elephant Drink Water !!!");
    }
}
