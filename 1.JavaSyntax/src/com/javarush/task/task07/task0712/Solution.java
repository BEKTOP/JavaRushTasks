package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int lma=0,lmi=100,ma=0,mi=0;
        for (int i = 0; i <10 ; i++) {
            String s = reader.readLine();
            list.add(s);
            int l = s.length();
            if (l<lmi) {mi=i; lmi=l;}
            if (l>lma){ ma=i;lma=l;}
        }
       if(mi>ma) System.out.println(list.get(ma));
        else System.out.println(list.get(mi));
    }
}
