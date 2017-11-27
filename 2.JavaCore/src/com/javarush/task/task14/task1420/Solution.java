package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        try {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            if(a <= 0||b<=0) throw new Exception();
            for (int i = 1; i < (a < b ? a : b) + 1; i++) {
                if((a%i == 0) && (b%i == 0)) max = i;
            }
            System.out.println(max);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
