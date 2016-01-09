package com.tom.helloworld;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Button;

import java.text.SimpleDateFormat;

/**
 * Created by tom on 16/1/7.
 */
public class MyButton extends Button{
    private static String TAG = "呵呵";
    public MyButton(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        Log.i(TAG, "自定义按钮的onKeyDown方法被调用");
        return false;
    }
}
