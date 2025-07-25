package com.kosmo;
class Access{
    //접근 지정자 : 필드나 함수의 접근 권한을 지정 ⇒ 캡슐화
    private int a=10; //같은 class 내부에서 접근 가능
    public int b=20; //패키지 관계없이 누구나 다 접근 가능
    int c=23; //default(기본 접근자). 같은 패키지의 클래스들이 다 접근 가능.
    protected int d=20; //상속관계는 접근 가능
    //┌─ 이름이 같은게 여러개 있는 것 ⇒ 오버라이드(딩) / 매개변수 숫자가 다름.
    Access(){}
    Access(int a){
        this.a=a;
    } //a값이 private 해서 직접 건드릴 수 없으니 내부에서 참조하여 사용.

    @Override
    public String toString() {
        return "Access{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}


public class L21AccessModifiers {
    private int a=10;
    public int b=20;
    int c=30;
    public L21AccessModifiers(int a){
        this.a=a;
    }

    @Override
    public String toString() {
        return "L21AccessModifiers{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
    Access access=new Access();
    //access.a=20; //private 타입이어서 내부 클래스에서만 사용 가능. 컴파일 오류.
    Access access2=new Access(1000);
    System.out.println(access2);


    L21AccessModifiers a=new L21AccessModifiers(2000);
    a.a=99;
    a.b=998;
    a.c=9998;
    System.out.println(a);

    access2.b=999;
    access2.c=9999; //다른 패키지의 클래스는 접근 불가능

    System.out.println(access2.b);





    }
}
