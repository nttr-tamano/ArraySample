package com.example.nttr.arraysample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final int GU = 0;
    final int CHOKI = 1;
    final int PA =2;

//    private int janken[] = new int[3];
    private ArrayList<Integer> jankenArr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 要素追加
        jankenArr.add(0);   // GU
        jankenArr.add(0);   // CHOKI
        jankenArr.add(0);   // PA

        ImageButton btnGu = (ImageButton) findViewById(R.id.gu);
        btnGu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                janken[GU]++;
                jankenArr.set(GU,jankenArr.get(GU)+1);
                kaisu();
            }
        });

        ImageButton btnChoki = (ImageButton) findViewById(R.id.choki);
        btnChoki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                janken[CHOKI]++;
                jankenArr.set(CHOKI,jankenArr.get(CHOKI)+1);
                kaisu();
            }
        });

        ImageButton btnPa = (ImageButton) findViewById(R.id.pa);
        btnPa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                janken[PA]++;
                jankenArr.set(PA,jankenArr.get(PA)+1);
                kaisu();
            }
        });
    }

    void kaisu() {
        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(janken[GU] +","+ janken[CHOKI] +","+ janken[PA]);
        textView.setText(jankenArr.get(GU) +","+ jankenArr.get(CHOKI) +","+ jankenArr.get(PA));

        int sum = 0;

        // foreach サンプル
//        for (int num:
//             janken) {
//            sum += num;
//        }

        for (Integer num:
             jankenArr) {
            sum += num;
        }

        TextView goukei = (TextView) findViewById(R.id.goukei);
        goukei.setText("合計:" + sum);

    }

}
