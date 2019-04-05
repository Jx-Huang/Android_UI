package com.example.administrator.android_ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button to_SimpleAdapter_button = findViewById(R.id.SimpleAdapter);  //跳转到SimpleAdapter的按钮
        Button to_AlertDialog_button = findViewById(R.id.AlertDialog);     //跳转到AlertDialog的按钮
        Button to_XMLMenu_button = findViewById(R.id.XMLMenu);       //跳转到XMLMenu的按钮
        Button to_ActionMode_button = findViewById(R.id.ActionMode);       //跳转到ActionMode的按钮

        to_SimpleAdapter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //实现跳转功能
                Intent intent = new Intent(MainActivity.this,
                        SimpleAdapterActivity.class);
                startActivity(intent);
            }
        });
        to_AlertDialog_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //实现跳转功能
                Intent intent = new Intent(MainActivity.this,
                        AlertDialogActivity.class);
                startActivity(intent);
            }
        });
        to_XMLMenu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //实现跳转功能
                Intent intent = new Intent(MainActivity.this,
                        XMLMenuActivity.class);
                startActivity(intent);
            }
        });
        to_ActionMode_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {       //实现跳转功能
                Intent intent = new Intent(MainActivity.this,
                        ActionModeActivity.class);
                startActivity(intent);
            }
        });
    }
}
