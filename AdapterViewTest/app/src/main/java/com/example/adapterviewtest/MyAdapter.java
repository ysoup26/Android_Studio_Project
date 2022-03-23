package com.example.adapterviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private int mResource; //items.xml을 바탕으로 만들어짐
    private ArrayList<MyItem> mItems = new ArrayList<MyItem>();

    public MyAdapter(Context context, int resource, ArrayList<MyItem> items) {
        mContext = context;
        mItems = items;
        mResource = resource;
    }

    // MyAdapter 클래스가 관리하는 항목의 총 개수를 반환
    @Override
    public int getCount() {
        return mItems.size(); //리스트가 가지고 있느느 갯수 반환
    }

    // MyAdapter 클래스가 관리하는 항목의 중에서 position 위치의 항목을 반환
    @Override
    public Object getItem(int position) {
        return mItems.get(position); //position 위치에 있는 아이템
    }

    // 항목 id를 항목의 위치로 간주함
    @Override
    public long getItemId(int position) {
        return position; //position 반환
    }
//위 세 부분은 거의 건드릴 필요 없음
    // position 위치의 항목에 해당되는 항목뷰를 반환하는 것이 목적임
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) { // 해당 항목 뷰가 이전에 생성된 적이 없는 경우
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // 항목 뷰를 정의한 xml 리소스(여기서는 mResource 값)으로부터 항목 뷰 객체를 메모리로 로드
            convertView = inflater.inflate(mResource, parent,false);
        }//뷰를 만들때 mResouce로 만드는 부분

        /*items.xml의 id를 하나씩 가져와 값을 넣어주는 부분*/
        // convertView 변수로 참조되는 항목 뷰 객체내에 포함된 이미지뷰 객체를 id를 통해 얻어옴
        TextView className = (TextView) convertView.findViewById(R.id.iconItem);
        // 어댑터가 관리하는 항목 데이터 중에서 position 위치의 항목의 이미지 리소스를 이미지뷰 객체에 설정
        className.setText(mItems.get(position).mClassName);

        // convertView 변수로 참조되는 항목 뷰 객체내에 포함된 텍스트뷰 객체를 id를 통해 얻어옴
        TextView classTime = (TextView) convertView.findViewById(R.id.textItem1);
        // 어댑터가 관리하는 항목 데이터 중에서 position 위치의 항목의 문자열을 설정 텍스트뷰 객체에 설정
        classTime.setText(mItems.get(position).mClassTime);

        // Set Text 02
        TextView classRoom = (TextView) convertView.findViewById(R.id.textItem2);
        classRoom.setText(mItems.get(position).mClassRoom);

        return convertView;

    }
}


