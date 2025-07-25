package com.kosmo.advance;

import java.time.LocalDateTime;

public class A08Thread {
    public static void main(String[] args) {
        //main 어플이 1개의 Thread를 가진다.
        //Thread ▶ 일 꾼
        //일꾼이 1명이면? 일도 한 개씩 진행.

        //쓰레드가 1개 있는 언어를 >순차적 언어<라고 부름.(1개씩 순차적으로 실행돼서)
        //일꾼을 여러개 만들 수 있는 언어를 Thread를 지원한다고 함. 자바는 일꾼을 여러개 만들 수 있음. so, 자바는 Thread를 지원함ㅋ.


        System.out.println("실행1");
        System.out.println("실행2");
        System.out.println("실행3");
        System.out.println("실행4");

        boolean isTime=true;
        while (isTime){//화면에 시간을 출력해볼게~
            try {
                Thread.sleep(1000); //다른 일꾼(다른 Thread)이랑 부딪힐 수 있어서 예외처리를 강제.
            } catch (InterruptedException e) {
            }
            LocalDateTime now=LocalDateTime.now(); //년-월-일T시:분:초.나노초 형식으로 출력.
            System.out.println(now.toString());
        }
        //1~100까지 수를 더해보자
        int sum=0;
        for(int i=1; i<=100; i++){
            sum+=i;
        }
        System.out.println(sum);



    }
}
