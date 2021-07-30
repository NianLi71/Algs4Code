package com.linian.algs4.quickdemo;

import java.util.Arrays;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
    public static void main(String[] args) {
        Integer[] array = {5,6,2,1,4,3};
        printArrary(array);
        Arrays.sort(array);
        printArrary(array);
        int key = 5;

        int location = binarySearch(key, array);
        StdOut.println(key);
        StdOut.println(location);
    }

    public static int binarySearch(int key, Integer[] array) {
        int l = 0, h = array.length;
        while (l <= h) {
            int m = (l+h)/2;
            if (array[m] == key) {
                return m;
            } else if (array[m] > key) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    private static <T> void printArrary(T[] array) {
        for (int i = 0; i < array.length; i++) {
            StdOut.print(array[i] + " ");
        }
        StdOut.println();
    }
}