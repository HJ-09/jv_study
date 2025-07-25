package com.kosmo.ex;

//과제 1. 부모(이름, 나이, 성별), 자식(상속 후 이름 재정의) 만드세오.
/*class 부모{
    String 이름="김철수";
    int 나이=54;
    String 성별="남자";
    }

class 자식 extends 부모 {
        String 이름="김희철";
    public String toString() {
        return "이름 : " + this.이름 + ", 나이 : " + this.나이 + ", 성별 : " + this.성별;
    }
}

public class S22Inheritance {
    public static void main(String[] args) {
        //자식 정보를 출력하시오.
        자식 c=new 자식();
        System.out.println(c);
    }
}*/


//과제2. 부모가 이름을 초기화 하도록 구현하세요. 자식 클래스에 발생하는 문제 해결+메인함수도 문제해결 go!
//초기화 하라 ⇒ 생성자를 만들어라

class 부모{
    String 이름="김철수"; //회색으로 바뀌었다는 것은 쓸 일이 없다는 의미.
    int 나이=54;
    String 성별="남";
    부모(String 이름){
        this.이름=이름;
    }
}

class 자식 extends 부모 { //자식이 부모를 객체로 가진다는 의미.
    //기본 생성자 → 자식(){super();}
    자식(String 이름){
        super(이름); //super는 부모 class를 지칭.
        // super는 항상 맨 위에서 호출되어야 함. 부모 필드를 ""먼저"" 정의해야 자식 필드 재정의 할 수 있음.
        this.이름=이름; //자식 필드에서 다시 재지정해야 밑에 String 이름="김희철";의 값이 출력되지 않음.
    }
    String 이름="김희철";
    public String toString() {
        return "이름 : " + this.이름 + ", 나이 : " + this.나이 + ", 성별 : " + this.성별;
    }
}
public class S22Inheritance {
    public static void main(String[] args) {
        //자식 정보를 출력하시오.
        자식 c=new 자식("희철");
        System.out.println(c);
    }
}



/*
⸻

📘 자바 상속(Inheritance) & super() 생성자 호출 수업 정리

⸻

1. 상속 기본 개념

✅ 정의
	•	상속(Inheritance): 기존 클래스(부모)의 필드와 메서드를 새로운 클래스(자식) 에 물려주는 기능
	•	extends 키워드 사용

✅ 용어 정리

용어	        설명
부모 클래스	상속해주는 클래스 (super class) :상위 클래스
자식 클래스	상속받는 클래스 (sub class) :하위 클래스
extends	    상속을 명시하는 키워드
super	    부모의 멤버 또는 생성자를 가리키는 키워드

⸻

2. 필드 재정의 (이름 겹칠 때의 처리)

🔎 예시 코드

class Parent {
    String name = "부모";
    String birth = "1986-05-25";

    public String toString() {
        return "Parent{ name :" + this.name + ", birth :" + this.birth + " }";
    }
}

class Child extends Parent {
    String name = "자식"; // 필드 재정의 (부모의 name을 숨김) ⇒ 우선순위 가져감

    @Override
    public String toString() {
        return "Child{ name :'" + this.name + "', birth :'" + this.birth + "' }"; //위에 재정의한 자식 필드가 없으면 this여도 super여도 상관없음.
    }
}

✅ 개념 정리
	•	자식 클래스에서 부모와 같은 이름의 필드를 선언하면 → 부모 필드는 가려짐(숨겨짐)
	•	this.name → 자식 클래스의 name 참조
	•	부모의 name을 사용하고 싶으면 super.name 사용 가능

⸻

3. super() 생성자 호출

🔎 예시 코드

class 슈퍼 {
    int a;

    슈퍼(int a) {
        this.a = a;
    }
}

class 디스 extends 슈퍼 {
    디스(int a) {
        super(a); // 반드시 부모 생성자를 호출해야 함 ☆☆☆☆☆
    }
}

✅ 개념 정리
	•	자식 객체가 생성되면 반드시 부모 객체도 함께 생성되어야 한다
	•	부모 클래스에 매개변수가 있는 생성자만 존재한다면 → 자식 클래스는 반드시 super(값)으로 호출해야 함
	•	자식 생성자에서 super()를 가장 먼저 호출해야함 (자동 또는 수동)

⸻

4. super 키워드의 용도 요약

사용위치	        의미
super()	        부모 클래스의 생성자 호출
super.필드	    부모의 필드 접근
super.메서드()	부모의 메서드 호출

4-1. this
this()       내 객체 생성자 호출
this.필드     내 객체 필드 접근
this.메서드() 내 객체 메서드 호출


⸻

5. 실행 결과 요약

Parent p = new Parent();
System.out.println(p);  // 출력: Parent{ name :부모, birth :1986-05-25 }

Child c = new Child();
System.out.println(c);  // 출력: Child{ name :'자식', birth :'1986-05-25' }

→ 자식 클래스가 toString()을 오버라이딩 했기 때문에 Child 인스턴스는 자식 쪽 출력 형식으로 보여짐

⸻

✍️ 보충 설명
	•	자식 클래스가 부모의 생성자를 사용할 수 있는 이유는 super() 덕분
	•	필드 재정의는 변수 숨김(variable hiding)이라고 하며, 메서드 재정의인 오버라이딩과는 다름

🔎 보충 설명 예시 코드

class 슈퍼 {
    int a;

    public void sum(){}

    슈퍼(int a) {
        this.a = a;
    }
}

class 디스 extends 슈퍼 {
    int a=10; //필드 재정의 → 변수 숨김

    @Override //→ 재정의 확인. 실행 전에 작동. 어노테이션
    public void sum(){} //메서드 재정의 → 오버라이딩

    디스(int a) {
        super(a); // 반드시 부모 생성자를 호출해야 함 ☆☆☆☆☆
    }
}


⸻
*/