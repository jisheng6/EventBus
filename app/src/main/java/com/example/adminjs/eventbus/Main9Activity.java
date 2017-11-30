package com.example.adminjs.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main9Activity extends AppCompatActivity {

    @BindView(R.id.btn8)
    Button btn8;
    @BindView(R.id.btn81)
    Button btn81;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        ButterKnife.bind(this);


    }


    @OnClick({R.id.btn8, R.id.btn81})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn8:
//                EventBus.getDefault().post(new MessageEvent(true));

                EventListener.getInstance().post("1");

//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        EventBus.getDefault().postSticky(new MessageEvent(true));
//
//                    }
//                }).start();
                break;
            case R.id.btn81:
                startActivity(new Intent(this,Main10Activity.class));
                break;
                default:

                    break;
        }
    }
}
