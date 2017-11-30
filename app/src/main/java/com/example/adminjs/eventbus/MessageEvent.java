package com.example.adminjs.eventbus;

/**
 * Created by muhanxi on 17/11/29.
 */

public class MessageEvent {

    public boolean tag;

    public MessageEvent(boolean tag){
        this.tag = tag;
    }


    public boolean isTag() {
        return tag;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }
}
