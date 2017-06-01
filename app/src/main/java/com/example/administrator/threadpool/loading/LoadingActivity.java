package com.example.administrator.threadpool.loading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.dyhdyh.widget.loading.bar.LoadingBar;
import com.example.administrator.threadpool.R;

/**
 * Created by Administrator on 2017/6/1.
 */

public class LoadingActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bn01, bn02, bn03, bn04;

    private View main_view;

    @Override
    protected void onCreate(Bundle saveInstanceBundle){
        super.onCreate(saveInstanceBundle);
        main_view = LayoutInflater.from(this).inflate(R.layout.loading_main, null);
        setContentView(main_view);
        bn01 = (Button)findViewById(R.id.bn1);
        bn02 = (Button)findViewById(R.id.bn02);
        bn03 = (Button)findViewById(R.id.bn03);
        bn04 = (Button)findViewById(R.id.bn04);

        bn01.setOnClickListener(this);
        bn02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bn1:
                LoadingBar.make(main_view).show();
                break;
            case R.id.bn02:
                LoadingBar.cancel(main_view);
                break;
            case R.id.bn03:
                break;
            case R.id.bn04:
                break;
        }
    }
}
