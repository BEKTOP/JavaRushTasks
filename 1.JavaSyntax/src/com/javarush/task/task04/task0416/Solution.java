package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        double i = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());

        int k=(int)i/5;
        i=i-k*5;
        if (i>=0&&i<3) System.out.println("зелёный");
        if (i>=3&&i<4) System.out.println("жёлтый");
        if (i>=4&&i<5) System.out.println("красный");

    }
}