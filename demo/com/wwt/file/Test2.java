package com.wwt.file;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File[] files = File.listRoots();
        for (File src : files) {
            findAvi(src);
        }
    }

    public static void findAvi(File src) {
        File[] files = src.listFiles();
        if(files != null) {
            for (File file : files) {
                if(file.isFile()){
                    if(file.getName().endsWith(".avi")){
                        System.out.println(file.getAbsolutePath());
                    }
                }else{
                    findAvi(file);
                }
            }
        }
    }
}
