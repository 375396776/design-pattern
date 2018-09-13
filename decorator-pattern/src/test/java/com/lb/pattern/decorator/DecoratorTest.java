package com.lb.pattern.decorator;

import org.junit.Test;

/**
 * @author lb
 * @Title: DecoratorTest
 * @Description: TODO
 * @date 2018/09/13  15:42
 */
public class DecoratorTest {

    @Test
    public void testDecorator(){
        Car car = new Car();
        car.move();
        //增加新功能，飞
        System.out.println("增加新功能，飞");
        FlyCar flyCar =new FlyCar(car);
        flyCar.move();
        //增加新功能，游
        System.out.println("增加新功能，游");
        WaterCar waterCar =new WaterCar(car);
        waterCar.move();
        System.out.println("增加新功能，飞,游");
        WaterCar allCar = new WaterCar(new FlyCar(car));
        allCar.move();
    }
}
