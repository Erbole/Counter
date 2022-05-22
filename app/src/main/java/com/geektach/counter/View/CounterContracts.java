package com.geektach.counter.View;

public class CounterContracts {

    public interface CounterView {
        void updateText(int count);

        void toast(int toast);

        void background(int background);
    }

    public interface CounterPresenter {
        void increment();

        void attachCounterView(CounterView view);

        void decrement();
    }
}
