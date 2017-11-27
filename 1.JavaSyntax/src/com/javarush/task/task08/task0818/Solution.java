package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hashmap = new HashMap();//создаем массив и забиваем данными
        hashmap.put("LastName1",530);
        hashmap.put("LastName2", 565);
        hashmap.put("LastName3", 450);
        hashmap.put("LastName4", 555);
        hashmap.put("LastName5", 985);
        hashmap.put("LastName6", 235);
        hashmap.put("LastName7", 454);
        hashmap.put("LastName8", 555);
        hashmap.put("LastName9", 665);
        hashmap.put("LastName10", 858);
        return hashmap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {


        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry pair = (HashMap.Entry) iterator.next();
            Integer n = (Integer) pair.getValue();
            if (n < 500) iterator.remove();
        }
        //напишите тут ваш код }
    }

    public static void main(String[] args) {

    }
}