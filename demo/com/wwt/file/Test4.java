package com.wwt.file;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("E:\\Study");
        long size = getSize(file);
        System.out.println("文件夹总大小：" + size/1024/1024 + "MB");
    }

    public static long getSize(File file){
        long size = 0;
        File[] files = file.listFiles();
        if(files != null){
            for (File file1 : files) {
                if(file1.isFile()){
                    size += file1.length();
                }else{
                    size += getSize(file1);
                }
            }
        }
        return size;
    }
}
