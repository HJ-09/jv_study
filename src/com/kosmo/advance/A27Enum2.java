package com.kosmo.advance;

import java.time.LocalDate;
import java.util.Arrays;

class A{
    int a;
    int b;
    int c;
}

enum E{
    A,B,C
}

enum Day{
    MON("월요일","monday"), TUE("화요일","tuesday"), WED("수요일","wednesday"), THU("목요일","thursday"), FRI("금요일","friday"), SAT("토요일)"), SUN("일요일");
    //우리 눈엔 안 보이지만, toString()이 필드명과 같은 것을 반환
    //MON == Day MON=new Day()

    String koStr;
    String enStr;
    //enum은 public 쓰는거 별로 안 좋아함.
    Day(){}
    Day(String koStr){
        this.koStr=koStr; //koStr을 초기화 하는 생
    }
    Day(String koStr, String enStr){
        this.koStr=koStr;
        this.enStr=enStr;
    }


}

class Plan{
    String txt;
    Day day;
    LocalDate date;

    //초기화 하기 위해선 생성ㅈㅏ를 만들어라..!
    public Plan(String txt, Day day, LocalDate date) {
        this.txt = txt;
        this.day = day;
        this.date = date;
    }
}


public class A27Enum2 {
    public static void main(String[] args) {
        Plan plan=new Plan("강아지산책",Day.THU,LocalDate.of(2025,8,7));
        //enum을 사용하면 모든 필드를 반복 탐색에 사용할 수 있음
        for (Day d:Day.values()){
            if(plan.day==d){
                System.out.println("목요일은 산책 x");
            }
        }
        System.out.println(plan.day);
        System.out.println(plan.day.koStr);
        System.out.println(plan.day.enStr);


        A obj = new A();
        //자바는 객체 내부의 필드가 무엇이 있는지 알 방법이 없다..!ㅠ

        //그런데~? enum은 가능!
        E[] arr=E.values(); //{A,B,C}
        System.out.println(Arrays.toString(arr));




    }
}
