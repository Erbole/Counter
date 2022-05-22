package com.geektach.counter.Model;

public class CounterModel {

    public int toast = 10;
    public int background = 15;
    public int count = 0;

    public void increment() {
        ++count;
    }

    public void decrement() {
        --count;
    }

    public int getCounter() {
        return count;
    }

    public int getToast() {
        return toast;
    }

    public int getBackground() {
        return background;
    }
}
