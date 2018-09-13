package com.lb.pattern.decorator;

/**
 * @author lb
 * @Title: WaterCar
 * @Description: TODO
 * @date 2018/09/13  15:49
 */
public class WaterCar extends SuperCar {

    public WaterCar(ICar iCar) {
        super(iCar);
    }
    private void water(){
        System.out.println("水里游");
    }

    @Override
    public void move() {
        super.move();
        water();
    }
}
