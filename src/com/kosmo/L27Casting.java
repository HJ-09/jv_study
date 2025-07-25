package com.kosmo;

public class L27Casting {
    public static void main(String[] args) {
        //변수, 데이터
        //데이터 : 저장되는 것
        //변수 : 데이터를 담는 것(참조)
        int a=10; //a와 10이라는 데이터를 만들고 int 타입의 변수 a가 10을 가리킨다..!
        //10이라는 정수 데이터를 생성
        //a 이름의 정수 타입을 참조하는 변수를 생성
        //= : 참조 대입연산자
        //변수를 사용하는 이유 : 데이터를 ""재사용""하려고

        Object object=new Object();
        Object var=new Object();
        //이름은 카멜규칙(개발자간의 약속) /카멜규칙 문자는 무조건 영어로! 시작 소문자 새단어 대문자. ex) bigMouse, smallPanda
        //참조, 할당, 대입 다 같은 말 ~ ~ ~

        //기본형 데이터 : 숫자로 된 데이터로, 변수를 정의할 때 무조건 소문자로 작성
        byte b=127; //⇒ 숫자(기본 데이터)로 b가 참조
        Byte bObj=127; //⇒ 오른쪽은 기본형(숫자)인데 오른쪽 타입이 대문자인 경우는 (127을) 객체로 만들어서 bObj 참조함..!
        //└─ 랩퍼클래스라고 함.
        //Boolean, Byte, Short, Integer, Long, Float, Double, Character ⇒ 기본형의 객체형태(연산 외의 기능 도와줌)(얘네가 랩퍼클래스)
        //기본형은 연산만 가능해서 도와줄 클래스가 필요함. 그래서 기본형의 객체형태가 있는 것!
        System.out.println(b);
        System.out.println(bObj.byteValue());
        int i=10;
        System.out.println(i);
        Integer iObj=10;
        System.out.println(Integer.toHexString(10));
        //기본형 데이터가 자료형 데이터로 변하는게 ""형변환""      // 제대로 적은거 맞는지..?
        //변수가 자료형이면 ""자동으로"" 형변환~~
        //자료형 → 기본형은 연산할 때 자동으로 형변환
        ++iObj;
        ++i;
        int i2=iObj; //대입 연산. iObj 뒤에 .intValue()가 생략되어있음.
        double d=iObj; //iObj 뒤에 .doubleValue()가 생략되어있음.

        //작은 수가 큰 수로 바뀔 때 형변환
        i=1000000;
        long l=i; //작은 수를 큰 수로 바꿀 때는 아무 문제 없음! 자동 형변환
        l=1000000000000000000l;
        float f=l; //실수(지수부) 데이터 타입이 정수 데이터 타입보다 더 큰 수를 표현. so, 이것도 자동 형변환(작은 수 → 큰 수)
        f=100000000000000000000000000000000000000f;
        d=f;

        //큰 수가 작은 수로 바뀔 때 형변환  ⇒ 자동 아니고 캐스팅(강제 형변환) 해줘야함. (타입)
        System.out.println(Short.MAX_VALUE); //32767
        //└─ 타입의 가장 최대를 알고 싶을 때
        i=32767;
        //short s=i; 이거는 x
        short s=(short) i;
        System.out.println(i); //32767
        System.out.println(s); //32767
        //정수는 형이 강제로 바뀔 때, 데이터 손실이 일어남.
        //거꾸로 반복하는 행위 발생..! ((ex)) i=32770; 으로 했을 때 s 출력값은 -32766 으로 나타남. 오버플로우

        //실수는 데이터 손실이 일어났을 때 무한대(Infinity)라고 뜸
        d=1.0E300;
        f=(float) d;
        System.out.println(f); //Infinity ⇒ 숫자가 너무 커서 이렇게 뜸
        d=d*d*d*d*d*d*d*d*d;
        System.out.println(d); //Infinity ⇒ 데이터 손실이 너무 커서 이렇게 뜸

        //char를 정수로 형변환 : 인코딩 라벨의 번호를 출력
        char c='가';
        System.out.println((int)c); //44032




    }
}
