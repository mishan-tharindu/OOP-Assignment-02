package com.animals;

import com.categroy.IFlyer;
import com.categroy.ISwimmer;
import com.categroy.IWalker;

public class Duck extends Animal implements IWalker, ISwimmer, IFlyer{

    public Duck(){}

    public Duck(String name, String[] animaCategory){
        super(name, animaCategory);
        System.out.println(name);
    }

    @Override
    public void eat() {
        System.out.println("Duck Eating Fish!!!");
    }

    @Override
    public void drink() {
        System.out.println("Duck drinking!!!");
    }

    @Override
    public void fly() {
        System.out.println("Duck Flying!!!");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming!!!");
    }

    @Override
    public void walk() {
        System.out.println("Duck walking!!!");
    }
}
