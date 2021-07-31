package com.linian.algs4.chp1;

import org.junit.Test;
import org.junit.Assert;

public class QueueTest {
    @Test
    public void queueTest() {
        final Queue<String> queue = new Queue<>();

        Assert.assertEquals(queue.isEmpty(), true);

        queue.enqueue("Java");
        queue.enqueue("Javascript");
        queue.enqueue("Python");

        Assert.assertEquals(queue.size(), 3);
        Assert.assertEquals(queue.isEmpty(), false);

        Assert.assertEquals(queue.dequeue(), "Java");
        Assert.assertEquals(queue.dequeue(), "Javascript");
        Assert.assertEquals(queue.dequeue(), "Python");

        Assert.assertEquals(queue.size(), 0);
        Assert.assertEquals(queue.isEmpty(), true);
    }
}
