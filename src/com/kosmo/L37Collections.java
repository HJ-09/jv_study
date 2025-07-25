package com.kosmo;
//java.util ⇒ 개발자에게 유용한 도구(라이브러리(메인없이 사용), class)를 제공
import java.util.*;

public class L37Collections {
    public static void main(String[] args) {
        int [] arr=new int[4]; //[0,0,0,0] 기본값
        System.out.println(Arrays.toString(arr));
        //arr[4]=1; //오류.
        //Array([])는 길이 조정이 안된다. 처음 만들어진 길이 고정.
        //배열 : 순서인 인덱스로 자료를 참조할 수 있는 것. 순서와 길이가 있는 데이터.

        List list=new ArrayList(); //보통 길이를 만들지 않음.
        //List는 길이가 변경되는 배열.
        list.add(10); //자바말고 다른언어는 add 아니고 push 用
        list.add(10.0);
        list.add(10.0f);
        list.add(10l);
        System.out.println(list);
        System.out.println(list.size()); //arr의 length랑 같은거
        System.out.println(list.get(3)); //arr[3]/ arr 대괄호가 get 중괄호임. 인덱스 참조
        //System.out.println(list.get(4)); //Array처럼 없는 것은 참조 x
        list.add("10"); //배열에 추가
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.remove("10")); //remove Object는 데이터를 찾아서 지움. 실패 가능성 有
        System.out.println(list.remove("10.0")); //문자열 10.0은 없어서 삭제 x false.
        System.out.println(list.remove(0)); //remove index는 해당하는 길이에 데이터를 지움. index로 지울 때는 삭제한 대상을 꺼내옴.
        System.out.println(list);
        System.out.println(list.contains(10.0)); //true //괄호 안에 있는 데이터가 있나용?
        System.out.println(list.contains(11)); //false
        //(double) 10;
        //(Double) 10;

        Object [] objArr={10,10.0,10.0f,10l};
        //objArr.contains(10.0);
        boolean result=false;
        for(int i=0; i<objArr.length; i++){
            if((objArr[i] instanceof Double) && 10.0 == (Double) objArr[i]);{
                result = (true);
                break;
            }
        }
        //└─ Array가 list보다 복잡하지만 쓰는 이유 ⇒ 메모리가 절약돼서. 고급언어일수록 Array가 없는 경우가 있다.

        List<Integer> listInt=new ArrayList<>();
        listInt.add(10);
        //listInt.add(10.0); ⇒ Integer랑 상관x. 오류
        //listInt.add("10"); ⇒ Integer랑 상관x. 오류
        listInt.add(99);
        listInt.add(20);
        listInt.add(-100);
        System.out.println(listInt);

        listInt.sort(null); //null : 오름차순 /
        System.out.println(listInt);
        listInt.sort(Comparator.reverseOrder()); // 내림차순 \
        System.out.println(listInt);
        //문자열도 정렬이 되나?~ (문자 ⇒ 번호)
        List<String> listStr=new ArrayList<>();
        listStr.add("Banana");
        listStr.add("Kiwi");
        listStr.add("Lemon");
        listStr.add("apple");
        listStr.add("오렌지"); //한글 번호가 더 커서 제일 뒤로..!
        listStr.add("Apple"); //대문자가 앞번호, 소문자가 뒷번호
        System.out.println(listStr);
        listStr.sort(null);
        System.out.println(listStr);
        //contains, sort, remove, add ⇒ 유용한 함수

        for(String s: listStr){ //향상된 for 반복문은 index를 알 수 없음..!
            System.out.println(s);
        }
        System.out.println("향상된 for 반복문(iterator) 종료");

        for(String s:listStr){
            System.out.println(s);
        }
        System.out.println("향상된 for 반복문은 iterator를 초기화하고 다시 사용");

        Iterator<String> it=listStr.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("while로 iterator 호출");

        it=listStr.iterator(); //재사용 하려면 초기화 필수.
        while(it.hasNext()){ //반복자는 끝으로 이동하면 다시 사용할 수 없음. 또 쓰고 싶으면 iterator로 한 번 더 초기화하고 사용해야함.
            String s=it.next();
            System.out.println(s);
        }

    }
}
