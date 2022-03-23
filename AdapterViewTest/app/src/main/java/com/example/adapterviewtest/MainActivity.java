package com.example.adapterviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터 원본
        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem("안드로이드 프로그래밍", "수3:00~6:00","상상관304"));
        data.add(new MyItem("사물인터넷 개론 A", "월12:00~1:30,목1:30~3:00","상상관304"));
        data.add(new MyItem("사물인터넷 개론 N", "월5:00~6:25,목7:25~8:45","상상관304"));
        //데이터 추가하고 싶으면 여기만 추가하면 됨!

        //어댑터 생성
        adapter =new MyAdapter(this,R.layout.items,data);

        //어댑터 연결
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        //어댑터 이벤트처리
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View vClicked, int position, long id) {
                String name = ((MyItem) adapter.getItem(position)).mClassName; //과목이름을 출력해줌
                Toast.makeText(MainActivity.this, name + " selected",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}