package com.kosmo;

class 슈퍼 {
    int a;

    슈퍼(int a) {
        this.a = a;
    }
}
class 디스 extends 슈퍼{
    /*디스(){
        super(10); //디스 규칙이 안 바뀌고 슈퍼(동일하게)만 호출해도 되기는 함.
    }*/
    디스(int a){
        super(a); //new 슈퍼(10);
    //자식 객체가 생성될 때 부모도 객체로 만들어짐.
    //└─ 부모 객체가 있어야 자식 객체를 쓸 수 있다는 말 x. 자식 객체 내부에 부모 부분이 반드시 초기화 되어있어야 한다는 말.
    //이 때 부모가 생성자규칙이 강제되어 있으면(바뀌어 있으면) 자식이 꼭 부모의 생성자를 호출해야함.
    }
}

public class L23SuperConstructor {
    public static void main(String[] args) {
        슈퍼 s=new 슈퍼(10);
    }
}
