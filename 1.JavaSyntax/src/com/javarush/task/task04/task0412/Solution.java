package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        int n = Integer.parseInt(name1);
        if (n>0) n=n*2;
        if (n<0) n=n+1;
        if (n==0) n=0;


            System.out.println(n);
        }
    }

