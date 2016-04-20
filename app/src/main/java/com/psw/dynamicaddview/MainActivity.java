package com.psw.dynamicaddview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout lnDynamic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpDynamicView();
    }

    private void setUpDynamicView() {
        lnDynamic = (LinearLayout)findViewById(R.id.lnDynamic);

        for(int i =0; i < 100; i++){
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            LinearLayout dynamic_buy_item = (LinearLayout) inflater.inflate(R.layout.dynamic_layer, null);

            TextView txtTitle  = (TextView)dynamic_buy_item.findViewById(R.id.txtTitle);
            txtTitle.setText(i + "번째 아이템.");

            lnDynamic.addView(dynamic_buy_item);

        }
    }

    private void doThinkAboutWhy_using_listview(){
        // 1. 몇 번째 항목을 클릭했을 때 뭐를 하라를 어떻게 구현하지?
        // 2. 데이터를 추가/삭제 했을 때는 어떻게 해야 하지?
        // 3. 저렇게 사용하면 메모리 문제는 없는가?
    }
}
