package com.animals;

public class Elephant extends Animal implements Walker{


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

    @Override
    public void walk() {
        System.out.println("Elephant Walking");
    }
}
