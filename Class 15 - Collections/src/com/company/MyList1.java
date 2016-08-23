package com.company;

/**
 * Created by eladlavi on 17/08/2016.
 */
public class MyList1 implements Listable {

    private int[] nums;
    private int pos;


    public MyList1() {
        nums = new int[10];
        pos = 0;

    }

    public void makeRoom() {
        if (pos == nums.length) {
            int[] temp = new int[nums.length * 2];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = temp[i];
            }
        }
        int[] temp = nums;
        pos++;
    }


    @Override
    public void add(int num) {
        makeRoom();
        num = nums[pos];

    }

    @Override
    public void remove(int index) {
        if (index < 0 || pos >= nums.length) {
            throw new IndexOutOfBoundsException("Trying to add at " + index);
        }
        for (int i = index; i < nums.length - 1; i++) {
            nums[i + 1] = nums[i];
        }

    }

    @Override
    public void addAt(int index, int num) {
        if (index < 0 || pos >= nums.length) {
            throw new IndexOutOfBoundsException("Trying to add at " + index);
        }
        makeRoom();
        for (int i = nums.length; i > index; i--) {
            nums[i] = nums[i + 1];
        }
        num = nums[index];
    }

    @Override
    public void set(int index, int num) {
        if (index < 0 || pos >= nums.length) {
            throw new IndexOutOfBoundsException("Trying to add at " + index);

        }
        nums[index]=num;
    }

        @Override
        public int get ( int index){
            if (index < 0 || pos >= nums.length) {
                throw new IndexOutOfBoundsException("Trying to add at " + index);
            }

                return 0;
        }

        @Override
        public int indexOf (int num) {
            for (int i = 0; i < nums.length; i++) {
                if (num == nums[i]) {
                    return i;
                }
            }
            return -1;
        }

        @Override
        public int[] toArray () {
            return new int[pos];
        }

        @Override
        public int size () {
            return nums.length;
        }
    }