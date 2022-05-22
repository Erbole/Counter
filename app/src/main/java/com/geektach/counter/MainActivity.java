package com.geektach.counter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Toast;

import com.geektach.counter.Presenter.PresenterCounter;
import com.geektach.counter.View.CounterContracts;
import com.geektach.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    PresenterCounter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getCounter();
        presenter.attachCounterView(this);
        initClickers();
    }

    private void initClickers() {
        binding.btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
            }
        });
        binding.btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
            }
        });
    }

    @Override
    public void updateText(int count) {
        binding.tvCounter.setText(String.valueOf(count));
    }

    @Override
    public void toast(int toast) {
        Toast.makeText(this, "Поздравляем", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void background(int background) {
        binding.tvCounter.setTextColor(Color.GREEN);
    }
}