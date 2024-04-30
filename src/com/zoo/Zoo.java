package com.zoo;

import com.animals.Animal;

import java.util.ArrayList;

public class Zoo {


     public ArrayList<Animal> animals = new ArrayList<>();


    public void createAnimal(Object animal){
        Animal ani = (Animal) animal;
        animals.add(ani);
    }

    public void sleepAllAnimals(){
        for (Animal ani : animals){
            ani.sleep();
        }
    }

    public void wakeAllAnimals(){
        for (Animal ani : animals){
            ani.wake();
        }
    }

    public void feedAllAnimals(){
        for (Animal ani : animals){
            ani.eat();
        }
    }

    public void drinkAllAnimals(){
        for (Animal ani : animals){
            ani.drink();
        }
    }

}
