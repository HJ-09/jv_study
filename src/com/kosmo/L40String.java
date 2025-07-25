package com.kosmo;

public class L40String {
    public static void main(String[] args) {
        //문자열
        String s="안뇽"; //문자열
        char [] s2={'안','뇽'}; //안녕을 선언하면 물리적으로 저장되는 데이터
        //문자열 ⇒ 배열(고정길이, 불변데이터)

        s+="잘가";
        System.out.println(s); //안녕, 잘가, 안녕잘가 총 3개 데이터가 만들어지는거임.
        //└─ "AB"+"CD"⇒"ABCD" 총 3개.

        // concat() → 배열을 더하는 함수의 이름
        s=s.concat("!");
        s+= "~"; //s=s+"~"
        System.out.println(s);
        //문자열 더하기 연산은 숫자의 더하기 연산보다 우선순위가 높다.

        System.out.println("어서"+"오세요"+2*2); //어서오세요4
        System.out.println("어서"+"오세요"+2+2); //어서오세요22  ⇒ 어서오세요 뒤에 오는 숫자 2를 문자로 자동 형변환이 됨. so, 숫자에 소괄호를 붙여줘야 혀~
        System.out.println("어서"+"오세요"+(2+2)); //어서오세요4
        System.out.println(2+2+"어서"+"오세요"); //4어서오세요

        //"" ⇒ 문자열의 리터럴(있는 그대로) 표기법
        // 10, 10l, 10.0, 10.0f, true, false, 'd' ... (short랑 byte는 리터럴 표기법 업슴)/ 기본형은 무조건 리터럴 표기 Go.
        //{} ⇒ 배열의 리터럴 표기법

        //문자열 리터럴 표기법을 사용하면..? ─┐
        //**같은 문자열을 새로 만들면 새로 만들지 않고 기존의 문자열을 참조합니당**
        //└─ why? 문자열을 많이 쓰니까 메모리를 절약하려고~
        System.out.println("안녕"=="안녕"); //문자열, 배열은 불변  //true
        System.out.println("안녕"==new String("안녕"));  //false


        //문자열의 유용한 함수들
        String str="ABCDEFG";
        //Array[index], List.get(index), String.charAt(index)
        System.out.println(str.charAt(2));
        System.out.println(str.length()); //Array[length], List.get(size), String.charAt(length())
        System.out.println(str.contains("E"));
        System.out.println(str.contains("Z"));
        System.out.println(str.contains("AB"));
        //contains ⇒ List도 있음. List.contains()
        System.out.println(str.substring(5,7)); //FG
        //substring ⇒ List도 있음. List.sublist()
        System.out.println("str.substring(3) : "+str.substring(3));

        //String vs list
        //특정요소 삭제? ⇒ 불가능. why? 불변하니까. 그런데 List는 가능함. List.remove(Object)/List.remove(index)
        //수정? ⇒ 안돼 why? 불변하니까. 그런데 또 List는 가능함. List.set(Object)/List.set(index)
        //더하기 ⇒ 안돼 why? 불변하니까. 그런데 또 List는 가능함. List.add(Obj)
        //전체삭제 ⇒ 안돼 why? 불변하니까. 그런데 또 List는 가능함. List.clear()
        //정렬 ⇒ 안돼 why? 불변하니까. 그런데 또 List는 가능함. List.sort()
        //반복자(Iterator) 유무? ⇒ 안돼 why? 불변하니까. 그런데 또 List는 가능함. List.iterator()

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }

        System.out.println();
        System.out.println("---");
        //for-each 반복문 가능?~!
        //for(char c : str){} ⇒ 문자열은 for-each 반복문 지원하지 않음
        //str.iterator(); ⇒ iterator도 불가능
        int[]arr={10,20,30};
        for(int n:arr){ //┌─ 컴파일러가 상상해서 index 참조문으로 자동완성
            //└─ 풀어서 >> for(int i=0; i<arr.length; i++){int n:arr[i]}
            System.out.println(n+" ");
        }






    }
}
