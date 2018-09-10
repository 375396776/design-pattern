package com.lb.pattern.proxy.cglib;

import com.lb.pattern.proxy._static.Person;

/**
 * @author lb
 * @Title: Xiaoliang
 * @Description: TODO
 * @date 2018/09/10  17:50
 */
public class Xiaoliang implements Person {

    @Override
    public void buyHouse() {
        System.out.println("我叫小亮，我要买一个大房子，有大窗户的");
    }

    @Override
    public void buyCar() {
        System.out.println("我叫小亮，我要买一个奔驰amg");
    }
}
