package com.kosmo.advance;

import java.io.*;
import java.util.Arrays;

class Block implements Serializable {//타입에 객체가 직렬화 대상임을 명시.
    //Serializable 했을 땐 버전이 필요함. JVM이 구분을 못해서..^^ ↓
    private static final long serialVersionUID=1L; //직렬화 한 객체간의 구분

    int x;
    int y;
    int[]color; //{R,G,B} ⇒ {0~255,0~255,0~255}

    //Color color2; //⇒ Color Serializable 구현 했을 때만 사용할 수 있음. so, 필드를 막 작성하면 x

    public Block(int x, int y, int[] color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public String toString() { //객체 정보(필드)를 출력하는 함수
        return "Block{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + Arrays.toString(color) +
                '}';
    }
}

//목표 : 객체로 만들어서 저장 ⇒ 다른 서버에 보내기
public class A18ObjectInputOutput {
    public static void main(String[] args) {
        int [] color={200,30,25};
        Block block=new Block(10,10,color);
        //서버에 전송하고 싶으면 객체를 파일로 만들어야 함. 정확히는 byte 정보로 만들어야 함. ⇒ 직렬화. 근데 아무 데이터나 직렬화 할 수는 없음.
        //└─ 그래서 타입에 객체가 직렬화 대상임을 명시해야함. implements Serializable.

        try (
                FileOutputStream fileOut=new FileOutputStream("L18block.ser");
                ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);
                //객체(인스턴스)==object : 객체를 파일로 작성할 준비
        ){
            objectOut.writeObject(block);
            System.out.println("블럭을 파일로 작성 완료");
        } catch (FileNotFoundException e) {
            System.out.println("경로를 찾을 수 없음");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("블럭 객체를 파일로 작성 중 오류");
            e.printStackTrace();
        }

//파일로 저장된 객체를 다시 불러와서 객체로 만들어볼게~

        System.out.println("파일 불러오는 중..");
        try(FileInputStream fileIn=new FileInputStream("L18block.ser");
            ObjectInputStream objcetIn=new ObjectInputStream(fileIn);){
            Object objBlock = objcetIn.readObject(); //받아온 클래스가 명시되지 않아서 오류 발생
            Block b=(Block) objBlock;
            System.out.println(b);

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("파일을 읽는 중 오류 발생");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("받아온 객체와 같은 타입이 없음");
            e.printStackTrace();
        }


    }
}
