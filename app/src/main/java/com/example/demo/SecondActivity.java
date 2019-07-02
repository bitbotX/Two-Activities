package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private EditText eSec=null;
    private TextView tvSec=null;
    public static String KEY_SA="pass_from_second";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        eSec=(EditText)findViewById(R.id.enter_second);
        tvSec=(TextView)findViewById(R.id.tv_second);
        tvSec.setText(getIntent().getStringExtra(MainActivity.KEY_MA));
    }

    public void loadFirstActivity(View view) {
        Intent toFirstActivity=new Intent(this,MainActivity.class);
        toFirstActivity.putExtra(KEY_SA,eSec.getText().toString());
        setResult(RESULT_OK,toFirstActivity);
        finish();
    }
}
