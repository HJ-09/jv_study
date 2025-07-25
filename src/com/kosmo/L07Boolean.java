package com.kosmo;

public class L07Boolean {
    public static void main(String[] args) {
        boolean b=true; //true → 숫자 1인 데이터
        //자바의 논리형은 산술적 연산이 불가
        //System.out.println(true+1); → 불가능. 컴파일 오류
        b=false; //false → 숫자 0인 데이터
        //논리형인 boolean의 데이터의 크기는 1bit이지만, 주소체계가 1byte라서 최소 단위가 1byte인 기본형 데이터 타입임.

        //논리형은 ""언제나"" 비교연산의 결과로 반환되는 데이터
        // 기본형의 연산   ( ==, !=, >, <, >=, <= )
        // 다른 언어에서는 '<>' 이것도 같지 않다(!=)인데 자바에는 없는 말~
        // 자료형(참조형)의 비교연산  ( ==, != (사용할 수 있지만, 사요하지 않는 것을 권장) )
        //\ ==은 기본형이면 값 비교, 객체면 주소비교..!!!
        int [] nums={1,2,3,4};
        int [] nums2={1,2,3,4};
        System.out.println(nums==nums2); //false
        System.out.println(nums==nums);  //true
        char [] chars={'h','e','l','l','o'};
        char [] chars2={'h','e','l','l','o'};
        System.out.println(chars==chars2);  //false
        String str="hello";
        String str2="hello";
        System.out.println(str==str2);  //true    → 자료형(문자열)은 == 비교를 권장하지 않음..!
        //자료형 중에 문자열만 ""(큰 따옴표)(리터럴하게) 정의하면 기존에 데이터를 찾아서 참조한다. 그런데 인터넷/소켓으로 받아온 데이터는 만듦..
        //문자열은 통신(인터넷, 소켓 등의 input)과 같은 특수한 상황에서 기존 문자열을 찾지 않고, 새로 만들기 때문에 false를 반환할 가능성이 있다.
        //└─ 문자열을 == 비교하는 것은 좋지않다.!

        System.out.println(str.equals(str2)); //자료(참조)형의 equals는 자료 내의 모든 값을 비교해서 같을 때만 true 반환.
                                              //└─ 그래서 자료(참조)형은 무조건 equals를 사용.

        //논리 연산자
        // && (AND 연산), || (OR 연산), ! (NOT 연산)
        // true는 1, false는 0

        // ||연산 (true 찾는 연산. true가 있으면 무조건 true)
        // true || false  ⇒ true
        // false || false ⇒ false
        // true || true ⇒ true

        // &&연산 (false 찾는 연산. false가 있으면 무조건 false)
        // true && false  ⇒ false
        // false && false ⇒ false
        // true && true ⇒ true

        // ! 연산
        // ! true  ⇒ false
        // ! false ⇒ true

        System.out.println((1>0)&&(10<2));  //false
        System.out.println((1>0)&& !(10<2));  //true
        System.out.println((1>0)||(10<2));  //true




    }
}
