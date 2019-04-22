package com.yue.desk.factory;

import com.yue.desk.service.Reception;
import com.yue.desk.serviceimpl.EnterpriseReception;
import com.yue.desk.serviceimpl.MemberReception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReceptFactory {
    @Autowired
    private  MemberReception memberReception;
    @Autowired
    private  EnterpriseReception enterpriseReception;
    public  Reception memberReception(){
            return memberReception;
    }

    public  Reception enterpriesReception(){
         return enterpriseReception;
    }
}
