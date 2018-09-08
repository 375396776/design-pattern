package com.lb.pattern.factory.abstractfactory;

import com.lb.pattern.factory.Mobile;

/**
 * @author lb
 * @Title: AbstractFactory
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  19:28
 */
public abstract class AbstractFactory {

    public abstract Mobile getNokia();
    public abstract Mobile getHuawei();
    public abstract Mobile getSummung();
}
