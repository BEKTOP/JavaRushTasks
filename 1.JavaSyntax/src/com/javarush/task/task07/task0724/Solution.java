package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        boolean d;
        String s = "a";
        String z= "z";
        Human[] a = new Human[9];
        for (int i = 0; i < 9; i++) { s += "a";
            if (i % 2 == 0) d = true;
            else d = false;
            if (i < 4){ a[i] = new Human(s, d,40 + i*4); }
            else { z += "z"; a[i] = new Human(z, d, 10 + i * 2, a[0], a[1]); } }
        for (int i = 0; i < 9; i++) System.out.println(a[i].toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father,mother;
        //напишите тут ваш код

        public Human(String name,boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
                    }
        public Human(String name,boolean sex, int age,Human father,Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
                    }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















