package com.wwt.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("E:\\Template\\a.txt");
        int b;
        while ((b = fileInputStream.read()) != -1){
            System.out.print((char)b);
        }
        fileInputStream.close();
    }
}
