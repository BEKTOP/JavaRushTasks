package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> resalt = new HashSet<Dog>();
        //напишите тут ваш код
        resalt.add(new Dog());
        resalt.add(new Dog());
        resalt.add(new Dog());

        return resalt;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> resalto = new HashSet<Object>();

        resalto.addAll(cats);
        resalto.addAll(dogs);

        return resalto;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object p : pets){
            System.out.println(p);
        }
       // System.out.println(" ");
    }
    public static class Cat{

    }
    public static class Dog{

    }
    //напишите тут ваш код
}
