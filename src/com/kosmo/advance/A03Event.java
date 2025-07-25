package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A03Event {
    static int num;
    static JLabel label;

    static class BtnHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) { //이 친구가 클릭했을 때의 콜백함수
            ++num;
            label.setText(num+"");
            System.out.println("버튼이 눌렸습니다.!");

        }
    }

    public static void main(String[] args) {
        //GUI는 마우스 이벤트로 인터페이스가 구성됨
        //클릭, over(enter) _마우스로 꾹 눌러서 잡는거?, leave, focus ...

        JFrame frame=new JFrame("이벤트");
        JButton btn=new JButton("++num");
        //int num=0; ⇒ 지역변수라서 참조가 안되니께 바깥으로 빼기~
        btn.addActionListener(new BtnHandler());
        //이벤트리스너 : 동작인식 형광등이라고 생각하세욤. 이벤트를 무한히 **대기**하고 있다가 정의한 동작을 실행하는 것.
        //ActionListener() : 버튼 클릭 이벤트.
        //└─ 버튼을 눌렀을 때의 동작(콜백함수)을 정의해서 매개변수로 전달
        //콜백함수 : 어떤 동작에 의해 호출된 함수(개발자가 임의로 실행하는 함수가 아님)

        /*btn.addActionListener((e)->{
            ++num;
            label.setText(num+"");
            System.out.println("버튼이 눌렸습니다.!");

        });*/ //← 람다식


        label=new JLabel(num+"",SwingConstants.CENTER); //라벨은 문자이기 때문에 정수를 넣어줄 수 없음.
        //SwingConstants.CENTER ⇒ 중간정렬

        frame.add(btn, BorderLayout.NORTH);
        frame.add(label, BorderLayout.CENTER);
        //모든 컴포넌트는 Font로 글씨체 변경 가능
        label.setFont(new Font("나눔고딕",Font.BOLD,50));


        frame.setSize(500,500);
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //이렇게 써도 되고 , 그냥 2만 써도 됨. 2가 종료하기
        frame.setVisible(true);


    }
}
