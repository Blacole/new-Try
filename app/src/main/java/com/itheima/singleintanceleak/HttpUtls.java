package com.itheima.singleintanceleak;

import android.content.Context;

/**
 * Created by youliang.ji on 2017/5/12.
 * 123
 */

public class HttpUtls {
    private static HttpUtls instance;
    private static Context mContext;
    private HttpUtls(){}

    public static HttpUtls getInstance(Context context){
        //单例
        if(instance == null){
            synchronized (HttpUtls.class){
                if(instance == null){
                    instance = new HttpUtls();
                    mContext = context;
                }
            }
        }
        return instance;
    }

}
