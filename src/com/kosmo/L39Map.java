package com.kosmo;
//util 패키지가 collections을 포함해서 컬렉션 패키지라고도 함. 근데 컬렉션만 가지고 있는건 아님^,~
import java.util.*; //* : 와일드카드

public class L39Map {
    public static void main(String[] args) {
        //Map: Collections 인터페이스로 구현된 타입이 아님. 대신 Set을 포함.
        //Collection Framework ⇒ 유용한 자료의 새로운 규칙 like that~
        //Collection : 유용한 자료
        //Framework : 여러 라이브러리의 집합으로 새로운 규칙을 생성. 유용한 편, 대신 난이도는 높음.
        //💯 컬렉션 프레임워크가 무엇인가요? 💯
        //└─ 개발자를 위한 유용한 자료들의 집합입니당.

        //{key:value,key:value}
        //{name:"경민" , 나이:39}
        Map<String, Object> person=new HashMap<>();
        //HashMap ⇒ HashSet에서 나온 값.
        person.put("name","경민"); //key="name", value="경민"
        person.put("age",39);
        person.put("isMarried",true);
        System.out.println(person); //{isMarried=true, name=경민, age=39}
        //Map도 순서(index)가 없음. index가 있는건 list랑 list친구들만 있음.
        person.put("name","최경만");
        System.out.println(person); //{isMarried=true, name=최경만, age=39}
        //└─ key가 set이라서 중복을 허용하지 않음.

        Set keys=person.keySet(); //keySet() : key값만 가져오는거
        System.out.println(keys); //[isMarried, name, age]

        System.out.println(person.get("name"));
        System.out.println(person.get("isMarried"));
        System.out.println(person.get("age"));

        PersonClass p=new PersonClass();
        //Map과 필드가 Key와 같은 인스턴트는 아주 유사한 데이터다.
        //자바는 유사하지만 구분해서 사용
        //Map과 class를 구분없이 사용하는 언어도 존재 (JavaScript _근데 이제 소송당해서 이름 바뀜.. 또르륵)
        System.out.println(p); //{name:'경민', isMarried:true, age:39}
        //Map은 생성자와 메소드를 포함하지 않는다.

        Collection<Object> values=person.values();
        System.out.println(values); //[true, 최경만, 39]
        //containsKey, containsValue

        System.out.println("-----while 구분선-----");
        //반복문으로 Map을 탐색
        //Key를 이용하는 방법
        Iterator<String> keysIt=person.keySet().iterator();
        while (keysIt.hasNext()){
            String key=keysIt.next();
            Object value=person.get(key);
            System.out.println(key+":"+value);
        }
        System.out.println("-----for 구분선-----");
        for (String key: person.keySet()){ //48~50줄 내용이 이 한 줄로 요약 가능 ㅋ
            Object value=person.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("-----Entry 구분선-----");
        //Entry //{[key,value],["name","경민"],["age",39]}
        for (Map.Entry<String,Object> entry : person.entrySet()){
            //System.out.println(entry);
            String key=entry.getKey();
            Object value=entry.getValue();
            System.out.println(key+":::"+value);
        }
    }
}


class PersonClass{
    String name="경민";
    boolean isMarried=true;
    int age=39;

    @Override
    public String toString() {
        return "{" + "name:'" + name + '\'' + ", isMarried:" + isMarried + ", age:" + age + '}';
    }
}