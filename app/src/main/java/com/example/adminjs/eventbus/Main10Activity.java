package com.example.adminjs.eventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class Main10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        EventBus.getDefault().register(this);


//        MessageEvent event = EventBus.getDefault().getStickyEvent(MessageEvent.class);

//        EventBus.getDefault().removeStickyEvent(event);
        EventBus.getDefault().removeStickyEvent(MessageEvent.class);
    }


    @Subscribe(sticky = true)
    public void onMessageEvent(MessageEvent event){

        System.out.println("event Main10Activity = " + event.isTag());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
