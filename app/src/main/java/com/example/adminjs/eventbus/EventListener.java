package com.example.adminjs.eventbus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by muhanxi on 17/11/29.
 */

public class EventListener {

    private static EventListener instance = null ;

    private List<Message> list = new ArrayList();
    private EventListener(){

    }

    public static EventListener getInstance(){
        if(instance == null){
            synchronized (EventListener.class){
                if(instance == null){
                    instance = new EventListener();
                }
            }
        }
        return instance;

    }


    /**
     * 注册
     * @param message
     */
    public void register(Message message){
        list.add(message);
    }


    public void unRegister(Message message){
        list.remove(message);
    }

    /**
     * 发送
     */
    public void post(String msg){

        for (Message message : list){
            message.click(msg);
        }

    }



}
