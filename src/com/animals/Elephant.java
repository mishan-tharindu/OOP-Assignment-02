package com.animals;

import com.categroy.IWalker;

public class Elephant extends Animal{


    public Elephant(String name, String[] animalCategory) {
        super(name, animalCategory);
        System.out.println(name);
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
        System.out.println("Elephant Walking !!!");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
