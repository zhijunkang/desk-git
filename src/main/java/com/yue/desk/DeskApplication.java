package com.yue.desk;

import com.yue.desk.factory.ReceptFactory;
import com.yue.desk.factory.SendFactory;
import com.yue.desk.service.Reception;
import com.yue.desk.service.Sender;
import com.yue.desk.serviceimpl.MailSender;
import com.yue.desk.serviceimpl.SmsSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeskApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeskApplication.class, args);
//        Sender sender = new MailSender();
//        sender.send();
//        Sender sender1 = new SmsSender();
//        sender1.send();
//        sender.send();

//           Sender sender = SendFactory.mailProduce();
//           sender.send();
//        Sender sender1 = SendFactory.smsProduce();
//        sender1.send();
        System.out.println("项目启动");
    }
}
