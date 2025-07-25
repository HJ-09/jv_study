package com.kosmo;

import java.util.*;

public class L38Set {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>(); //Hash 알고리즘으로 구현된 Set
        //hashcode(데이터의 주소)로 같은 아이템을(중복) 제거 HashSet
        //자료형 데이터는 equals로 같은 데이터를 제거
        set.add(5);
        set.add(5);
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(30);
        set.add(5);
        System.out.println(set);
        //set은 index가 없다.
        //set.get(1); ⇒ 오류
        System.out.println(set.contains(20)); //true
        System.out.println(set.remove(10)); //index(순서)가 없어서 당연히(?) remove.index는 안돼
        //map을 제외한 모든 컬렉션은 iterator을 포함하고 있음

        //반복자
        Iterator<Integer> it=set.iterator(); //반복자 초기화(생성)
        //it.pointer ⇒ *pointer* [20, 5, 30]
        //it.hasnext() : pointer 다음에 아이템이 있는지 질문. 있으면 next() 사용.
        //it.next(); : 이동하고 아이템 반환. 마지막까지 가면 종료.
        System.out.println("↓ iterator while ↓");
        while (it.hasNext()){
            int i=it.next();
            System.out.println(i);
        }
        System.out.println("↓ 향상된 for 반복문 ↓");
        for(int i:set){
            System.out.println(i);
        }
        //iterator랑 유사한 반복자는 향상된 for 반복문 사용할 수 없음. 지원하지 않아서. while 써야함~
        //유사 반복자(ResultSet)는 hasNext랑 next를 합쳐놓은 이상한 함수(next())를 사용함.


        //add(o), remove(o), contains(o), size(), clear(), isEmpty(), iterator() ⇒ set에 있는 것
        //clear() ⇒ 모든 요소 지우기
        //get(i), remove(i) ⇒ set에 없는 것(index로 하는건 다 없음)

        Set<String> setStr=new HashSet<>();

        setStr.add("안뇽"); //String.equals 가 구현되어 있어서 set이 중복제거 합니다.
        setStr.add("안뇽"); //==. 중복제거.
        setStr.add("안녕"); //
        setStr.add(new String("안뇽")); //"안녕"이랑 new String("안녕")은 저장된 주소가 다름. !=
        setStr.add("잘가");
        setStr.add("식사 맛있게 하세욤");
        System.out.println(setStr);

        //Map
        //교양 LinkedList, LinkedHashSet, TreeSet, Stack, queue 등..~
    }
}

