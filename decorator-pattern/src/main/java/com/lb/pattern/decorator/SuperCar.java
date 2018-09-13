package com.lb.pattern.decorator;

/**
 * @author lb
 * @Title: SuperCar
 * @Description: TODO
 * @date 2018/09/13  15:37
 */
public class SuperCar implements ICar {
    private ICar iCar;

    public SuperCar(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void move() {
        iCar.move();
    }
}
