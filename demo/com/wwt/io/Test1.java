package com.wwt.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {97, 98, 99, 100, 101, 102};

        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Template\\a.txt");
        // 三种写入的方式
        fileOutputStream.write(97);
        fileOutputStream.write(bytes);
        fileOutputStream.write(bytes, 1, 3);
        fileOutputStream.close();
    }
}
