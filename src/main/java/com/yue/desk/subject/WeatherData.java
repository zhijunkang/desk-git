package com.yue.desk.subject;

import com.yue.desk.observers.Observer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Getter
@Setter
@Service
public class WeatherData implements Subject {

    private double temperature;//温度
    private double humidity;//湿度
    private double pressure;//气压

    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public void setData(double temperature,double humidity,double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        dataChanged();//更新完信息就马上通知观察者
    }

    //数据改变之后就通知观察者(从气象站得到更新的观测值之后，通知观察者)
    public void dataChanged(){
        notifyObservers();
    }

    @Override
    public void registerObservers(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        int index = observers.indexOf(o);
        if(index >= 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() { //通知注册的观察者
        observers.forEach(observer -> {
           observer.update(temperature,humidity,pressure);
        });
    }
}
