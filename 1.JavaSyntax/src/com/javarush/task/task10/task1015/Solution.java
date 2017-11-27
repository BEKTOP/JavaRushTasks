package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] ar = new ArrayList[3];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = new ArrayList();
            for (int j = 0; j < 5; j++) {
                ar[i].add("txt"+j);
            }
        } return ar;


    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
           /* for (String s:list) result.put(s, Collections.frequency(list, s));*/

        }
    }
}