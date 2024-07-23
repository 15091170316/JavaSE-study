package com.wwt.zhengze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 正则表达式
public class Test {
    public static void main(String[] args) {

        // 单一的字符串判断是否满足正则条件
        // 身份证
        String regex = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";

        String id = "610303200004236787";
        String id2 = "610303300004236787";

        System.out.println(id.matches(regex));
        System.out.println(id2.matches(regex));

        System.out.println("------------------------1-----------------------");


        // 爬虫，从一段本地或网络的字符串中，爬取出满足正则表达式的所有数据
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        // 获取正则表达式对象
        Pattern compile = Pattern.compile("Java[0-9]{0,2}");
        // 获取文本匹配器的对象
        Matcher matcher = compile.matcher(str);
        // 循环查找符合条件的值（找不到后则返回false，循环停止）
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println(group);
        }

        System.out.println("----------------------2-------------------------");

        // String字符串的其他可以使用正则匹配的方法
        String str2 = "小诗诗hfdhjf2342342小蕊蕊32423dfkhjsdh233小曦曦";
        String regex2 = "\\w+";

        // replaceAll, 替换字符串中所有匹配到的值为指定的第二个参数
        String s = str2.replaceAll(regex2, "vs");
        System.out.println(s);

        // replaceFirst, 替换字符串中第一个匹配到的值为指定的第二个参数
        String s2 = str2.replaceFirst(regex2, "vs");
        System.out.println(s2);

        // split 根据给定正则表达式的匹配拆分此字符串。
        String[] split = str2.split(regex2);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        System.out.println("----------------------3-------------------------");

        // 需求：去掉重复的字，输出："我要学编程！"
        String str3 = "我要学学学编编编编编编程程程程程程程程程！";
        /*  分析：
            (.) 表示将一个随机字符分组（注：一个括号就表示一组，且每组是有序号表示的，序号是从左到右看左括号的位置，且从1开始排列）
            \\1 表示使用一次第一组的内容（注意：分组后，组可以在正则表达式内使用，也可以在正则表达式外使用。内：\\1  外：$1）
            + 表示前面的东西出现一次或多次
            $1 表示在正则表达式外使用第一组的内容
        */
        String s1 = str3.replaceAll("(.)\\1+", "$1");
        System.out.println(s1);



    }
}
