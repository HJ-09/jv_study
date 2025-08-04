package com.kosmo.advance;

public class A28Synchronized {

    public static int A=0; //전역변수이면서 클래스

    public static void main(String[] args) throws InterruptedException {
        //synchronized : 멀키스레드 환경에서 공유자원의 일관성을 보장(스레드간 비동기와 다른 뜻)

        //스레드간 비동기 ?-?

        //스레드간 동기↓
        int a=0;
        for(int i=0; i<10; i++){
            a++;
        }
        System.out.println(a);
        //스레드가 1개여서 코드간에 동기화 됨.
        //└─ 동기화 : 위에 코드가 끝나면 아래 코드가 실행. 결과를 예상할 수 있음.

        a=0;
        //멀티스레드 환경
        Thread thread=new Thread(()->{
            for (int i=0; i<10; i++){
                A++;
            }
        }); //새로운 일꾼 만들어서 할 일 정의
        thread.start(); //일꾼이 일 시작

        thread.join(); //Thread thread가 일을 끝낼 때 까지 기다려. 강제로 동기화 시킴.

        System.out.println(A);
        //A가 10이 출력되면 멀티스레드간 동기화 된 것.
        //A가 0이 출력되면 멀티스레드간 비동기화 된 것.

    }
}
