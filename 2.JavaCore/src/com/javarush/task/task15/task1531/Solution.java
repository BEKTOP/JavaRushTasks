package com.javarush.task.task15.task1531;

import javax.management.StringValueExp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        BigDecimal m =  BigDecimal.valueOf(1);
        if (n<0) m=BigDecimal.valueOf(0);
        if (n<=150||n>0){
            for (int i = 1; i <=n ; i++) {
                m=m.multiply(BigDecimal.valueOf(i));
            }
        }

        return String.valueOf(m);
    }
}
