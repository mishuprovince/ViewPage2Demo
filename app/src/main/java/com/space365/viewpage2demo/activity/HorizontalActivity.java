package com.space365.viewpage2demo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.space365.viewpage2demo.R;
import com.space365.viewpage2demo.adapter.HorizontalVpAdapter;

public class HorizontalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);
        ViewPager2 viewPager2=findViewById(R.id.viewpage);
        HorizontalVpAdapter adapter=new HorizontalVpAdapter(this);
        viewPager2.setAdapter(adapter);
    }
}
