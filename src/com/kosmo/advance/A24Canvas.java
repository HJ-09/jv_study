package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;

public class A24Canvas extends JFrame {
        //canvas도 컴포넌트여서 혼자 존재할 수 없음
        MyCanvas canvas;

        class MyCanvas extends Canvas {
            Image image;

            public MyCanvas(){
                this.setBackground(Color.pink); //배경은 paint 할 필요 없이 바로 지정 가능
                image=Toolkit.getDefaultToolkit().getImage("./다운로드.jpg"); //캔버스가 생성될 때만 이미지를 불러오기 위해.
            }

            //paint()는 canvas가 생성되면 자동으로 호출
            @Override
            public void paint(Graphics g) { //Graphics g는 붓임
                //super.paint(g); ⇒ 자동완성이라서 지워도 됨.
                Graphics2D g2=(Graphics2D)g; //선 굵기는 Graphics2D 사용해야함.
                g2.setStroke(new BasicStroke(5f));

                g.setColor(Color.RED);
                g.drawLine(50,50,100,100);

                //팩맨 만들어볼게~
                g2.setColor(Color.yellow);
                g2.fillArc(150,150,200,200,0,310);
                g2.setColor(Color.WHITE);
                g2.fillOval(280,190,25,25);

                //  ./다운로드.jpg ⇒ 현재 기준 경로
                //Image image=Toolkit.getDefaultToolkit().getImage("./다운로드.jpg"); //→ 이거는 바로 쓸 수 업서어
                //g2.drawImage(image,300,300,this);
                Image image=new ImageIcon("다운로드.jpg").getImage();
                g.drawImage(image,50,50,100,100,null);
                //└─ImageIcon을 쓰면 다음 코드에는 무조건 이미지가 존재하기 때문에 Observer가 필요없음. 그래서 null.


            }
        }

    public A24Canvas(){
            super("캔버스 수업");
            canvas=new MyCanvas();
            this.add(canvas);

            this.setBounds(800,300,450,450);
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new A24Canvas();

    }
}
