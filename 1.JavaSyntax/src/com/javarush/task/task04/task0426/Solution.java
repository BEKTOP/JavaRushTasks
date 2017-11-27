package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String p ="положительное";
        String n ="нечетное";
        String m ="";

        if (a<0) p = "отрицательное";
        if (a%2==0) n = "четное";
        m = p+" "+n+" число";
        if (a==0)m="ноль";

        System.out.println(m);
    }
}
