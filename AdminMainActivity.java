package com.pro.foodorder.activity;

import android.os.Bundle;

import com.pro.foodorder.R;

import com.pro.foodorder.databinding.ActivityAdminMainBinding;

public class AdminMainActivity extends BaseActivity {

    private ActivityAdminMainBinding mActivityAdminMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_admin_main);

    }
}