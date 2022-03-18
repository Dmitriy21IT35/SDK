package com.example.sdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickBtnAddStudents(View view) {
        counter++;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
}