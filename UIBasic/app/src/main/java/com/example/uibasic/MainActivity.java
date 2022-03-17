package com.example.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(new ClickListener1());
        Button btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(new ClickListener2());
        Button btn3=findViewById(R.id.button3);
        btn3.setOnClickListener(new ClickListener3());
        Button btn4=findViewById(R.id.button4);
        btn4.setOnClickListener(new ClickListener4());

    }
    class ClickListener1 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Toast.makeText(getApplicationContext(),R.string.msg1
                    ,Toast.LENGTH_SHORT).show();

        }
    }
    class ClickListener2 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Toast.makeText(getApplicationContext(),R.string.msg2
                    ,Toast.LENGTH_SHORT).show();

        }
    }
    class ClickListener3 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Toast.makeText(getApplicationContext(),R.string.msg3
                    ,Toast.LENGTH_SHORT).show();

        }
    }
    class ClickListener4 implements View.OnClickListener{
        boolean Change=true;
        @Override
        public void onClick(View view){
            Button btn=(Button)findViewById(R.id.button1);
            if(Change)
                btn.setText(R.string.msg4_1);
            else
                btn.setText(R.string.msg4_2);
            Change=!Change;

        }
    }
}