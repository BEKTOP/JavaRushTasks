package com.javarush.task.task15.task1530;

/**
 * Created by Boss on 022 22.09.17.
 */
public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();

    }
}
