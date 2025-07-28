package com.kosmo.advance;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class A20ChattingServer {
    public static List<Socket> clients=new ArrayList<>();
    public static void main(String[] args) {
        //OS가 쓰는 포트 ⇒ 2000번 이하.
        try(ServerSocket server=new ServerSocket(3333)){
            while (true){
                Socket client=server.accept(); //접속을 받는 것.
                //accept()는 접속이 올 때 까지 무한히 대기
                clients.add(client); //받은 메세지를 모든 client에게 보내야 해서 모아둠.
                String clientAddress=client.getInetAddress().toString(); //클라이언트 주소가 뜸
                System.out.println(clientAddress+"님 서버 접속");

                new Thread(()->{
                    try {
                        InputStream in=client.getInputStream(); //client가 서버로 보내는 메세지(문자열)를 받는 통로
                        //InputStreamReader, BufferedReader, Scanner

                        InputStreamReader inputStreamReader=new InputStreamReader(in);
                        BufferedReader reader=new BufferedReader(inputStreamReader);
                        while (true){
                            try {
                                String msg=clientAddress+":"+reader.readLine();
                                System.out.println(msg);
                                for(Socket c: clients){
                                    OutputStream out=c.getOutputStream();
                                /*OutputStreamWriter writer=new OutputStreamWriter(out);
                                BufferedWriter bufferedWriter=new BufferedWriter(writer);
                                bufferedWriter.write(msg);*/ //내용은 밑에랑 동일함.
                                    PrintWriter print=new PrintWriter(out);
                                    print.println(msg);
                                    print.flush(); //버퍼는 사용하고 비워야 함. 버퍼를 비우지 않으면 버퍼까지 전송(=오류)
                                }
                            } catch (IOException e) {
                                System.out.println("클라이언트가 보낸 메세지를 받는 중 오류");
                                e.printStackTrace();
                            }
                        }
                    }catch (IOException ex){
                        System.out.println("클라이언트에게서 입력 받는 객체 받아오기 오류");
                        ex.printStackTrace();
                    }

                }).start(); //쓰레드 만들고 시작.


            }
        } catch (IOException e) {
            //throw new RuntimeException(e); ⇒
            System.out.println("서버에 문제가 생김, 종료됩니다.");
            e.printStackTrace();
        }
    }
}
