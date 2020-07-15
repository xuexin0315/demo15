package com.io;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author xuexin
 * @creat 2020/7/10 17:01
 */
public class TestStream {


    public static void main(String[] args) {

        File f1 = new File("F:/OL.txt");
        try {
            FileInputStream f2 = new FileInputStream(f1);
            System.out.println((int)f1.length());

            byte[] bytes = new byte[(int)f1.length()];
            f2.read(bytes);
            for (byte b:bytes
                 ) {
                System.out.println(b);
            }
            f2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
