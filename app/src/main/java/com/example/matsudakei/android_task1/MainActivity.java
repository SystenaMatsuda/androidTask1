package com.example.matsudakei.android_task1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean flag;
    String message = "HELLO!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final Button button2 = findViewById(R.id.button2);
        final Button button3 = findViewById(R.id.button3);
        flag = true;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ダイアログクラスをインスタンス化
                CustomDialogFragment dialog = new CustomDialogFragment();
                // 表示  getFragmentManager()は固定、sampleは識別タグ
                dialog.show(getFragmentManager(), "sample");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag) { //flagがtrueならボタンの色を変更
                    button.setBackgroundColor(Color.rgb(0, 0, 200));
                    button.setTextColor(Color.rgb(200, 200, 200));
                    button2.setBackgroundColor(Color.rgb(0, 0, 200));
                    button2.setTextColor(Color.rgb(200, 200, 200));
                    button3.setBackgroundColor(Color.rgb(0, 0, 200));
                    button3.setTextColor(Color.rgb(200, 200, 200));
                    flag = false;
                } else { //flagがfalseならボタンの色をリセット
                    button.setBackgroundResource(android.R.drawable.btn_default);
                    button.setTextColor(Color.rgb(0, 0, 0));
                    button2.setBackgroundResource(android.R.drawable.btn_default);
                    button2.setTextColor(Color.rgb(0, 0, 0));
                    button3.setBackgroundResource(android.R.drawable.btn_default);
                    button3.setTextColor(Color.rgb(0, 0, 0));
                    flag = true;
                }
            }
        });
    }
}

