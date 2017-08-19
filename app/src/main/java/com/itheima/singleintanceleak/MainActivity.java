package com.itheima.singleintanceleak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 使用分支管理检测内存泄漏
 *
 * 1.发布到应用市场的版本：不带leak -> master 主分支
 * 2.发布之前检测内存泄漏：集成leak -> 独立分支处理
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpUtls.getInstance(this);

        //123
    }
}
