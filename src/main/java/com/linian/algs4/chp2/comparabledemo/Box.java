package com.linian.algs4.chp2.comparabledemo;

public class Box implements Comparable<Box> {
    private final long size;

    public Box(long size) {
        this.size = size;
    }

    @Override
    public int compareTo(final Box o) {
//        return Long.compare(this.size, o.size);

        if (this.size > o.size) {
            return 1;
        } else if (this.size == o.size) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "" + size;
    }
}
