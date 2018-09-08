package com.lb.pattern.factory.func;

/**
 * @author lb
 * @Title: FactoryTest
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  19:24
 */
public class FactoryTest {
    public static void main(String[] args) {
//        Factory factory = new NokiaFactory();
        Factory factory = new HuaweiFactory();
        System.out.println(factory.getMobile());
    }
}
