package com.example.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //02.버튼 클릭 이벤트 처리-이벤트 객체
        Button btn1=findViewById(R.id.button1);
        btn1.setOnClickListener(new ClickListener1());
        Button btn2=findViewById(R.id.button2);
        btn2.setOnClickListener(new ClickListener2());
        Button btn3=findViewById(R.id.button3);
        btn3.setOnClickListener(new ClickListener3());

        //03.버튼의 텍스트 변경
        Button btn4=findViewById(R.id.button4);
        btn4.setOnClickListener(new ClickListener4());

        //04.레이아웃의 gravity 변경
        Button btn5=findViewById(R.id.button5);
        btn5.setOnClickListener(new ClickListener5());

        //05.레이아웃의 padding 변경
        Button btn6=findViewById(R.id.button6);
        btn6.setOnClickListener(new ClickListener6());

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
    class ClickListener5 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            LinearLayout ll=findViewById(R.id.linear2);
            ll.setGravity(Gravity.CENTER_HORIZONTAL);

        }
    }
    class ClickListener6 implements View.OnClickListener{
        @Override
        public void onClick(View view){
            LinearLayout ll=findViewById(R.id.linear2);
            ll.setPadding(20,20,20,20);

        }
    }
}