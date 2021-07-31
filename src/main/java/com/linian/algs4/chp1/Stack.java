package com.linian.algs4.chp1;

import java.util.Iterator;
import java.util.Objects;

public class Stack<T> implements Iterable<T> {
    private Node<T> first;
    private int N;

    public void push(final T item) {
        final Node<T> node = new Node<>();
        node.setValue(item);
        node.setNext(first);
        first = node;
        N++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new UnsupportedOperationException("Try to pop from an empty Stack.");
        }

        final Node<T> top = first;
        first = first.getNext();
        N--;

        return top.getValue();
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    @Override
    public Iterator<T> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<T> {
        private Node<T> current = first;

        @Override
        public T next() {
            T item = current.getValue();
            current = current.getNext();
            return item;
        }

        @Override
        public boolean hasNext() {
            return Objects.nonNull(current);
        }
    }
}
