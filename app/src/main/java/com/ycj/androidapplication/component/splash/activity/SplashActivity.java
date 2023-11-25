package com.ycj.androidapplication.component.splash.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.ycj.androidapplication.R;
import com.ycj.androidapplication.util.SuperDateUtil;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //设置沉浸式状态栏
        QMUIStatusBarHelper.translucent(this);

        //设置状态栏文字颜色
        QMUIStatusBarHelper.setStatusBarLightMode(this);

        //设置本部年份
        int year = SuperDateUtil.currentYear();

        TextView copyrightView = findViewById(R.id.copyright);
        copyrightView.setText(getResources().getString(R.string.copyright, year));
    }
}