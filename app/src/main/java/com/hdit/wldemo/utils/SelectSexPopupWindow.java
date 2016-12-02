package com.hdit.wldemo.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.hdit.wldemo.R;
import com.hdit.wldemo.widget.WheelView;

import java.util.Arrays;

/**
 * Created by joker on 2016/12/1.
 */

public class SelectSexPopupWindow extends PopupWindow {
    private String[] PLANETS=new String[]{"男","女"};

    public SelectSexPopupWindow(Activity context, WheelView.OnWheelViewListener listener){
        super(context);
        View outerView = LayoutInflater.from(context).inflate(R.layout.wheel_view, null);
        WheelView wv = (WheelView) outerView.findViewById(R.id.wheel_view_wv);
        wv.setOffset(2);
        wv.setItems(Arrays.asList(PLANETS));
        wv.setSeletion(0);
        wv.setOnWheelViewListener(listener);
        new AlertDialog.Builder(context)
                .setTitle("请选择性别")
                .setView(outerView)
                .setPositiveButton("OK", null)
                .create().show();

        this.setContentView(outerView);
        this.setWidth(ViewGroup.LayoutParams.FILL_PARENT);
        this.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        this.setFocusable(true);
        this.setAnimationStyle(R.style.AnimBottom);
        ColorDrawable dw = new ColorDrawable(0xb0000000);
        this.setBackgroundDrawable(dw);
    }
}
