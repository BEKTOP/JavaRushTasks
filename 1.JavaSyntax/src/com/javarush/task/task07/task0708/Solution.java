package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int size=0;
        strings= new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            strings.add(reader.readLine());
            if (strings.get(i).length()>size) size=strings.get(i).length();
            }

        for (String arr2:strings){
            if (arr2.length()==size) System.out.println(arr2);
        }
    }
}
