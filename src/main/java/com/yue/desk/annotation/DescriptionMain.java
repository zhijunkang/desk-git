package com.yue.desk.annotation;

import sun.security.krb5.internal.crypto.Des;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class DescriptionMain {
    public static void main(String[] args) throws ClassNotFoundException {
        //1使用类加载器加载类
       Class c = Class.forName("com.yue.desk.annotation.DescriptionTest");
//        Class c = DescriptionTest.class;
        //2找到类上面的注解
        boolean isExist = c.isAnnotationPresent(Description.class);
        if(isExist){
            //3拿到注解实例
           Description d = (Description) c.getAnnotation(Description.class);
            System.out.println(d.desc());
            System.out.println(d.age());
            System.out.println(d.author());

        }
        //从类中获取到全部的方法
        Method[] methods = c.getMethods();
        List<Method> mss = Arrays.asList(methods);
        mss.forEach(m ->{
            //找到方法上的注解
         boolean isExistm =   m.isAnnotationPresent(Description.class);
         if(isExistm){
             Description dm = m.getAnnotation(Description.class);
             System.out.println(dm.desc());
             System.out.println(dm.author());
             System.out.println(dm.age());
         }
        });

        //另外一种解析方法
        mss.forEach(m ->{
            Arrays.stream(m.getAnnotations()).forEach(annotation -> {
                if(annotation instanceof Description){
                    Description description = (Description) annotation;
                    System.out.println(description.age());
                    System.out.println(description.desc());
                    System.out.println(description.author());
                }
            });
        });
    }
}
