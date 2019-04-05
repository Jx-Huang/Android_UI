package com.example.administrator.android_ui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class XMLMenuActivity extends AppCompatActivity {

    private EditText test_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlmenu);
        test_text = (EditText)findViewById(R.id.test_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.size_10:
                test_text.setTextSize(10);
                break;
            case R.id.size_16:
                test_text.setTextSize(16);
                break;
            case R.id.size_20:
                test_text.setTextSize(20);
                break;
            case R.id.normal_menu:
                Toast.makeText(this,"普通菜单项",Toast.LENGTH_LONG).show();
                break;
            case R.id.font_red:
                test_text.setTextColor(Color.RED);
                break;
            case R.id.font_black:
                test_text.setTextColor(Color.BLACK);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
