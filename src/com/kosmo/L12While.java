package com.kosmo;

import java.util.Scanner;

public class L12While {
    public static void main(String[] args) throws InterruptedException {
        // while 반복문 : 같은 동작을 반복 수행하고 싶을 때
        // 예) 현관에 센서등. → 사람이 지나가는지 검사. 지나가면 on, 일정시간이 지나면 off.

        //무한 반복문 → 쓸 일이 거의 없다..?!
        //└ while(true){반복 실행할 블럭}
        //특정한 조건만큼 일하는 반복문
        //└ while(조건문){반복 실행할 블럭, 조건을 false로 만들 값을 대입}

//        while(true){
//            System.out.println("안녕");
//        }
        //보통 무한반복문은 일정 주기만 쉬도록 작성
//        while(true){
//            //실행 == Thread(실행하는 일꾼)
//            Thread.sleep(1000); //밀리초 1/1000  ⇒ 1000이 1초
//            //일꾼이 sleep 하면 실행을 잠시 쉬는 것. 오류발생할 가능성 높음. → 오류 처리하기 위해 throws InterruptedException
//            System.out.println("안녕");
//        }
        //System.out.println("d"); → 무한반복문이 thread를 독점하고 있어서 다음 코드는 실행할 수 없음.

        int[] nums={11,22,33,44,55};
        //배열의 모든 자료를 검색하고 싶다.
        int i=0;
        while(i<5){
            System.out.println(nums[i++]);
        }
        i=4;
        while(i>=0){
            System.out.println(nums[i--]);
        }
        /*
        // 배열을 탐색하는 while 반복문의 공식
        * int i=0; → 선언문
        * while(i<arr,length){조건문}
        * i++, i-- → 증감문
         */

        //do{}while(조건식) : 조건과 상관없이 첫번째는 >>무조건<< 실행!

        //Scanner : 입력을 받는 클래스
        Scanner scanner=new Scanner(System.in); //자바를 실행하는 콘솔(터미널)에서 키보드 입력을 받겠다!
        String line=scanner.nextLine(); //입력을 기다리는 무한 반복문(문자열 입력 후 라인개행. 즉 엔터를 하면 입력한 문자열을 가져오고 종료. input)
        System.out.println("입력한 값은 :"+line);




    }
}
