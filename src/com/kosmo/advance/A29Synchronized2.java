package com.kosmo.advance;

public class A29Synchronized2 {

    public static int A=0; //공유자원

    public static final Object lock=new Object(); //람다식 내부 싱커로 블럭에 락을 걸어주는 객체



    public static void main(String[] args) throws InterruptedException { //static은 this가 없다..!..?
        Thread t=new Thread(()->{
            for (int i=0; i<100000; i++){

                synchronized (lock){
                    A++;
                }
            }
        });
        t.start();

        Thread t2=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lock){
                    A++;
                }
            }
        });
        t2.start();

        Thread t3=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lock){
                    A++;
                }
            }
        });
        t3.start();

        Thread t4=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lock){
                    A++;
                }
            }
        });
        t4.start();

        Thread t5=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lock){
                    A++;
                }
            }
        });
        t5.start();

        t.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        System.out.println(A);
        //500000이 나오면 Synchronized 된 것. 공유자원 안전하다!
        //162160 이렇게 나옴.. ⇒ 공유자원 안전하지 않음 ㅋ.. ⇒ 멀티스레드가 공유자원을 동시에 참조할 때 발생하는 문제. (≠ 비동기)
        //기본형이 제일 많이 발생함.

        //Synchronized 오류 줄이는 방법?! 안전한 공유자원을 사용하기 위한 방법
        //①. 안전한 타입(Synchronized 된 타입) 사용
        //int → AtomicInteger, ArrayList → Vector ...

        //②. Synchronized 블럭 사용 후 참조.
        //Synchronized 블럭 : lcok 걸기 ㅋ.. 내가 먼저 할게 잠만~ like that..~

        //③. Synchronized된 메서드 사용(인스턴스의 메서드). static 사용 불가.


    }
}
