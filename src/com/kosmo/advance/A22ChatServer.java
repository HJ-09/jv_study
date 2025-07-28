package com.kosmo.advance;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class A22ChatServer {

    private static List<Socket> clients=new ArrayList<>();

    public static void main(String[] args) {
        try(ServerSocket serverSocket=new ServerSocket(8888);){
            while (true) {
                Socket client=serverSocket.accept(); //클라이언트 소켓 접속을 받음
                clients.add(client);
                String ip=client.getInetAddress().toString();
                System.out.println(ip+"님 접속");

                //문자열(reader), 오브젝트(object), 파일(file, fileReader)
                new Thread(()->{ //접속한 클라이언트의 메세지를 받는 일꾼
                    try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(client.getInputStream()));
                    ){
                        String msg="";
                        while ((msg=bufferedReader.readLine())!=null){ //연결이 끊어졌을 때 반복문 중단
                            System.out.println(ip+"님이 보낸 메세지 : "+msg);

                            for(Socket c:clients){
                                BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(c.getOutputStream()));
                                writer.write(ip+":"+msg+"\n"); //클라이언트가 라인개행(\n)을 기준으로 문자열을 받을 예정(만약 라인개행 없으면 보낼 때까지 대기)
                                writer.flush();
                            }
                        }
                        //while 무한 반복문에서 나가는 것은 클라이언트와 소켓이 끊어졌을 때.
                        clients.remove(client);
                        client.close();


                    } catch (IOException e) {
                        System.out.println("클라이언트와의 접속 소켓에 문제가 생겼습니다.");
                        e.printStackTrace();
                    }
                }).start();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
