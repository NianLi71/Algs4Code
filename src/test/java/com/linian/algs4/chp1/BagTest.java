package com.linian.algs4.chp1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BagTest {

    private Bag<String> bag;

    @Before
    public void setup() {
        bag = new Bag<>();
    }

    @Test
    public void zeroSizeTest() {
        Assert.assertEquals(bag.size(), 0);
    }

    @Test
    public void functionalTest() {
        bag.add("hello");
        bag.add("world");
        bag.add("Java");

        Assert.assertEquals(bag.size(), 3);

        int i = 0;
        List<String> expectStrings = new ArrayList<>();
        expectStrings.add("Java");
        expectStrings.add("world");
        expectStrings.add("hello");
        for(String s: bag) {
            Assert.assertEquals(s, expectStrings.get(i++));
        }

        // finish forEach loop assert
        Assert.assertEquals(i, expectStrings.size());
    }

    @Test
    public void isEmptyTest() {
        Assert.assertTrue(bag.isEmpty());
    }
}
