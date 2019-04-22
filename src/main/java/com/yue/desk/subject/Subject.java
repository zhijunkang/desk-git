package com.yue.desk.subject;

import com.yue.desk.observers.Observer;

public interface Subject {
    void registerObservers(Observer o);//注册
    void removeObservers(Observer o);//删除
    void notifyObservers();//通知
}
