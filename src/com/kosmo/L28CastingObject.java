package com.kosmo;

public class L28CastingObject {
    public static void main(String[] args) {
        //★★★ 기본형과 자료형은 형변환이 다르다 ★★★
        //자료 데이터 : 데이터를 저장하는 용도
        //[], class : 자료 데이터 타입
        //[] : 길이와 인덱스가 있는 자료/ class : 필드가 있는 자료
        // 자료 데이터 생성 방법 >>Only 3가지<<
        //① new() 연산자로 생성자를 호출하는 방법 ⇒ new 클래스명();, new 타입[길이];
        //② {} : =new 타입[길이]를 생략하고 선언하는 배열의 리터럴 표기
        //③ "안녕" : 문자열이라고 하는 자료형 데이터를 리터럴하게 표기하는 방법. **조금 특이함**
        String h="안녕";
        String h2="안녕";
        String h3=new String("안녕");
        System.out.println(h==h2); //true
        System.out.println(h==h3); //false
        //문자열 데이터는 자료형 중에 유·일·하·게 더하기 연산이 가능 WoW
        System.out.println(h+","+h2+","+h3); //안녕,안녕,안녕
        //문자열은 문자의 배열형태인 자료이기 때문에 문자와도 더하기 연산이 가 능 !

        //배열을 제외하고 자료형은 모두 class로 생성되기 때문에 이름이 대문자로 시작.


        Animal ani=new Animal(); //class Animal을 객체로 만듦.
        //{name : null, birth : 0} ⇒ 초기값 설정.
        ani.name="기린";
        ani.birth=1986;
        //└─ {name : 기린, birth : 1986} //객체 완성. 객체=자료=인스턴스 다 같은 말 ~ ~

        Dog dog=new Dog();
        //{name : null, birth : 0, tail : null} ⇒ 초기값 설정.
        //근데 상속해온거니까 {super.name : null, super.birth : 0, this.tail : null} ⇒ 초기값 설정.
        dog.name="코에";
        dog.birth=2022;
        dog.tail="반토막"; //선샌님 강아지..^^!
        //└─ {name : "코에", birth : 2022, tail : "반토막"}

        //자료형의 형변환
        //방법
        //① 객체를 동일한 타입으로 생성하는 것. ⇒ 아무 일도 안 일어남. 정상
        //② 변수를 선언할 때 부모(super)타입으로 선언할 수 있음. ⇒ 업캐스팅, 형변환. (밑에 예시+설명有)
        Animal aniDog=dog;
        //└─ Animal에 있는 타입에 선언된 필드만 참조하겠다. 고로 tail을 Dog 클래스에만 있는 것이라서 사용 불가.
        //└─ {super.name : "코에", super.birth : 2022, dog.tail : "반토막"}
        //③ ②번일 때, 다시 ①번으로 바꾸는 경우.(부모를 참조하고 있다가 자식으로 다시 참조할 때)
        //└─ 객체를 부모타입의 변수로 참조 중에 다시 자식 본인의 타입으로 바꾸는 것. ⇒ 다운캐스팅, 강제형변환.
        //왜 "강제"형변환? → 자식을 다른 타입으로 잘못 작성할 수 있어서..! 무조건 명시해줘야 함. (타입) ← 이렇게.
        Dog dog2=(Dog) aniDog;



    }
}

//사용자 정의 자료형
//└─ 필요자료 : 필드(자료 데이터의 즨짜 자료), 메서드(동작), 생성자(자료를 만들 때 초기값을 제공)
//
class Animal{ //⇒ name과 birth를 저장하는 데이터의 용도임!!
    String name;
    int birth;
}

//상속 ⇒ 타입을 재사용
class Dog extends Animal{ //끌어온 타입을 부모(super)라고 함. 여기서는 Animal이 부모.
    //나 자신을 this라고 함. 여기서는 Dog이 this
    String tail;
}

