package com.lb.pattern.factory.abstractfactory;

/**
 * @author lb
 * @Title: AbstractFactoryTest
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  20:10
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new MobileFactory();

        System.out.println(abstractFactory.getHuawei());
    }
}
