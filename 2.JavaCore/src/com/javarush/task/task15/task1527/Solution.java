package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        String a1 = s.readLine();
        s.close();
        String[] p1 = a1.split("\\?");
        String p = p1[1];
        String[] m;
        String[] sm;
        HashMap<String, String> hm = new HashMap<>();
        m = p.split("&");
        for (int i = 0;i < m.length;i++) {
            String b = m[i];
            if (b.contains("=")){
                sm = b.split("=");
                if (i != m.length - 1){
                    System.out.print(sm[0] + " ");}
                else{
                    System.out.println(sm[0]);
                }
            }
            else if ((i != m.length - 1)){
                System.out.print(b + " ");
            }
            else {
                System.out.println(b);
            }

        }
        for (String t : m) {
            sm = t.split("=");
            if (sm[0].equals("obj")) {
                try {
                    Double d = Double.parseDouble(sm[1]);
                    alert(d);
                } catch (Exception a) {
                    alert( sm[1]);
                }
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
