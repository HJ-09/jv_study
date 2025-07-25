package com.kosmo.advance.ex;

public class S03Thread {
    /*
⸻

자바 스레드(Thread) 수업 정리

- 1. 스레드란?
	•	하나의 프로그램(프로세스) 안에서 동시에 여러 작업(일)을 수행할 수 있게 해주는 실행 단위
	•	예: 음악 재생 + 파일 다운로드 + 화면 출력

⸻

- 2. 스레드를 사용하는 이유
	•	효율적으로 작업(일)을 하기 위해서 (=동시에 여러 작업을 처리)
	•	병렬 처리 (성능 개선), 순서 상관 x / ⇔ 직렬 처리는 1개씩 처리하는것. 그래서 속도 느림.
	•	사용자 응답성을 향상 (UI 멈춤 방지)

⸻

- 3. 스레드 생성 방법 (2가지)

(1) Thread 클래스를 상속

class MyThread extends Thread {
    public void run() {
        System.out.println("스레드 실행 중...");
    }
}

(2) Runnable 인터페이스를 구현

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable 스레드 실행 중...");
    }
}

(1) 실행 방법

Thread t = new MyThread();       // 또는 new Thread(new MyRunnable());
t.start();  // run()이 아닌 start() 호출해야 새 스레드에서 실행됨

(2) 실행 방법

Thread t = new Thread(new MyRunnable());
t.start();

(+) 익명클래스 실행법
Thread t = new Thread(new Runnable(){
    public void run(){
        //실행할 코드
    }
});
t.start();

(+) 람다식 실행법 (자바 8버전부터 사용가능)
new Thread(()->{
    //실행할 코드
}).start();
// == new Runnable(){public void run(){}}

⸻

- 4. run() vs start() 차이
	•	run() → start가 실행할 콜백함수로, 개발자가 재정의 해야함. 일반 메서드처럼 실행 (스레드 아님)
	•	start() → 새로운 스레드를 생성해서 run()을 내부적으로 실행

⸻

- 5. 스레드 실행 결과 예측 어려움
	•	스레드는 동시 실행되므로 실행 순서가 항상 같지 않음

⸻

- 6. 주요 메서드
	•	start() : 스레드 시작
	•	run() : 스레드 실행 코드
	•	sleep(ms) : 주어진 시간 동안 스레드 멈춤
	•	join() : 해당 스레드가 끝날 때까지 기다림
	•	isAlive() : 스레드가 살아있는지 확인

⸻

- 7. 예제: 숫자 출력 스레드

class CountThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
Thread t=new CountThread();
t.start();

t.isAlive(); //끝났으면 false, 아직 안 끝났으면 true

*)5초 걸린다고 가정했을 때
Thread.sleep(10000);
t.isAlive(); // false가 나옴.


⸻

- 8. 예제: 두 스레드 동시에 실행

public class Main {
    public static void main(String[] args) {
        new CountThread().start();
        new CountThread().start();
    }
}


⸻

- 9. 실습 아이디어 (수업용 과제)
	•	숫자를 1초 간격으로 출력하는 스레드
	•	두 개의 스레드가 번갈아 숫자 출력
	•	스레드로 동작하는 타이머 만들기
	•	스레드가 경쟁하여 점수를 증가시키는 간단한 게임

⸻

- 10. 스레드 관련 주의점
	•	run() 직접 호출하면 새 스레드가 아님
	•	start()는 한 번만 호출 가능 (두 번째 호출 시 예외 발생)
	•	UI(Thread-Swing)와 백그라운드(Thread)를 섞을 경우 동기화에 주의

⸻*/
}
