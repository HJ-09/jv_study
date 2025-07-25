package com.kosmo.advance.exAnswer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class BtnHandler implements ActionListener {

    //자료를 만든다. → 필드, 생성자(객체의 초기값을 정의하는 애), 함수를 정의할 수 있다는 의미
    int a=10; //new BtnHandler().a ⇒ 10  → 필드
    void sum(){} //new BtnHandler().sum() → 함수
    public int num;

    @Override //이 친구가 콜백함수의 설계도(콜백함수라고도 함)
    public void actionPerformed(ActionEvent e) {
        /*String num=E01Q01NumberUp.label.getText();
        int i=Integer.parseInt(num); //문자열을 숫자로 강제 형변환
        E01Q01NumberUp.label.setText(i+1+"");*/ //①번 방법

        /*++num;
        E01Q01NumberUp.label.setText(num+"");*/ //②번 방법
    }

}
public class E01Q01NumberUp {
    public static JLabel label; //클래스 변수. 독립체임. 누구나 접근 가능. 생성 즉시 데이터가 됨.
    static int num=0;

    public static void main(String[] args) {
        //swing GUI
        JFrame frame=new JFrame("NumberUp"); //상단 제목
        //JLabel label=new JLabel("0"); //처음에 보여지는 화면
        //변수는 타입을 쓰면 선언으로 생성.
        label=new JLabel("0", SwingConstants.CENTER); // SwingConstants : ..?
        label.setFont(new Font("맑은고딕",Font.BOLD,20)); //글자 스타일

        JButton btn=new JButton("+1"); //보여지는 버튼 이름
        frame.add(btn, BorderLayout.NORTH); //버튼을 상단에 붙이겠다
        frame.add(label, BorderLayout.CENTER); //라벨을 가운데에 붙이겠다(정중앙 말하는거 아님)
        btn.addActionListener(new BtnHandler()); //ActionListener(인터페이스) 타입이 콜백함수의 기초설계도임.
        //익명클래스(숫자로 된 클래스)는 타입을 구현하는 클래스를 만들기 귀찮아서 도입



        //BtnHandler가 지역변수 label에 접근할 수 있으려면?
        //1. label을 클래스 멤버로 변경 ---①
        //2. BtnHandler 생성자에 전달 ---②
        //3. BtnHandler를 쓰지 않고 람다식(-②)이나 익명클래스(-①) 사용 ---③


        ActionListener btnHandler = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //label=new JLabel();
                String num=label.getText();
                int i=Integer.parseInt(num);
                label.setText(i+1+"");
            } //변수가 바뀐다 ⇒ 다른 객체로 변경, 객체의 필드가 바뀌는건 허용
        };
            btn.addActionListener(btnHandler);  //③-①번 방법

        /* final int num[]={0};
           btn.addActionListener((e)->{
            ++num;
            label.setText(num+"");
        }); */   //③-②번 방법


        //HD ⇒ 1980*1080 픽셀
        frame.setSize(200,200); //1980*1080에서 200*200만큼 쓰겠다.
        frame.setLocation(800,300);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}
