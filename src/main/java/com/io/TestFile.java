package com.io;

import java.io.File;

/**
 * @author xuexin
 * @creat 2020/7/10 15:43
 */
public class TestFile {
    public static void main(String[] args) {


        File f1 = new File("f:/OL");
        System.out.println("f1的绝对路径"+f1.getAbsolutePath());
        File f2 = new File("OL.exe");
        System.out.println("f2的绝对路径："+f2.getAbsolutePath());
        File f3 = new File(f1,"OL.exe");
        System.out.println("f3的绝对路径："+f3.getAbsolutePath());


    }
}
