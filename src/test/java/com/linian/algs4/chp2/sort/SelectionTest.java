package com.linian.algs4.chp2.sort;

import org.junit.Test;

import static com.linian.algs4.chp2.sort.Example.*;

public class SelectionTest {
    @Test
    public void test() {
        String[] strings = {"world", "says", "hello", "to", "all"};

        Selection.sort(strings);

        show(strings);
    }
}
