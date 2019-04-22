package com.yue.desk.observers;

/**
 * 观察者接口
 */
public interface Observer {
    void update(double temperature, double humidity, double pressure);
}
