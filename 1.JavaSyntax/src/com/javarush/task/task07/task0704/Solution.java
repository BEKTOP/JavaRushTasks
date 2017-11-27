package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr =new int[10];
        int temp;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <10 ; i++) {
            arr[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <5 ; i++) {
          temp=arr[i];
            arr[i]=arr[9-i];
            arr[9-i]=temp;
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(arr[i]);
        }
    }
}

