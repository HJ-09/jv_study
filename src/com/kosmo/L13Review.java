package com.kosmo;
//deploy(배포) : 서비스, 라이브러리...
//public class : 라이브러리화 하려면 다른 사람들이 import 할 수 있어야 함.
//└─import : 프로그램이 실행시 라이브러리를 가져와서 같이 실행

import java.lang.*; //자바 어플이 실행될 때 꼭 필요한 클래스의 집합
//System : 자바 어플을 실행하는 터미널에 접근(모든 OS는 어플을 실행할 때 터미널이 어플을 실행하게 되어있음.)
//Integer, Double, Short, Character.. : 랩퍼클래스/ 기본형 데이터를 도와주는 클래스


public class L13Review {
    //┌─ main 함수가 있어야 자바 어플이 된다.
    public static void main(String[] args) throws InterruptedException {
        int i=10; //데이터 10이 생기고
        //int i 변수가 데이터 10을 참조
        //* 정수형 데이터 : byte, short, int(☆☆☆), long
        //수를 리터럴하게 작성하면 int ⇒ 자바의 정수 기본형을 int 타입으로 사용하고 있음.
        //└─ 리터럴 : 자연스럽게, 있는 그대로
        //* 실수형 : float, double(☆☆☆)
        double d=10.0;
        float f=10.0f;
        // * 문자형 : '' (작은따옴표) 사용해야함. 따옴표 안을 비워두면 안됨.
        //└─ 유니코드(utf-16)의 문자표의 번호를 참조
        // * 문자열형 : ""(큰 따옴표) 사용해야함.
        // 0, 1 : bit (전기적 신호 유무 저장)
        // 0000 0000 → 1byte
        // 0000~1111 → 0~15(0~9,A~f)까지 16진수로 표기
        char c1='\u0000'; //→ 0000 0000 0000 0000
        char c2='\uFFFF'; //→ 1111 1111 1111 1111
        c1='가';
        System.out.println((int)c1); //⇒ 44032
        System.out.println(Integer.toHexString(c1)); //⇒ ac00 → \uAC00 : 1010 1100 0000 0000

        //* 논리형
        int a=20;
        boolean b=a>10; //비교, 논리연산의 결과인 boolean
        //true(==1), false(==0)
        System.out.println(b); //⇒ true

        //변수는 같은 이름을 다시 선언(생성)할 수 없다.
        //└─ 선언 : 생성
        b=false;
        b=true;
        b=(10>20);
        b=true||false;
        //변수 : 데이터를 계속 다르게 참조할 수 있는 것.

        final double PI=3.14;
        //상수(const) : 첫번째 참조한 데이터를 바꿀 수 없는 것.(constant)
        //└─ 절대 바꿀 수 없는(혹은 바뀌지 않는) 정보성 데이터(약속)를 정의하기 위해서 사용.

        //if else if else
        //switch
        //while

        int age=66;
        if(age>=20){ //분기 (조건이 true 일 때 실행되는 분기)
            System.out.println("주류 구입");
        }else if(age>=60){
            //else if : 복잡한 분기를 생성(위쪽 분기가 만족되지 않을 때만 실행)
            System.out.println("주류 할인");
        }else{ //모두 만족하지 않을 때
            System.out.println("미성년자는 구입 불가");
        }   //주류 할인까지 결과값이 나올 수 없음. true가 위에 이미 있어서..^^
        // == != ! >= <= > <
        switch (age/10){
            case 2,3,4,5 :
                System.out.println("주류구입"); break;
            case 6,7,8,9,10 :
                System.out.println("주류할인"); break;
            default :
                System.out.println("미성년자 구입 불가");
        }

        while(true){ //무한 반복문
            Thread.sleep(1000);
            System.out.println("반복문");
        }

    }
}
