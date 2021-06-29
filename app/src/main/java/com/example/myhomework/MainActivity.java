package com.example.myhomework;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
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

//        ImageView imageView = findViewById(R.id.imageView1);
//        imageView.setBackground(AppCompatResources.getDrawable(this, R.drawable.example));
//        textView = findViewById(R.id.textView2);
//        initView();
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

//
//    private void initView() {
//        LinearLayout layout = findViewById(R.id.LinearLayout);
//        layout.setBackgroundColor(ContextCompat.getColor(this, R.color.darkThemeColorTV));
//        for (int i = 0; i < layout.getChildCount(); i++) {
//            if (layout.getChildAt(i) instanceof AppCompatButton) {
//                layout.getChildAt(i).setOnClickListener(this::onClick);
//            }
//        }


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

}

//    private final static String KeyCounters = "Counters";  - по методичке
//
//    private Counters counters;
//
//    private TextView textCounter1;  // пользовательский элемент 1-го счетчика
//    private TextView textCounter2;  // пользовательский элемент 2-го счетчика
//    private TextView textCounter3;  // пользовательский элемент 3-го счетчика
//    private TextView textCounter4;  // пользовательский элемент 4-го счетчика
//    private TextView textCounter5;  // пользовательский элемент 1-го счетчика
//    private TextView textCounter6;  // пользовательский элемент 2-го счетчика
//    private TextView textCounter7;  // пользовательский элемент 3-го счетчика
//    private TextView textCounter8;  // пользовательский элемент 4-го счетчика
//    private TextView textCounter9;  // пользовательский элемент 4-го счетчика
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        counters = new Counters();
//        initView();
//    }
//
//    private void initView() {
//        // Получить пользовательские элементы по идентификатору
//        textCounter1 = findViewById(R.id.textView1);
//        textCounter2 = findViewById(R.id.textView2);
//        textCounter3 = findViewById(R.id.textView3);
//        textCounter4 = findViewById(R.id.textView4);
//        textCounter5 = findViewById(R.id.textView5);
//        textCounter6 = findViewById(R.id.textView6);
//        textCounter7 = findViewById(R.id.textView7);
//        textCounter8 = findViewById(R.id.textView8);
//        textCounter9 = findViewById(R.id.textView9);
//        initButton2ClickListener();
//        initButton3ClickListener();
//        initButton4ClickListener();
//        initButton5ClickListener();
//        initButton6ClickListener();
//        initButton7ClickListener();
//        initButton8ClickListener();
//        initButton9ClickListener();
//    }
//
//    private void initButton6ClickListener() {
//        Button button5 = findViewById(R.id.button_6);
//        button5.setOnClickListener(button5ClickListener);
//        private void initButton5ClickListener(){
//            Button button4 = findViewById(R.id.button_5);
//            button4.setOnClickListener(button4ClickListener);
//        }
//
//        private void initButton4ClickListener () {
//            Button button3 = findViewById(R.id.button_4);
//            button3.setOnClickListener(button4ClickListener);
//        }
//
//        private void initButton3ClickListener () {
//            Button button2 = findViewById(R.id.button_3);
//            button2.setOnClickListener(this);
//
//            private void initButton2ClickListener () {
//                Button button_1 = findViewById(R.id.button_2);
//                button2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        counters.incrementCounter1();
//                        setTextCounter(textCounter2, counters.getCounter1());
//                    }
//                });
//            }
//
//            // Обработка кнопки через атрибут onClick в макете
//    public void button1_onClick(View view) {
//        counters.incrementCounter2();
//        setTextCounter(textCounter1, counters.getCounter2());
////
//////        }
////
//////    @Override
//////    public void onClick(View v) {
//////        // Если на экране один пользовательский элемент, то такая обработка имеет смысл,
//////        // но если на экране несколько элементов, здесь придется создавать "лишние" условия.
//////        counters.incrementCounter3();
//////        setTextCounter(textCounter3, counters.getCounter3());
//////    }
////
//           public  View.OnClickListener button4ClickListener = new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    counters.incrementCounter4();
//                    setTextCounter(textCounter4, counters.getCounter4());
//                }
//
//                //    };
////
//////    // Установить текст на TextView
//                private void setTextCounter(TextView textCounter, int counter) {
//                    textCounter.setText(String.format(Locale.getDefault(), "%d", counter));
//                }
//            };
//        }
//    }
//}
//////        // Сохранение данных
//////        @Override
//////        public void onSaveInstanceState(@NonNull Bundle instanceState) {
//////            super.onSaveInstanceState(instanceState);
//////            instanceState.putParcelable(KeyCounters, counters);
//////        }
//////
//////        // Восстановление данных
//////        @Override
//////        protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
//////            super.onRestoreInstanceState(instanceState);
//////            counters = instanceState.getParcelable(KeyCounters);
//////            setTextCounters();
////        }
////
////        // Отображение данных на экране
//        private void setTextCounters(){
//            setTextCounter(textCounter1, counters.getCounter1());
//            setTextCounter(textCounter2, counters.getCounter2());
//            setTextCounter(textCounter3, counters.getCounter3());
//            setTextCounter(textCounter4, counters.getCounter4());
//            setTextCounter(textCounter5, counters.getCounter5());
//            setTextCounter(textCounter6, counters.getCounter6());
//            setTextCounter(textCounter7, counters.getCounter7());
//            setTextCounter(textCounter8, counters.getCounter8());
//            setTextCounter(textCounter9, counters.getCounter9());
////        }
////    }
//
//                                          по методичке
















//    private int counter1 = 0;                Сам
//    private TextView textCounter1;
//    private Button button_1;
//    private int counter2 = 0;
//    private TextView textCounter2;
//    private Button button_2;
//    private Counters counters;
//
//
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//            initView();
//        }
//
//    private void initView() {
//        // Получить пользовательские элементы по идентификатору
//        textCounter1 = findViewById(R.id.textView1);
//        initButton2ClickListener();
//    }
//
//    private void initButton2ClickListener() {
//        Button button2 = findViewById(R.id.button_2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                counter2++;
//                setTextCounter(textCounter1,counter1);
//                public void button1_onClick(View view) {
//                    counter1++;
//                    setTextCounter(textCounter1, counter1);
//
//                }
//                private void setTextCounter( TextView  textCounter, int counter;){
//                    textCounter.setText(String.format(Locale.getDefault(), "%d", counter));
//                }
//            }
//
//        });
//    }
//
//};
//}//                                                               МОЁ



                                                                    //МОЁ2//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_layo);
//        counters = new Counters();
//        textCounter1 = findViewById(R.id.textView1);
//        button1 = findViewById(R.id.button_1);



//    @Override
//    public void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putSerializable(KEY, counters);
//    }
//
//    @Override
//    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        counters = (Counters) savedInstanceState.getSerializable(KEY);
//        restoreText();
//    }
//
//    private void restoreText() {
//        textCounter1.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_1()));
//    }

    //    public void button1_onClick(TextView view) {
//        counters.increaseCounter1();
//        textCounter1.setText(String.format(Locale.getDefault(), "%d", counters.getCounter_1()));
//    }

//super.onSaveInstanceState(outState, outPersistenceState);       сам