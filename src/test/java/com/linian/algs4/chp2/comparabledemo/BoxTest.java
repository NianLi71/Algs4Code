package com.linian.algs4.chp2.comparabledemo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BoxTest {
    @Test
    public void comparableTest() {
        Box redBox = new Box(10);
        Box blueBox = new Box(5);

        Assert.assertTrue(redBox.compareTo(blueBox) > 0);
        Assert.assertTrue(redBox.compareTo(redBox) == 0);
        Assert.assertTrue(blueBox.compareTo(redBox) < 0);
    }

    @Test
    public void boxSortingTest() {
        Box[] boxes = {
                new Box(5),
                new Box(3),
                new Box(7),
                new Box(1),
                new Box(9)
        };

        Arrays.sort(boxes);

        for (Box box: boxes) {
            System.out.println(box);
        }

        Assert.assertTrue(isSorted(boxes));
    }

    private boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    private boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
