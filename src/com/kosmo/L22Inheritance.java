package com.kosmo;
class Parent{
    String name="부모";
    String birth="1986-05-25";

    public String toString(){
        return "Parent{name : "+this.name+", birth : "+this.birth+"}";
    }


}
//extends가 의미하는 것 : 상속
//상속하는 대상 → 부모, 상속받는 대상 → 자식
//자식은 부모의 필드 모두를 물려받는다.
class Child extends Parent{
    String name="자식"; //부모가 물려준 것을 바꾼다.(필드를 재정의함.)
    //String birth="2002-05-06";


    @Override
    public String toString() {
        return "Child{" +
                "name : " + name +
                ", birth  : " + birth +
                '}';
    }
}

public class L22Inheritance {
    public static void main(String[] args) {
        Parent p=new Parent();
        //System.out.println(p.name);
        //System.out.println(p.birth);
        System.out.println(p);

        Child c=new Child();
        //System.out.println(c.name);
        System.out.println(c);
    }
}
