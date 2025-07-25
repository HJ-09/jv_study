package com.kosmo;

public class L05Float {
    public static void main(String[] args) {
        //자바는 2개의 실수 데이터 타입을 갖는다. (float, double)/ 자바는 기본적으로 실수를 입력할 때 double로 적용. 그래서 float는 f 붙여야함.
        //3.14 => double형
        //3.14f => float형
        //1 => int / 1l => long 처럼 구분이 되어야 하는데 정수는 숫자의 크기가..?..?
        float f=3.14f;  //float는 4byte 실수형 데이터
        double d=3.14;  //double은 8byte 실수형 데이터
        //자바는 실수가 8byte는 되어야 쓸만하다 생각하고 실수의 기본 타입으로 double을 지정.

        System.out.println(Integer.MAX_VALUE);

        f=2147483647; //→ 사실은 소수점이 있는 것. 2147483647.0
        System.out.println(f);
        //2147483647.0 = 2.147483647 * 10^9
        //2.147483647E9 ⇒ 10^ 가 E임.
        //2.1474836E9 : 부동소수점(=float)/ 뒤에 47이 없는 이유는, 4byte라는 제한된 크기 때문에 데이터를 정확히 기억할 수 없음. 연산불가

        f=123456789012345678901234567890123456789f;
        System.out.println(f); //1.2345679E38
        //실수 데이터는 지수부와 가수부로 나누는데
        //가수부로 표현할 수 없는 숫자는 반올림으로 잘라낸다(0으로 바꾼다). -㉠
        //엄청 큰 수나 작은 수를 표현할 수 있다.
        //float는 4byte를 지수부(1byte)와 가수부(3byte)로 나누고 있기 때문에 수의 정밀도가 떨어진다. _위에 ㉠의 이유로.
        //때문에 8byte 실수인 double을 자바의 기본 실수로 지정하고 있다.
        d=123456789012345678901234567890123456789f;
        //float는 double 보다 작은 수이기 때문에 double 변수가 참조할 수 있음.
        //d=1234567890123456789012345678901234567890; //→ 이렇게 쓰면 int로 인식이 되는데 int가 가능한 수가 아님. long도 마찬가지.
        d=1234567890123456789012345678901234567890123456789012345678901234567890123456789.0; //뒤에 .0을 붙여서 실수로 표기해주면 쓸 수 있음.
        System.out.println(d); //1.2345678901234568E78
        System.out.println(Double.MAX_EXPONENT); //(2^)1023
        System.out.println(Float.MAX_EXPONENT);  //(2^)127 = 1.7*10^38
        System.out.println(Double.MAX_VALUE);  //1.7976931348623157E308
        System.out.println(Float.MAX_VALUE);   //3.4028235E38

        //실수는 천문학적인 수를 표현 → 무한대

        System.out.println(d*d*d*d);  //Infinity
        System.out.println(f*f);  //Infinity
        System.out.println(-d*d*d*d);  //-Infinity
        System.out.println(-f*f);  //-Infinity



    }
}
