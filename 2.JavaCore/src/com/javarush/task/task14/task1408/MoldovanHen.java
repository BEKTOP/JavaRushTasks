package com.javarush.task.task14.task1408;

/**
 * Created by User on 20.09.2017.
 */
public class MoldovanHen extends Hen implements Country{
    @Override
    int getCountOfEggsPerMonth() {
        return 120;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
