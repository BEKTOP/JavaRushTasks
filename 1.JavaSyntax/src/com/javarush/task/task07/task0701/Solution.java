package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] intList = new int[20];
        for (int i = 0; i < intList.length; i++){
            intList[i] = Integer.parseInt(reader.readLine());
            }
        return intList;
    }

    public static int max(int[] array) {
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if (max<array[i])max=array[i];
        }
        // найди максимальное значение
        return max;
    }
}
