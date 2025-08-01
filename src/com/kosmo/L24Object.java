package com.kosmo;
class AA{
    String name;
    void call(){
        System.out.println("AA입니다.");
    }
}

class BB extends AA {
    String name; //⇒ AA의 name을 BB의 name으로 재정의.


    //@ → 어노테이션. :== 주석임(// 이거랑 다른 주석). 컴파일 될 때 실행. (main이 될 때 실행)
    //@Override //부모에 같은 함수가 있는지 검사하는 어노테이션. 필드엔 안 쓰고 메서드에만 사용.
    //└─ 꼭 필요한 코드는 아니지만 더 명시적이고 오류를 줄일 수 있음.
    //부모의 메소드를 자식이 재정의하는 것을 오버라이딩, 오버라이드라고 부름.
//    void call(){
//        System.out.println("BB입니다.");
//    }
    @Override //Object.toString 재정의
    public String toString() {
        return super.toString()+"\nBB{name:"+name+"}"; //타입 @ hashcode ⇒ toString
    }

    void call(int a){}
    //└─ 오버로드, 오버로딩 : 이름이 같은 함수가 매개변수만 다르게 존재하는 것.
    //개발자가 게으르기 때문에 이름 짓기 귀찮아서 존재함.~
}


class 오브젝{
    //상속 받은 적이 없다 ⇒ 재정의 할 것이 없다
}

public class L24Object {
    public static void main(String[] args) {
        BB b=new BB();
        b.name="BB군";
        System.out.println(b);
    }
}