package com.example.medic.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medic.R;

public class onBoard1_2_3 extends AppCompatActivity {
    private HorizontalScrollView myScroll;
    private TextView analizing, opisanie, next, complete;
    private ImageView point1, point2, point3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board1_2_3);
        myScroll = findViewById(R.id.myScroll);
        init();
        analizing = findViewById(R.id.analizing);
        opisanie = findViewById(R.id.opisanie);
        complete = findViewById(R.id.complete);
        next = findViewById(R.id.next);
        point1 = findViewById(R.id.point1);
        point2 = findViewById(R.id.point2);
        point3 = findViewById(R.id.point3);
        point1.setVisibility(View.VISIBLE);
        point2.setVisibility(View.GONE);
        point3.setVisibility(View.GONE);
        complete.setVisibility(View.GONE);

        myScroll.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {
                int scrollX = myScroll.getScrollX();
                if (scrollX >=0){
                    complete.setVisibility(View.GONE);
                    next.setVisibility(View.VISIBLE);
                    point1.setVisibility(View.VISIBLE);
                    if (scrollX<=800){
                        next.setVisibility(View.VISIBLE);
                        complete.setVisibility(View.GONE);
                        analizing.setText("Анализы");
                        opisanie.setText("Экспресс сбор и получение проб");
                        point2.setVisibility(View.GONE);
                        point3.setVisibility(View.GONE);
                    }
                    if (scrollX>=800){
                        next.setVisibility(View.VISIBLE);
                        point1.setVisibility(View.GONE);
                        analizing.setText("Уведомления");
                        opisanie.setText("Вы быстро узнаете о результатах");
                        point1.setVisibility(View.VISIBLE);
                        point2.setVisibility(View.VISIBLE);
                        if (scrollX<=1100){
                            complete.setVisibility(View.GONE);
                            point1.setVisibility(View.GONE);
                            point3.setVisibility(View.GONE);
                        }
                        if (scrollX>=1100){
                            analizing.setText("Мониторинг");
                            opisanie.setText("Наши врачи всегда наблюдают за вашими показателями здоровья");
                            complete.setVisibility(View.VISIBLE);
                            next.setVisibility(View.GONE);
                            point1.setVisibility(View.GONE);
                            point2.setVisibility(View.GONE);
                            point3.setVisibility(View.VISIBLE);
                        }
                    }
                }
            }
        });
    }
    public static void init(){
    }
    public void next(View view) {
        //next session
        Intent intent = new Intent(this, register_email.class);
        startActivity(intent);
    }
    public void complete(View view) {
        //next session
        Intent intent = new Intent(this, register_email.class);
        startActivity(intent);
    }
}
