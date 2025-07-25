package com.kosmo;

public class L41StringBuffer {
    public static void main(String[] args) {
        //배열 vs 리스트 관계처럼 String과 StringBuffer가 있음.
        //Array가 불변데이터라서 List가 나온 것처럼 String이 불변데이터라서 StringBuffer가 나옴.
        //가변길이의 문자열은 StringBuffer를 사용해야합니다. (근데 StringBuilder가 더 빠름)
        //Buffer : 임시저장공간
        StringBuffer sb=new StringBuffer("안녕"); //선언하면 기본 16개의 buffer를 가짐.
        sb.append(" 나는 경민이야");
        sb.append(" 오늘 비가 많이 오네");
        System.out.println(sb);

        String s="A"; //"A"
        s+="B"; //"A","B","AB"
        s+="C"; //"A","B","C","AB","ABC"

        sb=new StringBuffer(100); //{'A','\0' ..} ⇒ 16→100
        sb.append("A"); //"A"
        sb.append("B"); //"AB"
        sb.append("C"); //"ABC"

        //┌─ 기존 StringBuffer에 문자열을 추가하거나 삭제하거나 수정..!
        //insert(3,"") ⇒ 특정위치에 문자열 추가
        //delete(1,4) ⇒ 삭제
        //replace(0,3,"hello") ⇒ 대체
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuilder strBuilder=new StringBuilder();
        strBuilder.append("B");
        strBuilder.append("C");
        strBuilder.append("D");
        System.out.println(strBuilder);
        strBuilder.reverse();
        System.out.println(strBuilder);
        //StringBuilder vs StringBuffer  ⇒ 거의 비슷
        //StringBuffer 멀티스레드환경에서 안전 (Vector) : 멀티스레드 배우고 다시 등장할 예정

        //System : 자바를 실행하는 터미널 호출
        //System.currentTimeMillis();
        long start=System.nanoTime();
        int sum=1+1;
        long end=System.nanoTime();
        System.out.println(end-start);

        start=System.nanoTime();
        String str="";
        for (int i=0; i<10000; i++){
            str+=i;
        }
        System.out.println(str);
        end=System.nanoTime();
        System.out.println("문자열 더하기 연산시간 : "+(end-start));

        start=System.nanoTime();
        strBuilder=new StringBuilder();
        for(int i=0; i<10000; i++){
            strBuilder.append(i);
        }
        System.out.println(strBuilder);
        end=System.nanoTime();
        System.out.println("스트링빌더의 더하기 연산시간 : "+(end-start));
    }
}
