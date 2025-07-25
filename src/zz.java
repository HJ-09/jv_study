class Person{
    String name;
    int age;
    void print(){
        System.out.println("Name:" + name + "," + " " + "Age:" + age);
    }

    void move(){
        System.out.println(name + " " + "is moving");
    }
}

class Car{
    String color;
    int speed;

    void drive(){
        System.out.println(color+"myCar(이)가 부릉 달립니다. 속도 : "+speed+"km/h");
    }
    void stop(){
        System.out.println(color+"자동차가 멈췄습니다.");
    }

    void sayHello(){
        System.out.println("Hello!");
    }
}

class S{
    int m=3;
    int n=4;
    void work1(){
        int k=5;
        System.out.println(k);
        work2(3);
    }
    void work2(int i){
        int j=4;
        System.out.println(i+j);
    }
}


public class zz {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="철수";
        person1.age=10;
        person1.print();
        person1.move();

        Person person2=new Person();
        person2.name="회장님";
        person2.age=63;
        person2.print();
        person2.move();

        Car myCar=new Car();
        myCar.color="흰색";
        myCar.speed=100;

        myCar.drive();
        myCar.stop();

        Car a = new Car();
        a.sayHello();

        S s = new S();
        System.out.println(s.m);
        System.out.println(s.n);
        s.work1();

    }
}

