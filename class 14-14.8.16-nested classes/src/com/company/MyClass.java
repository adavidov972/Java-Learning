package com.company;

/**
 * Created by Avi on 14/08/2016.
 */
public class MyClass {
    public static class myStaticNestedClass{

    }

    public class MyInnerClass {

    }

    public void foo(){
        class LocalInnerClass{

        int x = 8;
            LocalInnerClass localInnerClass = new LocalInnerClass();

        }
    }

}