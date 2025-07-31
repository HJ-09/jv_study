package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class A25MoveBlockCanvas extends JFrame {
    int x=0; //x값을 필드로 만든 이유는 분기마다 변경 후 캔버스를 다시 그리려고.
    javax.swing.Timer timer; //0.1초 분기마다 실행되어서 블럭의 위치(x값)를 옮길거임.
    final int width=500; //너비 고정값
    final int height=500; //높이 고정값

    int keyCode=KeyEvent.VK_RIGHT; //방향키 기본값을 오른쪽으로 초기화.

    //start() : 시작, stop() : 멈춤
    class MyCanvas extends Canvas{

        public MyCanvas(){
            //KeyListener : 키보드 이벤트를 받는 인터페이스/ 람다식 불가능
            //Typed : 누르고 놓는거. 치는거..? / Pressed : 누르기만 하는거 / Released : 눌렀다가 떼는거
            //KeyAdapter : KeyListener를 구현한 추상클래스 (여러개의 추상메서드 중에 한 개만 구현해도 됨)/ 람다식 불가능
            //람다식은 인터페이스가 한 개의 추상메서드가 있을 때만 가능!
            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e){
                    //e : 이벤트 정보
                    keyCode=e.getKeyCode();
                }
            });
        }

        @Override
        public void paint(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(x,300,50,50);
        }
    }

    private Canvas canvas; //타입의 다형성

    public A25MoveBlockCanvas(){
        super("블럭을 움직이는 캔버스");

        canvas=new MyCanvas();
        canvas.setBackground(Color.WHITE);

        this.add(canvas);

        //0.1초마다 블럭을 오른쪽으로 이동하는 방법 3가지
        //① 스레드를 만들고 0.1초 쉬었다가 블럭의 위치를 오른쪽으로 옮겨서(++, +=10 ...) 새로그림(repaint).
        //② 스레드를 java.util.Timer로 0.1초 분기마다 실행되는 스레드 생성 후 블럭의 위치를 오른쪽으로 옮겨서(++, +=10 ...) 새로그림(repaint).
        //③ javax.swing.Timer로 EDT한테 0.1초 분기마다 실행되도록 콜백함수 정의

        //①,②는 멀티스레드, ③은 있는 스레드(EDT)한테 일 시키는 것.
        //이런 경우에는 ③으로 해야함. 왜냐, EDT가 아닌 스레드가 그래픽을 새롭게 그리면 충돌이 생김.

        timer=new Timer(100,(e)->{ //분기마다 실행할 함수
            if(x>=(width-60)){
                //return; //타이머는 계속 실행되지만 콜백함수의 다음 코드는 실행안됨
                timer.stop();
                return; //timer.stop() 후의 다음 코드 실행 안되고 끝나게 하기 위해.
            }
            //x+=10;
            switch (keyCode){
                case KeyEvent.VK_RIGHT -> x+=10;
                case KeyEvent.VK_LEFT -> x-=10;
            }

            canvas.repaint(); //paint를 다시 호출해서 그림(paint를 절대 직접 호출하면 안됨)
        });
        timer.start();
        canvas.setFocusable(true);

        this.setBounds(800,300,width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        // new A25MoveBlockCanvas(); ⇒ EDT랑 충돌하니까 이렇게 사용x.
        SwingUtilities.invokeLater(()->{ //EDT window를 생성 → EDT와 main 충돌 예방
            new A25MoveBlockCanvas();
        });

    }
}
