package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            System.out.print(weight/(height*height)<18.5?"Недовес: меньше чем 18.5":weight/(height*height)>18.5&&
                    weight/(height*height)<24.9?"Нормальный: между 18.5 и 24.9":weight/(height*height)>25&&
                    weight/(height*height)<29.9?"Избыточный вес: между 25 и 29.9":weight/(height*height)>=30?
                    "Ожирение: 30 или больше":"");
            //напишите тут ваш код
        }
    }
}
