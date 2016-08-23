package com.company;

/**
 * Created by Avi on 20/08/2016.
 */
public class IntNode {

    private int info;
    private IntNode next;

    public IntNode(int x) {
        this.info = x;
        this.next = null;
    }

    public int getInfo() {
        return this.info;
    }

    public void setInfo(int x) {
        this.info = x;
    }

    public IntNode getNext(IntNode next) {
        return this.next;
    }

    public void setNext(IntNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "IntNode{" +
                "info=" + info +
                ", next=" + next +
                '}';
    }
}
