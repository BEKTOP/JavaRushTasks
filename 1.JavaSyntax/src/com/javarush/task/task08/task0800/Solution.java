package com.javarush.task.task08.task0800;

/*
Набор кода
*/

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Solution {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Stop");
        set.add("Look");
        set.add("Listen");


        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}