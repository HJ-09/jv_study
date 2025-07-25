package com.kosmo;

public class L35RecursiveMethod {

    public static void call(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("안뇽");
        call();
    }

    //┌─10부터 하나씩 작아지면서 더해지는 재귀함수 만들게~
    public static int sum(int i){ //10
        int sum=0;
        System.out.println(i);
        if(i==1) return 1;
        //sum(i-1);
        return i+sum(i-1);
    }

    public static void main(String[] args) {
        //call(); //StackOverflowError
        //Stack(스택메모리)이 넘쳐서 오류.
        //main이 실행하는 코드는 Stack 메모리에 저장.
        //재귀함수 실행속도가 메모리 크기보다 빨라서 메모리 크기가 넘치면서 종료.
        //└─ 재귀함수는 종료시점을 정해주거나 실행속도를 늦추면 됩니당. (보통 전자의 경우가 多)

        //1부터 입력한 수까지 더하는 함수
        //sum(7) ⇒ 7+6+5+4+3+2+1 종료

        int sum=0;
        for(int i=7; i>0; i--){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println(sum(10));;

    }
}
//무한반복에 빠질 수 있고, 가독성이 떨어지기 때문에 자바에서 권장하지 x
//결론 ⇒ 재귀함수 쓰지마세용 ㅋ,ㅋ