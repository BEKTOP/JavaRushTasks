package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child  = new Human("Nata", false, 10, new ArrayList<>());
        Human child2  = new Human("Tana", false, 8, new ArrayList<>());
        Human child3  = new Human("Roma", true, 6, new ArrayList<>());

        ArrayList<Human> children3 = new ArrayList<Human>();
        ArrayList<Human> children4 = new ArrayList<Human>();
        ArrayList<Human> children5 = new ArrayList<Human>();
        children3.add(child);
        children3.add(child3);
        children3.add(child2);



        Human father = new Human("Saha", true, 30, children3);
        Human mother = new Human("Kata", false, 20, children3);
        children4.add(father);
        children5.add(mother);
        Human gfather1 = new Human("Sffd", true, 30, children4);
        Human gmother1 = new Human("Dggg", false, 20, children4);

        Human gmother2 = new Human("Afff", false, 20, children5);
        Human gfather2 = new Human("Qdff", true, 30, children5);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;
        public Human(String name,boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            System.out.println(this);
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
