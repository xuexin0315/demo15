package com.controller;


import java.util.*;

/**
 * @author xuexin
 * @creat 2020/7/2 11:27
 */
public class Test {

    public static void main(String[] args) {

        Set<String> testList = new HashSet<String>();

        testList.add("xuexin");
        testList.add("xuexinzhenshuai");

        for (String dr:testList
             ) {
            System.out.println(dr);
        }
//        for (int i = 0; i < testList.size(); i++) {
//
//            System.out.println(testList.get(i));
//        }

//
//        Iterator<String> iterator = testList.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
    }

}


