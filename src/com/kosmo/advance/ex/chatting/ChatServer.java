package com.kosmo.advance.ex.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ChatServer {
    private static List<PrintWriter> writers= Collections.synchronizedList(new ArrayList<>());

    static class ClientHandler extends Thread{
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in; //Scanner가 나을지?? ⇒ 채팅처럼 줄 단위로 받는 경우에는 BufferedReader 추천.
        private String name;

        public ClientHandler(Socket socket){
            this.socket=socket;
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                //socket.getOutputStream() → 소켓을 통해 나가는 길(출력스트림)을 가져오는 것. 클라이언트가 받을 수 있음.
                //new PrintWriter(..., true) → PrintWriter은 문자열을 쉽게 출력할 수 있게 도와주는 클래스, true는 자동 flush 설정. 버퍼에 저장 x.
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //socket.getInputStream() → 클라이언트가 보낸 데이터를 받는 통로. 근데 byte 단위라서 우리가 보기 힘듦.
                //new InputStreamReader(...) → byte를 문자(String)로 바꿔주는 변환기 역할
                //new BufferedReader() → 문자를 한 줄씩 읽을 수 있게 해주는 도구. readline() 메서드를 쓰기 위해 필요.
                writers.add(out); //연결된 클라이언트 추가
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        public void run(){
            String msg;
            try {
                while((msg=in.readLine())!=null){
                    System.out.println("클라이언트: "+msg);
                    synchronized (writers){
                        for (PrintWriter writer:writers){
                        if(writer!=out){
                            writer.println(name+": "+msg);
                            }
                        }
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            } finally {
                try{
                    writers.remove(out);
                    in.close();
                    out.close();
                    socket.close();
                    System.out.println(name+" 연결 종료");
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        int port=5555;
        String name="";
        try(ServerSocket server=new ServerSocket(port)){
            //ServerSocket은 문을 열고 손님(클라이언트)을 기다리는 역할
            System.out.println("서버가 실행 중..");

            while (true) {
                Socket socket = server.accept(); //accept()는 누군가 접속할 때까지 멈춰있음
                System.out.println(name+"님이 접속했습니다.");

                ClientHandler handler = new ClientHandler(socket);
                handler.start();
            }

        } catch (IOException e){
          e.printStackTrace();
        }
    }
}
