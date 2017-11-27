package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int j=1;
        while (j<=10){
            int i=1;
            while (i<10) {

                System.out.print(i*j+" ");
                i++;
            }
            System.out.print(i*j+"\n");
            j++;
        }

    }
}
