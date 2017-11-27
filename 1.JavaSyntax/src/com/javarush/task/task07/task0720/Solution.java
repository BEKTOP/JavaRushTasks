package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <N ; i++) {
            arr.add(reader.readLine());
        }
        arr.addAll( arr.subList(0, M) ); arr.subList(0,M).clear();



        for (int i = 0; i <N ; i++) {
            System.out.println(arr.get(i));
        }
        //напишите тут ваш код
    }
}
