package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k=0, m[] = new int[3];

       for (int i=0;i<m.length;i++) {
           m[i] = Integer.parseInt(reader.readLine());
           if (m[i] > 0) k++;
       }
        System.out.println(k);
    }
}
