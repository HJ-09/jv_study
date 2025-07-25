package com.kosmo;

class A {//전역(전체영역)/global scope → 규칙 : 필드나 메서드 정의 외에 다른건 할 수 없음.
    //필드 선언법 ⇒ 전역에 선언할 수 있다.
    public int n=10;
    boolean isMarried=false;
    private int score=10;

    //접근지정자 : public '' ⇒ default, protected, private
    //public → 어디서든 접근, default → 같은 패키지 안에 있는 클래스는 접근, protected → 상속 관계에서 접근, private → 내부에서만 사용

    //메서드 : 객체의 동작을 정의

    //return ⇒ 반환값
    //void ⇒ 반환값 없는 함수
    private String name="혜지";
    public void callName(){
        System.out.println(name);
    }
}
//┌─ 사용자 정의 자료형, type(자료의 형==type)
//class는 타입이야!(객체의 타입)
class Calc{
    //생성자 : 객체를 만들 때 필드를 재정의하는 용도 ☆☆☆
    String name="계산기";
    public Calc(){} //default 생성자 ⇒ class를 만들면 기본적으로 있는 생성자
    //new Calc(); ⇒ 객체 생성시 호출되는 생성자
    public Calc(String name){
        this.name=name; //this : 필드접근자
    }
    public void info(){
        System.out.println(this.name+"입니다.");
    }


    //더하기를 하는 동작을 정의
    public double plus(double a, double b, double c){ //()괄호 안에 적어둔 것 = 파라미터
        return a+b+c;
    }


}

public class L16ClassObject {
    public static void main(String[] args) {
        //class ⇒ 객체의 타입
        //object ⇒ 객체(자료형, 인스턴스_instance)
        A a=new A();
        //new A(); ⇒ 객체. 해당 객체의 타입은 com.kosmo.A
        //객체는 필드(자원), 메서드를 가질 수 있음.
        //객체는 필드접근자에 '.'으로 필드와 메서드를 접근할 수 있음.
        System.out.println("new A().n :"+a.n);
        System.out.println("new A().n :"+new A().n); //참조된 변수가 없기 때문에 사용하자마자 삭제됨.
        System.out.println(a.isMarried);
        a.isMarried=true;
        System.out.println(a.isMarried);
        //System.out.println(a.score); → private는 외부에서 접근 x


        //new 연산자료 생성되는 객체는 JVM에 heap 메모리 영역에 저장.
        //heap 메모리 영역에 존재하는 GC(GarbageCollector:쓰레기 수집기)가 사용하지 않는 객체를 정리.
        //└─ 때문에 객체가 쉽게 만들어지고 버려진다는 뜻으로 인스턴스라 부름!

        a.callName();


        Calc calc = new Calc("공학계산기");
        System.out.println(calc.plus(1.2,3.3,4.4)); //파라미터 갯수를 맞춰줘야 함.

        calc.info();


    }
}
