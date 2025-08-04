package com.kosmo.advance;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class Game {
    int x; //AtomicInteger를 사용해도 완전히 안전한 공유자원이 될 수 없음
    int y;

    public synchronized void increamentX(){
        x++; //Game.this가 lock 객체
    }

    class MoveThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 500000; i++) {
                //x++;
                //increamentX();
                synchronized (Game.this){ //lock 객체는 x를 포함하는 객체여서 Game.this여야만 함.
                    //내부클래스에서 외부클래스의 필드를 접근할 때 lock 객체를 외부클래스로 지정해야함(주의※)
                    x++;
                }
            }
        }
    }

    /*class MoveXThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 500000; i++) {
                x++;
            }
        }
    }*/

    public Game() throws InterruptedException {
        Thread t1 = new MoveThread();
        Thread t2 = new MoveThread();
        t1.start();
        t2.start();
        //Runnable movexThread=new MoveXThread();
        t1.join();
        t2.join();
        System.out.println(x);
    }
}


public class A30SynchronizedMethod {


    public static void main(String[] args) {
        try {
            Game game=new Game();
        } catch (InterruptedException e) {

        }
    }
}
