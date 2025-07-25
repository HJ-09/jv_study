package com.kosmo;

public class L34Method {
    //[접근지정자] [메모리영억] [반환타입]  [이름] [(매개변수)] ⇒ 메서드
    //클래스 변수로 저장된 sum은 매개변수를 더해서 반환하는 기능을 수행하는 코드 집합
    public static int sum(int a, int b){
        int sum=a+b;
        return sum; //함수의 종료 시점. 이 다음에 무언가 하려고 해도 못해유~ // 코드 종료하려고 일부러 return 쓰는 경우도 有.
        //++a; ⇒ 종료시점 다음이라서 오류. 실행 x
    }

    //배열 중에 데이터가 모두 숫자이면 true, 숫자가 아닌 것이 있으면 false를 반환하는 검사 함수를 만들게~
    public static boolean isNum(Object o){
        //숫자인지 아닌지 검사해서 맞으면 true, 아니면 false
        //o 숫자 데이터면
        //20 ⇒ Integer
        //20l ⇒ Long
        //20.2 ⇒ Double
        //20.2f ⇒ Float
        boolean isNum=false;
        isNum=o instanceof Number;
        /*System.out.println(o instanceof Number);
        System.out.println(o instanceof Double);*/
        return isNum;
    }

    public static boolean isNum(Object arr[]){
        boolean isNum=false;
        //반복문으로 배열 탐색해야함..
        for (int i=0; i<arr.length; i++){
            Object o=arr[i];
            System.out.println(i+":"+(o instanceof Number));
            isNum=o instanceof Number;
            //break; : for문을 종료하는 명령.. 기억하자^^
            //continue : 해당지점을 건너뛴다..^^
            if(!isNum) break; //편의점 마감 알바가 정리 다 하고 가는거
            if(!isNum) return false; //그냥 문 닫고 가는거
        }
        return isNum;
    }

    public static void main(String[] args) { //이 친구가 메서드
        //메서드 : 특정 기능을 수행하는 코드 집합(블럭)
        //메서드 호출 방법 : 이름(매개변수);
        int s=sum(10,20);
        System.out.println(s);

        System.out.println(isNum(10.0)); //true
        System.out.println(isNum("헬로")); //false

        Object []arr={1,2.1,30l,2.0f,40};
        Object []arr2={1,2.1,"??",'a',30l,2.0f,40};

        isNum(arr2);

        boolean isArr2Num=isNum(arr2);
        //System.out.println(isArr2Num);

        System.out.println(isArr2Num);
        System.out.println(isNum(arr));

    }
}
