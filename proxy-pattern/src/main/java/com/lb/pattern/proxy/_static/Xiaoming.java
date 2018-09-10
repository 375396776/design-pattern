package com.lb.pattern.proxy._static;

/**
 * @author lb
 * @Title: Xiaoming
 * @Description: TODO
 * @date 2018/09/10  16:58
 */
public class Xiaoming implements Person{
    @Override
    public void buyCar() {
        System.out.println("买汽车");
    }

    @Override
    public void buyHouse() {
        System.out.println("我要买房子！！！");
    }
}
