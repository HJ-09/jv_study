package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Frame 만드는 법
//1. class를 따로 만들고 Frame을 상속받는다.
//2. 추가할 컴포넌트들은 필드로 정의 ⇒ 이벤트와 같은 내부 클래스에서 필드를 참조하기 쉬움.
//3. 생성자를 만들어서 컴포넌트들이 해야할 것들을 정의.
class Counter extends JFrame{
    private int num=0; //캡슐화
    private JLabel label; //=new JLabel(num+"");
    private JButton btn;
    class BtnHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            num++;
            label.setText(num+"");
        }
    }


    public Counter(){
        super("나는 카운터야"); //객체를 만들 때 호출
        //JFrame super = new JFrame("나는 카운터야"); 랑 같은거임.

        label=new JLabel(this.num+"",SwingConstants.CENTER);
        this.btn=new JButton("num++");
        btn.addActionListener(new BtnHandler());

        super.add(this.label);
        this.add(btn, BorderLayout.NORTH);
        this.setBounds(0,0,500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(2);


    }
}


public class A04Counter {
    public static void main(String[] args) {
        Counter counter=new Counter();


    }
}
