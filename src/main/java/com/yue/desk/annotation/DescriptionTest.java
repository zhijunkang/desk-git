package com.yue.desk.annotation;

@Description(desc = "I am Class Description",author = "zhijunkang",age = 27)
public class DescriptionTest {

    @Description(desc = "I am Method Description",author = "zhijunkang",age = 27)
    public void descriptionMethod(){
        System.out.println(".........");
    }
}
