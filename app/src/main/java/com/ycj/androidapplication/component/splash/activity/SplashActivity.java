package com.ycj.androidapplication.component.splash.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;
import com.ycj.androidapplication.R;
import com.ycj.androidapplication.activity.BaseActivity;
import com.ycj.androidapplication.util.SuperDarkUtil;
import com.ycj.androidapplication.util.SuperDateUtil;

public class SplashActivity extends BaseActivity {

    private TextView copyrightView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //设置沉浸式状态栏
        QMUIStatusBarHelper.translucent(this);

        //设置状态栏文字颜色
        if (SuperDarkUtil.isDark(this)) {
            //状态栏文字白色
            QMUIStatusBarHelper.setStatusBarDarkMode(this);
        } else {
            //状态栏黑色
            QMUIStatusBarHelper.setStatusBarLightMode(this);
        }
    }

    @Override
    protected void initView() {
        super.initView();
        //快捷生成实例变量：command+option+f  或者右键>refactor>Introduce Field...
        copyrightView = findViewById(R.id.copyright);
    }

    @Override
    protected void initDatum() {
        super.initDatum();
        //设置年份
        int year = SuperDateUtil.currentYear();
        copyrightView.setText(getResources().getString(R.string.copyright, year));
    }
}