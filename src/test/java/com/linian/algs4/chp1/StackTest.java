package com.linian.algs4.chp1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class StackTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private Stack<Integer> stack;

    @Before
    public void setup() {
        stack = new Stack<>();
    }

    @Test
    public void isEmptyTest() {
        assertTrue(stack.isEmpty());
        assertFalse(!stack.isEmpty());
    }

    @Test
    public void sizeTest() {
        assertEquals(stack.size(), 0);

        stack.push(1);
        stack.push(2);

        assertEquals(stack.size(), 2);
        assertFalse(stack.isEmpty());

        assertEquals(stack.pop().intValue(), 2);
        assertEquals(stack.pop().intValue(), 1);
    }

    @Test
    public void popFromEmptyStackTest() {
        expectedException.expect(UnsupportedOperationException.class);
        expectedException.expectMessage("Try to pop from an empty Stack.");

        stack.pop();
    }

    @Test
    public void iterateStackTest() {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int n: intList) {
            stack.push(n);
        }

        int i = 0;
        for(int n: stack) {
            System.out.println(n);
            Assert.assertEquals(n, intList.get(intList.size() - i - 1).intValue());
            i++;
        }

        Assert.assertEquals(i, intList.size());
    }
}
