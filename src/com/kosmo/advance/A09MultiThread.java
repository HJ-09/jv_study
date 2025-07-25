package com.kosmo.advance;

import java.time.LocalDateTime;

//Thread는 Runnable 인터페이스로 구현된 함수만 실행함.
class DigiClock implements Runnable{
    @Override
    public void run() { //일꾼이 실행할 함수. 일꾼이 호출하는 함수니까 이것도 콜백함수임 ㅋ
        while (true){

            try {
                Thread.sleep(1000); //무한반복문은 텀이 너무 짧으면 stack 영역이 너무 빨리 차버림. 조심!
            } catch (InterruptedException e) {
            }
            System.out.println(LocalDateTime.now());
        }
    }
}


public class A09MultiThread {
    public static void main(String[] args) {
        Thread thread=new Thread(new DigiClock()); //일꾼생성 및 콜백함수(자기가 일 할 코드) 준 비 !
        thread.start();

        int sum=0;
        for(int i=1; i<=100; i++){
            sum+=i;
        }
        System.out.println(sum);


    }
}
