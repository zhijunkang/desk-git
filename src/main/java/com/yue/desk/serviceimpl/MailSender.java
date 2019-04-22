package com.yue.desk.serviceimpl;

import com.yue.desk.service.Sender;
import org.springframework.stereotype.Service;

@Service
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send mail to zhijunkangv@163.com");
    }
}
