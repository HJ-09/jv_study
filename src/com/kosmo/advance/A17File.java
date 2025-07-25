package com.kosmo.advance;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A17File {
    public static void main(String[] args) {
        //문자열로 된 파일을 작성하고 읽어오는 예제
        //왠만하면 모든 입출력은 예외처리 하는 것이 좋음.
        //입출력은 stream을 동반하는데 다 사용하고나면 close()를 해야합니다.
        /*FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter("A17hello.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fileWriter!=null) fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/

        //close()가 작성된 클래스의 close를 자동으로 finally 지점에 호출
        // ./ ⇒ 현재 위치를 기준으로 해당 파일을 작성. 여기서는 프로젝트 위치가 되겟죠!
        try (FileWriter fileWriter=new FileWriter("./L17hello.txt")) {
            fileWriter.write("안녕하세욥\n");
            fileWriter.write("자바 고급 수업 어려워욥^^..");

        } catch (IOException e) {
            System.out.println("파일 출력 중 오류 발생");
            e.printStackTrace();
        }

        System.out.println("파일을 읽는 중..");
        try(
                FileReader fileReader=new FileReader("./L17hello.txt"); //try-catch 안에서는 세미콜론 안 찍어도 됨
                BufferedReader bufferedReader=new BufferedReader(fileReader);
        ){
            String line="";
            while ((line= bufferedReader.readLine()) != null){ //한 줄씩 받는데 없을 때까지 반복문 실행하겠다!
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("찾는 파일이 업습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("파일을 찾는 도중 오류가 생겼습니다.");
            e.printStackTrace();
        }

        //java 11 버전만 가능함 ↓
        //Files → path 라는걸 만들어야 함
        Path path = Paths.get("L17FilesHello.txt"); //경로를 찾는 객체
        String txt="안녕! \nFiles로 파일 쓰기 해볼게~";
        try {
            Files.write(path,txt.getBytes()); //get.Bytes() : byte로 바꾸는데 인코딩 지정 후 변경
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
        String contents = Files.readString(path);
            System.out.println(contents);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
