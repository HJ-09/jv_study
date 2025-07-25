package com.kosmo.advance;

import java.io.IOException;
import java.io.InputStream;

public class A15Input {
    public static void main(String[] args) throws IOException {
        //터미널의 문자열 입력을 자바 어플에서 받기
        InputStream in=System.in;
        //InputStream.read() : InputStream에서 받는 함수
        //int a = in.read(); //try catch로 예외처리를 해야하지만 단순한 예제니까 예외 위임으로 처리
        //System.out.println(a); //→ ABCD 입력했더니 65가 나옴. 왜? 입력출력은 기본적으로 1byte여서.
        //데이터가 없으면 -1(없다는 의미) 또는 \n(=10) 일 때 까지

        in=System.in;
        int a=0;

        while ((a=in.read()) != -1){
            System.out.println(a);
            //안녕 ⇒ utf-8 한글 3byte
            //236 149 136 235 133 149
            //10
            //자바는 utf-16이니까 한글을 받으려면 인코딩 변환을 해야 받을 수 있움.
        }


    }
}
