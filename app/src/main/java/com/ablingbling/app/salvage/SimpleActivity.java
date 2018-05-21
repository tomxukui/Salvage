package com.ablingbling.app.salvage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewPager viewPager = new ViewPager(this);
        viewPager.setAdapter(new SimpleAdapter(this));
        setContentView(viewPager);
    }

}
