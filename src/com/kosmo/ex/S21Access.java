package com.kosmo.ex;

import com.kosmo.L21AccessModifiers;

public class S21Access {
    public static void main(String[] args) {
        L21AccessModifiers a=new L21AccessModifiers(2000);
        //a.a=99; ⇒ private이라서 실행 x
        a.b=998;
        //a.c=9998; ⇒ 패키지 달라서 실행 x
        System.out.println(a);
    }
}
