package com.geektach.counter.Presenter;

import com.geektach.counter.Model.CounterModel;
import com.geektach.counter.View.CounterContracts;

public class PresenterCounter implements CounterContracts.CounterPresenter {
    CounterModel model = new CounterModel();
    CounterContracts.CounterView counterView;

    @Override
    public void increment() {
        model.increment();
        counterView.updateText(model.getCounter());
        if (model.getCounter() == model.getToast()) {
            counterView.toast(model.getToast());
        }
        if (model.getCounter() == model.getBackground()) {
            counterView.background(model.getBackground());
        }
    }

    @Override
    public void decrement() {
        model.decrement();
        counterView.updateText(model.getCounter());
        if (model.getCounter() == model.getBackground()) {
            counterView.toast(model.getToast());
        }
        if (model.getCounter() == model.getBackground()) {
            counterView.background(model.getBackground());
        }
    }

    @Override
    public void attachCounterView(CounterContracts.CounterView view) {
        counterView = view;
    }
}
