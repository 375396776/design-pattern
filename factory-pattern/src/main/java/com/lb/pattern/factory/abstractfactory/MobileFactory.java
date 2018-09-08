package com.lb.pattern.factory.abstractfactory;

import com.lb.pattern.factory.Mobile;
import com.lb.pattern.factory.func.HuaweiFactory;
import com.lb.pattern.factory.func.NokiaFactory;
import com.lb.pattern.factory.func.SumsungFactory;

/**
 * @author lb
 * @Title: MobileFactory
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2018/08/29  20:08
 */
public class MobileFactory extends AbstractFactory {
    @Override
    public Mobile getNokia() {
        return new NokiaFactory().getMobile();
    }

    @Override
    public Mobile getHuawei() {
        return new HuaweiFactory().getMobile();
    }

    @Override
    public Mobile getSummung() {
        return new SumsungFactory().getMobile();
    }
}
