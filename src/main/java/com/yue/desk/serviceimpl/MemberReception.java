package com.yue.desk.serviceimpl;

import com.yue.desk.service.Reception;
import org.springframework.stereotype.Service;

@Service
public class MemberReception implements Reception {
    @Override
    public void reception() {
        System.out.println("会员接待。。。。。");
    }
}
