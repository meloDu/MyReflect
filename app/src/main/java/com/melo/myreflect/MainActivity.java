package com.melo.myreflect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TestBean testBean = new TestBean("恭喜发财", 2017, 1);
        Object[] paramss = {testBean};
        LoadMethodEx.getInstance().Load("com.melo.myreflect.MyTest", "getData", paramss);
    }
}
