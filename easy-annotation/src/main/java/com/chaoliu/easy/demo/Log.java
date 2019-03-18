package com.chaoliu.easy.demo;

public class Log {

    public static void e(String msg) {
        e( "tag", msg );
    }

    public static void e(String tag, String msg) {
        System.out.println( tag + "[" + msg + "]" );
    }

}
