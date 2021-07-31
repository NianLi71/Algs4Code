package com.linian.algs4.chp1;

public class Stopwatch {
    private final long start;

    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    /**
     * @return the elapsed time since start in seconds.
     */
    public double elapsedTime() {
        final long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public static void main(String[] args) {

        Stopwatch timer = new Stopwatch();

        timeCostRun();

        double time = timer.elapsedTime();

        System.out.println(String.format("Take %.2f seconds to run.", time));
    }

    private static void timeCostRun() {
        int sum = 0;
        for(int i = 0; i < 30000; i++) {
            for(int j = 1; j< 10000; j++) {
                sum += i/(double)j;
            }
        }
        System.out.println(sum);
    }
}
