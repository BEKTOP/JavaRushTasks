package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a>=b && b>=c) System.out.println(a+" "+b+" "+c);
        if (a>=c && c>b) System.out.println(a+" "+c+" "+b);
        if (b>=a && a>=c) System.out.println(b+" "+a+" "+c);
        if (b>=c && c>a) System.out.println(b+" "+c+" "+a);
        if (c>=b && b>=a) System.out.println(c+" "+b+" "+a);
        if (c>=a && a>b) System.out.println(c+" "+a+" "+b);


/*        int[] mas = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            mas[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0; j < mas.length; j++) {
            for (int i = j + 1; i < mas.length; i++) {
                if (mas[j] < mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
            System.out.print(mas[j] + " ");
        }*/


    }
}
