package com.lb.pattern.proxy._static;

/**
 * @author lb
 * @Title: Zhongjie
 * @Description: TODO
 * @date 2018/09/10  17:00
 */
public class Zhongjie implements Person {
    @Override
    public void buyCar() {
        System.out.println("买汽车");
    }

    private Xiaoming xiaoming;
    public Zhongjie(Xiaoming xiaoming){
        this.xiaoming = xiaoming;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房子前的准备");
        xiaoming.buyHouse();
        System.out.println("买房子前的装修");
    }
}
