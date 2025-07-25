package com.kosmo;
class Student{
    //┌─ 클래스 변수
    static int count=0; //이름이 Student.count 이지만, Student 클래스랑 관련은 없음.
    //└─ static으로 선언된 변수는 독립적인 데이터로 존재할 수 있음. 클래스 이름을 빌려써서 클래스 변수라고 부름.

    //┌─필드
    int cnt=0;

    int score;
    int grade;
    String name;
    int num;
    public Student(){}
    public Student(String name){ //객체를 만들 때 이름 필드가 존재하도록 강제
        this.name=name;
    }
}


public class L19StaticClassVariable {
    public static void main(String[]args){
        System.out.println("안뇽"); //문자열 ⇒ 자료형 데이터
        Student student=new Student();
        student.name="HJ";
        student.score=79;
        Student student1=new Student("홍길동");
        Student student2=new Student("고길동"); //데이터가 객체
        //heap 메모리 : GC 쓰지 않는 객체를 삭제 (메모리 걱정없이 편하게 만들 수 있다.)

        System.out.println(Student.count); //독립적인 객체기 때문에 호출 가능
        //System.out.println(Student.cnt); //호출 불가능. Student가 객체가 될 때만 데이터로 존재
        //이 때 cnt는 Student 객체에 소속되어서 필드라고 부름.
        Student student3=new Student();
        System.out.println(student3.cnt);
        System.out.println(new Student().cnt);

        //┌─클래스변수(static)는 항상 같은 데이터를 공유
        ++Student.count; //1
        ++Student.count; //2
        ++new Student().count; //(==++Student.count;) 할 수 있지만 권장하지 않음.
        System.out.println(Student.count); //3
        //┌─객체는(new Student()) 서로 독립적이다
        ++student2.cnt; //1
        ++student3.cnt; //1
        System.out.println(student2.cnt);
        System.out.println(student3.cnt);

        //┌─PI 공유데이터(클래스변수의 특징)
        System.out.println(Math.PI); //PI는 클래스 변수라서 그냥 호출 가능

        //객체 vs 클래스변수
        //객체 : 자주 바뀌는 정보
        //클래스변수 : 처음 만들어두고 바뀌지 않고 계속 공유해서 사용. 대체로 상수(final)로 정의.





    }
}
