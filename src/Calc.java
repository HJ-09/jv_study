import java.util.Arrays;

public class Calc {
    public static void main(String[] args) {
        System.out.println(2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2);
        System.out.println(Math.pow(3, 2));
        System.out.println(13 / 3.0);
        System.out.println(10 / 4);

        final int N;
        N = 20;
        System.out.println(N * 2);

        String str = "";

        System.out.println(10 * 10);
        System.out.println(10l * 10l);

        System.out.println(Integer.MAX_VALUE);

        byte b = 127;
        System.out.println(b << 1);

        System.out.println(7 ^ 0);
        System.out.println(8 ^ 1);
        System.out.println(2 ^ 3);

        int a = 5;
        switch (a) {
            case 0:  //if(a==0)
                System.out.println("a는 0입니다.");
                break; //switch는 자동차처럼 달리는 친구여서 브레이크 필요
            case 1:  //esle if(a==1)
                System.out.println("a는 1입니다.");
                break;
            case 2:  //else if(a==2)
                System.out.println("a는 2입니다.");
                break;
            default: //else
                System.out.println("a는 0,1,2가 아닙니다.");
        }

        int num = 10;
        if (num > 0 && num % 2 == 0)
            System.out.println("양수이면서 정수입니다.");

        int age = 18;
        String gender = "남성";
        if (age >= 19 && gender.equals("남성")) {
            System.out.println("특정 기능 실행: 성인 남성 사용자입니다.");
        } else {
            System.out.println("특정 기능 실행불가: 조건을 만족하지 않습니다.");
        }

        String m = null;
        if (m != null && m.isEmpty()) {
            System.out.println("정답입니다.");
        }

        int a1 = 5;
        if (a1 % 2 != 0) ; //수학 2n-1의 자바식 표현.,
        System.out.println("홀수입니다.");

        String s = "\uD83D\uDE0D";
        System.out.println(s);

        char n1 = 'Z';
        System.out.println((int) n1);

        char m1 = '한';
        System.out.println((int) m1);

        char c = 50000;
        System.out.println(c);
        System.out.println((int) c);

        System.out.println((int) '썐');

        String s2 = "\u0041";
        System.out.println(s2);

        String[] strs = new String[3];
        strs[0] = "반가워";
        strs[1] = "또 보자";
        strs[2] = "조심히 가";
        System.out.println(strs[0] + strs[2]);

        int[] nums = new int[3];

        nums[1] = 9;
        nums[2] = 3;
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        String[] fruit = new String[4];
        fruit[0] = "사과";
        fruit[1] = "딸기";
        fruit[2] = "수박";
        fruit[3] = "배";
        System.out.println(fruit[2] + fruit[3]);

        //② 두번째 풀이 ?????
        int mm = 2;
        int day = switch (mm) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
        System.out.println(day);

        int nx = 2;
        int lastDay = switch (nx) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        int age1 = 31;
        String p = "술";
        if (p.equals("술")) {
            if (age1 > 19) {
                System.out.println("" + p + "(을)를 구입.");
            } else {
                System.out.println("" + p + "(은)는 성인만 구입할 수 있습니다.");
            }
        }
        if (p.equals("술") && age > 19) {
            System.out.println(p + "(을)를 구입했습니다.");
        } else {
            System.out.println(p + "(은)는 성인만 구입 가능");
        }

        String grade = "브론즈";
        int amount = 20000;
        double rate = switch (grade) {
            case "골드" -> 0.05;
            case "실버" -> 0.03;
            case "브론즈" -> 0.01;
            default -> 0.0;
        };
        System.out.println("적립금은 " + (int) (amount * rate) + "입니다.");


        int[] x = new int[3];
        System.out.print(x.length);


        int num2 = 0, sum = 0;
        while (sum < 100) {
            sum += num2;
            num2++;
        }
        System.out.println((num2 - 1) + "까지의 합=" + sum);

        for (num2 = 0, sum = 0; sum < 100; num2++) {
            sum += num2;
        }
        System.out.println((num2 - 1) + "까지의 합=" + sum);

        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
        }

