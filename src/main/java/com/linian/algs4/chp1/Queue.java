package com.linian.algs4.chp1;

public class Queue<T> {
    private Node first;
    private Node last;
    private int N;

    private class Node {
        T item;
        Node next;
    }

    public void enqueue(final T item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public T dequeue() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }
}
