package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList <Integer> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(System.in);
            while (true) {
                list.add(sc.nextInt()); }
        } catch (Exception ex) {
            for (Integer i: list )
            { System.out.println(i); }
        }
    }
        //напишите тут ваш код
}
