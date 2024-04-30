package com.zoo;

import com.animals.Animal;

import java.util.ArrayList;

public class Zoo {


     public ArrayList<Animal> animals = new ArrayList<>();


    public void createAnimal(Object animal){

        Animal ani = (Animal) animal;
        animals.add(ani);
    }

}
