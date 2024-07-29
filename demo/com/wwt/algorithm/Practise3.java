package com.wwt.algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Practise3 {

    public static void main(String[] args) throws ParseException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello World");
        stringBuilder.insert(0, "aaa");
        stringBuilder.insert(0, "bbb");
        System.out.println(stringBuilder.toString());

        System.out.println("------------------------------------");

        long currentTime = System.currentTimeMillis();
        String birthday = "2000年04月03日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        long birthdayTime = simpleDateFormat.parse(birthday).getTime();
        long time = currentTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);
        System.out.println(time / 1000 / 60 / 60 / 24 / 365);

        System.out.println("------------------------------------");

        LocalDate localDate = LocalDate.of(2000, 4, 3);
        LocalDate now = LocalDate.now();
        long between = ChronoUnit.DAYS.between(localDate, now);
        System.out.println(between);
        long between1 = ChronoUnit.YEARS.between(localDate, now);
        System.out.println(between1);

        System.out.println("------------------------------------");

        LocalDate localDate1 = LocalDate.of(2000, 3, 1);
        LocalDate localDate2 = localDate1.minusDays(1);
        int dayOfMonth = localDate2.getDayOfMonth();
        System.out.println(dayOfMonth);
        if(dayOfMonth == 29){
            System.out.println("是闰年");
        }  else{
            System.out.println("是平年");
        }

        // isLeapYear方法，直接判断是否为闰年（true为闰年，false为平年）
        System.out.println(localDate1.isLeapYear());


    }
}
