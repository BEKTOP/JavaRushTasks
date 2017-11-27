package com.javarush.task.task08.task0815;

import java.util.HashMap;

/*
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap();
        map.put("Иванов","Иван");
        map.put("Петров","Иван");
        map.put("Сидоров","Иван");
        map.put("Ал-ахмед","Петр");
        map.put("Трамп","Димон");
        map.put("Ким","Ин");
        map.put("Курва","Джанко");
        map.put("Бобруйско","Иван");
        map.put("Жан-клод","Петр");
        map.put("МакНил","Иван");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //map = Solution.createMap();
        int count = 0;
        for (String value: map.values()){
            if (value.equals(name)) count ++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
       // map = Solution.createMap();

        int countt = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) countt++;
        }
        return countt;
    }

    public static void main(String[] args) {
        // System.out.println(getCountTheSameFirstName(createMap(), "Name"));
        // System.out.println(getCountTheSameLastName(createMap(), "Surename2"));

    }
}
