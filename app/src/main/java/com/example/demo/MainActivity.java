package com.example.demo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText eMain=null;
    private TextView tvMain=null;
    public static String KEY_MA="pass_from_main";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eMain=(EditText)findViewById(R.id.enter_main);
        tvMain=(TextView)findViewById(R.id.tv_main);
    }
    public void loadSecondActivity(View view) {
        Intent toSecondActivity=new Intent(this,SecondActivity.class);
        toSecondActivity.putExtra(KEY_MA,eMain.getText().toString());
        startActivityForResult(toSecondActivity,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                tvMain.setText(data.getStringExtra(SecondActivity.KEY_SA));
            }
        }
    }
}
