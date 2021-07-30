package com.linian.algs4.chp1.iterabledemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class IterableDemo1 implements Iterable<String> {
    public static void main(String[] args) {
        final Iterable<String> iterable = new IterableDemo1();

        // traverse iterable
        out.println("Iterable demo starts:");
        for (String s: iterable) {
            out.println(s);
        }

        // traverse with iterator
        out.println("Iterator demo starts:");
        final Iterator<String> iter = iterable.iterator();
        while (iter.hasNext()) {
            out.println(iter.next());
        }

        // interface Collection<E> extends Iterable<E>
        final Collection<String> collection;
    }

    @Override
    public Iterator<String> iterator() {
        return new IteratorDemo1();
    }
}

class IteratorDemo1 implements Iterator<String > {
    private final List<String> strings = new ArrayList<>();

    private int index = 0;

    public IteratorDemo1() {
        strings.add("Java");
        strings.add("Python");
        strings.add("Javascript");
    }

    @Override
    public String next() {
        return strings.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < strings.size();
    }
}
