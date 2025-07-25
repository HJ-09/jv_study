package com.kosmo;

interface Carable{
    void drive();
}
class CarVolvo{
    int y=0;
    //인스턴스 변수(필드) : 객체가 존재하는한 계-속 존재.
    void run(){
        final int x=0;
        //local 변수 : 메서드가 호출될 때만 메모리로 존재.
        //Carable 타입을 객체로 꼭 사용해야합니다.
        Carable carable=new Carable() {
            @Override
            public void drive() {
                //익명클래스에서 로컬변수를 참조하면 로컬변수는 final로 바뀌어서 변수가 다른 데이터를 참조하지 못하게 함.
                System.out.println("현재 위치는 "+x+","+y);
                //++x;  ⇒ 메서드 안에 있는 로컬변수여서 변수 사용 불가능..
                ++y;
            }
        };
        carable.drive();
    }
}


public class L33AnonymousLocalVar {
    public static void main(String[] args) {
        //익명클래스로 타입 제작시 로컬변수를 참조하는 경우 주의해야할 점 **

        //main 메서드에서 호출하는 데이터를 스택메모리에 보낸당..!
    }
}
