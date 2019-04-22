package com.yue.desk.observers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CurrentConditionDisplay implements Observer {

    private double temperature;//温度
    private double humidity;//湿度
    private double pressure;//气压
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display(){
        log.info("CurrentDisplay :[{}---{}---{}]",temperature,humidity,pressure);
    }
}
