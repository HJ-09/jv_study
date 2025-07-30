package com.kosmo.advance.ex.chatting;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.Socket;

public class ChatClient extends JFrame{
    JTextArea chatArea; //채팅출력
    JTextField chatInput; //채팅입력
    JButton chatSend; //전송버튼
    JScrollPane sp; //채팅창 자동 스크롤

    Socket socket;
    PrintWriter out;
    BufferedReader in;

    public ChatClient() throws IOException {
        super("단체채팅방");

        chatArea=new JTextArea();
        chatArea.setEditable(false); //사용자가 직접 못 쓰게 함.
        sp=new JScrollPane(chatArea);

        chatInput=new JTextField(30);
        chatSend=new JButton("전송");

        JPanel panel=new JPanel(new BorderLayout());
        panel.add(chatInput, BorderLayout.CENTER);
        panel.add(chatSend, BorderLayout.EAST);

        add(sp, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        socket=new Socket("localhost",5555);
        out=new PrintWriter(socket.getOutputStream(),true);
        in=new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String name=JOptionPane.showInputDialog(this,"이름을 입력하세요.");
        out.println(name); //서버에게 이름 먼저 전송

        chatSend.addActionListener((e)->{
            String msg=chatInput.getText().trim(); //trim()은 빈 메시지 방지하려고 넣어둠.
            if(!msg.isEmpty()){ //!msg.isEmpty() → msg가 비어있지 않다면. 즉, 뭔가 입력되었을 때만 실행하겠다는 의미.
                //isEmpty() → 문자열이 완전히 빈 문자열인지 확인하는 메서드
                chatArea.append("나: "+msg+"\n");
                out.println(msg); //서버에 보냄
                chatInput.setText(""); //입력창 비우기
                chatInput.requestFocusInWindow();
            }
        });

        chatInput.addActionListener((ex)->{
            chatSend.doClick();
        });


        new Thread(()->{
            try{
                String msg;
                while ((msg=in.readLine())!=null){
                    chatArea.append((msg+"\n"));
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }).start();

        //Thread는 웬만하면 객체 다 만들고 밑에 만드는게 좋음. 객체 위에 만들어두면 null. 뜰 수 있음 ㅋ


        setBounds(800,500,450,450);
        setVisible(true);
        chatInput.requestFocusInWindow();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        try {
            new ChatClient();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
