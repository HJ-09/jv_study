package com.kosmo;

class Out{
    int a=10;
    In in=new In();
    //new Out() ⇒ {a:10, in:new Int()}

    //static : 클래스 변수, 메서드 (**독립적**이기 때문에 객체와 관련x)
    static int b=20; //독립적인 친구임
    //new Out() ⇒ {a:10, in:new Int(),b:20} → 절대 이렇게 생성 xxx

    class In{ //← 이 친구를 inner(=nested) class(내부클래스)라고 부름미당
        //내부클래스는 보통 class 내부에서만 사용하려고 만든 자료형임. 여기서는 Out 클래스에서 사용하려고~
        //Out.jave ⇒ Out.class
        //         ⇒ Out$In.class
        int score;
        String num;
    }
    static class A{} //정적 내부 클래스 ⇒ 외부 클래스(여기서는 Out)의 이름만 가져다 씀. 독립적이라서~
    //└─ 얘 이름은 그냥 A 아니고 Out.A 임.
}

public class L29InnerClass {
    public static void main(String[] args) {
        System.out.println("이너클래스 시작");

        //In in = new In(); ⇒ 불가능. 내부클래스는 외부클래스에 소속된 형태이기 때문에 독립적으로 존재할 수 없음.
        //Out.In in = new Out.In(); ⇒ 이것도 불가능.
        //└─ 내부 클래스 객체를 만들려면, 외부 클래스 객체가 먼저 있어야 함.
        Out out=new Out();
        Out.In in=out.new In(); //가능은 하지만, 이렇게 사용하는 목적이 아님. So, 작성불편 ~,~
        Out.In in2=new Out().new In(); //얘도 마찬가지 ~,~

        System.out.println(new Out().a);
        System.out.println(Out.b);

        Out.A a=new Out.A(); //얘는 static 클래스라서 독립적으로 쓸 수 있음^^


    }
}
