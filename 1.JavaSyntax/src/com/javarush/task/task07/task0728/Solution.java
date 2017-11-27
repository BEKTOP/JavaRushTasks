package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
В убывающем порядке
*/



    public class Solution {public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine()); }

        sort(array);
    }

        public static void sort(int[] array) {
            int t;
            int N = array.length;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++)
                    if (array[j] > array[i]) { t = array[i]; array[i] = array[j]; array[j] = t; }
            }
            for (int x : array) { System.out.println(x); }}}
