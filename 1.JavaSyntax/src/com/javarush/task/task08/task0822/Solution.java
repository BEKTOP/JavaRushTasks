package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <array.size() ; i++) {
            min = Math.min(min,array.get(i));
        }
        return min;

    }

    public static List<Integer> getIntegerList() throws IOException {
        ArrayList array = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(reader.readLine());
            array.add(a);
        }
        return array;
    }

}