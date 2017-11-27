package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int a = Integer.parseInt(name);
        String name2 = reader.readLine();
        int b = Integer.parseInt(name2);
        String name3 = reader.readLine();
        int c = Integer.parseInt(name3);
        if (a+b<=c||a+c<=b||b+c<=a) System.out.println("Треугольник не существует.");
        else System.out.println("Треугольник существует.");

    }
}