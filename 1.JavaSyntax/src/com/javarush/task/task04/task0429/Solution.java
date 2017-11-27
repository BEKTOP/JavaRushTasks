package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int p=0,o=0, m[] = new int[3];

        for (int i=0;i<m.length;i++) {
            m[i] = Integer.parseInt(reader.readLine());
            if (m[i] > 0) p++;
            if (m[i] < 0) o++;
        }
        System.out.println("количество отрицательных чисел: "+o);
        System.out.println("количество положительных чисел: "+p);
    }
}

