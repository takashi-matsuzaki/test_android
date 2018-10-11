package com.example.takashimatsuzaki.androiduitestdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count;
    private TextView countLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.countLabel = (TextView)findViewById(R.id.countLabel);
    }

    public void increment(View view) {
        count++;
        this.countLabel.setText(String.valueOf(count));
    }

    public void decrement(View view) {
        count--;
        this.countLabel.setText(String.valueOf(count));
    }
}
