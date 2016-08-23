package com.company;

/**
 * Created by Avi on 21/08/2016.
 */
public class MyList2 implements Listable {

    Link anchore;
    Link last;
    int pos;

    public MyList2() {
        anchore = new Link(10);
        pos = 0;
        last = last.next;
    }


    @Override
    public void add(int num) {
        Link last = anchore;
        while (last.next != null) {
            last = last.next;

        }

    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= pos) {
            throw new IndexOutOfBoundsException("out of bound");
        }
        Link theOneBefore = anchore;
        for (int i = 0; i < index; i++) {
            theOneBefore = theOneBefore.next;

        }
        theOneBefore.next = theOneBefore.next.next;
        pos--;
    }

    @Override
    public void addAt(int index, int num) {

        if (index < 0 || index >= pos) {
            throw new IndexOutOfBoundsException("out of bound");
        }
        Link addSpot = anchore;
        for (int i = index; i == pos ; i++) {
            addSpot=addSpot.next;
        }
        anchore.value=num;
    }

    @Override
    public void set(int index, int num) {

        if (index < 0 || index >= pos) {
            throw new IndexOutOfBoundsException("out of bound");
        }
    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int indexOf(int num) {
        return 0;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public int size() {
        return 0;
    }


    static class Link {

        int value;
        Link next;


        public Link(int value) {
            this.value = value;
        }

    }
}