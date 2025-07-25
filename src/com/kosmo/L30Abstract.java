package com.kosmo;
abstract class AbstractClass{
    int a=10; //추상클래스도 필드를 가질 수 있음.
    //└─추상클래스는 상속의 형태로 클래스에 포함되기 때문에 필드를 가질 수 있다.
    //상속(extends)은 부모-자식으로 우선순위가 있다. ★★★

    //추상클래스 내부에서만 추상 메서드를 작성할 수 있다.
    abstract public void sum();  //⇒ 추상메서드이기 때문에 자식이 반드시 구현해야함.

    //추상클래스를 만드는 이유
    //1.클래스를 만들기 위한 중간 단계의 설계도에 해당. ⇒ 객체가 될 수 없다.
    public void sum(int a){ //일반 메서드도 쓸 수 있음. why? 중간단계라서. //일반 메서드라서 바로 사용 가능.
        System.out.println(a);
    }
    //2.상속받은 클래스가 추상 메서드의 구현을 강제한다. ⒜가 예시임.
}

//클래스는 객체를 만들기 위한 완벽한 설계도이기 때문에 미완성된 추상메서드를 포함할 수 없다. ⇒ 때문에 추상메서드의 구현을 강제한다.
class ChildClass extends AbstractClass{ //---⒜
    @Override //추상메서드를 재정의하는 것도 오버라이드. 부모니까.
    public void sum(){
        //super.sum(); ⇒ 부모의 추상메서드는 미완성이기 때문에 호출할 수 없음(=구현할게 없음)
        System.out.println("추상 메서드를 구현한 함수");
    }

    @Override //부모가 정의한 메소드를 자식이 재정의 하는 것.
    //└─ 오버라이드 : 부모가 정의한 메소드 대신 자식이 재정의한 메소드가 실행되도록 한다.
    public void sum(int a){
        super.sum(a); //⇒ 부모가 이미 구현한 메서드이기 때문에 super로 호출 가능.
        System.out.println("안뇽");
    }
}


public class L30Abstract {
    //abstract public void sum();  ⇒ class에서 쓰는거 아니고 abstract 클래스에서 쓰는 것.
    //추상적인(구체적이지 않은 ⇒ 바디(본문 _스코프{})가 없음) abstract 메소드
    public static void main(String[] args) {
        //new AbstractClass(); ⇒ 불가능
        new ChildClass(); //⇒ 바디가 있어서 객체 만들 수 있움.

        new ChildClass().sum();
        new ChildClass().sum(10);


    }
}
