package com.kosmo;

public class L09Switch {
    public static void main(String[] args) {
        //Switch
        //else if 같은 분기가 많고, 조건이 간단할 때 작성하는 조건문
        //if문보다 연산속도가 빠르다.

        int a=5;
        switch(a){
            case 0:  //if(a==0)
                System.out.println("a는 0입니다.");
                break; //switch는 자동차처럼 달리는 친구여서 브레이크 필요
            case 1:  //esle if(a==1)
                System.out.println("a는 1입니다.");
                break;
            case 2:  //else if(a==2)
                System.out.println("a는 2입니다.");
                break;
            default: //else
                System.out.println("a는 0,1,2가 아닙니다.");
        }

        //java 14에 도입
        int weekNum=3;  //0은 월, 1은 화, 2는 수, 3은 목, 4는 금, 5는 토, 6은 일요일
        String week=null;

        switch (weekNum){
            case 0: week="월요일";break;
            case 1: week="화요일";break;
            case 2: week="수요일";break;
            case 3: week="목요일";break;
            case 4: week="금요일";break;
            case 5: week="토요일";break;
            case 6: week="일요일";break;
            default: week="잘못된 요일";
        }
        //자료형 중에 문자열만 더하기 연산이 가능
        System.out.println("오늘은 "+week+"입니다!");

        //java 14에 도입된 switch 문법
        // ->를 사용하면 변수가 바로 데이터를 참조, break 생략 가능
        String weekStr=switch (weekNum){
            case 0->"월요일";
            case 1->"화요일";
            case 2->"수요일";
            case 3->"목요일";
            case 4->"금요일";
            case 5->"토요일";
            case 6->"일요일";
            default->"잘못된 요일";
        }; //String으로 할 경우에는 마지막에 ; 필요. break 불필요
        System.out.println("오늘의 요일은 "+weekStr+"입니다!");
        //switch는 변수의 동등비교만 가능.
        //          └─ 변수의 데이터는 기본형이어야 함. 자료형은 문자열과 enum만 가능.
        //switch가 제한은 많지만, 분기의 가독성이 좋고 비교연산이 빠르다.
    }
}
