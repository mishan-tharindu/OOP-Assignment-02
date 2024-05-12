package com.zoo;

import com.animals.Animal;
import com.animals.Duck;
import com.animals.Elephant;
import com.categroy.IFlyer;
import com.categroy.ISwimmer;
import com.categroy.IWalker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

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
        for (Animal ani : animals) {

            try {
                ((IWalker) ani).walk();
            }catch (Exception e)
            {

            }


        }
    }

    public void flyAllAnimals(){
        for (Animal ani : animals) {

            try {
                ((IFlyer) ani).fly();
            }catch (Exception e)
            {

            }

        }
    }

    public void SwimAllAnimals(){
        for (Animal ani : animals) {
            try {
                ((ISwimmer) ani).swim();
            }catch (Exception e)
            {

            }
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


//    public void callWalkAllAnimals_Testing(){
//
//        ArrayList<String> interfaces = new ArrayList<String>();
//
//        for (Animal ani : animals){
////            ani.walk();
//            String animalCategory;
//
//            interfaces.add(Arrays.toString(ani.getClass().getInterfaces()).replaceAll("interface com.categroy.", ""));
////            System.out.println(ani.getClass().getInterfaces());
////            System.out.println(interfaces);
//            for (int i = 0; i < interfaces.size(); i++){
//                interfaces.get(i);
//                System.out.println(interfaces.get(i).toString());
//            }
//
//        }
////        System.out.println(interfaces);
//    }


//    public void walkAllAnimals_Testing_03(){
//
//
//
//        for (Animal ani : animals){
////            ani.walk();
//
////            Elephant el = (Elephant) ani;
//            ((IWalker) ani).walk();
//
//            ArrayList<String> interfaces = new ArrayList<String>();
//            Class<?>[] animalCategory = ani.getClass().getInterfaces();
//            String isWalker;
//            String animalType;
//
//
//
//            interfaces.add(Arrays.toString(ani.getClass().getInterfaces()).replaceAll("interface com.categroy.", ""));
////            interfaces.add(ani.getClass().getInterfaces().toString().replaceAll("interface com.categroy.", ""));
////            System.out.println(ani.getClass().getSimpleName());
//            animalType = ani.getClass().getSimpleName();
//
//            for (int i = 0; i < animalCategory.length; i++){
//                System.out.println(animalCategory[i].toString().replaceAll("interface com.categroy.", ""));
//
//                if(animalCategory[i].toString().replaceAll("interface com.categroy.", "").equals("IWalker")){
//                    System.out.println("This Animal can Walk !!!");
//                    try {
//                        Object ab = (Class.forName(ani.getClass().toString())); new Object();
////                        ab.walk();
//
//                    }catch (Exception e) {
//
//                    }
//                }
//
//            }
//
//
//
//        }
////        System.out.println(interfaces);
////        System.out.println(interfaces.size());
//    }




}
