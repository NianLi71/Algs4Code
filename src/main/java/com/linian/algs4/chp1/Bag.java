package com.linian.algs4.chp1;

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {
    private Node last;
    private int N;

    private class Node {
        T item;
        Node next;
    }

    public void add(T item) {
        Node node = new Node();
        node.item = item;

        if (!isEmpty()) {
            last.next = node;
        }

        last = node;
        N++;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {
        private Node current = last;

        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }
    }
}
