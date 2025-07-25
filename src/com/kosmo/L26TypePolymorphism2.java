package com.kosmo;

class P{
    void show(){
        System.out.println("안뇽");
    }
}
class C extends P{ //C2랑 부모(P)가 같음.
    //기능 수천가지
}

class C2 extends P{ //C랑 부모(P)가 같음.
    //기능 수천가지
    void callC2(){}
}

public class L26TypePolymorphism2 {
    public static void main(String[] args) {
        C c=new C();
        C2 c2=new C2();

        P p;
        p=c;
        p.show();

        p=c2;
        p.show();
        //부모 타입의 변수로 객체를 참조하는 것 = 타입의 다형성
        //부모 타입의 변수로 여러 객체를 참조할 수 있어서 편리함.

        //p.callC2(); → 불가능

        //부모타입을 참조하던 변수를 자식타입을 참조하도록 바꾸는 것 ⇒ 형변환(캐스팅 형변환)
        c2=(C2)p; //c2가 p에서 C2로 바뀌어라.
        c2.callC2();
        L26TypePolymorphism2.callShow(c);
        L26TypePolymorphism2.callShow(c2);
        L26TypePolymorphism2.callShow(p);
        //타입의 다형성을 이용하면 메서드 설계가 유용함.

        //★ 객체지향 문법 다형성 : 오버로드, 오버라이드, 타입의 다형성(하나의 이름으로 여러개의 역할을 하는 것)


        //객체 instanceof 타입 : 비교연산자 ⇒ 해당 객체가 어떤 타입(부모)인지 비교연산
        String str="안녕";
        System.out.println(str instanceof String);

        c2=new C2();
        System.out.println(c2 instanceof C2);
        System.out.println(c2 instanceof P);

        Object obj=new C2();
        System.out.println(obj instanceof String);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof P);
        System.out.println(obj instanceof C2);
        System.out.println(obj instanceof C);

    }
    static void callShow(P c){c.show();}
    //void callShow(C c){c.show();}
    //void callShow(C2 c){c.show();}
}

