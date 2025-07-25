package com.kosmo;

import java.util.Arrays;

public class L11Array {
    public static void main(String[] args) {
        //배열(Array, []) : 순서(0부터 시작)와 길이(1부터 시작)가 있는 자료형 ☆☆☆
        //자바의 배열 : 타입이 같은 자료가 순서와 길이가 있는 자료형. 고정길이(길이변경이 안됨).
        //자료형을 만들 때는 꼭 new 연산자를 사용해야함. ⇒ 자료를 메모리에 저장하겠다는 의미!
        //메모리에 저장된 자료를 객체라고 부름.
        int [] nums=new int [5]; //⇒ {0, 0, 0, 0, 0} 형태가 생성.
        String [] strs=new String[3]; //⇒ {null,null,null} 생성.
        //[] Array : 메모리가 굉장히 작고, 기능이 최소화 되어있음(기능이 없음 ㅠㅠ)(toString이 구현되어 있지 않다.)
        System.out.println(nums); //[I@b4c966a
        System.out.println(nums.toString()); //[I@b4c966a
        System.out.println(strs); //[Ljava.lang.String;@2f4d3709
                                  //└─ [ : 배열, L : 참조형데이터(자료형,객체)
        //Arrays : array를 도와주는 유틸클래스(≠랩퍼클래스:기본형을 돕는 것만)
        System.out.println(Arrays.toString(nums)); //[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(strs)); //[null, null, null]
        nums[0]=1; // [index] : 순서 번호 (0부터 시작)
        nums[1]=10;
        nums[2]=100;
        nums[3]=1000;
        nums[4]=10000;
        //nums[5]=100000; //컴파일시 발견되지 않는 오류 → 런타임 오류(컴파일 오류 아님).
        //└─ 런타임 오류가 발생하면 jvm이 멈춰서 실행이 안됨.
        //배열은 처음 생성한 길이 이상을 만들 수 없다. (고정길이)
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(strs));

        System.out.println(nums[3]);
        System.out.println(nums[2]);

        strs[0]="안녕";
        strs[1]="잘가";
        strs[2]="맛있게 드세요!";
        System.out.println(strs[2]);
        //System.out.println(strs[3]);
        //└─ .ArrayIndexOutOfBoundsException : 존재하지 않는 index 참조 오류
        //    └─ exception 오류가 뜨는 예외를 처리했어
        //thread 실행
    }
}
