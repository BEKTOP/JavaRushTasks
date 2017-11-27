package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int size=Integer.MAX_VALUE;
        ArrayList<String> strings= new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length()<size) size=strings.get(i).length();
        }
        for (String arr2:strings){
            if (arr2.length()==size) System.out.println(arr2);
        }
    }
}
