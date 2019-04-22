package com.yue.desk.serviceimpl;

import com.yue.desk.service.Reception;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseReception implements Reception {
    @Override
    public void reception() {
        System.out.println("企业接待。。。。。。");
    }
}
