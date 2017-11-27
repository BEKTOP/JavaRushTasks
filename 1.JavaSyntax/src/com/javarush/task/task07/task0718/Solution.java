package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader( new InputStreamReader(System.in));
        int n,t=0;
        ArrayList<String>list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        n=list.get(0).length();
        for (int i = 1; i <10 ; i++) {
            int l=list.get(i).length();
            if (l<=n) {
                System.out.println(i);
                break;}
            else n=l;
        }

    }
}

