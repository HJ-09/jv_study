package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class A10SwingClock extends JFrame {
    private JButton startBtn;
    private JButton stopBtn;
    private JLabel label;
    private boolean isClock;


    public A10SwingClock(){
        startBtn=new JButton("시계시작");
        startBtn.addActionListener((e)->{
            if(isClock) return; //true일 때, 이 다음 코드는 실행하지 않고 종료~

            isClock=true;
            new Thread(()->{
                while (isClock){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                    label.setText(LocalDateTime.now().toString());
                }
            }).start(); //Thread.stop(); : 강제로 일꾼을 종료. but, 권장x. 무한반복문의 조건을 false로 바꿔서 천천히 종료시키는 것을 권장.
        });
        stopBtn=new JButton("시계종료");
        stopBtn.addActionListener((e) -> {
            isClock=false;
        });
        label=new JLabel(LocalDateTime.now().toString());
        this.add(startBtn, BorderLayout.WEST);
        this.add(stopBtn, BorderLayout.EAST);
        this.add(label);


        this.setBounds(1000,0,450,450);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        new A10SwingClock(); //화면에 디지털 시계가 뜨도록 할게~
    }
}
