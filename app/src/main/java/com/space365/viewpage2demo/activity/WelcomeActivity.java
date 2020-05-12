package com.space365.viewpage2demo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.space365.viewpage2demo.R;
import com.space365.viewpage2demo.adapter.HorizontalVpAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends AppCompatActivity {

    @BindView(R.id.btn_horizontal)
    Button btnHorizontal;
    @BindView(R.id.btn_vertical)
    Button btnVertical;
    @BindView(R.id.btn_radio)
    Button btnRadio;
    @BindView(R.id.btn_tab)
    Button btnTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_horizontal, R.id.btn_vertical, R.id.btn_radio, R.id.btn_tab})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_horizontal:
                startActivity(new Intent(this, HorizontalActivity.class));
                break;
            case R.id.btn_vertical:
                startActivity(new Intent(this, VerticalActivity.class));
                break;
            case R.id.btn_radio:
                startActivity(new Intent(this, RadioActivity.class));
                break;
            case R.id.btn_tab:
                startActivity(new Intent(this, TabActivity.class));
                break;
        }
        finish();
    }
}
