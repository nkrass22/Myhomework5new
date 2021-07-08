package com.example.myhomework;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import static android.provider.Contacts.SettingsColumns.KEY;

public class MainActivity extends AppCompatActivity {
    private Counters counters;
    private TextView textView;
    private final String KEY = "key_counters";

    public static void showToast(Context context, String toast) {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        counters = new Counters();
        setContentView(R.layout.activity_main);
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/19659.ttf");
        TextView textView = findViewById(R.id.textViewback);
        textView.setTypeface(tf);

    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
            case R.id.button_2:
            case R.id.button_3:
            case R.id.button_4:
            case R.id.button_5:
            case R.id.button_6:
            case R.id.button_7:
            case R.id.button_8:
            case R.id.button_9:
            case R.id.button_0:
                textView.setText(counters.addNumeral(v));
                break;
            case R.id.button_pls:
            case R.id.button_del:
            case R.id.multiply:
            case R.id.button_min:
                textView.setText(counters.addSign(v));
                break;
            case R.id.button_mnj:
                counters.calcAnswer(v);
                break;
        }
    }



    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(KEY, counters);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counters = (Counters) savedInstanceState.getSerializable(KEY);
        restoreView();
    }

    private void restoreView() {
        textView.setText(counters.getTv());
    }

    //private void button1
//        button.setOnClickListener(this);
    private void initButton1ClickListener() {
            Button button_1 = findViewById(R.id.button_1);
            Button button_2 = findViewById(R.id.button_2);
            Button button_3 = findViewById(R.id.button_3);
            Button button_4 = findViewById(R.id.button_4);
            Button button_5 = findViewById(R.id.button_5);
            Button button_6 = findViewById(R.id.button_6);
            Button button_7 = findViewById(R.id.button_7);
            Button button_8 = findViewById(R.id.button_8);
            Button button_9 = findViewById(R.id.button_9); }
        }
