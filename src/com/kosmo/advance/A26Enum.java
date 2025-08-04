package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;

//인터페이스 내부에 정의된 전역변수가 클래스멤버로 상수가 되는지 설명 ↓
interface Direct{
    int NORTH=0; //public static final이 자동으로 앞에 붙어있음. 왜? ↓
    int SOUTH=1;
    //인터페이스는 필드를 가질 수 없다. ∴ 인터페이스 내부에 정의된 변수는 자동으로 static 필드인 클래스 멤버를 가지는 것.
    //인터페이스 내부에 쓰는 모든 것들은 public이 붙어욤. 왜? 인터페이스는 누군가가 사용하는 용도의 무언가를 만들어내는거니까 감출 필요가 x.
    //final이 붙는 이유는, 클래스 멤버이기 때문에. 클래스 멤버는 정적 메모리에 저장, 누구나 다 접근 후 바꿀 수 있기 때문에 문제를 야기할 수 있음.
}


enum DirectEnum{
    //타입, 접근지정자, 상수 등 쓸 필요 없음.
    NORTH, SOUTH //쉼표로 구분. 세미콜론도 필요 없음

}


public class A26Enum {
    //Direct d=new Direct(); //인터페이스는 설계도일 뿐 객체가 될 수 없음. 인터페이스는 필드를 가질 수 없음.

    public static final int NORTH=10;
    public static final int SOUTH=11;


    public static void main(String[] args) {
        //열거형 enum ⇒ 타입(정보로써의 상수 정의용)
        //상수(Constant, cont) ⇒ 처음 참조한 값을 바꿀 수 없는 것. 정보로 사용(바뀌지 않는 사실).
        //변수(Variable, var) ⇒ 참조한 값을 계속 바꿀 수 있는 것

        //public : 다른 패키지 누구나 다 사용가능 /private : 클래스 내부 /default : 같은 패키지
        //static : 클래스 멤버. JVM이 시작될 때 데이터가 되어라는 의미. 정적 메모리 영역인 메소드 영역에서 계속 유지.
        //public static final ⇒ 정보로 사용되기 위해 누구나 다 사용 가능해야 하고, 선언된 즉시 호출 가능.


        //상수의 사용 목적
        //①. 데이터의 상태를 나타내기 위해서 ↓
        new JFrame().add(new JButton(), BorderLayout.NORTH);
        //②. 조건의 상태를 나타내기 위해서 ↓    ⇒ 대부분의 ㅅㅏ용목적
        //③. 약속된 수학적 수를 사용하기 위해 (ex. PI ...)
        int code=0;
        switch (code){
            case A26Enum.NORTH -> System.out.println("위로 이동"); //-> 이게 있으면 break; 안 써도 됨.
            case A26Enum.SOUTH -> System.out.println("아래로 이동");
        }
        switch (code){
            case Direct.NORTH -> System.out.println("위로 이동");
            case Direct.SOUTH -> System.out.println("아래로 이동");
        }
        //정수로 상태를 표현하면 조건의 분기 타입이 어떤 것이든 사용가능하게 됨
        //so, 고유 상태를 갖는 상수 타입을 만들자 → enum ..!


        //enum의 지역변수는 클래스 멤버로 고유값을 갖는다.
        DirectEnum direct=DirectEnum.NORTH;
        switch (direct){
            case NORTH -> System.out.println("위로위로 이동");
            case SOUTH -> System.out.println("아래아래로 이동");
        }
        //switch : 조건으로 기본형 데이터와 문자열, 열거형(enum) 외의 자료형을 사용할 수 없음.


    }
}
