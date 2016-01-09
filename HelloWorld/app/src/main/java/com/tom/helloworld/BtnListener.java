package com.tom.helloworld;

import android.view.View;
import android.widget.TextView;

/**
 * Created by tom on 16/1/7.
 */
public class BtnListener implements View.OnClickListener{
    private TextView tv;
    public BtnListener(TextView tv){
        this.tv = tv;
    }

    @Override
    public void onClick(View v) {
        tv.setText("点击了button1");
    }
}