package com.lb.pattern.proxy.dynamicjdk;

import com.lb.pattern.proxy._static.Person;

/**
 * @author lb
 * @Title: XiaoGang
 * @Description: TODO
 * @date 2018/09/10  17:10
 */
public class XiaoGang implements Person {
    @Override
    public void buyCar() {
        System.out.println("买汽车");
    }

    @Override
    public void buyHouse() {
        System.out.println("我是小刚，我也要买房子");
    }
}
