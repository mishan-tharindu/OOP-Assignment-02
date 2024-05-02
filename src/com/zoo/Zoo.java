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

    public void walkAllAnimals(){
        for (Animal ani : animals){
            ani.walk();
        }
    }

    public void swimAllAnimals(){
        for (Animal ani : animals){
            ani.fly();
        }
    }
    public void flyAllAnimals(){
        for (Animal ani : animals){
            ani.fly();
        }
    }


//    public void getAnimalCategory(){
//        for (Animal ani : animals){
//            String[] animalCategory = ani.getAnimalCategoryArray();
//            for (int i = 0; i < animalCategory.length; i++){
////                String s = animalCategory[i];
//                System.out.println(ani.getClass().getSimpleName());
////                ani.swim();
//                System.out.println("Animal Category :: "+animalCategory[i]);
//            }
//
//        }
//    }

}
