package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> mlist = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            mlist.add(reader.readLine());
        }
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> result = doubleValues(mlist);
        for (int j = 0; j <result.size() ; j++) {

            System.out.println(result.get(j));
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = list.size() - 1; i >=0; i--)
            list.add(i + 1, list.get(i));
        return list;

    }
}
