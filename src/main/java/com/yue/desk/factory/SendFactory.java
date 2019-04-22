package com.yue.desk.factory;

import com.yue.desk.service.Sender;
import com.yue.desk.serviceimpl.MailSender;
import com.yue.desk.serviceimpl.SmsSender;


public class SendFactory {

    public static Sender mailProduce(){
          return new MailSender();
        }

        public static Sender smsProduce(){
        return new SmsSender();
        }
}
