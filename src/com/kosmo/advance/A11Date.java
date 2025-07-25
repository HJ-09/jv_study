package com.kosmo.advance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;// 자바의 초창기 시간 클래스
import java.util.TimeZone;

public class A11Date {
    public static void main(String[] args) {
        Date date=new Date(); //객체를 만드는 시점의 시간을 갖는다.
        System.out.println(date); //Mon Jul 21 11:49:31 KST 2025
        //UTC(Coordinated Universal Time) : 국제표준시간. 한국표준시간+9
        int y=date.getYear();
        int m=date.getMonth();
        int d=date.getDate();
        int w=date.getDay(); //요일
        System.out.println(y); //2025년 ⇒ 125 (=2025-1900)
        System.out.println(m); //7월 ⇒ 6 (0~11이라서 +1 해줘야함)
        System.out.println(d); //21일 ⇒ 21
        System.out.println(w); //월요일 ⇒ 1 (0~6임. 0은 일요일)
        String weeks[]={"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        System.out.println(weeks[w]);
        System.out.println(y+1900+"년");
        System.out.println(m+1+"월");
        System.out.println(d+"일");


        //특정 시간대의 시간 객체 생성법(자바 7버전이하)
        //Calendar(특정시간대 호출)
        Calendar cal=Calendar.getInstance();
        cal.set(2024,2,23);
        cal.set(2024,2,23,11,30,0);
        //Calendar cal=Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
        Date date2=cal.getTime();
        System.out.println(date2);

        //자바 8버전 이상, ZonedDateTime(특정시간대 생성)

        Date date3=Date.from(ZonedDateTime.of(2023,2,1,10,10,10,0, ZoneId.of("Asia/Seoul"))
                .toInstant()
        );
        System.out.println(date3);


        //숫자로 된 데이트 객체를 문자열로 출력 ⇒ SimpleDateFormat()
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); //2025-07-21
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-dd"); //2025-7-21
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 M월 d일"); //2025년 7월 21일
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 M월 d일 hh시 mm분 ss초"); //2025년 7월 21일 12시 18분 10초 //h는 12시간제 AM/PM , H는 24시간제
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 M월 d일 hh시 mm분 ss초 SS"); //2025년 7월 21일 12시 18분 52초 915  (S는 나노초)
        Date date4=new Date();
        System.out.println(sdf.format(date4));


        String dateStr="2002년 5월 5일 13시 13분 13초 001밀리초";
        //Date 객체로 만들고 싶다?!
        int i=Integer.parseInt("13"); //문자열을 정수로! (파싱 : 오류가 발생할 수도 있지만 형변환 GO)

        try {
            Date date5=sdf.parse(dateStr);
            System.out.println(date5);
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.out.println("형식이 잘못 되었습니다.");
        }


        //유닉스 시간
        //└─ 최초의 소형컴퓨터 운영체제 유닉스가 시간을 표기한 방법
        //유닉스가 만들어진 1970년부터 밀리초로 시간을 표현
        //시간을 문자열이 아니라 수로 정의하기 위해서 만듦.
        //1970.1.1.0.0.0 → 0
        //1970.1.1.0.1.0 → 1000
        //1970.1.1.1.0.0 → 60000(1000*60)


        Date date6=new Date();
        System.out.println(date6.getTime()); //1753069610606 →1970년부터 나노초를 계속 샌 값.. 미쵸따 0ㅇ0
        long time=System.currentTimeMillis();
        System.out.println(time); //1753069610606


        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf2.setTimeZone(TimeZone.getTimeZone("UTC"));
        //String str="1970-01-01 00:00:00";
        String str="1970-01-01 01:00:00"; //1000*60*60 (밀리초*60분*60초) ⇒ 3600000
        try {
            Date date7=sdf2.parse(str);
            System.out.println(date7); //Thu Jan 01 00:00:00 KST 1970
            System.out.println(date7.getTime()); //-32400000 (UTC기준이라서 -9시간) 86번째줄 추가 후 ⇒ 0
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long l=2000000000000l;
        Date date8=new Date(l); //유닉스 시간으로 date 객체 생성
        System.out.println(date8); //Wed May 18 12:33:20 KST 2033


    }
}
