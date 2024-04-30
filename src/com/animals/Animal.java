package com.animals;

public abstract class Animal {

    private String animalCategory;

    Animal(String animalCategory){
        this.animalCategory = animalCategory;
    }

    public String getAnimalCategory() {
        return animalCategory;
    }

    public void setAnimalCategory(String animalCategory) {
        this.animalCategory = animalCategory;
    }


    public static void wake(){
        System.out.println("Animals Wake !!!");
    }

    public static void sleep(){
        System.out.println("Animals Sleep !!!");
    }

    abstract void eat();

    abstract void drink();


}
