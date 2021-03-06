package com.cheng.mvpframestudy;

import android.os.Bundle;
import android.view.View;

import com.cheng.base.BaseActivity;
import com.cheng.mvpframestudy.diymvp.ui.activity.UiLogin;
import com.cheng.mvpframestudy.rxjavamvp.UiRxJavaMVP;
import com.cheng.mvpframestudy.themvp.UiTheMVPDemo;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toDIYMVPDemo(View v) {
        overlay(UiLogin.class);
    }

    public void toTheMVPDemo(View v) {
        overlay(UiTheMVPDemo.class);
    }

    public void toRxJavaMVP(View v) {
        overlay(UiRxJavaMVP.class);
    }
}
