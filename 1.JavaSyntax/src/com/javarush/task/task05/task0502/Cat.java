package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        boolean winner = false;
        winner = this.strength > anotherCat.strength && this.weight > anotherCat.weight ? true: false;
        return winner;
    }

    public static void main(String[] args) {

    }
}
