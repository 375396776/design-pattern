package com.lb.pattern.decorator;

/**
 * @author lb
 * @Title: FlyCar
 * @Description: TODO
 * @date 2018/09/13  15:46
 */
public class FlyCar extends SuperCar {

    public FlyCar(ICar iCar) {
        super(iCar);
    }
    private void fly(){
        System.out.println("天上飛");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
