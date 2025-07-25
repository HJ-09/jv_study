package com.kosmo;

public class L04Integer {
    public static void main(String[] args) {
        int i=10;
        //자바는 정수를 입력하면 int 타입의 정수를 생성.
        //자바는 다른 타입의 정수도 존재.
        //자바는 20억까지의 수는 그냥 작성할 수 있음. 이 때 int 타입 사용.
        //20억 초과의 수를 작성할 때는 l(혹은 L)을 사용. 이 때 long 타입 사용. long 타입은 숫자 뒤에 l(혹은 L)을 붙여야 함.
        byte b=127; //1byte(8bit)
        short s=32767; //2byte(16bit)
        i=2147483647; //4byte(32bit)
        long l=9000000000000000000l; //8byte(64bit)
        l=9000000000000000000L;
        l=10;
        l=2147483648l;


    }
}
