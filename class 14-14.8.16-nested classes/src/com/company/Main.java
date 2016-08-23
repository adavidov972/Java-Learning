package com.company;

public class Main {

    public static void main(String[] args) {
	/* 4 types of nested classes
        - static nested class
        - inner class
        - local inner class
        - anonymous class

    */

	MyClass.myStaticNestedClass myStaticNestedClass=
            new MyClass.myStaticNestedClass();
    }
    MyClass myClass = new MyClass();
    MyClass.MyInnerClass myInnerClass=myClass.new MyInnerClass();
}
