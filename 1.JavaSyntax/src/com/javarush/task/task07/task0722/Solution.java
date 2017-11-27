package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();
        String s=reader.readLine();
        while (!s.equals("end")){arr.add(s);
            s=reader.readLine();};

            for (int i = 0; i <arr.size() ; i++) {
                System.out.println(arr.get(i));

        }
        //напишите тут ваш код
    }
}