package com.yue.desk;

import com.yue.desk.factory.ReceptFactory;
import com.yue.desk.observers.CurrentConditionDisplay;
import com.yue.desk.observers.TomorrowConditionDisplay;
import com.yue.desk.service.Reception;
import com.yue.desk.subject.WeatherData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeskApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private ReceptFactory receptFactory;
    //工厂对象模式
    @Test
    public void receptionTest(){
        Reception reception = receptFactory.enterpriesReception();
        reception.reception();
        Reception reception1 = receptFactory.memberReception();
        reception1.reception();
    }

    @Autowired
    private WeatherData weatherData;
    @Autowired
    private CurrentConditionDisplay currentConditionDisplay;
    @Autowired
    private TomorrowConditionDisplay tomorrowConditionDisplay;
    //观察者模式
    @Test
    public void obServerTest(){
        // 创建两个观察者 (Observer的实现类) 在被观察者的List中注册两个观察者
        weatherData.registerObservers(currentConditionDisplay);
        weatherData.registerObservers(tomorrowConditionDisplay);

        // 设置完(天气更新)就会自动通知两个观察者
        weatherData.setData(10,100,50);

        System.out.println("----------移除Tomorrow公告板----------");
        weatherData.removeObservers(tomorrowConditionDisplay);

        weatherData.setData(20,200,25);
    }

}
