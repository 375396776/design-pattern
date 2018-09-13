package com.lb.pattern.decorator;

/**
 * @author lb
 * @Title: Car
 * @Description: TODO
 * @date 2018/09/13  15:35
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("地上跑");
    }
}
