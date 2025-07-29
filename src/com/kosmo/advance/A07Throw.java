package com.kosmo.advance;

public class A07Throw {
    static void sum(int a,int b)throws Exception{
        //new ArithmeticException(); //객체만 생성
        throw new ArithmeticException(); //생성한 객체로 오류 발생
    }

    //선택지
    //1.예외를 다시 위임 (최종사용자에서만 try()catch 사용) ---①
    //2.내가 최종사용자가 되는 방법
    //3.내가 최종사용자이면서 전가하는 방법 ⇒ catch에서 오류를 강제로 발생 ---③
    //└─ 내가 다른 함수를 사용하는데 오류가 발생했어 나를 사용하는 너도 그 오류를 알아야 해!
    static void strSum(String a,String b) throws Exception { //---①
        //sum()을 꼭 사용해야함
        int i = Integer.parseInt(a);
        int i2 = Integer.parseInt(b);
        try{
            sum(i, i2);
        }catch (Exception e){
            System.out.println("수학적 오류");
            throw new Exception("수학적 오류 전가 Go"); //---③
        }
    }

    public static void main(String[] args) {
        //강제로 오류를 발생시켜볼게~

        try {
            strSum("10","20");
        }catch (Exception e){
            System.out.println(e);
        }

        int i=1;
        if(i==1){
            throw new NumberFormatException("숫자만");
            //try catch로 예외를 처리한 메서드가 있는데 나를 사용한 메서드에서 오류를 알아차리면 좋겠다 싶을 때 사용.. 띄용..

        }

        System.out.println("안녕");
    }
}
