package com.kosmo.advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A16Reader {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=System.in;
        //인코딩 처리 및 2byte씩 받을 수 있는 문자열 입력 스트림
        InputStreamReader reader=new InputStreamReader(inputStream); //객체를 만들 때 ...?...

        int a;
        String str=""; //null로 초기화 하면 더하기 연산이 안되니께 ^-^
        StringBuilder sb=new StringBuilder(); //문자열 만들지 않고 바로 연산. 마치 list

        while ((a=reader.read()) != -1){
            //break : 반복문 종료
            //continue : 반복문의 한 구간만 건너뜀

            //System.out.println(a);
            //안녕
            //50504 45397 ⇒ 문자를 2byte씩 처리
            //10

            if((char)a=='\n') break;
                System.out.println(a + ":" + (char) a);
                str += (char) a;
                sb.append((char)a); //문자열 불변데이터이기 때문에 호출하는 즉시 생성
                //안녕!
                //50504:안
                //45397:녕
                //33:!
                //10:
        }
        System.out.println(str);

        //1byte씩 2byte씩 문자열 처리하면 귀찮아서 Buffer로 한 줄씩 받을 수 있음.
        BufferedReader bufferedReader=new BufferedReader(reader);

        str=bufferedReader.readLine();
        System.out.println("버퍼로 받은 한 줄 : "+str);


        //Scanner ⇒ 기능 많음. 탑임. 그래서 무거움..ㅠ
        //└─BufferedReader보다 기능이 많고 inputStream을 바로 변환가능.
        //└─BufferedReader보다 데이터 변환 속도가 느리고 메모리 차지를 많이 함. InputStreamReader보다 인코딩이 자유롭지 않음.
        Scanner scanner=new Scanner(System.in); //변환이 훨씬 더 간단.
        str=scanner.nextLine();
        System.out.println("스캐너로 받은 한 줄 : "+str);

        InputStream inputStream1=System.in;
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream1);
        BufferedReader bufferedReader1=new BufferedReader(inputStreamReader);
        //↑ BufferedReader를 사용하기 위한 과정 ↓
        //1byte → 2byte → 2byte 짜리 bufffer로 변환

    }
}
