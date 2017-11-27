package com.javarush.task.task08.task0817;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

/*
Удаялет повторяющиеся имена из массива Map
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> hashmap = new HashMap();//создаем массив и забиваем данными
        hashmap.put("LastName1", "FirstName");
        hashmap.put("LastName2", "FirstName");
        hashmap.put("LastName3", "FirstName");
        hashmap.put("LastName4", "FirstName");
        hashmap.put("LastName5", "FirstName5");
        hashmap.put("LastName6", "FirstName6");
        hashmap.put("LastName7", "FirstName7");
        hashmap.put("LastName8", "FirstName8");
        hashmap.put("LastName9", "FirstName9");
        hashmap.put("LastName10", "FirstName");
        return hashmap;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {//с параметром map
        ArrayList<String> list = new ArrayList();// создаю дополнительный список
        for (HashMap.Entry<String, String> a: map.entrySet()){//перебирает все значения в массиве
            list.add(a.getValue());//по очередно добавляет значения (Value это FirsstName) в список
        }
        for (String l : list){//перебирает список
            if (Collections.frequency(list, l)>1){//если в списке значение повторяется, то
                removeItemFromMapByValue(map, l);//запускает данный метод, передавая в него массив и
                //значение Value которое повторяется
            }
        }
        //System.out.println(map); //если убрать данный комментарий и комментарий в
        //методе main, то можно увидеть результат работы программы
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);//массив копируется, так
        //как в текущем массиве нельзя удалять - нарушается его целстность и цикл не правильно работает
        for (Map.Entry<String, String> pair : copy.entrySet()) {//перебирает все значения в массиве
            if (pair.getValue().equals(value))//если значение Value в массиве copy равно переданному
                //значению в начале метода
                map.remove(pair.getKey());//то удаляет запись в другом массиве map по ключу,
            //так как ключ уникален в данном массиве (ключом выступает LastName)
        }
    }

    public static void main(String[] args) {
        //removeTheFirstNameDuplicates(createMap()); /если убрать данный комментарий и комментарий в
        //методе removeTheFirstNameDuplicates, то можно увидеть результат работы программы
        //данная строка означает, что мы запускаем метод removeTheFirstNameDuplicates
        //передавая в него результат метода createMap()
    }
}