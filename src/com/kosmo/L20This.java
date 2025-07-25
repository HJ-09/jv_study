package com.kosmo;
class Stu{ //학교 어플로 학생 관리하기 위해 만듦. 학생이라는 데이터를 관리. ⇒ 자료형(묶어서 관리)
    //"A063015" 학번
    String 학번="A240123"; //한글이름의 변수나 필드를 작성할 수 있지만 권장하진 않음
    String 이름="김혜지";
    int 탄생=1995;
} //class Stu는 설계도.

class Stu2{
    String 학번="A2300333";
    String 이름="채정호";
    int 탄생=2003;
}

//개발자는 같은 필드를 갖는 다른 자료를 만들기 위해 타입을 매번 정하는 것을 정말 싫어함. So, 생성자를 만들어두자구~
class Stu3{
    String 학번;
    String 이름;
    int 탄생;
    //class를 만들면 눈에 보이지 않지만 작성된 생성자가 존재함.(기본(default)생성자)
    //public Stu3(){} ← 기본 생성자
    //다른 생성자를 작성하면 기본 생성자 사라짐. ⇒ 만든 생성자를 실행하도록 강제함.

    //생성자 : 처음 만들 때 주는 데이터로 객체를 만들게~
    Stu3(String 학번, String 이름, int 탄생){ //생성자가 실행(호출)될 때 소괄호 안에 주는 데이터를 파라미터(매개변수/전달데이터)라고 칭함.
    //this == new Stu3()과 같음.
    //this : 나(객체) 자신 / 필드접근자(필드, 함수, 생성자 접근(실행, 호출) 가능)
    this.학번=학번;
    this.이름=이름;
    this.탄생=탄생; //필드랑 매개변수랑 이름이 다르면 굳이 this. 안 써도 됨. 탄생=탄; 이렇게 해도 됨.

    //개발자의 습관
    //1. 필드는 this로 접근하자
    //2. 필드값을 바꾸는 변수의 이름은 필드와 똑같이 하자
        System.out.println(this.toString()); //this는 함수도 참조할 수 있음
    }
    //함수 (함수도 자료의 필드로 동작을 담당)
    public String toString(){ //toString : 객체 정보(필드) 출력
        return "학생의 이름은 : "+this.이름+", 학번은 : "+학번+", 탄생은 : "+this.탄생+"년도"; //this 없어도 괜츈.
    }
}


public class L20This {
    public static void main(String[] args) {
        //일을 시키는 곳
        /// ... 학생을 저장 관리 !
        Stu 혜지=new Stu(); //← 이렇게 new () 연산자 써야 class Stu가 자료가 됨.
        System.out.println(혜지.학번); //. → 만든 객체를 찾아보는 역할
        System.out.println(혜지.이름);
        System.out.println(혜지.탄생);
        혜지.이름="김혜진";
        System.out.println(혜지.이름);

        Stu2 정호=new Stu2();
        System.out.println(정호.학번);
        System.out.println(정호.이름);
        System.out.println(정호.탄생);

        Stu3 영주=new Stu3("A202233","송영주",2000); //new ()는 기본 생성자 호출.
        System.out.println(영주.학번);
        System.out.println(영주.이름);
        System.out.println(영주.탄생);

        //System.out.println(영주); //영주.toString() 출력


    }
}
