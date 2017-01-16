package com.melo.myreflect;

import android.util.Log;

/**
 * Created by melo on 2017/1/16.
 */
public class MyTest {


    public void getData(TestBean testBean){
        Log.i("tag","str:"+testBean.str+",year:"+testBean.year+",month:"+testBean.month);
    }
}
