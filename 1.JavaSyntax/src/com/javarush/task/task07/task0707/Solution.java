package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList();
       list.add("sdfsdf");
       list.add("gfghfg");
       list.add("sdfghfgfsdf");
       list.add("sdfgfgfhfgfsdf");
       list.add("sdffghfgfgsdf");

        System.out.println(list.size());
        for (int i = 0; i <5 ; i++) {
            System.out.println(list.get(i));
        }


    }
}
