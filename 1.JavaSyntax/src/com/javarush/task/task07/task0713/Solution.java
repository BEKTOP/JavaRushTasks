package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> na3 = new ArrayList<>();
        ArrayList<Integer> na2 = new ArrayList<>();
        ArrayList<Integer> ost = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <20 ; i++) {
            List.add(Integer.parseInt(reader.readLine()));
            if (List.get(i)%3==0) na3.add(List.get(i));
            if (List.get(i)%2==0) na2.add(List.get(i));
            if (List.get(i)%2!=0&&List.get(i)%3!=0) ost.add(List.get(i));

        }
        printList(na3);
        printList(na2);
        printList(ost);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}
