package com.wwt.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\Template\\a.txt", true);

        String src = "wangshiyun";
        byte[] bytes = src.getBytes();
        fileOutputStream.write(bytes);

        String src2 = "\r\n666";        // 换行写
        byte[] bytes2 = src2.getBytes();
        fileOutputStream.write(bytes2);

        fileOutputStream.close();
    }
}
