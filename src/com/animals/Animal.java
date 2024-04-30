package com.animals;

import com.categroy.IFlyer;
import com.categroy.ISwimmer;
import com.categroy.IWalker;

import java.util.ArrayList;

public abstract class Animal {

    private ArrayList<String> animalCategory;
    private String name;

    private String[] animalCategoryStringArray;
//    private String animalCategoryString;

    Animal()
    {

    }

//    Animal(String animalCategory){
//        this.animalCategoryString = animalCategory;
//    }

    Animal(String name ,String[] animalCategory){
        this.animalCategoryStringArray = animalCategory;
        this.name = name;
    }

//    public ArrayList<String> getAnimalCategory() {
//        return animalCategory;
//    }

    public String[] getAnimalCategoryArray(){

        return animalCategoryStringArray;
    }
    public String getAnimalName(){
        return name;
    }



    public static void wake(){
        System.out.println("Animals Wake !!!");
    }

    public static void sleep(){
        System.out.println("Animals Sleep !!!");
    }

    public abstract void eat();

    public abstract void drink();


}
