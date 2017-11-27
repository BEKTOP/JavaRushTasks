package com.javarush.task.task14.task1408;

/**
 * Created by User on 20.09.2017.
 */
public class UkrainianHen extends Hen implements Country{
    @Override
    int getCountOfEggsPerMonth() {
        return 102;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
