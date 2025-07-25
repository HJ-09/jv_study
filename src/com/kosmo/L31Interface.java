package com.kosmo;
//새를 만들어 볼게~
interface Flyable{ //보통 미완성 설계도에 able을 붙이는 경향이 이뜸.
    //interface는 완전한 미완성 설계도. 얘도 abstract와 마찬가지로 객체가 될 수 없음
    public void fly();
        /*public void fly(int direct){
            System.out.println(direct+"로 날아라");
            }*/
    //1.미완성 설계도이기 때문에 메소드를 구현할 수 없다. (=바디를 쓸 수 없다)
    //2.필드를 작성할 수 없다. ⇒ 다중구현시 우선 순위를 정하기 어렵기 때문에.
    int a=10; //자동으로 클래스 멤버(static)로 구현됨. int 앞에 자동으로 public static이 생김.
    //3.무조건 공개된(public) 함수만 작성 가능. public이라고 쓰든 안 쓰든 public임. interface에는 중요한 기능만..!


}

interface Swimmable{
    int a=100;
    void swim();
}

//★ 다중상속 :부모클래스들이 같은 이름의 필드나 메서드를 가지고 있다면, 우선순위를 정할 수 없음. 그래서 필드 못쓰는 것.
//다중구현이 가능한 이유 ⇒ 데이터 충돌(필드→작성불가)이나 구현간의 충돌(메서드→추상메서드로 대체)이 없어서.
class Duck implements Flyable, Swimmable{ //interface는 구현을 강제할 때, extends 아니고 implements 사용. (다중구현 가능)
    @Override
    public void fly(){
    }

    @Override
    public void swim() {

    }
}


public class L31Interface {
    public static void main(String[] args) {
        //new Flyable();
        System.out.println(Flyable.a); //객체 없이 혼자서 데이터로 존재 (==static)
    }
}
