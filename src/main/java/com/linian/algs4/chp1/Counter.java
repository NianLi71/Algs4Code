package com.linian.algs4.chp1;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import static java.lang.System.out;

@RequiredArgsConstructor
public class Counter {
    @NonNull
    private final String id;

    private int count = 0;

    public void increment() {
        this.count++;
    }

    public int tally() {
        return this.count;
    }

    @Override
    public String toString() {
        return String.format("Counter counts %d times.", this.count);
    }

    public static void main(String[] args) {
        final Counter counter1 = new Counter("c1");
        final Counter counter2 = new Counter("c2");

        counter1.increment();
        counter1.increment();

        out.println(counter1);

        out.println(counter2);
    }
}
