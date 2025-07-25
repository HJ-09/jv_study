package com.kosmo.ex;

public class S11While {
    /*
## 📘 `L12While.java` 수업 내용 정리

---

### ✅ 1. while 반복문 개념

* **형식:**

  ```java
  while(조건식) {
      // 반복 실행 블럭
  }
  ```

* 조건이 **`true`일 때만 실행**

* 조건이 처음부터 `false`이면 **한 번도 실행되지 않음**

---

### ✅ 2. 무한 반복문

```java
while(true){
    // 조건 없이 계속 반복됨
}
```

* 보통 내부에서 `break`를 사용하거나, `sleep()`을 통해 **주기적으로 실행 제어**
* 예: **센서**, **현관등 자동 ON/OFF**, **서버 상태 체크 루프**

---

### ✅ 3. `Thread.sleep(밀리초)`

* 실행을 일시 중지하는 기능
* 예: `Thread.sleep(1000);` → 1초 대기
* `InterruptedException`을 발생시킬 수 있어 **예외처리 필요**

---

### ✅ 4. 배열 탐색 while 예제

```java
int[] nums = {11, 22, 33, 44, 55};
int i = 0; //배열의 0번째부터 탐색하라고...^^
while (i < nums.length) { //0부터 5까지 → 0,1,2,3,4
    System.out.println(nums[i]);
    i++;
}

* 정방향 탐색: `i=0; while(i<length)`
```
* 역방향 탐색: `i=length-1; while(i>=0)`
int[] nums = {11, 22, 33, 44, 55};
int i = 4;
while (i >= 0) {
    System.out.println(nums[i]);
    --i;
}

---

### ✅ 5. do-while 문

```java
do {
    // 반복 실행 블럭
} while (조건식);
```

* **조건과 상관없이 최소 1번은 실행**
* 주로 **입력값 유효성 검사**, **초기 메시지 출력** 등에서 사용

---

### ✅ 6. Scanner 클래스

* 사용자 입력을 받을 수 있는 클래스
* `Scanner scanner = new Scanner(System.in);`
* `scanner.nextLine()` : 사용자의 한 줄 입력을 문자열로 받음

---

## 📝 수업 복습 문제

---

### 문제 1. while 반복문의 기본 구조를 작성하세요.

```java
// 빈칸 채우기
while (     ) {
    // 반복 내용
}
```
>> 정답 : 조건문(조건식)

### 문제 2. 다음 while 문이 **총 몇 번 실행될지** 계산하세요.

```java
int i = 0;
while (i < 3) {
    System.out.println("hello");
    i++;
}
```

>> 정답 : 3번

### 문제 3. 다음 중 무한 반복문으로 올바른 것은?

A. `while(false){}`
B. `while(1){}`
C. `while(true){}`
D. `while(null){}`

>> 정답 : C

### 문제 4. 다음 배열을 역순으로 출력하는 while 문을 작성하세요.

```java
int[] nums = {1, 2, 3, 4, 5};

// 역순 출력: 5 4 3 2 1
```

>> 정답 :
        int[] nums={1,2,3,4,5};
        int nums1=nums.length-1;
        while(nums1>=0){
            System.out.print(nums1+" ");
            nums1--;

        fffff


### 문제 5. 다음 코드의 실행 결과를 예상하세요.

```java
int[] arr = {10, 20, 30};
int i = 0;
while(i < arr.length){
    System.out.print(arr[i++] + " ");
}
```

>> 정답 : 10 20 30

### 문제 6. 사용자에게 한 줄 입력을 받아 출력하는 코드를 `Scanner`로 작성해보세요.

>> 정답 : String line=scanner.nextLine();

Scanner scan=new Scanner(System.in);
String line=scan.nextLine();

### 문제 7. `Thread.sleep(1000);`이 하는 일을 간단히 설명하세요.

>> 정답 : thread 1초간 쉬게 하는 코드

### 문제 8. 무한 루프 안에서 `Thread.sleep(1000);`을 넣는 이유는?

A. 반복 횟수를 줄이기 위해
B. CPU 점유율을 낮추고 주기 조절을 위해
C. 조건문을 없애기 위해
D. 오류를 방지하기 위해

>> 정답 : B

### 문제 9. 다음 중 컴파일 오류가 발생하는 코드는?

A. `Scanner sc = new Scanner(System.in);`
B. `Thread.sleep(1000);`
C. `System.out.println(sc.nextLine());`
D. `while sc.hasNextLine()`

>> 정답 : D


## ✅ 자바 배열과 while 반복문 중급 문제 (10문항)
---

### 1. 다음 코드는 어떤 값을 출력할까요?

```java
int[] nums = {10, 20, 30};
int i = 0;
while (i < nums.length) {
    System.out.print(nums[i] + " ");
    i++;
}
```

>> 정답 : 10 20 30

### 2. 다음 코드에서 `while` 조건식에 들어갈 알맞은 표현을 쓰세요.

```java
int[] scores = {85, 90, 75};
int i = 0;
while (        ) {
    System.out.println(scores[i]);
    i++;
}
```

>> 정답 : i<scores.length

### 3. 다음 코드를 실행하면 어떤 문제가 발생할까요?

```java
int[] arr = {1, 2, 3, 4};
int i = 0;
while (i <= arr.length) {
    System.out.println(arr[i]);
    i++;
}
```

>> 정답 : 인덱스가 없는 5번째를 참조하기 때문에 indexOutofBounceException 발생 → 런타임오류 발생

### 4. 다음 배열을 **역순으로 출력하는 while문**을 완성하세요.

```java
int[] nums = {10, 20, 30, 40};
int i =    ;  // 초기값 작성
while (    ) {
    System.out.println(nums[i]);
    i--; // 증감식
}
```

>> 정답 :
int[] nums = {10, 20, 30, 40};
int i = nums.length-1 ;
while(i>=0){
    System.out.println(nums[i]);
    --i; // 증감식
}


### 5. 다음 코드의 출력 결과를 예측하세요.

```java
int[] data = {5, 10, 15};
int i = 0;
while (i < data.length) {
    System.out.println(data[i] * 2);
    i++;
}
```

>> 정답 :
10
20
30

### 6. 다음 배열에서 **짝수만 출력**하는 코드를 작성하세요.

```java
int[] nums = {1, 4, 7, 8, 10};
int i = 0;
while (i < nums.length) {
    // 조건 추가
    i++;
}
```

>> 정답
int[] nums = {1, 4, 7, 8, 10};
int i = 0;
while (i < nums.length) {
    if(nums[i]%2==0){
    System.out.println(nums[i]);
    }
    i++;
}

### 7. 다음 배열의 총합을 구하는 코드를 완성하세요.

```java
int[] nums = {3, 6, 9};
int sum = 0;
int i = 0;
while (    ) {
    // 누적
    i++;
}
System.out.println("총합: " + sum);
```

>> 정답 : 총합 18
int[] nums = {3, 6, 9};
int sum = 0;
int i = 0;
while (i < nums.length) {
    sum += nums[i]; // 더하기 대입연산자
    i++; //== i+=1;
}
System.out.println("총합: " + sum);




### 8. 다음 배열에서 **100 이상인 값의 개수**를 세는 코드를 작성하세요.

```java
int[] scores = {99, 100, 105, 80};
int count = 0;
int i = 0;
while (i < scores.length) {
    // 조건문 추가
    i++;
}
System.out.println("100 이상: " + count + "개");
```

>> 정답
int[] scores = {99, 100, 105, 80};
int count = 0;
int i = 0;
while (i < scores.length) {
    if(scores[i]>=100) count++;  //→ 1줄이라서 {} 없음. 생략가능.
    i++;
}
System.out.println("100 이상: " + count + "개");



### 9. 다음 코드가 **무한 루프에 빠지는 이유**를 설명하세요.

```java
int[] arr = {1, 2, 3};
int i = 0;
while (i < arr.length) {
    System.out.println(arr[i]);
    // i++; 가 없다
}
```

>> 정답 : 증감식이 없어서 i가 계속해서 0이기 때문에 i<3 이 계속 true.


### 10. 배열의 모든 값을 **콤마로 구분된 문자열로 출력**하려고 한다.

아래 코드에서 잘못된 부분은?

```java
int[] nums = {10, 20, 30};
int i = 0;
while (i < nums.length) {
    System.out.print(nums[i] + ", ");
    i++;
}
```
> 예: 출력이 `10, 20, 30` 으로 끝나게 하려면 어떻게 수정할까?

>> 정답 :
int[] nums = {10, 20, 30};
int i = 0;
while (i < nums.length) {
    if(i==nums.length-1){
    System.out.print(nums[i]);
    }else{
    System.out.print(nums[i] + ", ");
    }
        i++;
    }

int[] nums = {10, 20, 30};
int i = 0;
while (i < nums.length) {
    System.out.print(nums[i]);
    if{i!=nums.length-1)
    System.out.print(", ");
    i++;
    }



## 🔶🔶🔶 while 반복문 + 배열: 상급 문제 10선
(많이 어려운 문제도 포함됩니다. 아래에 정답을 추가해 놓을테니 어려운 문제는 참고하세요.)

---


### 1. 배열 안에서 짝수의 합과 홀수의 합을 각각 구하시오.

```java
int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
```

>> 정답
int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
int i=0, sum1=0, sum2=0; //sum1 짝수, sum2 홀수
while(i < values.length){
    if(values[i]%2==0){
    sum1 += values[i];
    }else{
    sum2 += values[i];
    }
    i++;
}
    System.out.println("짝수의 합 :"+sum1);
    System.out.println("홀수의 합 :"+sum2);



### 2. 다음 배열에서 값이 100 이상인 숫자들만 **순서대로 출력**하시오.

```java
int[] scores = {70, 85, 100, 95, 120, 88, 150};
```

>> 정답
int[] scores = {70, 85, 100, 95, 120, 88, 150};
int k=0;
while(k<scores.length){
if(scores[k]>=100){
System.out.println(scores[k]+" ");
}
k++;
}



### 3. 배열에서 최대값과 최소값 구하기

다음 정수 배열에서 **최대값과 최소값을 각각 출력**하는 코드를 작성하세요.

```java
int[] nums = {45, 12, 88, 32, 67, 90, 3};
```

>> 정답
        int[] nums = {45, 12, 88, 32, 67, 90, 3};
        int min=nums[0], max=nums[0];
        int j=0;
        while(j<nums.length){
            if(nums[j]>max){
                max = nums[j];
            }if(nums[j]<min){
                min = nums[j];
            }
        j++;
        }
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);



### 4. 다음 배열에서 **세 번째로 큰 값**을 출력하세요.

```java
int[] data = {55, 23, 87, 90, 67, 89, 92};
```

>> 정답 :




### 5. 다음 배열에서 **중복된 숫자를 제외하고 모두 출력**하세요.

(단, 배열의 크기는 고정이고 중복은 연속된 값일 수도, 아닐 수도 있음)

```java
int[] nums = {1, 2, 2, 3, 4, 4, 5, 1};
```

---

### 6. 다음 배열에서 인접한 두 수의 차이가 10 이상인 쌍을 모두 출력하세요.

```java
int[] arr = {5, 15, 20, 25, 35, 30, 40};
```

---

### 7. 다음 배열의 평균을 구하고, 평균 이상인 값만 출력하세요.

```java
int[] numbers = {80, 75, 90, 60, 70, 85};
```

---

### 8. 사용자로부터 입력된 값과 같은 값을 배열에서 찾아 **해당 인덱스를 출력**하는 코드를 작성하세요.

단, 해당 값이 배열에 없으면 “찾을 수 없음”을 출력

```java
int[] data = {11, 22, 33, 44, 55};
```

---

### 9. 다음 배열에서 연속으로 같은 수가 3번 이상 반복된 값이 있으면 해당 값을 출력하고, 없으면 “없음”을 출력하세요.

```java
int[] seq = {2, 2, 2, 3, 3, 1, 4, 4, 4, 4};
```

---

### 10. 다음 배열을 거꾸로 뒤집어 새로운 배열에 저장하고 출력하세요.

(원본 배열 변경 없이)

```java
int[] original = {10, 20, 30, 40, 50};
```

---

## ✅✅✅ while + 배열 상급 문제 10선 - 정답 및 해설

---

### **1. 짝수 합과 홀수 합 구하기**

```java
int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
int i = 0;
int evenSum = 0;
int oddSum = 0;

while (i < values.length) {
    if (values[i] % 2 == 0) {
        evenSum += values[i];
    } else {
        oddSum += values[i];
    }
    i++;
}
System.out.println("짝수 합: " + evenSum);
System.out.println("홀수 합: " + oddSum);
```

---

### **2. 100 이상 출력**

```java
int[] scores = {70, 85, 100, 95, 120, 88, 150};
int i = 0;

while (i < scores.length) {
    if (scores[i] >= 100) {
        System.out.println(scores[i]);
    }
    i++;
}
```

---

### **3. 최대값과 최소값 구하기**

```java
int[] nums = {45, 12, 88, 32, 67, 90, 3};
int i = 1;
int max = nums[0];
int min = nums[0];

while (i < nums.length) {
    if (nums[i] > max) max = nums[i];
    if (nums[i] < min) min = nums[i];
    i++;
}
System.out.println("최대값: " + max);
System.out.println("최소값: " + min);
```

---

### **4. 세 번째로 큰 값 찾기**

```java
int[] data = {55, 23, 87, 90, 67, 89, 92};
int i = 0;
// 배열 복사 및 정렬 필요
int[] copy = data.clone();

// 정렬 (선택 정렬 또는 버블 정렬)
int j;
while (i < copy.length - 1) {
    j = i + 1;
    while (j < copy.length) {
        if (copy[i] < copy[j]) {
            int tmp = copy[i];
            copy[i] = copy[j];
            copy[j] = tmp;
        }
        j++;
    }
    i++;
}
System.out.println("세 번째로 큰 값: " + copy[2]);
```

---

### **5. 중복 제거 출력 (단순 비교 방식)**

```java
int[] nums = {1, 2, 2, 3, 4, 4, 5, 1};
int i = 0;

while (i < nums.length) {
    boolean isDuplicate = false;
    int j = 0;
    while (j < i) {
        if (nums[j] == nums[i]) {
            isDuplicate = true;
            break;
        }
        j++;
    }
    if (!isDuplicate) {
        System.out.println(nums[i]);
    }
    i++;
}
```

---

### **6. 인접한 수의 차가 10 이상인 쌍 출력**

```java
int[] arr = {5, 15, 20, 25, 35, 30, 40};
int i = 0;

while (i < arr.length - 1) {
    int diff = Math.abs(arr[i] - arr[i + 1]);
    if (diff >= 10) {
        System.out.println(arr[i] + " - " + arr[i + 1] + " = " + diff);
    }
    i++;
}
```

---

### **7. 평균 이상 값 출력**

```java
int[] numbers = {80, 75, 90, 60, 70, 85};
int i = 0;
int sum = 0;

while (i < numbers.length) {
    sum += numbers[i];
    i++;
}

double avg = (double) sum / numbers.length;

i = 0;
System.out.println("평균: " + avg);
System.out.println("평균 이상 값:");

while (i < numbers.length) {
    if (numbers[i] >= avg) {
        System.out.println(numbers[i]);
    }
    i++;
}
```

---

### **8. 입력값의 인덱스 찾기**

```java
int[] data = {11, 22, 33, 44, 55};
Scanner sc = new Scanner(System.in);
System.out.print("찾을 숫자 입력: ");
int target = sc.nextInt();

int i = 0;
boolean found = false;

while (i < data.length) {
    if (data[i] == target) {
        System.out.println("인덱스: " + i);
        found = true;
        break;
    }
    i++;
}

if (!found) {
    System.out.println("찾을 수 없음");
}
```

---

### **9. 연속으로 같은 수 3회 이상 반복 확인**

```java
int[] seq = {2, 2, 2, 3, 3, 1, 4, 4, 4, 4};
int i = 1;
int count = 1;
boolean found = false;

while (i < seq.length) {
    if (seq[i] == seq[i - 1]) {
        count++;
        if (count >= 3) {
            System.out.println("반복된 값: " + seq[i]);
            found = true;
            break;
        }
    } else {
        count = 1;
    }
    i++;
}

if (!found) {
    System.out.println("없음");
}
```

---

### **10. 배열을 거꾸로 뒤집은 새 배열 만들기**

```java
int[] original = {10, 20, 30, 40, 50};
int[] reversed = new int[original.length];
int i = 0;

while (i < original.length) {
    reversed[i] = original[original.length - 1 - i];
    i++;
}

i = 0;
while (i < reversed.length) {
    System.out.println(reversed[i]);
    i++;
}
```


*/
}
