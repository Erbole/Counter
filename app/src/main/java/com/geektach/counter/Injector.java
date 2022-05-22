package com.geektach.counter;

import com.geektach.counter.Presenter.PresenterCounter;

public class Injector {

    public static PresenterCounter getCounter() {
        return new PresenterCounter();
    }
}
