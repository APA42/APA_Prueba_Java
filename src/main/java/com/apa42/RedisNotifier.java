package com.apa42;

public class RedisNotifier implements Notifier{
    @Override
    public void notify(String to, String what) {
        // ...
        System.out.println("RedisNotifier notify to:" + to + " what:" + what);
        // ...
    }
}
