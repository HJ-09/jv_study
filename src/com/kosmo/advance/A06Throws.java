package com.kosmo.advance;

public class A06Throws {
    //이 함수는 위험하니까 예외처리해 ! (강제)
    //throws Exception : 이 함수를 사용하려면 try catch로 예외처리해!
    public static int sum(String a, String b) throws Exception{
        int sum=0;
        //"13"+"14"="1314"
        //"13"⇒13
        //"14"⇒14
        //13+14=27
        int i=Integer.parseInt(a);
        int i2=Integer.parseInt(b);
        sum=i+i2;

        return sum;
    }
    //main은 최종사용자이기 때문에 예외 위임은 소용없다. 띠이이이요오옹
    //main은 코드를 실행하는 어플이기 때문에 try catch로 예외를 처리해야한다.
    public static void main(String[] args) {
        int sum= 0;
        try {
            sum = sum("10","21");
        } catch (Exception e) {
            System.out.println("숫자만 입력");
        }
        System.out.println(sum);

        try{
            sum=sum("십","이십일");
            System.out.println(sum); //Integer.parseInt()는 문자열 안에 있는 모든 문자가 Digit(숫자)여야만 함.
        } catch (Exception e){
            System.out.println("숫자만 형변환이 됩니다");
        }
    }
}
