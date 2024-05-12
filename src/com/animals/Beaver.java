package com.animals;

import com.categroy.ISwimmer;
import com.categroy.IWalker;

import java.util.ArrayList;

public class Beaver extends Animal implements IWalker, ISwimmer{


    public Beaver()
    {

    }


    public Beaver(String name, String[] animalCategory){
        super(name, animalCategory);
        System.out.println(name);
    }

    @Override
    public void eat() {
        System.out.println("Beaver Eat Fish !!!");
    }

    @Override
    public void drink() {
        System.out.println("Beaver Drinking !!!");
    }

    @Override
    public void walk() {
        System.out.println("Beaver walking !!!");
    }

    @Override
    public void swim() {
        System.out.println("Beaver swimming !!!");
    }


}
