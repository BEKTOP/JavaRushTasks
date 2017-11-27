package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int j=0;
        double s=0;
        for (int i=0; ; )
        { i = Integer.parseInt(reader.readLine());
            if (i==-1){ break; }
            else
            j++;
            s+=i;


        }

        System.out.println(s/j);

    }
}

