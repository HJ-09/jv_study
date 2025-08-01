package com.kosmo.ex;

public class S05Float {
    /*
---

## ✅ 수업 내용 요약: `float`와 `double`

### 1. 자바의 실수형 데이터 타입

* 자바는 실수를 표현하기 위해 **2가지 타입** 사용  --> 문제 맨 밑에 추가 설명 있움!

  * `float` (4byte): `3.14f`, `3.14F`
  * `double` (8byte): `3.14` (기본 실수 타입)

### 2. 기본 타입이 `double`인 이유

* `float`는 표현 범위가 작고 정밀도가 떨어짐 (23비트 가수부)
* `double`은 더 넓은 범위, 높은 정밀도 (52비트 가수부)

### 3. 실수는 과학적 표기법으로 출력됨

* 예: `2.147483647E9`는 `2147483647`과 같음
* 큰 수를 넣으면 `E+지수` 형태로 출력됨

### 4. 실수는 **지수부 + 가수부** 구조로 저장됨

* float는 4바이트: 1비트 부호 + 8비트 지수 + 23비트 가수
* double은 8바이트: 1비트 부호 + 11비트 지수 + 52비트 가수

### 5. 정밀도 문제

* `float`는 소수점 아래 6~7자리까지 정확
* `double`은 약 15~17자리까지 정확

### 6. 부동소수점의 반올림

* 표현할 수 없는 수는 잘라지거나 반올림됨
* float에 너무 큰 수를 넣으면 오차가 발생함

### 7. `MAX_EXPONENT` & `MAX_VALUE`

* `Float.MAX_EXPONENT = 127` → 최대 2^127  ⇒ 2진수
* `Float.MAX_VALUE ≈ 3.4028235E38`        ⇒ 10진수 (E가 10의 제곱)
* `Double.MAX_EXPONENT = 1023` → 최대 2^1023
* `Double.MAX_VALUE ≈ 1.7976931348623157E308`

---

## 🧪 실습/퀴즈 문제 (총 10문제)

### 🔹 \[기본 개념 확인]

**1. 자바에서 기본 실수 타입은 무엇인가? 왜 그렇게 지정되어 있는가?**
>> 정답 : double/ float 데이터보다 커서.

**2. 다음 중 `float`으로 올바르게 선언된 것은?**
A. `float a = 3.14;`
B. `float a = 3.14f;`
C. `float a = 3.14d;`
D. `float a = "3.14";`

>> 정답 : B

**3. `double`과 `float`의 가수부 비트 수는 각각 몇 비트인가?**
>> 정답 : double 가수부 52비트, float 가수부 23비트

**4. 과학적 표기법 `2.1474836E9`는 정수로 쓰면 어떤 수인가?**
>> 정답 : 2147483600

**5. `Float.MAX_EXPONENT`는 어떤 의미이며, 값은 얼마인가?**
>> 정답 : 2진수의 최대 지수를 구하라. 2^127 (⇒ 바이어스 기법..)

---

### 🔹 \[출력 및 코드 이해 문제]

**6. 다음 코드를 실행했을 때 출력되는 형태는?**

```java
float f = 123456789012345678901234567890f;
System.out.println(f);
```

A. 그대로 출력됨
B. 에러 발생
C. 반올림되어 `E+지수` 형태로 출력됨
D. 무한대 출력

>> 정답 : C
---

**7. 아래 코드에서 오류가 발생하지 않는 변수 선언은?**

```java
double d = 123456789012345678901234567890f;
```

A. 오류 발생 (float이 커서 double 못 받음)
B. 오류 없음 (float은 double로 자동 형변환됨) → double 데이터 타입은 float보다 큰 실수 타입이기 때문에 float 데이터를 참조할 수 있음
C. float을 double에 넣으려면 캐스팅 필요
D. double은 float보다 작다

>> 정답 : B..
---

### 🔹 \[응용 및 사고력 문제]

**8. float에서 2147483647을 대입한 뒤 출력하면 `2.1474836E9`로 나오는데, 왜 정수가 아닌 `E` 형태로 출력되는가?**
>> 정답 : 부동소수점 한계 때문에..~
>>> 실수는 지수부와 가수부로 나누어 저장하기 때문

**9. 다음 중 실수형 계산에서 정밀도 오차가 가장 클 가능성이 높은 상황은?**

A. `double a = 3.14 + 0.000000000000001;`
B. `float b = 1000000000 + 0.1f;` ⇒ 부동소수점 때무넹 1.0E9로 변환되어야 하는데 선언이 float라서 큰 수에 작은 수를 더하는거라..ㅎ?;
C. `double c = 1.0 / 3.0;`
D. `float d = 1.0f;`

>> 정답 : B
---

**10. `System.out.println(d*d*d*d);` 같은 연산에서 `float`와 `double`의 결과 차이가 나는 이유는 무엇인가?**
>> 정답 : float와 double의 데이터 크기가 달라서 정밀도에 차이가 있음.
>>> double 지수부가 더 커서..~
---

*/

    public static void main(String[] args) {
        System.out.println(13); //int /4byte (정수 기본데이터값)
        System.out.println(13l); //long /8byte
        System.out.println(3.14); //3.14 데이터 타입/double 8byte (실수 기본데이터값)
        System.out.println(3.14f); //리터럴(x), 명시적(o)/float 4byte
        //수를 리터럴하게 작성 → 기본 데이터
        //리터럴 : 있는 그대로~~

        System.out.println((+0)==-(0));
        System.out.println((+0.0)==-(0.0)); //논리적으로는 false인데 출력값은 true..
                                            //└─ == ⇒ 숫자 연산에서는 데이터가 완전 같은지 물어보는 것이 아니라 값이 같은지 물어보는 것
        // 0000 0000 : 0
        // 1000 0000 : -0
        // └─ 데이터는 다르지만, 값은 같기 때문에 출력값이 true임. 뭐.. 문제 삼을 필요 없음!
    }
}



