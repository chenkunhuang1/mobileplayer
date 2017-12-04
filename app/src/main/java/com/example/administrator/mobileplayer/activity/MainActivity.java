package com.example.administrator.mobileplayer.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.example.administrator.mobileplayer.R;

public class MainActivity extends AppCompatActivity {
    private FrameLayout fl_main_content;
    private RadioGroup rg_bottom_tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl_main_content = (FrameLayout) findViewById(R.id.fl_main_content);
        rg_bottom_tag = (RadioGroup) findViewById(R.id.rg_bottom_tag);
        rg_bottom_tag.check(R.id.rb_video);

    }
}
