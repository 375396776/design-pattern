package com.lb.pattern.factory.simplefactory;

/**
 * @author lb
 * @Title: SimpleFactoryTest
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  17:28
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();

        System.out.print(simpleFactory.getMobile("NOKIA"));
    }
}
