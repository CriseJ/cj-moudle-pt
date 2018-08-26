package com.crise.cj_pt;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import cj_pt.crise.com.base_library.base_ui.BaseActivity;
import cj_pt.crise.com.base_library.utils.FragmentUtils;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup rg;
    private long exitTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.main_rg);
        rg.setOnCheckedChangeListener(this);
        rg.check(R.id.rb_home);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Fragment fragment=null;
        switch (checkedId){
            case R.id.rb_home:
                fragment = FragmentUtils.getOneFragment();
                break;
            case R.id.rb_invest:
                fragment = FragmentUtils.getTwoFragment();
                break;
            case R.id.rb_shop:
                fragment = FragmentUtils.getThreeFragment();
                break;
            case R.id.rb_more:
                fragment = FragmentUtils.getFourFragment();
                break;
        }
        this.getSupportFragmentManager()
                .beginTransaction()
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)//设置Fragment切换动画
                .replace(R.id.fram_layout, fragment).commit();
    }








}
