package com.kosmo;

interface Aable{}
class Aimp1 implements Aable{}
class Aimp2 implements Aable{}

//제네릭은 '해당 타입이(설계도,클래스) 객체가 될 때 필드나 메서드의 매개변수의 타입을 구체화 시키면 좋겠어.' 역할.
class GenericClass<T>{

    Object o; //가장 추상화 되어있는 필드(구체화 x)
    Aable a; //인터페이스로 일반화한 필드(구체화 o)
    T t; //객체가 생성될 때 전달된 제네릭으로 일반화한 필드
    //└─ 필드 제네릭

    //┌─메서드 제네릭
    void callGeneric(T t){
        System.out.println(t.toString());
    }

    void call(Object o){ //어떤 것이든 호출 가능
        System.out.println(o.toString());
    }
    //┌─ 매개변수 타입을 구체화한 것
    void callAable(Aable a){ //부모 타입이 Aable인 것만 할래!
        System.out.println(a.toString());
    }
}

class GenericExtends<T extends Number>{ //Number를 상속하고 있는 친구만
    //제네릭 자체에 제한주기 extends Type ⇒ Type의 자식만 제네릭으로 사용가능
    void call(T t){

    }
}




public class L36Generic { //제네럴 제네릭 : 일반화 하기(특징 없애기), Object 타입을 구체화 시키는 것.
    public static void main(String[] args) {
    GenericClass g=new GenericClass();
    g.call(10);
    g.call("헤ㅔ이");
    g.call('B');
    g.call(new L36Generic());
    //└─ 타입의 다형성
        //모든 객체의 부모인 Object 매개변수로 모든 객체를 받고 있음. ⇒ 너무 조상 부모의 매개변수를 사용하면 오류를 동반할 수 있음. 사용도 불편.
    g.callAable(new Aimp1());
    g.callAable(new Aimp2());
    g.callAable(new Aable() {
        @Override
        public String toString() {
            return "할로 난 Aable 인터페이스-익명클래스야";
        }
    });
//    g.callAable(1);
//    g.callAable("안녕");

    g.callGeneric("안녕"); //⇒ <> 제네릭을 비우면 자동으로 Object
    GenericClass<Number> g2=new GenericClass(); //객체는 생략해도 되는데 타입은 생략하면 안댐! 띠용?
    //g2.callGeneric("디지몬");
    g2.callGeneric(10);
    g2.t=0;
    System.out.println(g2.t);


    GenericClass<String> g3=new GenericClass<>(); //타입과 동일한 제네릭으로 생성.
    // 다이아몬드 생성자, 좌변에서 타입 추론, 우변제네릭타입 생략, type interface 등.
    //g3.callGeneric(19);
    g3.callGeneric("초코빵");

    //┌─ 제네릭은 꼭 자료형 타입만 작성가능(기본형 불가)  ⇒ 메모리 입장에서 단점임. why? 메모리낭비
    //GenericClass<int> g4=new GenericClass<int>();  ⇒ 자료형이여서 오류.
    //

    GenericExtends<Double> d=new GenericExtends<>();
    GenericExtends<Long> l=new GenericExtends<>();
    GenericExtends<Short> s=new GenericExtends<>();
    //GenericExtends<boolean> b=new GenericExtends<>(); ⇒ 자바는 boolean을 숫자로 인식하지 않음.

    GenericClass<? super Integer> superG=new GenericClass<>();
    //Integer 보다 부모(상위) 클래스만 사용가능

    }
}



