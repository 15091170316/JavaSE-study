package com.wwt.file;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        File file = new File("E:\\Template\\a.txt");
        deleteFile(file);
        file.delete();
    }

    public static void deleteFile(File file){
        File[] files = file.listFiles();
        if(files != null){
            for (File file1 : files) {
                if(file1.isFile()){
                    file1.delete();
                }else{
                    deleteFile(file1);
                    file1.delete();
                }
            }
        }
    }
}
