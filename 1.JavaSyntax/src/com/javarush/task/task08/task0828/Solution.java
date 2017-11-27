package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        list.add(text.readLine());
        Date date = new Date(list.get(0) + "1 1990");
        System.out.println(list.get(0) + " is " + (date.getMonth()+1) + " month");
    }
}
