package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) % 2 == 0)
                //if (Character.getNumericValue(s.charAt(i)) % 2 == 0)
                //if (number.charAt(i) % 2 == 0) even++; else odd++;
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + " " + "Odd: " + odd);

    }
}
