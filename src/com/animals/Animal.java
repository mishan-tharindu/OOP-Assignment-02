package com.animals;

public abstract class Animal {

    private String animalCategory;

    Animal()
    {

    }

    Animal(String animalCategory){

        this.animalCategory = animalCategory;
    }

    public String getAnimalCategory() {
        return animalCategory;
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
