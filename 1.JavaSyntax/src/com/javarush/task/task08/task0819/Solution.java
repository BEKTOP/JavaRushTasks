package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код. step 3 - пункт 3
        Set<Cat> cats = createCats();
        printCats(cats);
        cats.remove(0);
    }

    public static Set<Cat> createCats()
    {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> set = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat element:cats)
        {
            System.out.println(element);
        }
    }

    // step 1 - пункт 1
    public static class Cat
    {
        public static String name;
        public Cat()
        {

        }
    }
}