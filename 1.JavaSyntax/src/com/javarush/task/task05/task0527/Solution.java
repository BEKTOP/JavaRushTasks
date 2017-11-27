package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse heyMouse = new Mouse("Jerry", 12, 5);
        Mouse MouseThree = new Mouse("Jerry", 12, 5);
        Dog DanyDog = new Dog("Jerry", 12, 5);
        Dog BanyDog = new Dog("Jerry", 12, 5);
        Dog JonyDog = new Dog("Jerry", 12, 5);
        Cat TomCat  = new Cat("Jerry", 12, 5);
        Cat ZoluhaCat  = new Cat("Jerry", 12, 5);
        Cat EvaCat  = new Cat("Jerry", 12, 5);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }




    }

    //напишите тут ваш код
}
