package com.wwt.file;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Template\\aaa");
        file.mkdir();
        File file1 = new File(file, "a.txt");
        boolean b = file1.createNewFile();
        if(b){
            System.out.println("创建成功！");
        }else{
            System.out.println("创建失败！");
        }
    }
}