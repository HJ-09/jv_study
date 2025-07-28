package com.kosmo.advance;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class A23ChatClient {

    public static void main(String[] args) {
            try(Socket socket=new Socket("127.0.0.1",8888)){

                //1.콘솔에 입력한 문자열을 서버로 전송하는 무한반복문 만들기
                new Thread(()->{
                    Scanner scan=new Scanner(System.in); //채팅창에 입력한 메세지를 받을 준비만..
                    try {
                        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        while (scan.hasNextLine()) { //채팅창인 터미널이 죽으면 false를 반환하고 종료.
                            String msg=scan.nextLine(); //실제로 채팅 받는 애. 메세지의 한 줄 받기
                            writer.write(msg+"\n"); //\n을 생략하면 서버에서 메세지를 계속 대기
                            writer.flush(); //버퍼 비우기~
                        }
                    } catch (IOException e) {
                        System.out.println("출력에 문제가 생겼습니다.");
                    }
                }).start();

                //2.서버가 보내는 문자열을 받아서(in) 콘솔에 출력하는 무한반복문 만들기
                BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String str="";
                System.out.println("메세지 받을 준비 완료");
                while ((str=reader.readLine())!=null){
                    System.out.println(str);
                }

            } catch (UnknownHostException e) {
                System.out.println("해당 서버가 없음");
            } catch (IOException e) {
                System.out.println("연결에 문제가 있음");
                e.printStackTrace();
            }
    }
}
