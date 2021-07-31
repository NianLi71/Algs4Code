package com.linian.algs4.chp2.sort;

import static com.linian.algs4.chp2.sort.Example.exch;
import static com.linian.algs4.chp2.sort.Example.less;


public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