        for (k = 0; k < 10; k++) {
            System.out.println(k);
        }

        int j = 0;
        while (j < 15) {
            System.out.println(j + "");
            j++;
        }
        //for문으로 변환
        for (j = 0; j < 15; j++) {
            System.out.println(j + "");
        }
        System.out.println();

        j = 0;
        do {
            System.out.println(j + "");
            j++;
        } while (j < 5);

        int j1 = 7;
        do {
            System.out.println(j1 + "");
            j1--;
        } while (j1 >= 0);

        int[] arr = {10, 20, 30};
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i++] + " ");
        }


        int[] nums5 = {1, 4, 7, 8, 10};
        int i5 = 0;
        while (i5 < nums5.length) {
            if (nums5[i5] % 2 == 0) {
                System.out.println(nums5[i5]); // 조건 추가
            }
            i5++;
        }

        System.out.printf("%x\n", 10); //\n:줄 바꿈
        System.out.printf("%X\n", 10);
        System.out.printf("%f", 3.2582);

        System.out.println();
        System.out.println(7 << 2);
        System.out.println(7 >> 2);
        System.out.println(-7 << 2);
        System.out.println(-7 >> 2);
        System.out.println(-1 >>> 30);


        for (int i1 = 0; i1 < 3; i1++) {
            for (int j4 = 0; j4 < 5; j4++) {
                System.out.println(i1 + " " + j4);
                if (i1 == j4) {
                    System.out.println("i1=j4");
                }
            }
        }

        int[] nums1 = {12, 25, 7, 30, 18, 42, 5, 60, 33, 10};
        int cnt = 0;
        for (int i1 = 0; i1 < nums1.length; ++i1) {
            if (nums1[i1] % 2 == 0) ++cnt;
        }
        System.out.println("짝수의 개수는: " + cnt);


        //배열 `nums`에서 **30보다 큰 수들만의 합**을 구하시오.

        int sum1 = 0;
        for (int i2 = 0; i2 < nums1.length; ++i2) {
            if (nums1[i2] > 30)
                sum1 += nums1[i2];
        }
        System.out.println("30보다 큰 수들의 합: " + sum1);


        //배열 `nums`에서 **가장 큰 값을 찾아 출력**하시오.

        int max = nums1[0];
        for (int i3 = 0; i3 < nums1.length; ++i3){
        if(nums1[i3]>max) max=nums1[i3];
        }System.out.println("가장 큰 값: " + max);


        //배열 `nums` 중에서 **10의 배수의 개수**를 구하시오.

        int cnt1 = 0;
        for(int i4=0; i4<nums1.length; ++i4){
            if(nums1[i4]%10==0) ++cnt1;
        }
        System.out.println("10의 배수 개수: " + cnt1);


        //배열 `nums`에서 값이 **20 이상인 요소**를 모두 출력하시오.

        System.out.print("20 이상인 수들: " );
        for(int i6=0; i6<nums1.length; ++i6){
            if(nums1[i6]>=20){
                System.out.print(nums1[i6]+" ");
            }
        }


        int[][] scores = {
                {90, 85, 78},   // 학생 1
                {88, 92, 100},  // 학생 2
                {60, 70, 80},   // 학생 3
                {100, 95, 90}   // 학생 4
        };

        for(int i7=0; i7<scores.length; i7++){
            System.out.print("학생"+(i7+1)+":");
            for(int j3=0; j3<scores[i7].length; j3++){
                System.out.print(scores[i7][j3]);
                if(j3==scores[i7].length-1){
                    System.out.print("");
                }else{
                    System.out.print(", ");
                }
            }
            System.out.println();
        }



        int[] scoreSum=new int[3];
        for(int i8=0; i8<scores.length; i8++){
            for(int j4=0; j4<scores[i8].length; j4++){
                scoreSum[j4]+=scores[i8][j4];
            }
        }
            System.out.println(Arrays.toString(scoreSum));



    }
}