package com.space365.viewpage2demo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.space365.viewpage2demo.R;
import com.space365.viewpage2demo.adapter.VerticalVpAdapter;

public class VerticalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical);
        ViewPager2 viewPager2 = findViewById(R.id.viewpage);
        VerticalVpAdapter adapter = new VerticalVpAdapter(this);
        viewPager2.setAdapter(adapter);
    }
}
