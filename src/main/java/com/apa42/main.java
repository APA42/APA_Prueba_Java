package com.apa42;

public class main {

    public static void main(String[] args){
        Notifier aNotifier = new SlackNotifier();
        Notifier anotherNotifier = new RedisNotifier();

        System.out.println("MAIN BEGINS");
        aNotifier.notify("apa", "hello slack");
        anotherNotifier.notify("apa", "hello redis");

        System.out.println("MAIN ENDS");
    }
}
