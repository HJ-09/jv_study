package com.kosmo.advance.exAnswer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class E01Q05StopWatch extends JFrame {
    JButton startBtn=new JButton("시작");
    JButton stopBtn=new JButton("멈춤");
    JButton reBtn=new JButton("리셋");
    JLabel l=new JLabel("스톱워치",SwingConstants.CENTER);
    int n=0; //출력될 숫자
    boolean isStart=false; //스탑워치가 시작됨?(=isStart), 아니(=false)

    public E01Q05StopWatch(){
        super("StopWatch");

        this.add(startBtn, BorderLayout.WEST);
        this.add(stopBtn, BorderLayout.EAST);
        this.add(reBtn, BorderLayout.SOUTH);
        this.add(l,BorderLayout.CENTER);
        l.setFont(new Font("맑은고딕",Font.BOLD,12)); //생성자에서만 실행할 수 있음.


//        startBtn.addActionListener(e->{
//
//            Runnable run=()->{ //새로 생성할 스레드가 호출할 함수
//            //무한반복문으로 n을 0.01초 쉬었다가 증가
//                isStart=true;
//                while(isStart){
//                    //오류가 뜨면 실행 중인 어플이 멈추기 때문에 예외 처리해야함.
//                    try { //오류가 뜨면 무시하거나 처리해주는 블럭
//                        Thread.sleep(10); //0.01초
//                        n++;
//                        String numStr=String.format("%.2f",n/100.0); //문자열에 숫자를 추가해주는 포맷을 제공
//                        l.setText(numStr+"");
//                    } catch (InterruptedException ex) { //ActionListener 변수가 이미 e 여서 ex로 해야함.
//                        ex.printStackTrace(); //오류가 뜨는 위치와 오류를 붉은 색으로 출력.
//                    }
//                }
//            };
//            Thread t=new Thread(run); //새로 생성할 일꾼이 할 일 지정
//            t.start();
//        });

        stopBtn.addActionListener(e->{
                isStart=false;
        });

        //javax.swing.Timer : 분기가 있는 무한 반복문(이벤트 디스패치 스레드 : EDT)
        //start, stop으로 무한 반복문을 시작, 종료해야함.

        ActionListener timerHandler=(e->{
            n++;
            String nStr=String.format("%.2f",n/100.0);
            l.setText(nStr);
        });
        Timer timer=new Timer(10,timerHandler);
        startBtn.addActionListener((e)->{
            timer.start();
        });
        stopBtn.addActionListener((e)->{
            timer.stop();
        });
        reBtn.addActionListener((e)->{
            n=0;
            l.setText("스톱워치");
        });



        this.setBounds(800,300,300,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new E01Q05StopWatch();
    }
}
