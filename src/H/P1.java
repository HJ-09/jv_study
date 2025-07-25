package H;

public class P1 {
    public static void main(String[] args) {

//        int[] nums = {10, 20, 30};
//        int i = 0;
//        while (i < nums.length) {
//            if (i == nums.length - 1) {
//                System.out.println(nums[i]);
//            } else {
//                System.out.print(nums[i] + ", ");
//            }
//            i++;
//        }

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


        int[] scores = {70, 85, 100, 95, 120, 88, 150};
        int k=0;
        while(k<scores.length){
            if(scores[k]>=100){
                System.out.print(scores[k]+" ");
            }
            k++;
        }


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

        int q=9;
        System.out.println(Integer.toOctalString(q));
        System.out.println(Integer.toBinaryString(q));
        System.out.println(Integer.toHexString(q));

        int a2=3;
        int b2=++a2;
        System.out.println(a2);
        System.out.println(b2);

        System.out.println(3&10);
        System.out.println(3|10);
        System.out.println(3^10);

        System.out.println(Integer.parseInt("00000101",2));
        byte m=(byte)Integer.parseInt("11111011",2);
        System.out.println(m);

        int flags=0b10110110;
        System.out.println(flags>>>0&1);
        System.out.println(flags>>>1&1);


        byte m1=(byte)Integer.parseInt("11111101",2);
        System.out.println(m1);

        System.out.println(-3>>>31);


        String str="hello";
        String str2="hello";
        System.out.println(str==str2);

        String str3=new String("안녕");
        String str4=new String("안녕");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));



    }
}
