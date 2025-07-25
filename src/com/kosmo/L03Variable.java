package com.kosmo;

public class L03Variable {
    public static void main(String[] args) {
        //반지름이 2인 원의 넓이를 구하는 어플을 만들자!
        //반지름이 3인 원의 넓이를 구하는 어플을 만들자!
        //주석 : 실행이 되지 않는 코드
        /*
        /**
         */
//        System.out.println(2*2*3.14);
//        System.out.println(2*2*Math.PI);
        System.out.println(3*3*3.14);
        System.out.println(3*3*Math.PI);

        //변수 : 데이터를 참조하는 이름. 데이터의 타입을 명시해야 합니다.
        //└─(int, float, double, char, boolean, String, [])
        //int s=3; → 정수의 경우 int, 실수의 경우 double
        //└─ex) int z=3.0; (타입이 달라서 x), int s=4; (변수가 이미 지정되어 있어서 x)
        double r=3.0; //변수 선언(=변수 생성)
        //└─r과 3은 독립적으로 존재. 3이라는 변수(데이터)를 r이 참조하는 것(r은 3의 주소를 참조)이지, r이 3이라는 수학적인 접근이 아님.
        //왼쪽=오른쪽; → 항상 오른쪽이 먼저 생성되고, 왼쪽으로 대입(=참조).

        System.out.println(r*2*Math.PI);
        System.out.println(r*r*Math.PI);
        //변수의 사용 목적 → 데이터를 재사용 하기 위해서.
        //변수를 참조하고 있는 데이터를 바꿀 수 있다.
        //같은 중괄호(블럭)에서는 변수를 2번 선언할 수 없음 → 블럭 안에서 이미 r의 값을 참조해뒀으면, r을 또 쓸 수 없음.

        r = r/2;
        //기본형 데이터는 불변형이기 때문에 3이 1.5로 바뀌는 것이 아니라, 1.5의 주소가 새로 생성이 되는 것. 새로 생성된 주소를 참조하는 것임.
        System.out.println(r*2);

        //final : 상수, 정보성 데이터를 선언 → 처음 선언한 값이 바뀌지 않음.
        //상수의 이름은 ""대문자로만"" 명시.
        final double PI=3.14;
        System.out.println(Math.PI); //이것도 상수
        //PI=1.14; 컴파일 오류(실행을 막는 오류, 문법적 오류, 디버거)

        //개발자에게 중요한 것 → 규칙!!
        //이름 작성 규칙 ↓↓↓↓↓

        //파스칼 규칙 : 대문자로 이름 시작. 문자간에 결합시 대문자로 구분(class). 숫자로 시작할 수 없음.
        //└─ (class  System,Math,String,L03Variable)
        //ex) 파스칼 규칙x : mouse, opticalmouse, opticalMouse, option mouse 등
        //    파스칼 규칙o : Mouse, OpticalMouse

        //카멜(낙타) 규칙 : 소문자로 이름 시작. 문자간에 결합시 대문자로 구분(class). 숫자로 시작할 수 없음.
        //└─ 변수이름, 함수이름(pow(), println() 등)에 사용.
        //ex) opticalMouse
        //int 01n=3; → 숫자로 시작은 불가능.

        //스네이크 규칙 : 대문자나 소문자로 작성하는데 _(언더스코어)로 문자간의 구분.
        //└─ 상수는 대문자, 폴더나 파일이름(os의 파일시스템 중에 대소문자 구분 못하는 경우가 있음)은 소문자 사용.
        //ex) OPTICAL_MOUSE, optical_mouse

        int Round=10; //(x)
        int round=10; //(o)

        // null
        //변수를 선언할 때 데이터를 정의하지 않은 상태 ⇒ undefined (정의하지 않음)
        int n; //정수
        double d; //실수
        boolean b; //논리
        char c; //문자
        //System.out.println(n); → 정의되지 않은 기본형 데이터는 사용할 수 없다.

        String str;
        //System.out.println(str); → 정의되지 않은 자료형 데이터도 사용할 수 없다.

        //null : 데이터가 비어있다는 명시적 상태(자료형).
        str=null;
        System.out.println(str);

        //n=null; → 기본형은 null로 비어있는 상태를 표현할 수 없다.
        n=0; //→ 기본형은 0으로 비어있는 상태를 표현할 수 있다.
        d=0.0; //0
        b=false; //0

        final int N;
        //상수가 undefined로 정의되었다면 처음에 대입하는 값을 초기값으로 인지.
        //└─ 상수의 undefined는 초기값이 될 수 없다. null은 초기값으로 인정.
        N=10;
        //N=20; → 위에 10으로 초기값 설정해둬서 바꿀 수 없음.
        final String S="안녕";
        //S="잘가"; → 위에 안녕으로 초기값 설정해둬서 바꿀 수 없음.
        final Double D;
        D=2.0; //이같은 경우는 가능. 위에 초기값이 비어있어서.
    }
}