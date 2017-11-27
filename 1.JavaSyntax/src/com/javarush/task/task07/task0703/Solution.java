package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] leng = new int[10];
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10 ; i++) {
            array[i]=reader.readLine();
            leng[i]=array[i].length();

        }
        for (int i = 0; i <leng.length ; i++) {
            System.out.println(leng[i]);
        }

    }


}
