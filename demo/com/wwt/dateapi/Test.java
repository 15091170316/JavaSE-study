package com.wwt.dateapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

// 常见的时间API
public class Test {
    public static void main(String[] args) throws ParseException {
        // Date时间类：创建时间对象（JDK7）
        // getTime() 方法：获取指定时间的时间戳（事件对象至标准时间的毫秒数差值）
        // setTime() 方法：可以设置/修改时间对象的毫秒数，改变时间对象的时间

        // 若创建对象时不传参，则表示当前时间
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());     // 获取当前时间的毫秒值

        // 若创建时间对象时传参，则转递时间戳（时间的毫秒值）,则会创建传递的时间对象
        Date date1 = new Date(1000L * 60 * 60 * 24);
        System.out.println(date1);
        System.out.println(date1.getTime());    // 获取时间对象的毫秒值

        // setTime() 方法，也可以修改时间对象的毫秒值

        System.out.println("-----------------1--------------------");


        // SimpleDateFormat 类：格式化时间、解析时间（JDK7）
        // format() 方法：格式化时间对象为指定的格式
        // parse() 方法：解析其他格式的字符串时间为时间对象

        // 若创建对象时不传递构造参数，则表示使用默认格式格式化时间对象 （yyyy/MM/dd 上午m:ss）（不常用）
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String format = simpleDateFormat.format(new Date());    // 调用该对象的 format() 方法，传递时间对象来格式化时间对象
        System.out.println(format);

        // 若创建对象时传递了构造参数，则表示使用自定义的格式去格式化时间对象（常用）
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss EE");
        String format1 = simpleDateFormat1.format(new Date());  // 调用该对象的 format() 方法，传递时间对象来格式化时间对象
        System.out.println(format1);

        // 解析有格式的时间字符串为时间对象
        String time = "2023-11-11 11:11:11";
        // 注意，创建SimpleDateFormat对象时，构造参数的格式必须和被解析的时间字符串的格式相同
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat2.parse(time);
        System.out.println(parse);  // 时间对象
        System.out.println(parse.getTime());    // 时间对象的时间戳

        System.out.println("-----------------2--------------------");


        // Calender类：日历对象（不能直接new日历对象，该类是一个抽象类，需要使用静态方法获取日历对象）（JDK7）
        // getInstance() 静态方法：获取日历对象（静态对象）（这个日历对象是个类数组，把当前的日历信息全部存在一个类数组中，通过索引来获取某个字段信息，也可以通过java自定义的静态属性获取）
        // getTime() 方法：获取对应日历对象的时间对象
        // setTime() 方法：给日历对象 设置/修改 时间对象

        // getTimeInMillis() 方法：获取对应日历对象的时间对象的时间戳
        // setTimeInMillis() 方法：给日历对象 设置/修改 时间对象的时间戳

        // get() 方法：取日期中的某个字段信息
        // set() 方法：修改日期中的某个字段信息
        // add() 方法：为某个字段信息 增加/减少 指定的值

        // 获取当前的日历对象
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        Date date2 = new Date(0L);
        instance.setTime(date2);        // 设置日历对象的时间为指定的时间对象
        System.out.println(instance);

        System.out.println(instance.getTime());     // 获取日历对象的日期对象

        instance.setTimeInMillis(1000L);    // 设置日历对象的时间为指定的时间戳

        System.out.println(instance.getTimeInMillis());     // 获取日历对象的日期对象的时间戳

        int m = instance.get(Calendar.DAY_OF_MONTH);    // 获取一月中的某一天
        // int m = instance.get(5);     // 相同的效果，日历对象中有一个数组存储着这个日历的所有字段信息，可以使用索引获取，但为了见名知义，java给索引定义了静态属性与其对应
        System.out.println(m);

        instance.set(Calendar.YEAR, 2024);  // 修改日历对象中的年份
        System.out.println(instance.getTime());

        instance.add(Calendar.YEAR, 2);     // 将日历对象中的年份 +2
        System.out.println(instance.getTime());

        instance.add(Calendar.YEAR, -1);    // 将日历对象中的年份 -1
        System.out.println(instance.getTime());


        System.out.println("-----------------3--------------------");


        // JDK8中的新的时间类（10个类）
        // 注：JDK8中的时间都是不可修改的，要修改只能重新生成一个新的对象（为了解决多线程的时间冲突问题）

        // ZoneId 时区类
        // static getAvailableZoneIds() 方法：获取Java中支持的所有时区
        // static systemDefault() 方法：获取系统默认的时区
        // static of(String zoneId) 方法：获取一个指定时区

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();    // 获取Java中支持的所有时区
        System.out.println(availableZoneIds);

        ZoneId zoneId = ZoneId.systemDefault();     // 获取系统默认的时区
        System.out.println(zoneId);

        ZoneId zoneId1 = ZoneId.of("Asia/Aqtau");       // 获取一个指定时区
        System.out.println(zoneId1);

        // Instant 时间戳类
        Instant now = Instant.now();
        System.out.println(now);

    }

}
