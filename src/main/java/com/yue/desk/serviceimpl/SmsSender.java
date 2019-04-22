package com.yue.desk.serviceimpl;

import com.yue.desk.service.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("send sms to 13269196961");
    }
}
