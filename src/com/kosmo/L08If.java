package com.kosmo;

public class L08If {
    public static void main(String[] args) {
        //조건문 If : 프로그램의 분기를 만들 때 사용함.
        //if(논리형){실행할 블럭}  ⇒ if문 실행 조건.

        if (true) {//명칭:블럭,scope}
            System.out.println("안녕");
        }
        if (false) {
            System.out.println("잘가");
        }
        int a = -10;
        if (a >= 10) System.out.println("a는 10보다 크거나 같네용");
        //scope 내부의 코드가 한 줄일 때만 생략 가능.
        if (a < 0) {
            System.out.println("a는 음수입니다.");
        } else {//위 조건이 false이면
            System.out.println("a는 양수입니다.");
        }
        //if(1+10){} → 결과가 논리형(true나 false)인 경우만 작성 가능
        //if(1){} → 불가능/ 1==true라 생각하는 언어는 가능
        //if("안녕"){} → 불가능/ 존재하는 것을 true라고 하는 언어는 가능
        //if(조건){조건이 true일 때}else{조건이 false일 때}

        //esle if() : 분기가 복잡할 때 사용

        int score = -75;  //→ 만약 성적이 73이면 나머지 분기는 실행되지 않고 해당되는 >=70 분기만 실행. 결과값 : "성적이 C입니다."

        if (score > 100 || score < 0) {
            System.out.println("성적을 다시 입력하세요.");
        } else if (score >= 90) {
                System.out.println("성적이 A입니다.");
        } else if (score >= 80) {
                System.out.println("성적이 B입니다.");
        } else if (score >= 70) {
                System.out.println("성적이 C입니다.");
        } else if (score >= 60) {
                System.out.println("성적이 D입니다.");
        } else {
                System.out.println("성적이 F입니다.");
        }


        }
    }