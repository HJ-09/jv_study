package H;

public class P0 {
    public static void main(String[] args) {

        //250620 S08문제풀이 (나)

        //1. 입력한 정수가 짝수인지 홀수인지 판별하시오. (if-else)
        //예: int a=5; → 출력: 홀수
        int a=5;
        if(a%2!=0){
            System.out.println("홀수입니다.");
        }

        //2. 점수가 90 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 나머지 F 출력하시오. (if-else if)
        int score=100;
        if(score>=90){
            System.out.println("A");
        } else if(score>=80){
            System.out.println("B");
        } else if(score>=70){
            System.out.println("C");
        } else if(score>=60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }


        //3. 주민등록번호(int n=1671333; ) 뒤 7자리를 입력 받아 남자인지 여자인지 출력하시오. (switch)
        //주민번호 뒷자리 첫 숫자: 1,3 남자 / 2,4 여자
        int n=1671333;
        switch(n/1000000){
            case 1:
            case 3:
                System.out.println("남성입니다.");
                break;
            case 2:
            case 4:
                System.out.println("여성입니다.");
                break;
        }


        //4. 월(月)을 입력 받아 해당 월의 마지막 날짜를 출력하시오. (switch)
        //예: n=2 → 출력 28 (윤년은 고려하지 않음)

        //① 첫번째 풀이
        int m=11;
        switch(m){
            case 1 :
                System.out.println(31);break;
            case 2 :
                System.out.println(28);break;
            case 3 :
                System.out.println(31);break;
            case 4 :
                System.out.println(30);break;
            case 5 :
                System.out.println(31);break;
            case 6 :
                System.out.println(30);break;
            case 7 :
                System.out.println(31);break;
            case 8 :
                System.out.println(31);break;
            case 9 :
                System.out.println(30);break;
            case 10 :
                System.out.println(31);break;
            case 11 :
                System.out.println(30);break;
            case 12 :
                System.out.println(31);break;
        }
        //② 두번째 풀이
        int mm=2;
        int day=switch(mm){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> 0;
        };
        System.out.println(day);


        //5. 나이를 입력(age=22;) 받아 13세 미만은 어린이, 13~19세는 청소년, 20세 이상은 성인 출력하시오. (if-else if)
        int age=22;
        if(age<13){
            System.out.println("어린이");
        }else if(age>=13 && age<20){
            System.out.println("청소년");
        }else if(age>=20){
            System.out.println("성인");
        }


        //6. 주어진 점수(score=86;), 범위 벗어나면 “잘못된 점수” 출력, 범위 내면 성적 등급 출력 (if)
//        int score1=85;
//        if(score1==86){
//            System.out.println("A");
//        }else if(score1>86 || score1<86){
//            System.out.println("잘못된 점수");
//        }
        int score2=93;
        if(score2>=95){
            System.out.println("수");
        }else if(score2>=85){
            System.out.println("우");
        }else if(score2>=75){
            System.out.println("미");
        }else if(score2>=65){
            System.out.println("양");
        }else{
            System.out.println("가");
        }


        //7. 택배 배송 시스템에서 배송 상태 코드를 입력받아 상태 메시지 출력
        //0: “배송 준비중”, 1: “배송 중”, 2: “배송 완료”, 그 외: “잘못된 상태 코드”
        int b=1;
        String bb=null;
        switch (b){
            case 0 : bb="배송준비중";break;
            case 1 : bb="배송중";break;
            case 2 : bb="배송완료";break;
            default : bb="잘못된 상태 코드";
        }
        System.out.println("현재 "+bb+" 입니다.");


        //8. 포인트 적립 이벤트에서 회원 등급별 적립률 계산
        //골드”: 5%, “실버”: 3%, “브론즈”: 1%, 그 외: 0%

        String g1="실버";
        int p1=20000;
        int po1=0;
        if(g1.equals("골드")){
            po1=p1*5/100;
        }else if(g1.equals("실버")){
            po1=p1*3/100;
        }else if(g1.equals("브론즈")){
            po1=p1*1/100;
        }else{
            po1=p1*0;
        }
        System.out.println("적립 포인트 : "+po1+"점");

        String g2="실버";
        double d=switch(g2){
            case "실버" -> 0.05;
            default -> 0;
        };
        System.out.println("적립 포인트 : "+(p1*d)+"점");
    }
}
