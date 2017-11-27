package com.javarush.task.task24.task2413;


import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Arkanoid {
    //ширина и высота
    private int width;
    private int height;

    //список кирпичей

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    private List<Brick> bricks = new ArrayList<Brick>();
    //шарик
    private Ball ball;
    //подставка
    private Stand stand;


    void run() throws Exception {
        //Создаем холст для отрисовки.
        Canvas canvas = new Canvas(width, height);

        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //Исполняем цикл, пока игра не окончека
        while (!isGameOver) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();

//                //Если "стрелка влево" - сдвинуть фигурку влево
//                if (event.getKeyCode() == KeyEvent.VK_LEFT)
//                    stand.moveLeft();
//                    //Если "стрелка вправо" - сдвинуть фигурку вправо
//                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
//                    stand.moveRight();
//                    //Если "пробел" - запускаем шарик
//                else if (event.getKeyCode() == KeyEvent.VK_SPACE)
//                    ball.start();
            }

            //двигаем все объекты
            move();

//            //проверяем столкновения
//            checkBricksBump();
//            checkStandBump();
//
//            //проверяем, что шарик мог улететь через дно.
//            checkEndGame();
//
//            //отрисовываем все объекты
//            canvas.clear();
//            draw(canvas);
//            canvas.print();

            //пауза
            Thread.sleep(300);
        }

        //Выводим сообщение "Game Over"
        System.out.println("Game Over!");
    }

    /**
     * Двигаем шарик и подставку.
     */
    public void move() {
//        ball.move();
//        stand.move();
    }



    //игра закончена?
    private boolean isGameOver = false;

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public static Arkanoid game;

    public static void main (String[] args){

    }
}