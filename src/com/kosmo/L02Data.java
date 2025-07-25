package com.kosmo;

import java.sql.SQLOutput;

public class L02Data {
    public static void main(String[] args) {
        //(모든)프로그램은 계산(연산)을 하거나 일(출력, 입력 등)을 할 때 모든 것을 데이터로 (메모리에) 저장합니다.
        //자바는 연산을 위한 숫자 데이터(기본형/원시형 _컴퓨터가 다루는 기본 언어가 숫자이기 때문)와 관리를 하기 위한 자료 데이터(자료형)로 나누어 저장합니다.
        //수학적 연산(+ - * / % >> << 등)
        //숫자 데이터 ⇒ 실수(12.3312), 정수(13)
        System.out.println(12.33); //실수
        System.out.println(13);    //정수
        System.out.println(13/3);  //＼데이터가 정수, 실수 나뉘어 있어서 정수끼리 연산하면 정수의 결과값이 나옴.
        //자바는 정수 데이터와 실수 데이터가 분리되어 있고 정수끼리 연산하면 정수만 반환합니다.
        System.out.println(13.0/3.0);
        //자바는 수를 표현할 수 있는 크기가 정해져 있습니다. ＼메모리가 유한하기 때문에 무한대로 표현되지 않음.
        System.out.println(13/3.0);
        //실수와 정수를 연산하면 더 정확한 값인 실수의 결과가 반환(return)됩니다.

        //자바는 참(1⇒true)과 거짓(0⇒false)을 표현하는 데이터 boolean(1과 0)이 존재합니다.
        //비교연산자 (A>B, A<B, A=B(==), A≠B(!=), A≤B(<=), A≥B(>=))
        System.out.println(1==1); //결과값 -> true
        System.out.println(10<1); //결과값 -> false
        System.out.println("A");  //문자열 → 자료형 "ABCDEFG" 여러개 나열 가능
        System.out.println('A');  //숫자 \여러개 나열 불가능
        //컴퓨터는 숫자만 다루기 때문에 모든 문자를 번호로 치환(인코딩)해서 사용.
        //파일 인코딩 : utf-8 이라면 → utf-8의 문자표를 이용해서 문자를 번호로 치환한다.
        System.out.println((int)'A'); //문자 A를 정수로 바꿔라 는 의미.
        // ''(작은 따옴표)문자 데이터는 정수 데이터입니다.

        //기본형(숫자) 데이터에는 정수(int)와 실수, boolean(참/거짓), char(character)
        System.out.println('A'+'A');
        //System.out.println(true+true); → 2, 자바 문법으로는 불가능.

        //자료형 데이터 : 데이터들을 묶어서 관리
        int[]nums={80,82,100,99,70,100}; //배열 자료형(이 자체로는 수학적 연산 불가능) _nums는 {}안에 숫자들의 이름.
        //int[] : 데이터 타입, 정수로 된 배열
        //nums : 생성한 데이터를 참조하는 이름(변수→다른 것도 참조할 수 있다는 뜻 ⇔ 상수)
        //배열 : 순서가 있는 자료형
        char[]arr={'H','e','l','l','o'};
        String str="Hello"; //문자열 자료형 (arr와 str은 데이터가 같다. 둘 다 자료형 데이터)
        System.out.println(str);
        str=new String("안녕"); //객체 자료형 ⇒ str="안녕"; 이 대신할 수 있다.
        System.out.println(str);

    }
}
