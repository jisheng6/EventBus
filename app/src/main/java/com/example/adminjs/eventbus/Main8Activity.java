package com.example.adminjs.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;


import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main8Activity extends AppCompatActivity implements Message {

    @BindView(R.id.btn8)
    Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        ButterKnife.bind(this);

        EventBus.getDefault().register(this);

        EventListener.getInstance().register(this);

//        EventListener.getInstance().

//        Executor executor = Executors.


    }


//    ASYNC 异步 表示订阅者所在子线程
//BACKGROUND 后台线程
    @Subscribe
    public void onMessageEvent(MessageEvent event){
        System.out.println("event Main8Activity = " + event.isTag());

        System.out.println(Thread.currentThread().getName());


//        EventBus.getDefault().re

    }

    @OnClick(R.id.btn8)
    public void onViewClicked() {

        startActivity(new Intent(this,Main9Activity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void click(String msg) {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
    }
}
