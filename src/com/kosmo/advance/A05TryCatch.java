package com.kosmo.advance;

public class A05TryCatch {
    public static void main(String[] args) {
        //Exception 예외
        //오류가 발생하는 상황 ⇒ 예외
        //컴파일 언어인 자바는 런타임시 발생하는 오류를 예외라고 한다.
        int i=10;
        //i='10';  ⇒ 컴파일 언어는 오류를 미리 발견하고 배포(java→class)하지 않음.

        int[]arr={1,2,3};

        try{
            //try 블럭에서 오류가 발생하면 catch에서 오류를 잡는다.
            i=arr[4]; //예외
            System.out.println("안뇽"); //예외가 발생한 시점 이후의 코드는 무시. ∴ 출력 x. try{}catch 안에 코드를 넣을 땐 잘 생각해야함.
        }catch (ArrayIndexOutOfBoundsException e) {//특정오류 잡아내고 싶으면 이렇게 ㅎㅏ면 댐.
            System.out.println(e.toString());
        }catch (Exception e){ //==else. 중첩가능, 근데 최대한 안 하는게 좋음. 차라리 try()cathc를 2개 쓰는게..
            //Exception : 모든 예외 클래스의 부모. ∴ 모든 예외처리를 잡을 수 이뜸!
            System.out.println(e.toString());
        }finally { //← 무조건 실행되는 블럭임.
            System.out.println("무조건 실행되는 블럭");
        }
        //런타임시 오류가 발생하면(=심각한 상황) 프로그램(JVM main 함수)이 종료되어버림.
        //개발자가 오류를 예상하고 막는 것을 try catch라고 함!
        //구조 → try{}catch(){}

        System.out.println("내가 실행된다면 종료되지 않음~");



    }
}
