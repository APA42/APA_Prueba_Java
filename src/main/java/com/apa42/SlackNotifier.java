package com.apa42;

public class SlackNotifier implements Notifier {

    @Override
    public void notify(String to, String what){
        // ....
        System.out.println("SlackNotifier notify to:" + to + " what:" + what);
        // ....
    }
}
