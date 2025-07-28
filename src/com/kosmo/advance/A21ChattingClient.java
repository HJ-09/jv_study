package com.kosmo.advance;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class A21ChattingClient {
    //서버에 접속 후 메세지 전송 및 수신
    public static void main(String[] args) {
        //Socket 객체만 만들면 접속 가능
        try (Socket socket=new Socket("127.0.0.1",3333); //127.0.0.1 == localHost
            OutputStream outputStream=socket.getOutputStream(); //input을 먼저 생성하면 차단 가능성 有
            BufferedWriter  writer=new BufferedWriter(new OutputStreamWriter(outputStream));
            InputStream inputStream=socket.getInputStream();
            BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
            ){
            writer.flush();
            new Thread(()->{
                    Scanner terminalScan=new Scanner(System.in); //터미널에서 입력 받을 준비
                while (true){ //입력창 만들어두지 않았으니 터미널에서 받은 채팅을 서버에 전송 할거임.
                    String msg=terminalScan.nextLine();
                    try {
                        writer.write(msg+"\n"); //서버에 메세지 전송
                        //라인개행이 없으면 서버가 nextLine()으로 받을 수 없음 ★★★
                        writer.flush(); //사용한 버퍼 비우기
                    } catch (IOException e) {
                        System.out.println("서버로 메세지 보내는 중 오류 발생");
                        e.printStackTrace();
                    }
                }
            }).start();

            while (true){ //남은 일꾼이 무한히 메세지 받기
                String inputMsg=reader.readLine(); //서버가 보낸 메세지
                System.out.println(inputMsg);
            }

        } catch (UnknownHostException e) {
            System.out.println("찾는 서버가 없습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("서버와의 접속에 문제가 생겼습니다.");
            e.printStackTrace();
        }
    }
}
