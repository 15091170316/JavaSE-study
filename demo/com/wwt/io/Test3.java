package com.wwt.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\Template\\a.txt");

        int read = fileInputStream.read();      // 只能读取一个字符
        System.out.println((char) read);
        int read2 = fileInputStream.read();      // 只能读取一个字符
        System.out.println((char) read2);

        fileInputStream.close();
    }
}
