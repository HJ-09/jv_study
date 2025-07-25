package com.kosmo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface Testable{
    void test();
}

public class L32AnonymousClass {
    //Testable 을 사용하기 위해서 보통 내부클래스를 작성.
    class Test implements Testable{ //---ⓐ
        @Override
        public void test(){ //이름 :
            System.out.println("테스트 중입니다.");
        }
    }
    void run(){
        Test t=new Test();
        t.test(); //이름 :L32AnonymousClass$Test
    }
    void run2(){ //---ⓑ
        //Testable을 구현하지 않고 객체로 바로 만들고 시퐁
        //Testable을 구현한 객체를 한 번만 쓰고 다시는 사용하지 않을거야
        //그런데 Test 클래스를 만들 필요가 있을까....?
        Testable t=new Testable(){ //이름 :L32AnonymousClass$1  ⇒ 이름이 없는(Anonymous) 파일은 숫자가 붙음.
            @Override
            public void test() {
                System.out.println("테스트 해볼게");
            }
        };
        //그럼 내(java)가 바로 인터페이스를 객체로 만들어줄게
        //대신 추상메서드를 객체로 만들면서 바로 구현해
        //ⓐ랑 ⓑ가 같음. 그런데 계속 쓸거면 ⓐ로 하는게 맞고, 한 번만 쓸거면 ⓑ로 하는게 좋음.

        //익명클래스 개념
        //추상메서드를 포함하는 인터페이스나 추상클래스는 객체로 만들 수 없는데, 개발자 편의를 위해 추상메서드를 구현하면서 객체를 생성하는 문법을 지원함.
        //이 때, 컴파일러가 구현한 코드를 익명클래스에 반영함.

        t.test();
    }

    void run3(){
        Testable t2 = new Testable(){
            @Override
            public void test(){

            }
        };
        // 람다식 ()->{} == test(){}
        Testable t=()->{

        };
    }


    static class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            //버튼을 누르면 ~~을 해라
        }
    }

    public static void main(String[] args) {
        JButton btn=new JButton("클릭");
        btn.addActionListener(new BtnHandler());
        btn.addActionListener(new ActionListener() { //이름 :L32AnonymousClass$2
            @Override
            public void actionPerformed(ActionEvent e) {
                //버튼이 눌리는 기능
            }
        });
    }
}
