package com.lb.pattern.factory;

import com.lb.pattern.factory.abstractfactory.AbstractFactory;
import com.lb.pattern.factory.abstractfactory.MobileFactory;
import com.lb.pattern.factory.func.Factory;
import com.lb.pattern.factory.func.HuaweiFactory;
import com.lb.pattern.factory.simplefactory.SimpleFactory;
import org.junit.Test;

/**
 * @author lb
 * @Title: MobileFactoryTest
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/31  16:41
 */
public class MobileFactoryTest {

    @Test
    public void testSimpleFactory(){
        SimpleFactory simpleFactory = new SimpleFactory();

        System.out.print(simpleFactory.getMobile("NOKIA"));
    }
    @Test
    public void testFactoryFunc(){
        Factory factory = new HuaweiFactory();
        System.out.println(factory.getMobile().getName());
    }
    @Test
    public void testAbstractFactory(){
        AbstractFactory abstractFactory = new MobileFactory();

        System.out.println(abstractFactory.getHuawei());
    }
}
