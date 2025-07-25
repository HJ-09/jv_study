package com.kosmo.advance.exAnswer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E01Q01NumberUp2_self extends JFrame {
    //필드간의 접근은 자유롭기 때문에 컴포넌트를 필드로 정의
    private JButton btn=new JButton("증가"); //버튼에 글씨 보이게
    private JButton btn2=new JButton("감소");
    private JButton btn3=new JButton("리셋");
    private JLabel label;
    int num=0;

        class BtnHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                String cmd=e.getActionCommand();
                if(cmd.equals("증가")){
                    ++num;
                }else if(cmd.equals("감소")){
                    if(num>0){
                    --num;
                    }
                }else if(cmd.equals("리셋")){
                    num=0;
                }
                label.setText(num+"");
            }
        }

    public E01Q01NumberUp2_self(){
        super("NumberUp2"); //this super=new JFrame(); → 무조건 맨 상단에 자동완성

        label=new JLabel("숫자 카운터",SwingConstants.CENTER);
        label.setFont(new Font("",Font.BOLD,15));
        btn.setActionCommand("증가"); //명령
        btn2.setActionCommand("감소");
        btn3.setActionCommand("리셋");

        BtnHandler handler=new BtnHandler();
        btn.addActionListener(handler);
        btn2.addActionListener(handler);
        btn3.addActionListener(handler);

        JPanel p=new JPanel();
        p.setLayout(new FlowLayout()); //배치 마법사 → 컴포넌트를 배치하는 용도
        p.add(btn);
        p.add(btn2);
        p.add(btn3);

        this.add(label, BorderLayout.CENTER);
        super.add(p, BorderLayout.NORTH);

        //E01Q01NumberUp2 this=new E01Q01NumberUp2(); //this의 실체
        this.setSize(300,300);
        this.setLocation(800,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new E01Q01NumberUp2_self();
    }
}
