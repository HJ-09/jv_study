package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class A25MoveBlockCanvas_1 extends JFrame {
    int x=100;
    int y=100;
    Timer timer;
    final int width=500;
    final int height=500;

    int keyCode=KeyEvent.VK_RIGHT;

    class MyCanvas extends Canvas{

        public MyCanvas(){
            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e){
                    //e : 이벤트 정보
                    keyCode=e.getKeyCode();
                    switch (keyCode){
                        case KeyEvent.VK_SPACE -> {
                            x=100;
                            y=100;
                            timer.start();
                            keyCode=KeyEvent.VK_RIGHT;
                            repaint();
                        }
                    }
                }
            });
        }

        @Override
        public void paint(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(x,y,50,50);
        }
    }

    private Canvas canvas; //타입의 다형성

    public A25MoveBlockCanvas_1(){
        super("블럭을 움직이는 캔버스");

        canvas=new MyCanvas();
        canvas.setBackground(Color.WHITE);

        this.add(canvas);

        timer=new Timer(100,(e)->{
            if(x>width || x<=0){
                timer.stop();
                return;
            } if(y<=0 || y>width){
                timer.stop();
                return;
            } switch (keyCode){
                case KeyEvent.VK_RIGHT -> x+=10; //x좌표는 오른쪽으로 갈수록 증가
                case KeyEvent.VK_LEFT -> x-=10;
                case KeyEvent.VK_UP -> y-=10; //y좌표는 아래로 갈수록 증가
                case KeyEvent.VK_DOWN -> y+=10;


            }

            canvas.repaint(); //paint를 다시 호출해서 그림(paint를 절대 직접 호출하면 안됨)
        });
        timer.start();
        canvas.setFocusable(true);
        canvas.requestFocusInWindow();

        this.setBounds(800,300,600,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            new A25MoveBlockCanvas_1();
        });
    }
}
