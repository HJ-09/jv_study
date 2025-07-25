package H;
class A{
    int m=3;
    void method(){
        System.out.println("A의 메서드");
    }
}


public class H0 {
    public static <Example> void main(String[] args) {

        A b = new A();
        b.m=5;
        System.out.println(b.m);
        b.method();


        int a=8;
        switch(a){
            case 10,9,8,7:
                System.out.println("pass"); break;
            default:
                System.out.println("fail");
        }

        if(a>=7){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        int num=0, sum=0;
        while(sum<100){
            sum+=num;
            num++;
        }
        System.out.println((num-1)+"까지의 합 = "+sum);

        int num1=0, sum1=0;
        for(num1=0, sum1=0; sum1<100; num1++){
            sum1+=num1;
        }
        System.out.println((num1-1)+"까지의 합 = "+sum1);


        int n;
        n=0;
        while(n<0){
            System.out.println(n+" ");
            n++;
        }
        n=1;
        do{
            System.out.println(n+" ");
            n++;
        }while(n<0);


        int value3=2;
        switch (value3){
            case 1 :
                for(int k=0;k<10;k++){
                    System.out.println(k+" ");
                }
                break;
            case 2 :
                for(int k=10;k>0;k--){
                    System.out.println(k+" ");
                }
                break;
        }
        System.out.println();

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.println(i+" "+j);
                if(i==j){
                System.out.println("i=j");
                }
            }
        }
        System.out.println();


        for(int i=0; i<10; i++){
            for(int j=0;j<10;j++){
                if(i==j){
                    System.out.println("i=j");
                    break;
                }
                System.out.println("("+i+","+j+")");
            }
        }
        System.out.println();

        pos1:
        for(int d=0;d<5;d++){
            for(int f=0;f<5;f++){
                if(f==2){
                    break pos1;
                }
                System.out.println(d+", "+f);
            }
        }
        System.out.println();

        for(int d=0; d<10; d++){
            System.out.println(d+" ");
            continue;
        }

        int score=72;
        String scores=switch(score/10){
            case 10, 9 -> "A학점";
            case 8 -> "B학점";
            case 7 -> "C학점";
            default -> "F학점";
        };
        System.out.println(scores+" 입니다.");


        for(int i=0; ;i++) {
            if (i > 10) {
                break;
            }
            if (i % 2 != 0) {
                continue;
            }
                System.out.print(i+" ");
            }







    }
}

