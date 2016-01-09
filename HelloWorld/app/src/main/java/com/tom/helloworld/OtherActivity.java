package com.tom.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class OtherActivity extends Activity {
    public int[] img = new int[]{
            R.drawable.zmbz, R.drawable.zmsg, R.drawable.zmsp, R.drawable.zmyy, R.drawable.s_1,
            R.drawable.s_2, R.drawable.s_3, R.drawable.s_4, R.drawable.xlj
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        GridView myGridView = (GridView)findViewById(R.id.myGridView);
        BaseAdapter baseAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return img.length;
            }

            @Override
            public Object getItem(int position) {
                return img[position];
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView;
                if(convertView == null){
                    imageView = new ImageView(OtherActivity.this);
                    imageView.setAdjustViewBounds(true);
                    imageView.setMaxHeight(111);
                    imageView.setMaxWidth(111);
                    imageView.setPadding(5,5,5,5);
                }
                else
                    imageView = (ImageView)convertView;

                imageView.setImageResource(img[position]);
                return imageView;
            }
        };

        myGridView.setAdapter(baseAdapter);

        myGridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = getIntent();
                Bundle bundle = new Bundle();
                bundle.putInt("imgid", img[position]);
                intent.putExtras(bundle);
                setResult(0x123, intent);
                finish();
            }
        });

    }


}
