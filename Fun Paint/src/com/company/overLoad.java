package com.company;

/**
 * Created by Avi on 7.8.2016.
 */
public class overLoad {
    public static void aMethod (int val){System.out.println("int");}
    public static void aMethod (short val){System.out.println("short");}
    public static void aMethod (Object val){System.out.println("object");}
    public static void aMethod (String val){System.out.println("string");}

    public static void go (){
        byte b=9;
        aMethod(b);
        aMethod(9);
        Integer i=9;
        aMethod(i);
        aMethod("9");
    }
}
