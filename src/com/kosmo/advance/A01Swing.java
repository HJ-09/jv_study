package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;

public class A01Swing {
    public static void main(String[] args) {
        //GUI : OSX(모바일) apple의 최초의 운영체제, IOS(터치) 모바일
        //CLI

        //자바 : 플랫폼에 독립적으로 윈도우를 구현
        Frame f=new Frame(); //awt 패키지
        //└─ BorderLayout
        f.setBounds(1000,0,900,300);

        //Label : 글자를 추가하는 컴포넌트
        JLabel l=new JLabel("안뇽");
        JLabel l2=new JLabel("가지마 ㅠㅠ");

        //컨테이너에 컴포넌트를 추가할 수 있는 함수 add
        f.add(l,BorderLayout.NORTH);
        f.add(l2,BorderLayout.CENTER);


        f.setVisible(true);

        //JFrame : swing 패키지
        //awt 패키지가 나온지 오래되어서 플랫폼관에 일관성이 부족해짐.
        //이를 보완하기 위해야 java 1.2에서 swing을 발표
        //java FX java 6 버전 (swing 후속작), html 같은 스타일 적용이 가능
        //awt, swing(*), fx


        //컨테이너와 컴포넌트
        //swing에는 Container를 구현하는 클래스와 Component를 구현하는 클래스로 나뉜다.
        //컨테이너 클래스는 컴포넌트를 포함하기 위해 존재
        //Container에는 레이아웃 매니저라는 클래스가 포함되는데 컴포넌트의 위치를 조정한다.


    }
}
